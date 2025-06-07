package my.own.classes.classA;

import my.own.classes.classB.B;

public class A {
    B b;

    public A() {
        b = new B();
    }


    public void greet(String greeting) {
        b.sayHello(greeting);
    }

}