import java.util.concurrent.ThreadLocalRandom;

public class Main {
    private static Gryffindor[] studentsGryffindor = {
            new Gryffindor("Гарри", "Поттер", generateRandomInRange(), generateRandomInRange(), generateRandomInRange(), generateRandomInRange(), generateRandomInRange()),
            new Gryffindor("Гермиона", "Грейнджер", generateRandomInRange(), generateRandomInRange(), generateRandomInRange(), generateRandomInRange(), generateRandomInRange()),
            new Gryffindor("Рон", "Уизли", generateRandomInRange(), generateRandomInRange(), generateRandomInRange(), generateRandomInRange(), generateRandomInRange())
    };
    private static Slytherin[] studentsSlytherin = {
            new Slytherin("Драко", "Малфой", generateRandomInRange(), generateRandomInRange(), generateRandomInRange(), generateRandomInRange(), generateRandomInRange(), generateRandomInRange(), generateRandomInRange()),
            new Slytherin("Грэхэм", "Монтегю", generateRandomInRange(), generateRandomInRange(), generateRandomInRange(), generateRandomInRange(), generateRandomInRange(), generateRandomInRange(), generateRandomInRange()),
            new Slytherin("Грегори", "Гойл", generateRandomInRange(), generateRandomInRange(), generateRandomInRange(), generateRandomInRange(), generateRandomInRange(), generateRandomInRange(), generateRandomInRange())
    };
    private static Hufflepuff[] studentsHufflepuff = {
            new Hufflepuff("Захария", "Смит", generateRandomInRange(), generateRandomInRange(), generateRandomInRange(), generateRandomInRange(), generateRandomInRange()),
            new Hufflepuff("Седрик", "Диггори", generateRandomInRange(), generateRandomInRange(), generateRandomInRange(), generateRandomInRange(), generateRandomInRange()),
            new Hufflepuff("Джастин", "Финч-Флетчли", generateRandomInRange(), generateRandomInRange(), generateRandomInRange(), generateRandomInRange(), generateRandomInRange())
    };
    private static Ravenclaw[] studentsRavenclaw = {
            new Ravenclaw("Чжоу", "Чанг", generateRandomInRange(), generateRandomInRange(), generateRandomInRange(), generateRandomInRange(), generateRandomInRange(), generateRandomInRange()),
            new Ravenclaw("Падма", "Патил", generateRandomInRange(), generateRandomInRange(), generateRandomInRange(), generateRandomInRange(), generateRandomInRange(), generateRandomInRange()),
            new Ravenclaw("Маркус", "Белби", generateRandomInRange(), generateRandomInRange(), generateRandomInRange(), generateRandomInRange(), generateRandomInRange(), generateRandomInRange()),
    };

    private static int generateRandomInRange() {
        return ThreadLocalRandom.current().nextInt(1, 100);
    }

    public static void main(String[] args) {
        printStudents();

        System.out.println();
        Hogwarts.getTheStrongest(studentsGryffindor[0], studentsGryffindor[1]);
        Gryffindor.getTheStrongest(studentsGryffindor[0], studentsGryffindor[1]);

        System.out.println();
        Hogwarts.getTheStrongest(studentsSlytherin[0], studentsSlytherin[1]);
        Slytherin.getTheStrongest(studentsSlytherin[0], studentsSlytherin[1]);

        System.out.println();
        Hogwarts.getTheStrongest(studentsHufflepuff[0], studentsHufflepuff[1]);
        Hufflepuff.getTheStrongest(studentsHufflepuff[0], studentsHufflepuff[1]);

        System.out.println();
        Hogwarts.getTheStrongest(studentsRavenclaw[0], studentsRavenclaw[1]);
        Ravenclaw.getTheStrongest(studentsRavenclaw[0], studentsRavenclaw[1]);
    }

    public static void printStudents() {
        System.out.println("Students of Hogwarts:");
        System.out.println("  Students of Gryffindor:");
        for (Gryffindor gryffindor : studentsGryffindor) {
            System.out.println("    " + gryffindor);
        }
        System.out.println("  Students of Slytherin:");
        for (Slytherin slytherin : studentsSlytherin) {
            System.out.println("    " + slytherin);
        }
        System.out.println("  Students of Hufflepuff:");
        for (Hufflepuff hufflepuff : studentsHufflepuff) {
            System.out.println("    " + hufflepuff);
        }
        System.out.println("  Students of Ravenclaw:");
        for (Ravenclaw ravenclaw : studentsRavenclaw) {
            System.out.println("    " + ravenclaw);
        }
    }
}