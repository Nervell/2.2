public class Main {
    public static void main(String[] args) {
        Gryffindor harryPotter = new Gryffindor("Harry Potter",90, 90,90, 90, 90);
        Gryffindor hermioneGranger = new Gryffindor("Hermione Granger", 60, 60, 60, 60, 60);
        Gryffindor ronWeasley = new Gryffindor("Ron Weasley", 70, 70, 70, 70 ,70);

        Slytherin dracoMalfoy = new Slytherin( "Draco Malfoy", 90, 90, 90, 90, 90, 90, 90);
        Slytherin grahamMontagu = new Slytherin("Graham Montagu", 65, 65, 65, 65, 65, 65, 65);
        Slytherin gregoryGoyle = new Slytherin("Gregory Goyle", 75, 75, 75, 75, 75, 75, 75);

        Hufflepuff zachariasSmith = new Hufflepuff("Zacharias Smith", 66, 66, 66, 66, 66);
        Hufflepuff cedricDiggory = new Hufflepuff("Cedric Diggory", 88, 88, 88, 88, 88);
        Hufflepuff justinFinchFletchley = new Hufflepuff("Justin Finch-Fletchley", 55, 55, 55, 55, 55);

        Ravenclaw zhouChang = new Ravenclaw("Zhou Chang", 78, 78, 78, 78, 78);
        Ravenclaw padmaPatil = new Ravenclaw("Padma Patil", 87, 87, 87, 87, 87);
        Ravenclaw marcusBelby = new Ravenclaw("Marcus Belby", 44, 44, 44, 44, 44);

        compareGryffindor(harryPotter, hermioneGranger);
        compareHufflepuff(zachariasSmith, cedricDiggory);
        compareSlytherin(dracoMalfoy, grahamMontagu);
        compareRavenclaw(zhouChang, padmaPatil);

        compareStudentBasicStats(marcusBelby, gregoryGoyle);

    }

    public static void compareRavenclaw(Ravenclaw student1, Ravenclaw student2) {
        if (student1.getTotal() > student2.getTotal()) {
            System.out.println(student1.getFullName() + " is more powerful than " + student2.getFullName());
        } else {
            System.out.println(student2.getFullName() + " is more powerful than " + student1.getFullName());
        }
    }

    public static void compareHufflepuff(Hufflepuff student1, Hufflepuff student2) {
        if (student1.getTotal() > student2.getTotal()) {
            System.out.println(student1.getFullName() + " is more powerful than " + student2.getFullName());
        } else {
            System.out.println(student2.getFullName() + " is more powerful than " + student1.getFullName());
        }
    }

    public static void compareGryffindor(Gryffindor student1, Gryffindor student2) {
        if (student1.getTotal() > student2.getTotal()) {
            System.out.println(student1.getFullName() + " is more powerful than " + student2.getFullName());
        } else {
            System.out.println(student2.getFullName() + " is more powerful than " + student1.getFullName());
        }
    }

    public static void compareSlytherin(Slytherin student1, Slytherin student2) {
        if (student1.getTotal() > student2.getTotal()) {
            System.out.println(student1.getFullName() + " is more powerful than " + student2.getFullName());
        } else {
            System.out.println(student2.getFullName() + " is more powerful than " + student1.getFullName());
        }
    }

    public static void compareStudentBasicStats(Hogwarts student1, Hogwarts student2) {
        if (student1.getTotalPower() > student2.getTotalPower()) {
            System.out.println(student1.getFullName() + " is more powerful than " + student2.getFullName());
        } else {
            System.out.println(student2.getFullName() + " is more powerful than " + student1.getFullName());
        }
    }
}