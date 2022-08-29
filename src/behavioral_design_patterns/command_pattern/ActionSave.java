package behavioral_design_patterns.command_pattern;

public class ActionSave implements ActionListernerCommand {
    private Document doc;

    public ActionSave(Document doc) {
        this.doc = doc;
    }

    @Override
    public void execute() {
        doc.save();
    }
}
