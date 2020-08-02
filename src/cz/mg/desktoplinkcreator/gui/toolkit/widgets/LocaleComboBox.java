package cz.mg.desktoplinkcreator.gui.toolkit.widgets;

import cz.mg.collections.list.List;
import cz.mg.desktoplinkcreator.gui.toolkit.wrappers.HBox;
import javax.swing.*;


public class LocaleComboBox extends HBox {
    private final List<String> locales;
    private final JLabel label;
    private final JComboBox<String> comboBox;

    public LocaleComboBox(List<String> locales){
        super(4);
        this.locales = locales;
        this.label = new JLabel("Locale");
        this.comboBox = new JComboBox<String>();
        this.comboBox.addItem("<default>");
        this.comboBox.setSelectedIndex(0);
        for(String locale : locales){
            this.comboBox.addItem(locale);
        }
        this.add(this.label);
        this.add(this.comboBox, true);
    }
            
    public String getSelectedLocale(){
        int index = this.comboBox.getSelectedIndex();
        if(index <= 0) return "";
        return this.locales.get(index - 1);
    }
}
