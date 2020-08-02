package cz.mg.desktoplinkcreator;

import cz.mg.collections.list.List;

public class State {
    private final List actions;
    private final List locales;
    private final Options options;

    public State(){
        this.actions = new List();
        this.locales = new List();
        this.options = new Options();
    }

    public List getActions() {
        return actions;
    }

    public List getLocales() {
        return locales;
    }

    public Options getOptions() {
        return options;
    }
}
