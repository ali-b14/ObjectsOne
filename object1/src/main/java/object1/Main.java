package object1;

import java.nio.channels.Pipe;
import java.util.DoubleSummaryStatistics;
import java.util.logging.Logger;

public class Main {

    public static void main(String... args) {
        Logger logger=Logger.getLogger(Main.class.getName());
        logger.info("This is a module-using Hello World!");

        Person person2 = new Person ("Ali", 31);

        System.out.print(person2.height);

        Dog[] dogs = new Dog[3];

        Dog dogs1 = new Dog("balto",3, "germanshepherd");
        Dog dogs2 = new Dog("chico", 5, "pitbull");
        Dog dogs3 = new Dog("rambo",1, "labrador");

        dogs[0] = dogs1;
        dogs[1] = dogs2;
        dogs[2] = dogs3;

        System.out.println(dogs1);






    }
}
