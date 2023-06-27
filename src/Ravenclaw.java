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
}
