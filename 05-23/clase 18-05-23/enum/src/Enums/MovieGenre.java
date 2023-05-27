package Enums;

public enum MovieGenre {
    HORROR("horror"), FICTION("fiction"), FANTASY("fantasy");

    private String name;

    MovieGenre(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
