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
}
