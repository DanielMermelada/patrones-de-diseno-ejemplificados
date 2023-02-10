class InteractiveDisplay implements Exhibit {
    private String title;
    private String instructions;

    public InteractiveDisplay(String title, String instructions) {
        this.title = title;
        this.instructions = instructions;
    }

    public String getTitle() {
        return title;
    }

    public String getInstructions() {
        return instructions;
    }

    @Override
    public void accept(ExhibitVisitor visitor) {
        visitor.visitInteractiveDisplay(this);
    }
}