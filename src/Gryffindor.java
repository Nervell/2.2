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
}
