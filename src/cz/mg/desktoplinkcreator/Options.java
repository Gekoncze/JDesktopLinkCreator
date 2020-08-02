package cz.mg.desktoplinkcreator;

import cz.mg.collections.list.List;
import cz.mg.collections.text.Text;
import java.util.StringTokenizer;


public class Options extends Storage {
    public Options() {
        super(3);
    }

    public Storage getGet(String key1, String key2){
        Storage storage1 = (Storage) get(key1);
        Storage storage2 = (Storage) storage1.get(key2);
        return storage2;
    }

    @Override
    public Object createDefaultValue(){
        return "";
    }

    public String toString(){
        String content = "";
        for(String key : this.keys()){
            String line;
            if(key.equals("")){
                line = "[Desktop Entry]";
            } else {
                line = "[Desktop Action " + key + "]";
            }
                
            content = content + line + "\n";
            Storage group = (Storage) this.get(key);
            
            for(String key2 : group.keys()){
                String brackets;
                if(key2.equals("")){
                    brackets = "";
                } else {
                    brackets = "[" + key2 + "]";
                }
                    
                Storage options = (Storage) group.get(key2);
                
                for(String key3 : options.keys()){
                    Object value = options.get(key3);
                    content = content + key3 + brackets + "=" + value + "\n";
                }
            }

            content = content + "\n";
        }
        return content;
    }
        
    public void fromString(String content){
        this.clear();
        String[] lines = content.split("\n");
        Storage group = null;
        int i = 0;
        try {
            for(String line : lines){
                i += 1;
                line = line.strip();
                if(line.length() == 0) continue; // skip empty lines
                if(line.startsWith("#")) continue; // skip comments
                
                if(line.equals("[Desktop Entry]")) {
                    group = (Storage) this.get("");
                } else if(line.startsWith("[Desktop Action ") && line.endsWith("]")){
                    Text lline = new Text(line);
                    lline.removeFirst("[Desktop Action ".length());
                    lline.removeLast("]".length());
                    String key = lline.toString();
                    group = (Storage) this.get(key);
                } else if(line.contains("[") && line.contains("]") && line.contains("=")){
                    if(group == null) throw new RuntimeException ("Missing '[Desktop Entry]'.");
                    StringTokenizer tokenizer = new StringTokenizer(line, "=[]");
                    List<String> tokens = new List<>();
                    while(tokenizer.hasMoreTokens()) tokens.addLast(tokenizer.nextToken());
                    if(tokens.count() != 3) throw new RuntimeException("Unsupported line format.");
                    String key = tokens.get(0);
                    String locale = tokens.get(1);
                    String value = tokens.get(2);
                    ((Storage)group.get(locale)).set(key, value);
                } else if(line.contains("=")) {
                    if(group == null) throw new RuntimeException ("Missing '[Desktop Entry]'.");
                    StringTokenizer tokenizer = new StringTokenizer(line, "=");
                    List<String> tokens = new List<>();
                    while(tokenizer.hasMoreTokens()) tokens.addLast(tokenizer.nextToken());
                    if(tokens.count() != 2) throw new RuntimeException("Unsupported line format.");
                    String key = tokens.get(0);
                    String value = tokens.get(1);
                    ((Storage)group.get("")).set(key, value);
                } else {
                    throw new RuntimeException("Unsupported line format.");
                }
            }
        } catch (Exception e){
            this.clear();
            throw new RuntimeException("Error at line " + i + ": " + e.getMessage());
        }
    }
}
