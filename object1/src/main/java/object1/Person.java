package object1;

// Define a class
class Person {
    // Define Instance Variables
    // different for each object!

    String name;
    int age = 0;
    // units are in centimeters
    int height;

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





    }
}
