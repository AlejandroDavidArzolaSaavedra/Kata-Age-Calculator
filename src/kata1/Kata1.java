package kata1;

import java.time.LocalDate;

public class Kata1 {
 
    public static void main(String[] args) {
        Person persona = new Person("Pepito", LocalDate.of(1995, 8, 02));
        System.out.println(persona.getName() +" tiene "+ persona.getAge());
    }
}
