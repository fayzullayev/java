package human;

public class Human {
    public final String name;
    public static int count;


    public Human(String name) {
        this.name = name;
        count++;
    }

    public void showName(final int age) {
        System.out.println(this.name);
        System.out.println(age);
        System.out.println(count);
    }

    public static void showCount() {
        System.out.println(count);
    }

    void showInfo() {
        count++;
    }

}

