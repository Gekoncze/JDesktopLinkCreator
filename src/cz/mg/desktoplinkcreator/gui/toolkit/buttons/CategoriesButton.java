package cz.mg.desktoplinkcreator.gui.toolkit.buttons;

import cz.mg.desktoplinkcreator.gui.toolkit.Entry;
import cz.mg.desktoplinkcreator.gui.toolkit.menus.Item;


public class CategoriesButton extends AddValuesButton {
    private static final Item[] ITEMS = new Item[]{
        new Item("AudioVideo", new Item[]{
                new Item("Audio", null),
                new Item("Video", null),
                new Item("Midi", null),
                new Item("Mixer", null),
                new Item("Sequencer", null),
                new Item("Tuner", null),
                new Item("TV", null),
                new Item("AudioVideoEditing", null),
                new Item("Player", null),
                new Item("Recorder", null),
                new Item("Music", null)
        }),
        new Item("Development", new Item[]{
                new Item("Building", null),
                new Item("Debugger", null),
                new Item("IDE", null),
                new Item("GUIDesigner", null),
                new Item("Profiling", null),
                new Item("RevisionControl", null),
                new Item("Translation", null),
                new Item("Database", null),
                new Item("WebDevelopment", null)
        }),
        new Item("Education", new Item[]{
                new Item("Art", null),
                new Item("Languages", null),
                new Item("History", null),
                new Item("Humanities", null),
                new Item("Literature", null),
                new Item("Math", null),
                new Item("NumericalAnalysis", null),
                new Item("Spirituality", null),
                new Item("Sports", null),
                new Item("ParallelComputing", null)
        }),
        new Item("Game", new Item[]{
                new Item("ActionGame", null),
                new Item("AdventureGame", null),
                new Item("ArcadeGame", null),
                new Item("BoardGame", null),
                new Item("BlocksGame", null),
                new Item("CardGame", null),
                new Item("KidsGame", null),
                new Item("LogicGame", null),
                new Item("RolePlaying", null),
                new Item("Shooter", null),
                new Item("Simulation", null),
                new Item("SportsGame", null),
                new Item("StrategyGame", null),
                new Item("Art", null),
                new Item("Emulator", null)
        }),
        new Item("Graphics", new Item[]{
                new Item("2DGraphics", null),
                new Item("VectorGraphics", null),
                new Item("RasterGraphics", null),
                new Item("3DGraphics", null),
                new Item("OCR", null),
                new Item("Photography", null),
                new Item("Viewer", null),
                new Item("ImageProcessing", null)
        }),
        new Item("Network", new Item[]{
                new Item("Email", null),
                new Item("Dialup", null),
                new Item("InstantMessaging", null),
                new Item("Chat", null),
                new Item("IRCClient", null),
                new Item("Feed", null),
                new Item("FileTransfer", null),
                new Item("HamRadio", null),
                new Item("News", null),
                new Item("P2P", null),
                new Item("RemoteAccess", null),
                new Item("Telephony", null),
                new Item("VideoConference", null),
                new Item("WebBrowser", null)
        }),
        new Item("Office", new Item[]{
                new Item("Calendar", null),
                new Item("ContactManagement", null),
                new Item("Dictionary", null),
                new Item("Chart", null),
                new Item("Email", null),
                new Item("Finance", null),
                new Item("FlowChart", null),
                new Item("PDA", null),
                new Item("ProjectManagement", null),
                new Item("Presentation", null),
                new Item("Spreadsheet", null),
                new Item("WordProcessor", null),
                new Item("Scanning", null),
                new Item("Photography", null),
                new Item("Publishing", null),
                new Item("DataVisualization", null)
        }),
        new Item("Science", new Item[]{
                new Item("Art", null),
                new Item("Construction", null),
                new Item("ArtificialIntelligence", null),
                new Item("Astronomy", null),
                new Item("Biology", null),
                new Item("Chemistry", null),
                new Item("ComputerScience", null),
                new Item("DataVisualization", null),
                new Item("Economy", null),
                new Item("Electricity", null),
                new Item("Geography", null),
                new Item("Geology", null),
                new Item("Geoscience", null),
                new Item("Math", null),
                new Item("MedicalSoftware", null),
                new Item("Physics", null),
                new Item("Robotics", null),
                new Item("Electronics", null),
                new Item("Engineering", null)
        }),
        new Item("Settings", new Item[]{
                new Item("DesktopSettings", null),
                new Item("HardwareSettings", null)
        }),
        new Item("System", new Item[]{
                new Item("PackageManager", null),
                new Item("Emulator", null),
                new Item("FileTools", null),
                new Item("Printing", null),
                new Item("FileManager", null),
                new Item("TerminalEmulator", null),
                new Item("Filesystem", null),
                new Item("Monitor", null),
                new Item("Security", null),
                new Item("Core", null)
        }),
        new Item("Utility", new Item[]{
                new Item("TextTools", null),
                new Item("TelephonyTools", null),
                new Item("DiscBurning", null),
                new Item("Maps", null),
                new Item("Archiving", null),
                new Item("Compression", null),
                new Item("FileTools", null),
                new Item("Accessibility", null),
                new Item("Calculator", null),
                new Item("Clock", null),
                new Item("TextEditor", null),
                new Item("Documentation", null)
        })
    };

    public CategoriesButton(Entry entry){
        super(entry, ITEMS);
    }
}
