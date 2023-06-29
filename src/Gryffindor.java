public class Gryffindor extends Hogwarts{
    private int nobility;
    private int honor;
    private int courage;

    public Gryffindor(String fullName, int power, int distanceOfSpells, int nobility, int honor, int courage) {
        super(fullName, power, distanceOfSpells);
        this.nobility = nobility;
        this.honor = honor;
        this.courage = courage;
    }
    public int getTotal() {
        return nobility + honor + courage;
    }

    public void compareGryffindorStudents(Gryffindor student2) {
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
                " nobility=" + nobility +
                ", honor=" + honor +
                ", courage=" + courage;
    }
}
