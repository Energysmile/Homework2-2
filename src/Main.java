public class Main {
    public static void main(String[] args) {
        gryffindor[] gryffindors = {
                new gryffindor("Гарри Поттер", 20, 20, 20, 20, 20),
                new gryffindor("Гермиона Грейнджер", 30, 30, 30, 30, 30),
                new gryffindor("Рон Уизли", 40, 40, 40, 40, 40)

        };


        hufflepuff[] hufflepuffs = {
                new hufflepuff("Захария Смит", 50, 50, 50, 50, 50),
                new hufflepuff("Седрик Диггори", 20, 20, 20, 20, 20),
                new hufflepuff("Джастин Финч-Флетчли", 10, 10, 10, 10, 10)
        };

        ravenclaw[] ravenclaws = {
                new ravenclaw("Чжоу Чанг", 25, 25, 25, 25, 25),
                new ravenclaw("Падма Патил", 35, 35, 35, 35, 35),
                new ravenclaw("Маркус Белби", 45, 45, 45, 45, 45)
        };

        slytherin[] slytherins = {
                new slytherin("Драко Малфой", 22, 22, 22, 22, 22, 22, 22),
                new slytherin("Грэхэм Монтегю", 33, 33, 33, 33, 33, 33, 33),
                new slytherin("Грегори Гойл", 44, 44, 44, 44, 44, 44, 44)
        };


        gryffindor.gryffindorStudent(gryffindors[1]); // Описание студента
        System.out.println();
        hufflepuff.hufflepuffStudent(hufflepuffs[1]); // Описание студента
        System.out.println();
        ravenclaw.ravenclawStudent(ravenclaws[1]); // Описание студента
        System.out.println();
        slytherin.slytherinStudent(slytherins[1]); // Описание студента
        System.out.println();
        gryffindor.bestInGryffindor(gryffindors[1], gryffindors[2]); // Сравнение студентов факультета
        System.out.println();
        hufflepuff.bestInHufflepuff(hufflepuffs[1], hufflepuffs[2]); // Сравнение студентов факультета
        System.out.println();
        ravenclaw.bestInRavenclaw(ravenclaws[1], ravenclaws[2]); // Сравнение студентов факультета
        System.out.println();
        slytherin.bestInSlytherin(slytherins[1], slytherins[2]); // Сравнение студентов факультета
        System.out.println();
        hogwarts.bestInHogwats(gryffindors[0], hufflepuffs[1]); // Сравнение студентов Хогвардса

    }
}