package cz.mg.desktoplinkcreator.gui.toolkit.buttons;

import cz.mg.desktoplinkcreator.gui.toolkit.Entry;
import cz.mg.desktoplinkcreator.gui.toolkit.menus.Item;


public class DesktopEnvironmentButton extends AddValuesButton {
    private static final Item[] ITEMS = new Item[]{
            new Item("GNOME", null),
            new Item("KDE", null),
            new Item("LXDE", null),
            new Item("LXQt", null),
            new Item("MATE", null),
            new Item("Razor", null),
            new Item("ROX", null),
            new Item("TDE", null),
            new Item("Unity", null),
            new Item("XFCE", null),
            new Item("EDE", null),
            new Item("Cinnamon", null),
            new Item("Pantheon", null),
            new Item("Old", null)
    };
    
    public DesktopEnvironmentButton(Entry entry){
        super(entry, ITEMS);
    }
}
