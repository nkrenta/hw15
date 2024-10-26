public class Hufflepuff extends Hogwarts {
    private int hardworking;
    private int loyalness;
    private int honestness;

    public Hufflepuff(String firstname, String lastname, int strengthOfMagic, int rangeOfTransgression, int hardworking, int loyalness, int honestness) {
        super(firstname, lastname, strengthOfMagic, rangeOfTransgression);
        this.hardworking = hardworking;
        this.loyalness = loyalness;
        this.honestness = honestness;
    }

    public int getHardworking() {
        return hardworking;
    }

    public int getLoyalness() {
        return loyalness;
    }

    public int getHonestness() {
        return honestness;
    }

    public static void getTheStrongest(Hufflepuff studentOne, Hufflepuff studentTwo){
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
        return super.getTotalPoints() + hardworking + loyalness + honestness;
    }

    public String toString() {
        return super.toString()
                + "; трудолюбие ["+ hardworking + "]"
                + "; верность ["+ loyalness + "]"
                + "; честность ["+ honestness + "]";
    }
}
