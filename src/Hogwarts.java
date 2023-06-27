public class Hogwarts {
    private String fullName;
    private int power;
    private int distanceOfSpells;

    public Hogwarts(String fullName, int power, int distanceOfSpells) {
        this.fullName = fullName;
        this.power = power;
        this.distanceOfSpells = distanceOfSpells;
    }

    public String getFullName() {
        return fullName;
    }

    public int getTotalPower() {
        return power + distanceOfSpells;
    }
}
