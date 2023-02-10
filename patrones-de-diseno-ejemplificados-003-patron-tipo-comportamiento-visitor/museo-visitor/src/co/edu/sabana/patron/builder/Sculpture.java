class Sculpture implements Exhibit {
    private String artist;
    private String title;
    private String material;

    public Sculpture(String artist, String title, String material) {
        this.artist = artist;
        this.title = title;
        this.material = material;
    }

    public String getArtist() {
        return artist;
    }

    public String getTitle() {
        return title;
    }

    public String getMaterial() {
        return material;
    }

    @Override
    public void accept(ExhibitVisitor visitor) {
        visitor.visitSculpture(this);
    }
}
