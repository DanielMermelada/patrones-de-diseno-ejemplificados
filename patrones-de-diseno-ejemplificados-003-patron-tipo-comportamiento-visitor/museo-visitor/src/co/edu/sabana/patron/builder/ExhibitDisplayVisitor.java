abstract class ExhibitDisplayVisitor implements ExhibitVisitor {
    @Override
    public void visitPainting(Painting painting) {
        System.out.println(painting.getTitle() + " by " + painting.getArtist() + " (" + painting.getYear() + ")");
    }

    @Override
    public void visitSculpture(Sculpture sculpture) {
        System.out.println(sculpture.getTitle() + " by " + sculpture.getArtist() + " made of " + sculpture.getMaterial());
    }

    @Override
    public void visitInteractiveDisplay(InteractiveDisplay interactiveDisplay) {
        System.out.println(interactiveDisplay.getTitle() + ": " + interactiveDisplay.getInstructions());
    }
}