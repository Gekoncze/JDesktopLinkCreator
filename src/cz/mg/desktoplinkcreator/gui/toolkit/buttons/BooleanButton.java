package cz.mg.desktoplinkcreator.gui.toolkit.buttons;

import cz.mg.desktoplinkcreator.gui.toolkit.Entry;
import cz.mg.desktoplinkcreator.gui.toolkit.menus.Item;


public class BooleanButton extends SetValuesButton {
    private static final Item[] ITEMS = new Item[]{
            new Item("false", null),
            new Item("true", null)
    };
    
    public BooleanButton(Entry entry){
        super(entry, ITEMS);
    }
}
