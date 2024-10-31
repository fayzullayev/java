package car;

public class Car {
    int String = 10;
    String color;
    String engine;
    static int count;
//    boolean count;

    Car(String color, String engine) {
        count++;
        color = color;
        engine = engine;
    }

    public final void showColor() {
        int x = 10;
        int y = x + 10;
        System.out.println(color);
        this.changeColor("rbrtbrtb");
    }

    public void changeColor(String newColor) {
        int newColor = 88;
        System.out.println("Color is changing");
        int price = 5000;
        color = newColor;
        price += 1000;
    }


}
