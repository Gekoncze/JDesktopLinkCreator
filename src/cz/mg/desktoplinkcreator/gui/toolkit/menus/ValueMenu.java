package cz.mg.desktoplinkcreator.gui.toolkit.menus;

import cz.mg.desktoplinkcreator.gui.toolkit.Entry;

import javax.swing.*;

public class ValueMenu extends JPopupMenu {
    public ValueMenu(Entry entry, boolean add, Item[] items){
        for(Item item : items){
            add(new ValueMenuItem(entry, add, item));
        }
    }
}
