package cz.mg.desktoplinkcreator.gui.toolkit.buttons;

import cz.mg.desktoplinkcreator.gui.toolkit.Entry;
import cz.mg.desktoplinkcreator.gui.toolkit.menus.Item;
import cz.mg.desktoplinkcreator.gui.toolkit.menus.ValuePopupMenu;
import javax.swing.*;
import java.awt.event.ActionEvent;


public class AddValuesButton extends JButton {
    private final ValuePopupMenu menu;

    public AddValuesButton(Entry entry, Item[] items){
        this.menu = new ValuePopupMenu(entry, true, items);
        this.setText("+");
        this.addActionListener(this::onActivate);
    }

    public void onActivate(ActionEvent e){
        menu.show(this, 0, 0);
    }
}
