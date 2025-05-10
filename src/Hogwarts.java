public class Hogwarts {

    private String firstname;
    private String lastname;
    private int strengthOfMagic;
    private int rangeOfTransgression;

    public Hogwarts(String firstname, String lastname, int strengthOfMagic, int rangeOfTransgression) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.strengthOfMagic = strengthOfMagic;
        this.rangeOfTransgression = rangeOfTransgression;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public int getStrengthOfMagic() {
        return strengthOfMagic;
    }

    public int getRangeOfTransgression() {
        return rangeOfTransgression;
    }

    public int getTotalPoints() {
        return getStrengthOfMagic() + getRangeOfTransgression();
    }

    public static void getTheStrongest(Hogwarts studentOne, Hogwarts studentTwo) {
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
    public String toString() {
        return lastname + " " + firstname
                + "; сила магии [" + strengthOfMagic + "]"
                + "; расстояние трансгрессии [" + rangeOfTransgression + ']';
    }
}
