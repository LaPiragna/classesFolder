package Enums;

public enum MusicalGenre {;
    private String name;

    private MusicalGenre(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
