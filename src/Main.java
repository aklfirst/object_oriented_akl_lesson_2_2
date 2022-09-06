public class Main {


    public static void main(String[] args) {

        Griffindor griffindor1 = new Griffindor("Гарри Поттер", 50, 10, 40, 90, 100);
        Griffindor griffindor2 = new Griffindor("Гермиона Грейнджер", 55, 15, 35, 80, 80);
        Griffindor griffindor3 = new Griffindor("Рон Уизли", 60, 5, 38, 85, 81);
        Puffendui puffendui1 = new Puffendui("Захария Смит", 32, 9, 50, 94, 99);
        Puffendui puffendui2 = new Puffendui("Седрик Диггори", 28, 25, 59, 93, 89);
        Puffendui puffendui3 = new Puffendui("Джастин Финч-Флетчли", 18, 65, 39, 73, 69);
        Cogtevran cogtevran1 = new Cogtevran("Чжоу Чанг", 65, 2, 78, 81, 86, 93);
        Cogtevran cogtevran2 = new Cogtevran("Падма Патил", 53, 21, 68, 41, 46, 43);
        Cogtevran cogtevran3 = new Cogtevran("Маркус Белби", 23, 17, 38, 51, 76, 93);
        Slizerin slizerin1 = new Slizerin("Драко Малфой", 20, 2, 50, 90, 90, 45, 95);
        Slizerin slizerin2 = new Slizerin("Грэхэм Монтегю", 22, 3, 15, 95, 96, 52, 56);
        Slizerin slizerin3 = new Slizerin("Грегори Гойл", 22, 3, 15, 95, 96, 52, 56);

        System.out.println(griffindor1);
        System.out.println(puffendui3);
        System.out.println(cogtevran2);
        System.out.println(slizerin1);

        griffindor2.compareStudentPower(griffindor3);
        Hogwarts.compareStudentPower(slizerin1, cogtevran2);
        slizerin2.compareStudentPower(slizerin3);

    }
}