public class Personaje {
    private String name;
    private int id;
    Origin origin;

    public Personaje() {
        this.origin = null;
    }

    public Personaje(String name, int id, Origin origin) {
        this.name = name;
        this.id = id;
        this.origin = origin;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Origin getOrigin() {
        return origin;
    }

    public void setOrigin(Origin origin) {
        this.origin = origin;
    }

    @Override
    public String toString() {
        return "Personaje{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", origin=" + origin +
                '}';
    }
}
