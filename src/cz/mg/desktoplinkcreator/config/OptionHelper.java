package cz.mg.desktoplinkcreator.config;

import cz.mg.desktoplinkcreator.gui.toolkit.ButtonFactory;


public class OptionHelper {
    private final String category;
    private final boolean localizable;
    private final boolean actionable;
    private final ButtonFactory buttonFactory;
    private final int order;

    public OptionHelper(String category, boolean localizable, boolean actionable, ButtonFactory buttonFactory, int order){
        this.category = category;
        this.localizable = localizable;
        this.actionable = actionable;
        this.buttonFactory = buttonFactory;
        this.order = order;
    }

    public String getCategory() {
        return category;
    }

    public boolean isLocalizable() {
        return localizable;
    }

    public boolean isActionable() {
        return actionable;
    }

    public ButtonFactory getButtonFactory() {
        return buttonFactory;
    }

    public int getOrder() {
        return order;
    }
}
