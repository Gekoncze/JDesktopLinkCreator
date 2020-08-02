package cz.mg.desktoplinkcreator.config;

import cz.mg.collections.map.Map;
import cz.mg.desktoplinkcreator.gui.toolkit.buttons.*;


public class Config {
    public static final OptionHelper DEFAULT_HELPER = new OptionHelper(Category.OTHER, false, false, null, 1000);
    public static final Map<String, OptionHelper> HELPERS = new Map<>();

    static {
        HELPERS.set("Name", new OptionHelper(Category.MAIN, true, true, null, 1));
        HELPERS.set("GenericName", new OptionHelper(Category.MAIN, true, false, null, 2));
        HELPERS.set("Comment", new OptionHelper(Category.MAIN, true, false, null, 3));
        HELPERS.set("Icon", new OptionHelper(Category.MAIN, false, true, FilePathButton::new, 4));
        HELPERS.set("Type", new OptionHelper(Category.MAIN, false, false, TypesButton::new, 5));

        HELPERS.set("Exec", new OptionHelper(Category.APP, false, true, FilePathButton::new, 1));
        HELPERS.set("TryExec", new OptionHelper(Category.APP, false, false, FilePathButton::new, 2));
        HELPERS.set("Path", new OptionHelper(Category.APP, false, false, DirectoryPathButton::new, 3));
        HELPERS.set("Terminal", new OptionHelper(Category.APP, false, false, BooleanButton::new, 4));
        HELPERS.set("StartupNotify", new OptionHelper(Category.APP, false, false, BooleanButton::new, 5));
        HELPERS.set("StartupWMClass", new OptionHelper(Category.APP, false, false, null, 6));
        HELPERS.set("DBusActivatable", new OptionHelper(Category.APP, false, false, BooleanButton::new, 7));
        HELPERS.set("Actions", new OptionHelper(Category.APP, false, false, null, 8));

        HELPERS.set("URL", new OptionHelper(Category.LINK, false, false, null, 1));

        HELPERS.set("Categories", new OptionHelper(Category.MENU, false, false, CategoriesButton::new, 1));
        HELPERS.set("Keywords", new OptionHelper(Category.MENU, true, false, null, 2));
        HELPERS.set("NoDisplay", new OptionHelper(Category.MENU, false, false, BooleanButton::new, 3));

        HELPERS.set("MimeType", new OptionHelper(Category.OTHER, false, false, null, 1));
        HELPERS.set("OnlyShowIn", new OptionHelper(Category.OTHER, false, false, DesktopEnvironmentButton::new, 2));
        HELPERS.set("NotShowIn", new OptionHelper(Category.OTHER, false, false, DesktopEnvironmentButton::new, 3));
        HELPERS.set("Implements", new OptionHelper(Category.OTHER, false, false, null, 4));
        HELPERS.set("Hidden", new OptionHelper(Category.OTHER, false, false, BooleanButton::new, 5));
    }
}
