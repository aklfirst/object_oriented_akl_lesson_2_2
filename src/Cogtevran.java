public class Cogtevran extends Hogwarts {

    private int cleverness;
    private int wiseness;
    private int humor;
    private int creativity;


    public Cogtevran(String studentName, int magicPower, int transDistance, int cleverness, int wiseness, int humor, int creativity) {
        super(studentName, magicPower, transDistance);

        this.studentName = studentName;
        this.magicPower = magicPower;
        this.transDistance = transDistance;
        this.cleverness = cleverness;
        this.wiseness = wiseness;
        this.humor = humor;
        this.creativity = creativity;

    }

    public int getCleverness() {
        return cleverness;
    }

    public void setCleverness(int cleverness) {
        if (Service_range.checkNumRange(cleverness) == true) {
            System.out.println("Значение не может быть меньше 0 и больше 100");
        }
        this.cleverness = cleverness;
    }

    public int getWiseness() {
        return wiseness;
    }

    public void setWiseness(int wiseness) {
        if (Service_range.checkNumRange(wiseness) == true) {
            System.out.println("Значение не может быть меньше 0 и больше 100");
        }
        this.wiseness = wiseness;
    }

    public int getHumor() {
        return humor;
    }

    public void setHumor(int humor) {
        if (Service_range.checkNumRange(humor) == true) {
            System.out.println("Значение не может быть меньше 0 и больше 100");
        }
        this.humor = humor;
    }

    public int getCreativity() {
        return creativity;
    }

    public void setCreativity(int creativity) {
        if (Service_range.checkNumRange(creativity) == true) {
            System.out.println("Значение не может быть меньше 0 и больше 100");
        }
        this.creativity = creativity;
    }

    @Override

    public String toString() {
        return "Студент: " + getStudentName() + "| " + getMagicPower() + "| " + getTransDistance() + "| " + getCleverness() + "| " + getWiseness() + "| " + getHumor() + "| " + getCreativity();
    }


    public void compareStudentPower(Cogtevran student2) {
        int power1 = this.getMagicPower() + this.getTransDistance() + this.getCleverness() + this.getWiseness() + this.getHumor() + this.getCreativity();
        int power2 = student2.getMagicPower() + student2.getTransDistance() + student2.getCleverness() + student2.getWiseness() + student2.getHumor() + student2.getCreativity();

        if (power1 > power2) {
            System.out.println("Студент " + this.getStudentName() + " сильнее чем " + student2.getStudentName());
        } else if (power2 > power1) {
            System.out.println("Студент " + student2.getStudentName() + " сильнее чем " + this.getStudentName());
        } else {
            System.out.println("Силы студентов " + this.getStudentName() + " и " + student2.getStudentName() + " равны");
        }

    }



}
