package cz.mg.desktoplinkcreator.gui.toolkit.widgets;

import cz.mg.collections.list.List;

import javax.swing.*;
import java.awt.*;


public class OptionsFilter extends JScrollPane {
    private final OptionsGrid grid;

    public OptionsFilter(List<OptionWidget> filteredWidgets){
        this.grid = new OptionsGrid(filteredWidgets);
        this.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
        this.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        this.setPreferredSize(new Dimension(512, 256));
        this.setViewportView(this.grid);
    }
}
