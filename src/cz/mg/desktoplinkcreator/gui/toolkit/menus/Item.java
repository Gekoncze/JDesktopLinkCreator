package cz.mg.desktoplinkcreator.gui.toolkit.menus;

public class Item {
    private final String value;
    private final Item[] items;

    public Item(String value, Item[] items) {
        this.value = value;
        this.items = items;
    }

    public String getValue() {
        return value;
    }

    public Item[] getItems() {
        return items;
    }
}
