package cz.mg.desktoplinkcreator.gui.toolkit.widgets;

import cz.mg.collections.list.List;
import cz.mg.desktoplinkcreator.gui.toolkit.wrappers.HBox;
import cz.mg.desktoplinkcreator.gui.toolkit.wrappers.VBox;


public class OptionsGrid extends VBox {
    public OptionsGrid(List<OptionWidget> filteredWidgets) {
        super(4);

        for(OptionWidget widget : filteredWidgets){
            HBox hbox = new HBox(4);
            hbox.add(widget.getLabel());
            hbox.add(widget.getEntry(), true, false);
            if(widget.getButton() != null) hbox.add(widget.getButton());
            add(hbox, true, false);
        }

        add(new Dummy(), true, true);
    }
}
