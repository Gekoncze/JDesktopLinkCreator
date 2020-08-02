package cz.mg.desktoplinkcreator.gui.toolkit.menus;

import cz.mg.desktoplinkcreator.gui.toolkit.Entry;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.util.StringTokenizer;


public class ValueMenuItem extends JMenuItem {
    private final Entry entry;
    private final boolean add;
    
    public ValueMenuItem(Entry entry, boolean add, Item item){
        this.entry = entry;
        this.add = add;
        this.setText(item.getValue());
        this.addActionListener(this::onActivate);
        if(item.getItems() != null){
            add(new ValueMenu(entry, add, item.getItems()));
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
