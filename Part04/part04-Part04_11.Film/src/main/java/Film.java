public class Film {
    private String name;
    private int ageRating;

    public Film(String name, int ageRating) {
        this.name = name;
        this.ageRating = ageRating;
    }
    public String name() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int ageRating() {
        return ageRating;
    }
    public void setAgeRating(int ageRating) {
        this.ageRating = ageRating;
    }
    
    
}
