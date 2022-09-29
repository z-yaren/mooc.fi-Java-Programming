public class Song {

    private String name;
    private int length;

    public Song(String name, int lenght){
        this.name = name;
        this.length = lenght;
    }

    public String name() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int length() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }
    
}

