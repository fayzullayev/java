package car;


class Car {

    String color;
    String engine;
    int speed;

    void Car(String color, String engine, int speed) {
        this.color = color;
        this.engine = engine;
        this.speed = speed;

        System.out.println("Color is " + this.color + " and engine is " + this.engine + " and speed is " + this.speed);
    }


    int gaz(int skorost) {
        this.speed += skorost;
        return this.speed;
    }

    int tormoz(int skorost) {
        speed -= skorost;
        return speed;
    }

    void showInfo() {
        System.out.println("Color: " + color);
        System.out.println("Engine: " + engine);
        System.out.println("Speed: " + speed);

    }
}

class Car2 {
    public static void main(String[] args) {
        Car car = new Car();
        car.speed = 10;
        car.color = "red";
        car.engine = "v8";
//        Car car = new Car();


        car.gaz(50);
        car.tormoz(20);
        car.showInfo();

        car.Car("blue", "v9", 100);

        car.gaz(50);
        car.tormoz(20);
        car.showInfo();
    }
}

