package behavioral_design_patterns.command_pattern;

public class CommandPatternClient {
    public static void main(String[] args) {
        Document doc = new Document();

        ActionListernerCommand clickOpen = new ActionOpen(doc);
        ActionListernerCommand clickSave = new ActionSave(doc);

        MenuOptions menu = new MenuOptions(clickOpen, clickSave);

        menu.clickOpen();
        menu.clickSave();
    }
}
