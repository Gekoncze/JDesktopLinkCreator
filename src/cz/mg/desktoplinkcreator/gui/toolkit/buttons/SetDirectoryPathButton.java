package cz.mg.desktoplinkcreator.gui.toolkit.buttons;

import cz.mg.desktoplinkcreator.gui.dialog.DirectoryOpenDialog;
import cz.mg.desktoplinkcreator.gui.toolkit.Entry;
import javax.swing.*;
import java.awt.event.ActionEvent;


public class SetDirectoryPathButton extends JButton {
    private final Entry entry;
    
    public SetDirectoryPathButton(Entry entry){
        this.entry = entry;
        this.setText("...");
        this.addActionListener(this::onActivate);
    }

    private void onActivate(ActionEvent actionEvent){
        String path = DirectoryOpenDialog.show(this);
        if(path != null) this.entry.setText(path);
    }
}
