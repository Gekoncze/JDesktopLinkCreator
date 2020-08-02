package cz.mg.desktoplinkcreator;

import cz.mg.collections.list.ReadableList;
import cz.mg.collections.map.Map;


public class Storage {
    private final int dimension;
    private final Map<String, Object> data;

    public Storage(int dimension){
        this.dimension = dimension;
        this.data = new Map<>();
    }
        
    public ReadableList<String> keys(){
        return this.data.keys();
    }
        
    public void clear(){
        this.data.clear();
    }
        
    public Object get(String key){
        if(!this.data.keys().contains(key)) this.data.set(key, this.createDefault());
        return this.data.get(key);
    }
        
    public void set(String key, Object value){
        if(value == null){
            this.data.remove(key);
        } else {
            this.data.set(key, value);
        }
    }

    public Object createDefault(){
        if(this.dimension <= 1) {
            return this.createDefaultValue();
        } else {
            return new Storage(this.dimension - 1);
        }
    }

    protected Object createDefaultValue(){
        return null;
    }
}
