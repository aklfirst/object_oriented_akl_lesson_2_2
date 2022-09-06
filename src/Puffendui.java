public class Puffendui extends Hogwarts {

    private int hardwoking;
    private int loyalty;
    private int honesty;


    public Puffendui(String studentName, int magicPower, int transDistance,int hardwoking, int loyalty, int honesty) {
        super(studentName, magicPower, transDistance);

        this.studentName = studentName;
        this.magicPower = magicPower;
        this.transDistance = transDistance;
        this.hardwoking = hardwoking;
        this.loyalty = loyalty;
        this.honesty = honesty;

    }

    public int getHardwoking() {

        return hardwoking;
    }

    public void setHardwoking(int hardwoking) {

        if (Service_range.checkNumRange(hardwoking) == true) {
            System.out.println("Значение не может быть меньше 0 и больше 100");
        }
        this.hardwoking = hardwoking;
    }

    public int getLoyalty() {
        return loyalty;
    }

    public void setLoyalty(int loyalty) {

        if (Service_range.checkNumRange(loyalty) == true) {
            System.out.println("Значение не может быть меньше 0 и больше 100");
        }
        this.loyalty = loyalty;
    }

    public int getHonesty() {
        return honesty;
    }

    public void setHonesty(int honesty) {

        if (Service_range.checkNumRange(honesty) == true) {
            System.out.println("Значение не может быть меньше 0 и больше 100");
        }
        this.honesty = honesty;
    }

    @Override

    public String toString() {
        return "Студент: " + getStudentName() + "| " + getMagicPower() + "| " + getTransDistance() + "| " + getHardwoking() + "| " + getLoyalty() + "| " + getHonesty();
    }


    public void compareStudentPower(Puffendui student2) {
        int power1 = this.getMagicPower() + this.getTransDistance() + this.getHardwoking() + this.getLoyalty() + this.getHonesty();
        int power2 = student2.getMagicPower() + student2.getTransDistance() + student2.getHardwoking() + student2.getLoyalty() + student2.getHonesty();

        if (power1 > power2) {
            System.out.println("Студент " + this.getStudentName() + " сильнее чем " + student2.getStudentName());
        } else if (power2 > power1) {
            System.out.println("Студент " + student2.getStudentName() + " сильнее чем " + this.getStudentName());
        } else {
            System.out.println("Силы студентов " + this.getStudentName() + " и " + student2.getStudentName() + " равны");
        }

    }





}
