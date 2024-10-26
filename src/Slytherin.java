public class Slytherin extends Hogwarts {
    private int cunning;
    private int determination;
    private int ambition;
    private int resourcefullness;
    private int thirstForPower;


    public Slytherin(String firstname, String lastname, int strengthOfMagic, int rangeOfTransgression, int cunning, int determination, int ambition, int resourcefullness, int thirstForPower) {
        super(firstname, lastname, strengthOfMagic, rangeOfTransgression);
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefullness = resourcefullness;
        this.thirstForPower = thirstForPower;
    }

    public int getCunning() {
        return cunning;
    }

    public int getDetermination() {
        return determination;
    }

    public int getAmbition() {
        return ambition;
    }

    public int getResourcefullness() {
        return resourcefullness;
    }

    public int getThirstForPower() {
        return thirstForPower;
    }

    public static void getTheStrongest(Slytherin studentOne, Slytherin studentTwo){
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
        return super.getTotalPoints() + cunning + determination + + ambition + resourcefullness + thirstForPower;
    }

    public String toString() {
        return super.toString()
                + "; хитрость ["+ cunning + "]"
                + "; решительность ["+ determination + "]"
                + "; амбициозность ["+ ambition + "]"
                + "; находчивость ["+ resourcefullness + "]"
                + "; жажда власти ["+ thirstForPower + "]";
    }
}
