package kata1;

import java.util.Date;

/**
 *
 * @author Lab-DIS
 */
public class Kata1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Person persona = new Person("pepito", new Date(34,9,25));
        System.out.println(persona.getName() +"tiene "+ persona.getAge());
    }
    
}
