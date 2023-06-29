public class Ravenclaw extends Hogwarts{
    private int smart;
    private int wise;
    private int creative;

    public Ravenclaw(String fullName, int power, int distanceOfSpells, int smart, int wise, int creative) {
        super(fullName, power, distanceOfSpells);
        this.smart = smart;
        this.wise = wise;
        this.creative = creative;
    }
    public int getTotal() {
        return smart + wise + creative;
    }

    public void compareRavenclawStudents(Ravenclaw student2) {
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
                " smart=" + smart +
                ", wise=" + wise +
                ", creative=" + creative;
    }
}
