package cz.mg.desktoplinkcreator.gui.toolkit.widgets;

import cz.mg.collections.list.List;
import cz.mg.collections.map.Map;
import cz.mg.desktoplinkcreator.Options;
import cz.mg.desktoplinkcreator.Storage;
import cz.mg.desktoplinkcreator.config.Category;
import cz.mg.desktoplinkcreator.config.Config;
import cz.mg.desktoplinkcreator.config.OptionHelper;
import javax.swing.*;


public class OptionsContainer extends JTabbedPane {
    private final Map<String, OptionWidget> widgets;

    public OptionsContainer(Options options){
        this.widgets = helpersToWidgets(optionsToHelpers(options));
        Map<String, List<OptionWidget>> filteredWidgets = filterWidgets(this.widgets);
        for(String category : Category.CATEGORIES){
            this.addTab(category, new OptionsFilter(filteredWidgets.get(category)));
        }
    }

    public Map<String, OptionWidget> getWidgets() {
        return widgets;
    }

    public Map<String, OptionHelper> optionsToHelpers(Options options){
        for(String actionKey : options.keys()){
            Storage action = (Storage) options.get(actionKey);
            for(String localeKey : action.keys()){
                Storage locale = (Storage) action.get(localeKey);
                for(String optionKey : locale.keys()){
                    if(!(Config.HELPERS.get(optionKey) == null)){
                        Config.HELPERS.set(optionKey, Config.DEFAULT_HELPER);
                    }
                }
            }
        }
        return Config.HELPERS;
    }
    
    public Map<String, OptionWidget> helpersToWidgets(Map<String, OptionHelper> helpers){
        Map<String, OptionWidget> optionWidgets = new Map<>();
        for(String key : helpers.keys()){
            optionWidgets.set(key, new OptionWidget(key, helpers.get(key)));
        }
        return optionWidgets;
    }
    
    public Map<String, List<OptionWidget>> filterWidgets(Map<String, OptionWidget> widgets){
        Map<String, List<OptionWidget>> filteredWidgets = new Map<>();
        for(String category : Category.CATEGORIES) {
            filteredWidgets.set(category, new List<>());
        }

        for(String key : widgets.keys()){
            OptionWidget widget = widgets.get(key);
            filteredWidgets.get(widget.getHelper().getCategory()).addLast(widget);
        }

        return filteredWidgets;
    }
}
