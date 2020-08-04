package cz.mg.desktoplinkcreator.gui.toolkit.menus;

import cz.mg.desktoplinkcreator.gui.toolkit.Entry;

import javax.swing.*;

public class ValuePopupMenu extends JPopupMenu {
    public ValuePopupMenu(Entry entry, boolean add, Item[] items){
        for(Item item : items){
            add(ValueMenuItem.create(entry, add, item));
        }
    }
}
