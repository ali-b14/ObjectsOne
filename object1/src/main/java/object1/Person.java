package object1;

import java.util.DoubleSummaryStatistics;

// Define a class
class Person {
    // Define Instance Variables
    // different for each object!

    String name;
    int age = 0;
    int height; // units are in centimeters

    // Constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
        this.height = 0;
    }
        public String getName() {
            return name;
        }
        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }
        public void setAge(int age) {
            this.age = age;
        }

        public int getHeight() {
        return height;
        }
        public void setHeight() {
            this.height = height;
        }


    public static void main(String[] args) {
        // Declare and initialize an object
        Person person1 = new Person("John", 30); /* Now you can use the Object `person1` */

        System.out.print(person1.name);




    }
}
