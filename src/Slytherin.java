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
}
