package ui.template;

public abstract class Controller {
    protected final Model model;

    public Controller(Model model) {
        this.model = model;
    }
}
