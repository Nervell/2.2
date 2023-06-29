public class Hufflepuff extends Hogwarts{
    private int hardworking;
    private int loyal;
    private int honest;

    public Hufflepuff(String fullName, int power, int distanceOfSpells, int hardworking, int loyal, int honest) {
        super(fullName, power, distanceOfSpells);
        this.hardworking = hardworking;
        this.loyal = loyal;
        this.honest = honest;
    }

    public int getTotal() {
        return hardworking + loyal + honest;
    }

    public void compareHufflepuffStudents(Hufflepuff student2) {
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
                " hardworking=" + hardworking +
                ", loyal=" + loyal +
                ", honest=" + honest;
    }
}
