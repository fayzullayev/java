package test;

public class Test {
    public String name;
    public final int a;

    public Test(String name, int a) {
        this.name = name;
        this.a = a;
    }

    Test(int a) {
        this.a = a;
    }

    public void abc(final short c) {
        final short b;

        b = 555;

        System.out.println(c + b);
    }
}
