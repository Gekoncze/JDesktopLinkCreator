package cz.mg.desktoplinkcreator.gui.toolkit.wrappers;

import javax.swing.*;


public class VBox extends JPanel {
    public VBox(int spacing) {
        BoxLayout boxLayout = new BoxLayout(this, BoxLayout.Y_AXIS);
        setLayout(boxLayout);
    }
}
