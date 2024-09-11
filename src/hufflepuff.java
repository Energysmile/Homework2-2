public class hufflepuff extends hogwarts {
    private int industriousness;
    private int loyalty;
    private int honesty;

    public hufflepuff(String name, int magicPower, int transgressionDistance, int industriousness, int loyalty, int honesty) {
        super(name, magicPower, transgressionDistance);
        this.industriousness = industriousness;
        this.loyalty = loyalty;
        this.honesty = honesty;
    }

    public int getIndustriousness() {
        return industriousness;
    }

    public int getLoyalty() {
        return loyalty;
    }

    public int getHonesty() {
        return honesty;
    }

    public void setIndustriousness(int industriousness) {
        this.industriousness = industriousness;
    }

    public void setLoyalty(int loyalty) {
        this.loyalty = loyalty;
    }

    public void setHonesty(int honesty) {
        this.honesty = honesty;
    }

    public static void hufflepuffStudent(hufflepuff hufflepuff) {
        if (hufflepuff.getMagicPower() <= 0 || hufflepuff.getMagicPower() > 100) {
            throw new IllegalArgumentException("Сила магии должна быть от 0 до 100");
        } else if (hufflepuff.getTransgressionDistance() <= 0 || hufflepuff.getTransgressionDistance() > 100) {
            throw new IllegalArgumentException("Дальность трансгрессии должна быть от 0 до 100");
        } else if (hufflepuff.getIndustriousness() <= 0 || hufflepuff.getIndustriousness() > 100) {
            throw new IllegalArgumentException("Трудолюбие должно быть от 0 до 100");
        } else if (hufflepuff.getLoyalty() <= 0 || hufflepuff.getLoyalty() > 100) {
            throw new IllegalArgumentException("Верность должна быть от 0 до 100");
        } else if (hufflepuff.getHonesty() <= 0 || hufflepuff.getHonesty() > 100) {
            throw new IllegalArgumentException("Честность должна быть от 0 до 100");
        } else {
            System.out.println("Факультет - Пуффендуй" + "\nИмя ученика - " + hufflepuff.getName()
                    + "\nСилам магии - " + hufflepuff.getMagicPower()
                    + "\nДальность трансгрессии - " + hufflepuff.getTransgressionDistance()
                    + "\nТрудолюбие - " + hufflepuff.getIndustriousness()
                    + "\nВерность - " + hufflepuff.getLoyalty()
                    + "\nЧестность - " + hufflepuff.getHonesty());
        }
    }

    public static void bestInHufflepuff(hufflepuff hufflepuff1, hufflepuff hufflepuff2) {
        System.out.println("У " + hufflepuff1.getName() + " Трудолюбие = " + hufflepuff1.getIndustriousness()
                + ", Верность = " + hufflepuff1.getLoyalty() + ", Честность = " + hufflepuff1.getHonesty());
        System.out.println("У " + hufflepuff2.getName() + " Трудолюбие = " + hufflepuff2.getIndustriousness()
                + ", Верность = " + hufflepuff2.getLoyalty() + ", Честность = " + hufflepuff2.getHonesty());
        int sum1 = hufflepuff1.getIndustriousness() + hufflepuff1.getLoyalty() + hufflepuff1.getHonesty();
        int sum2 = hufflepuff2.getIndustriousness() + hufflepuff2.getLoyalty() + hufflepuff2.getHonesty();
        if (sum1 > sum2) {
            System.out.println(hufflepuff1.getName() + " лучше Пуффендуец чем " + hufflepuff2.getName());
        } else if (sum1 < sum2) {
            System.out.println(hufflepuff2.getName() + " лучше Пуффендуец чем " + hufflepuff1.getName());
        } else {
            System.out.println(hufflepuff1.getName() + " так же хорош как и " + hufflepuff2.getName());
        }
    }
}
