public class ravenclaw extends hogwarts {
    private int wisdom;
    private int wit;
    private int creation;

    public ravenclaw(String name, int magicPower, int transgressionDistance, int wisdom, int wit, int creation) {
        super(name, magicPower, transgressionDistance);
        this.wisdom = wisdom;
        this.wit = wit;
        this.creation = creation;
    }

    public int getWisdom() {
        return wisdom;
    }

    public void setWisdom(int wisdom) {
        this.wisdom = wisdom;
    }

    public int getWit() {
        return wit;
    }

    public void setWit(int wit) {
        this.wit = wit;
    }

    public int getCreation() {
        return creation;
    }

    public void setCreation(int creation) {
        this.creation = creation;
    }

    public static void ravenclawStudent(ravenclaw ravenclaw) {
        if (ravenclaw.getMagicPower() <= 0 || ravenclaw.getMagicPower() > 100) {
            throw new IllegalArgumentException("Сила магии должна быть от 0 до 100");
        } else if (ravenclaw.getTransgressionDistance() <= 0 || ravenclaw.getTransgressionDistance() > 100) {
            throw new IllegalArgumentException("Дальность трансгрессии должна быть от 0 до 100");
        } else if (ravenclaw.getWisdom() <= 0 || ravenclaw.getWisdom() > 100) {
            throw new IllegalArgumentException("Мудрость должна быть от 0 до 100");
        } else if (ravenclaw.getWit() <= 0 || ravenclaw.getWit() > 100) {
            throw new IllegalArgumentException("Остроумие должно быть от 0 до 100");
        } else if (ravenclaw.getCreation() <= 0 || ravenclaw.getCreation() > 100) {
            throw new IllegalArgumentException("Творчество должно быть от 0 до 100");
        } else {
            System.out.println("Факультет - Когтевран" + "\nИмя ученика - " + ravenclaw.getName()
                    + "\nСилам магии - " + ravenclaw.getMagicPower()
                    + "\nДальность трансгрессии - " + ravenclaw.getTransgressionDistance()
                    + "\nМудрость - " + ravenclaw.getWisdom()
                    + "\nОстроумие - " + ravenclaw.getWit()
                    + "\nТворчество - " + ravenclaw.getCreation());
        }
    }

    public static void bestInRavenclaw(ravenclaw ravenclaw1, ravenclaw ravenclaw2) {
        System.out.println("У " + ravenclaw1.getName() + " Мудрость = " + ravenclaw1.getWisdom()
                + ", Остроумие = " + ravenclaw1.getWit() + ", Творчество = " + ravenclaw1.getCreation());
        System.out.println("У " + ravenclaw2.getName() + " Мудрость = " + ravenclaw2.getWisdom()
                + ", Остроумие = " + ravenclaw2.getWit() + ", Творчество = " + ravenclaw2.getCreation());
        int sum1 = ravenclaw1.getWisdom() + ravenclaw1.getWit() + ravenclaw1.getCreation();
        int sum2 = ravenclaw2.getWisdom() + ravenclaw2.getWit() + ravenclaw2.getCreation();
        if (sum1 > sum2) {
            System.out.println(ravenclaw1.getName() + " лучше Когтевранец чем " + ravenclaw2.getName());
        } else if (sum1 < sum2) {
            System.out.println(ravenclaw2.getName() + " лучше Когтевранец чем " + ravenclaw1.getName());
        } else {
            System.out.println(ravenclaw1.getName() + " так же хорош как и " + ravenclaw2.getName());
        }
    }
}
