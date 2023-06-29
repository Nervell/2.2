public class Slytherin extends Hogwarts{
    private int cunning;
    private int determination;
    private int ambition;
    private int resourcefulness;
    private int thirstForPower;

    public Slytherin(String fullName, int power, int distanceOfSpells, int cunning, int determination, int ambition, int resourcefulness, int thirstForPower) {
        super(fullName, power, distanceOfSpells);
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.thirstForPower = thirstForPower;
    }

    public int getTotal() {
        return cunning + determination + ambition + resourcefulness + thirstForPower;
    }

    public void compareSlytherinStudents(Slytherin student2) {
        if (getTotal() == student2.getTotal()) {
            System.out.println("Students power are equal");
        } else if (getTotal() > student2.getTotal()) {
            System.out.println(getFullName() + " is more powerful than " + student2.getFullName());
        } else {
            System.out.println(student2.getFullName() + " is more powerful than " + getFullName());
        }
    }

    @Override
    public String toString() {
        return super.toString() +
                " cunning=" + cunning +
                ", determination=" + determination +
                ", ambition=" + ambition +
                ", resourcefulness=" + resourcefulness +
                ", thirstForPower=" + thirstForPower;
    }
}
