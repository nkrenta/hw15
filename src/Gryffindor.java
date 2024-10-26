public class Gryffindor extends Hogwarts {
    private int nobility;
    private int honor;
    private int bravery;

    public Gryffindor(String firstname, String lastname, int strengthOfMagic, int rangeOfTransgression, int nobility, int honor, int bravery) {
        super(firstname, lastname, strengthOfMagic, rangeOfTransgression);
        this.nobility = nobility;
        this.honor = honor;
        this.bravery = bravery;
    }

    public int getNobility() {
        return nobility;
    }

    public int getHonor() {
        return honor;
    }

    public int getBravery() {
        return bravery;
    }

    public static void getTheStrongest(Gryffindor studentOne, Gryffindor studentTwo){
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
        return super.getTotalPoints() + nobility + honor + bravery;
    }

    public String toString() {
        return super.toString()
                + "; благородство ["+ nobility + "]"
                + "; честь ["+ honor + "]"
                + "; храбрость ["+ bravery + "]";
    }
}
