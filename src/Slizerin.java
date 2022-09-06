public class Slizerin extends Hogwarts {
    private int cunning;
    private int determination;
    private int ambition;
    private int resourcefulness;
    private int authority;


    public Slizerin(String studentName, int magicPower, int transDistance, int cunning, int determination, int ambition, int resourcefulness, int authority) {
        super(studentName, magicPower, transDistance);

        this.studentName = studentName;
        this.magicPower = magicPower;
        this.transDistance = transDistance;
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.authority = authority;

}

    public int getCunning() {
        return cunning;
    }

    public void setCunning(int cunning) {
        if (Service_range.checkNumRange(cunning) == true) {
            System.out.println("Значение не может быть меньше 0 и больше 100");
        }
        this.cunning = cunning;
    }

    public int getDetermination() {
        return determination;
    }

    public void setDetermination(int determination) {
        if (Service_range.checkNumRange(determination) == true) {
            System.out.println("Значение не может быть меньше 0 и больше 100");
        }
        this.determination = determination;
    }

    public int getAmbition() {
        return ambition;
    }

    public void setAmbition(int ambition) {
        if (Service_range.checkNumRange(ambition) == true) {
            System.out.println("Значение не может быть меньше 0 и больше 100");
        }
        this.ambition = ambition;
    }

    public int getResourcefulness() {
        return resourcefulness;
    }

    public void setResourcefulness(int resourcefulness) {
        if (Service_range.checkNumRange(resourcefulness) == true) {
            System.out.println("Значение не может быть меньше 0 и больше 100");
        }
        this.resourcefulness = resourcefulness;
    }

    public int getAuthority() {
        return authority;
    }

    public void setAuthority(int authority) {
        if (Service_range.checkNumRange(authority) == true) {
            System.out.println("Значение не может быть меньше 0 и больше 100");
        }
        this.authority = authority;
    }

    @Override

    public String toString() {
        return "Студент: " + getStudentName() + "| " + getMagicPower() + "| " + getTransDistance() + "| " + getCunning() + "| " + getDetermination() + "| " + getAmbition() + "| " + getResourcefulness() + "| " + getAuthority();
    }



    public void compareStudentPower(Slizerin student2) {
        int power1 = this.getMagicPower() + this.getTransDistance() + this.getCunning() + this.getDetermination() + this.getAmbition() + this.getResourcefulness() + this.getAuthority();
        int power2 = student2.getMagicPower() + student2.getTransDistance() + student2.getCunning() + student2.getDetermination() + student2.getAmbition() + student2.getResourcefulness() + student2.getAuthority();

        if (power1 > power2) {
            System.out.println("Студент " + this.getStudentName() + " сильнее чем " + student2.getStudentName());
        } else if (power2 > power1) {
            System.out.println("Студент " + student2.getStudentName() + " сильнее чем " + this.getStudentName());
        } else {
            System.out.println("Силы студентов " + this.getStudentName() + " и " + student2.getStudentName() + " равны");
        }

    }



}
