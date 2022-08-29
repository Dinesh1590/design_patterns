package behavioral_design_patterns.command_pattern;

public class ActionOpen implements ActionListernerCommand {
    private Document doc;

    public ActionOpen(Document doc) {
        this.doc = doc;
    }

    @Override
    public void execute() {
        doc.open();
    }
}
