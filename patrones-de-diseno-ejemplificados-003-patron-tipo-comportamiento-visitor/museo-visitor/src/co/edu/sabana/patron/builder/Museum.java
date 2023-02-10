import java.util.*;

class Museum {

    private List<Exhibit> exhibits;

    public Museum() {
        exhibits = new ArrayList<>();
        exhibits.add(new Painting("Van Gogh", "Starry Night", 1889));
        exhibits.add(new Sculpture("Michelangelo", "David", "Marble"));
        exhibits.add(new InteractiveDisplay("Virtual Reality Experience", "Put on headset and follow instructions"));
    }

    public void accept(ExhibitVisitor visitor) {
        for (Exhibit exhibit : exhibits) {
            exhibit.accept(visitor);
        }
    }
}