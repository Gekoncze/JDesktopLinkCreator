package cz.mg.desktoplinkcreator.gui.toolkit.wrappers;

import javax.swing.*;
import java.awt.*;


public class HBox extends JPanel {
    private final GridBagLayout layout = new GridBagLayout();
    private final int spacing;

    public HBox(int spacing) {
        this.spacing = spacing;
        setLayout(layout);
    }

    @Override
    public Component add(Component component) {
        return this.add(component, false, false);
    }

    public Component add(Component component, boolean fill_x, boolean fill_y) {
        int x = getComponents().length;
        super.add(component);
        GridBagConstraints constraints = new GridBagConstraints();
        constraints.gridx = x;
        constraints.gridy = 0;
        constraints.insets.left = spacing / 2;
        constraints.insets.right = spacing / 2;
        constraints.insets.top = spacing;
        constraints.insets.bottom = spacing;
        if(fill_x && fill_y) constraints.fill = GridBagConstraints.BOTH;
        if(fill_x && !fill_y) constraints.fill = GridBagConstraints.HORIZONTAL;
        if(!fill_x && fill_y) constraints.fill = GridBagConstraints.VERTICAL;
        if(!fill_x && !fill_y) constraints.fill = GridBagConstraints.NONE;
        constraints.weightx = fill_x ? 1 : 0;
        constraints.weighty = fill_y ? 1 : 0;
        layout.setConstraints(component, constraints);
        return component;
    }
}
