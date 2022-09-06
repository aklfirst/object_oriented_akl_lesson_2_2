public abstract class Hogwarts {

    int magicPower;
    int transDistance;
    String studentName;



    public Hogwarts (String studentName,int magicPower,int transDistance) {
        this.studentName = studentName;
        this.magicPower = magicPower;
        this.transDistance = transDistance;

    }

    public static void compareStudentPower(Hogwarts student1, Hogwarts student2) {
        int power1 = student1.getMagicPower() + student1.getTransDistance();
        int power2 = student2.getMagicPower() + student2.getTransDistance();

        if (power1 > power2) {
            System.out.println("Студент " + student1.getStudentName() + " сильнее чем " + student2.getStudentName());
        } else if (power2 > power1) {
            System.out.println("Студент " + student2.getStudentName() + " сильнее чем " + student1.getStudentName());
        } else {
            System.out.println("Силы студентов равны");
        }

    }

    public int getMagicPower() {
        return magicPower;
    }

    public void setMagicPower(int magicPower) {
        if (Service_range.checkNumRange(magicPower) == true) {
            System.out.println("Значение не может быть меньше 0 и больше 100");
        }
        this.magicPower = magicPower;
    }

    public int getTransDistance() {
        return transDistance;
    }

    public void setTransDistance(int transDistance) {
        if (Service_range.checkNumRange(transDistance) == true) {
            System.out.println("Значение не может быть меньше 0 и больше 100");
        }
        this.transDistance = transDistance;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }



}
