interface ExhibitVisitor {
    void visitPainting(Painting painting);
    void visitSculpture(Sculpture sculpture);
    void visitInteractiveDisplay(InteractiveDisplay interactiveDisplay);

    void visitInteractiveDisplay(Sculpture sculpture);
}