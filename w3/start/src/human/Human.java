package human;

public class Human {
    public String name;
    public int count;

}

class HumanTest {
    public static void main(String[] args) {
        Human h = new Human();
        System.out.println(h);
        h = null;
        System.out.println(h);
    }
}





