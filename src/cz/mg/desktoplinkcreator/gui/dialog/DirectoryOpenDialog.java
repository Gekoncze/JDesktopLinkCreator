package cz.mg.desktoplinkcreator.gui.dialog;

import javax.swing.*;
import java.awt.*;
import java.io.File;

public class DirectoryOpenDialog {
    public static String show(Component parent){
        JFileChooser dialog = new JFileChooser();
        dialog.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        dialog.setDialogTitle("Open Directory");
        dialog.setDialogType(JFileChooser.OPEN_DIALOG);
        int result = dialog.showDialog(parent, "Open");
        if(result == JFileChooser.APPROVE_OPTION){
            File file = dialog.getSelectedFile();
            if(file != null){
                String path = file.getAbsolutePath();
                if(path.length() > 0) return path;
            }
        }
        return null;
    }
}
