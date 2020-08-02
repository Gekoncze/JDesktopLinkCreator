package cz.mg.desktoplinkcreator.gui.toolkit.wrappers;

import javax.swing.*;
import java.awt.*;


public class HBox extends JPanel {
    public HBox(int spacing) {
        BoxLayout boxLayout = new BoxLayout(this, BoxLayout.X_AXIS);
        setLayout(boxLayout);
    }

    @Override
    public Component add(Component comp) {
        //todo;
        return super.add(comp);
    }

    public Component add(Component comp, boolean fill) {
        //todo;
        return super.add(comp);
    }
}
