package gladzik.eduardo.Gradle.example3.model;

/**
 * @author Eduardo Gladzik
 * @version 1.0
 * @since 16/04/2020 09:45
 */
public class Spells {

    private String name;
    private int range;
    private String classes;

    public Spells() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRange() {
        return range;
    }

    public void setRange(int range) {
        this.range = range;
    }

    public String getClasses() {
        return classes;
    }

    public void setClasses(String classes) {
        this.classes = classes;
    }

    /**
     * @return Returns spell information
     */
    public String toString() {
        return "Name: " + this.name
            + "\nRange: " + this.range
            + "\nClasses: " + this.classes;
    }
}
