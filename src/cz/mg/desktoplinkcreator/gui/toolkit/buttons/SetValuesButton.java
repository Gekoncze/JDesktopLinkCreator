package cz.mg.desktoplinkcreator.gui.toolkit.buttons;

import cz.mg.desktoplinkcreator.gui.toolkit.Entry;
import cz.mg.desktoplinkcreator.gui.toolkit.menus.Item;
import cz.mg.desktoplinkcreator.gui.toolkit.menus.ValuePopupMenu;

import javax.swing.*;
import java.awt.event.ActionEvent;


public class SetValuesButton extends JButton {
    private final ValuePopupMenu menu;

    public SetValuesButton(Entry entry, Item[] values){
        this.menu = new ValuePopupMenu(entry, false, values);
        this.setText("<");
        this.addActionListener(this::onActivate);
    }
        
    public void onActivate(ActionEvent e){
        menu.show(this, 0, 0);
    }
}
