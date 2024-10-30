// https://www.w3schools.com/java/java_data_types_characters.asp

// time 8th 22:58 ;

import human.Person;
import people.People;
import test.Test;

class Main {

    public static void main(String[] args) {
        Test test = new Test("Mirodil", 50);
        System.out.println(test.name);
        System.out.println(test.a);


        System.out.println("--------------------------");

        test.name = "Odil";
        System.out.println(test.name);
        System.out.println(test.a);
    }
}
