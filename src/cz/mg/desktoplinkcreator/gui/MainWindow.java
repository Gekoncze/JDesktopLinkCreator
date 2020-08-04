package cz.mg.desktoplinkcreator.gui;

import cz.mg.collections.map.Map;
import cz.mg.desktoplinkcreator.File;
import cz.mg.desktoplinkcreator.State;
import cz.mg.desktoplinkcreator.Storage;
import cz.mg.desktoplinkcreator.config.Info;
import cz.mg.desktoplinkcreator.gui.dialog.FileOpenDialog;
import cz.mg.desktoplinkcreator.gui.dialog.FileSaveDialog;
import cz.mg.desktoplinkcreator.gui.toolkit.widgets.*;
import cz.mg.desktoplinkcreator.gui.toolkit.wrappers.HBox;
import cz.mg.desktoplinkcreator.gui.toolkit.wrappers.VBox;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.event.ActionEvent;


public class MainWindow extends JFrame {
    private final State data;
    private final JButton loadButton;
    private final JButton saveButton;
    private final HBox hbox;
    private final VBox vbox;
    private final ActionComboBox actionComboBox;
    private final LocaleComboBox localeComboBox;
    private final OptionsContainer optionsContainer;

    public MainWindow(){
        this.data = new State();

        try {
            setIconImage(ImageIO.read(getClass().getResourceAsStream("icon.png")));
        } catch (Exception e){
            System.out.println("WARNING: Could not set icon.");
        }
        
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setTitle(Info.NAME + " " + Info.VERSION);

        this.actionComboBox = new ActionComboBox(this.data.getActions());
        this.localeComboBox = new LocaleComboBox(this.data.getLocales());
        this.optionsContainer = new OptionsContainer(this.data.getOptions());

        this.loadButton = new JButton();
        this.loadButton.setText("Load Desktop File");
        this.loadButton.addActionListener(this::load);

        this.saveButton = new JButton();
        this.saveButton.setText("Save Desktop File");
        this.saveButton.addActionListener(this::save);

        this.hbox = new HBox(0);
        this.hbox.add(this.loadButton);
        this.hbox.add(new Dummy(), true, false);
        this.hbox.add(this.saveButton);

        this.vbox = new VBox(8);
        this.vbox.add(this.actionComboBox);
        this.vbox.add(this.localeComboBox);
        this.vbox.add(this.optionsContainer, true, true);
        this.vbox.add(hbox, true, false);

        this.getContentPane().add(vbox);
        pack();
    }
    
    public void load(ActionEvent e){
        String filename = FileOpenDialog.show(this);
        if (filename != null) this.doLoad(filename);
    }
        
    public void doLoad(String filename){
        try {
            String content = File.read(filename);
            this.data.getOptions().fromString(content);
            optionsToWidgets(this.data.getOptions().getGet("", ""), this.optionsContainer.getWidgets());
        } catch (Exception e){
            this.showErrorMessage(e.getClass().getSimpleName() + ": " + e.getMessage());
        }
    }
        
    public void save(ActionEvent e){
        String filename = FileSaveDialog.show(this);
        if(filename != null) this.doSave(filename);
    }
        
    public void doSave(String filename){
        try {
            widgetsToOptions(this.optionsContainer.getWidgets(), this.data.getOptions().getGet("", ""));
            String content = this.data.getOptions().toString();
            File.write(filename, content);
        } catch (Exception e){
            this.showErrorMessage(e.getClass().getSimpleName() + ": " + e.getMessage());
        }
    }
        
    public void showErrorMessage(String message){
        JOptionPane.showMessageDialog(this, message, "error", JOptionPane.ERROR_MESSAGE);
    }
    
    public void optionsToWidgets(Storage options, Map<String, OptionWidget> widgets){
        for(String key : options.keys()){
            widgets.get(key).getEntry().setText((String) options.get(key));
        }
    }

    public void widgetsToOptions(Map<String, OptionWidget> widgets, Storage options){
        for(String key : widgets.keys()){
            String content = widgets.get(key).getEntry().getText().strip();
            if(content.length() > 0) {
                options.set(key, content);
            } else {
                options.set(key, null);
            }
        }
    }
}
