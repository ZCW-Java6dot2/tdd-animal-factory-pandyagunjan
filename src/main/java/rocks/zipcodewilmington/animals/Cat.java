package rocks.zipcodewilmington.animals;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class Cat extends Mammal {
    public Cat(String name, Date birthDate, Integer id) {
        super(name, birthDate, id);
    }
    public Cat() {
        this(null ,null, 1);
    }

    public String speak() {
        return "meow!";
    }

    public void setName(String name) {
        super.setName(name);
    }

}
