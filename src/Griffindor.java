public class Griffindor extends Hogwarts {

    private int nobility;
    private int honor;
    private int courage;



    public Griffindor(String studentName, int magicPower, int transDistance, int nobility, int honor, int courage) {
        super(studentName, magicPower, transDistance);

        this.studentName = studentName;
        this.magicPower = magicPower;
        this.transDistance = transDistance;
        this.nobility = nobility;
        this.honor = honor;
        this.courage = courage;
    }

    public int getNobility() {
        return nobility;
    }

    public void setNobility(int nobility) {
        if (Service_range.checkNumRange(nobility) == true) {
            System.out.println("Значение не может быть меньше 0 и больше 100");
        }
        this.nobility = nobility;
    }

    public int getHonor() {
        return honor;
    }

    public void setHonor(int honor) {
        if (Service_range.checkNumRange(honor) == true) {
            System.out.println("Значение не может быть меньше 0 и больше 100");
        }
        this.honor = honor;
    }

    public int getCourage() {
        return courage;
    }

    public void setCourage(int courage) {
        if (Service_range.checkNumRange(courage) == true) {
            System.out.println("Значение не может быть меньше 0 и больше 100");
        }
        this.courage = courage;
    }

    @Override

    public String toString() {
        return "Студент: " + getStudentName() + "| " + getMagicPower() + "| " + getTransDistance() + "| " + getNobility() + "| " + getHonor() + "| " + getCourage();
    }


    public void compareStudentPower(Griffindor student2) {
        int power1 = this.getMagicPower() + this.getTransDistance() + this.getNobility() + this.getHonor() + this.getCourage();
        int power2 = student2.getMagicPower() + student2.getTransDistance() + student2.getNobility() + student2.getHonor() + student2.getCourage();

        if (power1 > power2) {
            System.out.println("Студент " + this.getStudentName() + " сильнее чем " + student2.getStudentName());
        } else if (power2 > power1) {
            System.out.println("Студент " + student2.getStudentName() + " сильнее чем " + this.getStudentName());
        } else {
            System.out.println("Силы студентов " + this.getStudentName() + " и " + student2.getStudentName() + " равны");
        }

    }


}
