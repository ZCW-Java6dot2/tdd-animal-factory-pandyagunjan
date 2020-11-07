package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import java.util.Date;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.animal_storage.CatHouse;

/**
 * @author leon on 4/19/18.
 */
public class CatHouseTest {




    // TODO - Create tests for `void add(Cat cat)`
    @Test
    public void addTest() {
        // given
        String name = "Fluffy Cat";
        Date birthDate = new Date();
        Integer defaultId = 1;
        Cat expected = new Cat(name,birthDate,defaultId);
        Integer id = expected.getId();

        // when
        CatHouse.add(expected);
        Cat actual = CatHouse.getCatById(id);

        // then
        Assert.assertEquals(expected, actual);
    }

    // TODO - Create tests for `void remove(Integer id)`
    @Test
    public void removeTest() {
        // given
        String name = "Fluffy Cat";
        Date birthDate = new Date();
        Integer defaultId = 3;
        Cat catToBeAdded = new Cat(name, birthDate, defaultId);
        CatHouse.add(catToBeAdded);
        Integer id = catToBeAdded.getId();

        // when
        CatHouse.remove(id);
        Cat retrievedCat = CatHouse.getCatById(id);

        // then
        Assert.assertNull(retrievedCat);

    }


    // TODO - Create tests for `void remove(Cat cat)`
    @Test
    public void removeByCatTest() {
        // given
        Cat catToBeAdded = new Cat(null, null,2);
        CatHouse.add(catToBeAdded);
        Integer id = catToBeAdded.getId();

        // when
        CatHouse.remove(catToBeAdded);
        Cat retrievedCat = CatHouse.getCatById(id);

        // then
        Assert.assertNull(retrievedCat);
    }

    // TODO - Create tests for `Integer getNumberOfCats()`
    @Test
    public void getNumberOfCatsTest() {
        // given there is a cat to be added
        Cat cat = new Cat();

        // given that I count number of cats before add
        int numberOfCatsBeforeAdd = CatHouse.getNumberOfCats();

        // given that I add one cat, my expected should be numberOfCatsBeforeAdd + 1
        int expected = numberOfCatsBeforeAdd + 1;

        // given that I have added a cat
        CatHouse.add(cat);

        // when I get the number of cats after the add
        int actual = CatHouse.getNumberOfCats();

        // then
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void getCatByIdTest() {
        // given there is a cat to be added
        String name = "Fluffy Cat";
        Date birthDate = new Date();
        Integer defaultId = 11;
        Cat catToBeAdded = new Cat(name, birthDate, defaultId);
        CatHouse.add(catToBeAdded);
        // given that I have added a cat

        Cat returnedCat= CatHouse.getCatById(defaultId);

        // then
        Assert.assertEquals(defaultId, returnedCat.getId());
    }

}
