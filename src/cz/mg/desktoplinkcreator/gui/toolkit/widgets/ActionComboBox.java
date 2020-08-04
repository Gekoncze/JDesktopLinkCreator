package cz.mg.desktoplinkcreator.gui.toolkit.widgets;

import cz.mg.collections.list.List;
import cz.mg.desktoplinkcreator.gui.toolkit.wrappers.HBox;
import javax.swing.*;


public class ActionComboBox extends HBox {
    private final List<String> actions;
    private final JLabel label;
    private final JComboBox<String> comboBox;

    public ActionComboBox(List<String> actions){
        super(4);
        this.actions = actions;
        this.label = new JLabel("Action");
        this.comboBox = new JComboBox<String>();
        this.comboBox.addItem("[Desktop Entry]");
        this.comboBox.setSelectedIndex(0);
        for(String action : actions){
            this.comboBox.addItem("[Desktop Action " + action + "]");
        }
        this.add(this.label);
        this.add(this.comboBox, true, false);
    }
            
    public String getSelectedAction(){
        int index = this.comboBox.getSelectedIndex();
        if(index <= 0) return "";
        return this.actions.get(index - 1);
    }
}
