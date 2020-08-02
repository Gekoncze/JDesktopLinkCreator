package cz.mg.desktoplinkcreator.gui.toolkit.buttons;

import cz.mg.desktoplinkcreator.gui.toolkit.Entry;
import cz.mg.desktoplinkcreator.gui.toolkit.menus.Item;


public class IterfaceButton extends AddValuesButton {
    public static final Item[] ITEMS = new Item[]{
            new Item("org.freedesktop.DBus.Properties", null),
            new Item("org.freedesktop.DBus.Introspectable", null),
            new Item("org.freedesktop.DBus.ObjectManager", null)
    };
    
    public IterfaceButton(Entry entry){
        super(entry, ITEMS);
    }
}
