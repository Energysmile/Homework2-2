public class slytherin extends hogwarts {
    private int cunning;
    private int determination;
    private int ambition;
    private int resourcefulness;
    private int lustForPower;

    public slytherin(String name, int magicPower, int transgressionDistance, int cunning, int determination, int ambition, int resourcefulness, int lustForPower) {
        super(name, magicPower, transgressionDistance);
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.lustForPower = lustForPower;
    }

    public int getCunning() {
        return cunning;
    }

    public void setCunning(int cunning) {
        this.cunning = cunning;
    }

    public int getDetermination() {
        return determination;
    }

    public void setDetermination(int determination) {
        this.determination = determination;
    }

    public int getAmbition() {
        return ambition;
    }

    public void setAmbition(int ambition) {
        this.ambition = ambition;
    }

    public int getResourcefulness() {
        return resourcefulness;
    }

    public void setResourcefulness(int resourcefulness) {
        this.resourcefulness = resourcefulness;
    }

    public int getLustForPower() {
        return lustForPower;
    }

    public void setLustForPower(int lustForPower) {
        this.lustForPower = lustForPower;
    }

    public static void slytherinStudent(slytherin slytherin) {
        if (slytherin.getMagicPower() <= 0 || slytherin.getMagicPower() > 100) {
            throw new IllegalArgumentException("Сила магии должна быть от 0 до 100");
        } else if (slytherin.getTransgressionDistance() <= 0 || slytherin.getTransgressionDistance() > 100) {
            throw new IllegalArgumentException("Дальность трансгрессии должна быть от 0 до 100");
        } else if (slytherin.getCunning() <= 0 || slytherin.getCunning() > 100) {
            throw new IllegalArgumentException("Хитрость должна быть от 0 до 100");
        } else if (slytherin.getDetermination() <= 0 || slytherin.getDetermination() > 100) {
            throw new IllegalArgumentException("Решительность должна быть от 0 до 100");
        } else if (slytherin.getAmbition() <= 0 || slytherin.getAmbition() > 100) {
            throw new IllegalArgumentException("Амбициозность  должна быть от 0 до 100");
        } else if (slytherin.getResourcefulness() <= 0 || slytherin.getResourcefulness() > 100) {
            throw new IllegalArgumentException("Находчивость должна быть от 0 до 100");
        } else if (slytherin.getLustForPower() <= 0 || slytherin.getLustForPower() > 100) {
            throw new IllegalArgumentException("Жажда власти должна быть от 0 до 100");
        } else {
            System.out.println("Факультет - Слизерин" + "\nИмя ученика - " + slytherin.getName()
                    + "\nСилам магии - " + slytherin.getMagicPower()
                    + "\nДальность трансгрессии - " + slytherin.getTransgressionDistance()
                    + "\nХитрость - " + slytherin.getCunning()
                    + "\nРешительность - " + slytherin.getDetermination()
                    + "\nАмбициозность - " + slytherin.getAmbition()
                    + "\nНаходчивость - " + slytherin.getResourcefulness()
                    + "\nЖажда власти - " + slytherin.getLustForPower());
        }
    }

    public static void bestInSlytherin(slytherin slytherin1, slytherin slytherin2) {
        System.out.println("У " + slytherin1.getName() + " Хитрость = " + slytherin1.getCunning()
                + ", Решительность = " + slytherin1.getDetermination() + ", Амбициозность = "
                + slytherin1.getAmbition() + ", Находчивость = " + slytherin1.getResourcefulness()
                + ", Жажда власти = " + slytherin1.getLustForPower());
        System.out.println("У " + slytherin2.getName() + " Хитрость = " + slytherin2.getCunning()
                + ", Решительность = " + slytherin2.getDetermination() + ", Амбициозность = "
                + slytherin2.getAmbition() + ", Находчивость = " + slytherin2.getResourcefulness()
                + ", Жажда власти = " + slytherin2.getLustForPower());
        int sum1 = slytherin1.getCunning() + slytherin1.getDetermination() + slytherin1.getAmbition()
                + slytherin1.getResourcefulness() + slytherin1.getLustForPower();
        int sum2 = slytherin2.getCunning() + slytherin2.getDetermination() + slytherin2.getAmbition()
                + slytherin2.getResourcefulness() + slytherin2.getLustForPower();
        if (sum1 > sum2) {
            System.out.println(slytherin1.getName() + " лучше Слизеренец чем " + slytherin2.getName());
        } else if (sum1 < sum2) {
            System.out.println(slytherin2.getName() + " лучше Слизеренец чем " + slytherin1.getName());
        } else {
            System.out.println(slytherin1.getName() + " так же хорош как и " + slytherin2.getName());
        }
    }
}
