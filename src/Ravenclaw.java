public class Ravenclaw extends Hogwarts {
    private int smartness;
    private int wiseness;
    private int witty;
    private int fullOfCreativity;

    public Ravenclaw(String firstname, String lastname, int strengthOfMagic, int rangeOfTransgression, int smartness, int wiseness, int witty, int fullOfCreativity) {
        super(firstname, lastname, strengthOfMagic, rangeOfTransgression);
        this.smartness = smartness;
        this.wiseness = wiseness;
        this.witty = witty;
        this.fullOfCreativity = fullOfCreativity;
    }

    public int getSmartness() {
        return smartness;
    }

    public int getWiseness() {
        return wiseness;
    }

    public int getWitty() {
        return witty;
    }

    public int getFullOfCreativity() {
        return fullOfCreativity;
    }

    public static void getTheStrongest(Ravenclaw studentOne, Ravenclaw studentTwo){
        if (studentOne.getTotalPoints() > studentTwo.getTotalPoints()) {
            System.out.println(studentOne.getLastname() + " " + studentOne.getFirstname() + " с общей силой [" + studentOne.getTotalPoints() + "]" + " имеет большую силу, чем " + studentTwo.getLastname() + " " + studentTwo.getFirstname() + " с общей силой [" + studentTwo.getTotalPoints() + "]");
        } else if (studentOne.getTotalPoints() < studentTwo.getTotalPoints()) {
            System.out.println(studentTwo.getLastname() + " " + studentTwo.getFirstname() + " с общей силой [" + studentTwo.getTotalPoints() + "]" + " имеет большую силу, чем " + studentOne.getLastname() + " " + studentOne.getFirstname() + " с общей силой [" + studentOne.getTotalPoints() + "]");
        } else if (studentOne.getTotalPoints() == studentTwo.getTotalPoints()) {
            System.out.println("Ученики равны по общей силе!");
        } else {
            System.out.println("Допущена ошибка! Попробуйте снова!");
        }
    }

    @Override
    public int getTotalPoints() {
        return super.getTotalPoints() + smartness + wiseness + witty + fullOfCreativity;
    }

    public String toString() {
        return super.toString()
                + "; ум ["+ smartness + "]"
                + "; мудрость ["+ wiseness + "]"
                + "; остроумие ["+ witty + "]"
                + "; полнота творчества ["+ fullOfCreativity + "]";
    }
}
