public class hogwarts {
    private String name;
    private int magicPower;
    private int transgressionDistance;

    public hogwarts(String name, int magicPower, int transgressionDistance) {
        this.name = name;
        this.magicPower = magicPower;
        this.transgressionDistance = transgressionDistance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMagicPower() {
        return magicPower;
    }

    public void setMagicPower(int magicPower) {
        this.magicPower = magicPower;
    }

    public int getTransgressionDistance() {
        return transgressionDistance;
    }

    public void setTransgressionDistance(int transgressionDistance) {
        this.transgressionDistance = transgressionDistance;
    }

    public static void bestInHogwats(hogwarts hogwarts1, hogwarts hogwarts2) {
        int sum1 = hogwarts1.getMagicPower() + hogwarts1.getMagicPower();
        int sum2 = hogwarts2.getTransgressionDistance() + hogwarts2.getTransgressionDistance();
        if (sum1 > sum2) {
            System.out.println(hogwarts1.getName() + " обладает большей мощностью магии, чем " + hogwarts2.getName());
        } else if (sum2 > sum1) {
            System.out.println(hogwarts2.getName() + " обладает большей мощностью магии, чем " + hogwarts1.getName());
        } else {
            System.out.println(hogwarts1.getName() + "  так же хорош как и  " + hogwarts2.getName());
        }
    }
}