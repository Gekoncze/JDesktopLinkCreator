package cz.mg.desktoplinkcreator.gui.toolkit.buttons;

import cz.mg.desktoplinkcreator.gui.dialog.FileOpenDialog;
import cz.mg.desktoplinkcreator.gui.toolkit.Entry;
import javax.swing.*;
import java.awt.event.ActionEvent;


public class SetFilePathButton extends JButton {
    private final Entry entry;
    
    public SetFilePathButton(Entry entry){
        this.entry = entry;
        this.setText("...");
        this.addActionListener(this::onActivate);
    }
        
    private void onActivate(ActionEvent actionEvent){
        String path = FileOpenDialog.show(this);
        if(path != null) this.entry.setText(path);
    }
        
    public String addLauncher(String path){
        if(path.endsWith(".sh")) return "sh " + path;
        if(path.endsWith(".py")) return "python " + path;
        if(path.endsWith(".jar")) return "java -jar " + path;
        return path;
    }
}
