public class Cat {
    private String name;
    private int age;

    public Cat(String name, int age)
    {
        this.name = name;
        this.age = age;
    }

    public String getName()
    {
        return name;
    }

    // add a getAge() getter below for
    // obtaining the Cat's age

    public int getAge() {
        return age;
    }

    // MODIFY this method so that the Cat randomly
    // returns one of three different messages
    // (make any messages you want!) rather than always returning "meow".
    // Each message should have equal chance of being returned.
    public String speak() {
        int which = (int) (Math.random() * 3) + 1;
        if (which == 1) {
            return "μ"; // omfg im so funny -- vanessa physics joke
        } else if (which == 2) {
            return "feed me *&^#!";
        } else
            return "meow!";
    }



    public void introduce()
    {
        System.out.println("Hello. My name is " + name + " and I am " + age + " years old. Now, mind your own business.");
    }
}
