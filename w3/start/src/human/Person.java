package human;


public class Person {
    String name;
    Human human;
    int age;
}


class PersonTest {
    public static void main(String[] args) {
        Person p = new Person();

        System.out.println(p.name);
        System.out.println(p.human.name);
        System.out.println(p.age);
    }
}