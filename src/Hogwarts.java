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
    public void compareStudents(Hogwarts student2) {
        if (getTotalPower() == student2.getTotalPower()) {
            System.out.println("Students power are equal");
        } else if (getTotalPower() > student2.getTotalPower()) {
            System.out.println(getFullName() + " is more powerful than " + student2.getFullName());
        } else {
            System.out.println(student2.getFullName() + " is more powerful than " + getFullName());
        }
    }

    @Override
    public String toString() {
        return "Full Name='" + fullName + '\'' +
                ", power=" + power +
                ", distance Of Spells=" + distanceOfSpells;
    }
}
