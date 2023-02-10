public class Main {
    public static void main(String[] args) {
        Museum museum = new Museum();
        ExhibitVisitor visitor = new ExhibitDisplayVisitor() {
            @Override
            public void visitInteractiveDisplay(Sculpture sculpture) {
                
            }
        };
        museum.accept(visitor);
    }
}
