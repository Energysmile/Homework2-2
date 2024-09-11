public class gryffindor extends hogwarts {
    private int nobility;
    private int honor;
    private int bravery;

    public gryffindor(String name, int magicPower, int transgressionDistance, int nobility, int honor, int bravery) {
        super(name, magicPower, transgressionDistance);
        this.nobility = nobility;
        this.honor = honor;
        this.bravery = bravery;
    }

    public int getNobility() {
        return nobility;
    }

    public void setNobility(int nobility) {
        this.nobility = nobility;
    }

    public int getHonor() {
        return honor;
    }

    public void setHonor(int honor) {
        this.honor = honor;
    }

    public int getBravery() {
        return bravery;
    }

    public void setBravery(int bravery) {
        this.bravery = bravery;
    }

    public static void gryffindorStudent(gryffindor gryffindor) {
        if (gryffindor.getMagicPower() <= 0 || gryffindor.getMagicPower() > 100) {
            throw new IllegalArgumentException("Сила магии должна быть от 0 до 100");
        } else if (gryffindor.getTransgressionDistance() <= 0 || gryffindor.getTransgressionDistance() > 100) {
            throw new IllegalArgumentException("Дальность трансгрессии должна быть от 0 до 100");
        } else if (gryffindor.getNobility() <= 0 || gryffindor.getNobility() > 100) {
            throw new IllegalArgumentException("Благородство должно быть от 0 до 100");
        } else if (gryffindor.getHonor() <= 0 || gryffindor.getHonor() > 100) {
            throw new IllegalArgumentException("Честь должна быть от 0 до 100");
        } else if (gryffindor.getBravery() <= 0 || gryffindor.getBravery() > 100) {
            throw new IllegalArgumentException("Храбрость должна быть от 0 до 100");
        } else {
            System.out.println("Факультет - Гриффиндор" + "\nИмя ученика - " + gryffindor.getName()
                    + "\nСилам магии - " + gryffindor.getMagicPower()
                    + "\nДальность трансгрессии - " + gryffindor.getTransgressionDistance()
                    + "\nБлагородство - " + gryffindor.getNobility()
                    + "\nЧесть - " + gryffindor.getHonor()
                    + "\nХрабрость - " + gryffindor.getBravery());
        }
    }

    public static void bestInGryffindor(gryffindor gryffindor1, gryffindor gryffindor2) {
        System.out.println("У " + gryffindor1.getName() + " Благородство = " + gryffindor1.getNobility()
                + ", Честь = " + gryffindor1.getHonor() + ", Храбрость = " + gryffindor1.getBravery());
        System.out.println("У " + gryffindor2.getName() + " Благородство = " + gryffindor2.getNobility()
                + ", Честь = " + gryffindor2.getHonor() + ", Храбрость = " + gryffindor2.getBravery());
        int sum1 = gryffindor1.getNobility() + gryffindor1.getHonor() + gryffindor1.getBravery();
        int sum2 = gryffindor2.getNobility() + gryffindor2.getHonor() + gryffindor2.getBravery();
        if (sum1 > sum2) {
            System.out.println(gryffindor1.getName() + " лучше Гриффиндорец чем " + gryffindor2.getName());
        } else if (sum1 < sum2) {
            System.out.println(gryffindor2.getName() + " лучше Гриффиндорец чем " + gryffindor1.getName());
        } else {
            System.out.println(gryffindor1.getName() + " так же хорош как и " + gryffindor2.getName());
        }
    }
}


