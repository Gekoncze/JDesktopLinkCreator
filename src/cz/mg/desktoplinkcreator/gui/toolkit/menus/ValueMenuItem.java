package cz.mg.desktoplinkcreator.gui.toolkit.menus;

import cz.mg.desktoplinkcreator.gui.toolkit.Entry;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.StringTokenizer;


public class ValueMenuItem extends JMenu {
    private static final class JMenuItemExt extends JMenuItem {
        private final Entry entry;
        private final boolean add;

        public JMenuItemExt(Entry entry, boolean add, Item item) {
            this.entry = entry;
            this.add = add;

            this.setText(item.getValue());
            this.addActionListener(this::onActivate);
            this.addMouseListener(new MouseAdapter() {
                @Override
                public void mousePressed(MouseEvent e) {
                    onActivate(null);
                }
            });
        }

        public void onActivate(ActionEvent e){
            if(add) {
                if (!contains(getText())){
                    entry.setText(entry.getText() + getText() + ";");
                }
            } else {
                entry.setText(getText());
            }
        }

        public boolean contains(String value){
            StringTokenizer tokenizer = new StringTokenizer(entry.getText(), ";");
            while(tokenizer.hasMoreTokens()){
                String token = tokenizer.nextToken();
                if(token.equals(value)) return true;
            }
            return false;
        }
    }

    private static final class JMenuExt extends JMenu {
        private final Entry entry;
        private final boolean add;

        public JMenuExt(Entry entry, boolean add, Item item) {
            this.entry = entry;
            this.add = add;

            this.setText(item.getValue());
            this.addActionListener(this::onActivate);
            this.addMouseListener(new MouseAdapter() {
                @Override
                public void mousePressed(MouseEvent e) {
                    onActivate(null);
                }
            });
            for(Item subItem : item.getItems()){
                add(ValueMenuItem.create(entry, add, subItem));
            }
        }

        public void onActivate(ActionEvent e){
            if(add) {
                if (!contains(getText())){
                    entry.setText(entry.getText() + getText() + ";");
                }
            } else {
                entry.setText(getText());
            }
        }

        public boolean contains(String value){
            StringTokenizer tokenizer = new StringTokenizer(entry.getText(), ";");
            while(tokenizer.hasMoreTokens()){
                String token = tokenizer.nextToken();
                if(token.equals(value)) return true;
            }
            return false;
        }
    }

    public static JMenuItem create(Entry entry, boolean add, Item item){
        if(item.getItems() == null){
            return new JMenuItemExt(entry, add, item);
        } else {
            return new JMenuExt(entry, add, item);
        }
    }
}
