package cz.mg.desktoplinkcreator.gui.toolkit.buttons;

import cz.mg.desktoplinkcreator.gui.toolkit.Entry;
import cz.mg.desktoplinkcreator.gui.toolkit.menus.Item;


public class TypesButton extends SetValuesButton {
    private static final Item[] ITEMS = new Item[]{
            new Item("Application", null),
            new Item("Link", null),
            new Item("Directory", null)
    };
    
    public TypesButton(Entry entry){
        super(entry, ITEMS);
    }
}
