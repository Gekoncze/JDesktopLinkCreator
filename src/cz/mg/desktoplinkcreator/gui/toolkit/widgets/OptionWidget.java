package cz.mg.desktoplinkcreator.gui.toolkit.widgets;

import cz.mg.desktoplinkcreator.config.OptionHelper;
import cz.mg.desktoplinkcreator.gui.toolkit.Entry;
import javax.swing.*;


public class OptionWidget extends JPanel {
    private final String key;
    private final OptionHelper helper;
    private final JLabel label;
    private final Entry entry;
    private final JButton button;

    public OptionWidget(String key, OptionHelper helper) {
        this.key = key;
        this.helper = helper;
        this.label = new JLabel(key);
        this.entry = new Entry();
        if(helper.getButtonFactory() != null){
            this.button = helper.getButtonFactory().create(entry);
        } else {
            this.button = null;
        }
    }

    public OptionHelper getHelper() {
        return helper;
    }

    public JLabel getLabel() {
        return label;
    }

    public Entry getEntry() {
        return entry;
    }

    public JButton getButton() {
        return button;
    }
}
