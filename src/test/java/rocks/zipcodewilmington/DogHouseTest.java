package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;

import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;

import rocks.zipcodewilmington.animals.animal_storage.DogHouse;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class DogHouseTest {
    // TODO - Create tests for `void add(Dog dog)`
    // TODO - Create tests for `void remove(Integer id)`
    // TODO - Create tests for `void remove(Dog dog)`
    // TODO - Create tests for `Dog getDogById(Integer id)`
    // TODO - Create tests for `Integer getNumberOfDogs()`

    private DogHouse dogHouse;
 
    @Test
    public void testGetDogById() {
        // given there is a dog to be added
        String name = "Fluffy dog";
        Date birthDate = new Date();
        Integer defaultId = 11;
        Dog dogToBeAdded = new Dog(name, birthDate, defaultId);
        dogHouse.add(dogToBeAdded);
        // given that I have added a dog

        Dog returneddog= DogHouse.getDogById(defaultId);

        // then
        Assert.assertEquals(defaultId, returneddog.getId());
    }
    @Test
    public void getNumberOfDogsTest() {
        Dog dog = new Dog();

        // given that I count number of dogs before add
        int numberOfDogsBeforeAdd = DogHouse.getNumberOfDogs();

        // given that I add one dog, my expected should be numberOfdogsBeforeAdd + 1
        int expected = numberOfDogsBeforeAdd + 1;

        // given that I have added a dog
        dogHouse.add(dog);

        // when I get the number of dogs after the add
        int actual = DogHouse.getNumberOfDogs();

        // then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void addTest() {
        // given
        String name = "Fluffy dog";
        Date birthDate = new Date();
        Integer defaultId = 1;
        Dog expected = new Dog(name,birthDate,defaultId);
        Integer id = expected.getId();

        // when
        dogHouse.add(expected);
        Dog actual = dogHouse.getDogById(id);

        // then
        Assert.assertEquals(expected, actual);
    }

    // TODO - Create tests for `void remove(Integer id)`
    @Test
    public void removeTest() {
        // given
        String name = "Fluffy dog";
        Date birthDate = new Date();
        Integer defaultId = 3;
        Dog expected = new Dog(name,birthDate,defaultId);
        dogHouse.add(expected);
        Integer id = expected.getId();

        // when
        dogHouse.remove(id);
        Dog retrieveddog = dogHouse.getDogById(id);

        // then
        Assert.assertNull(retrieveddog);

    }


    // TODO - Create tests for `void remove(dog dog)`
    @Test
    public void removeBydogTest() {
        // given
        Dog expected = new Dog(null,null,2);
        dogHouse.add(expected);
        Integer id = expected.getId();

        // when
        dogHouse.remove(expected);
        Dog retrieveddog = dogHouse.getDogById(id);

        // then
        Assert.assertNull(retrieveddog);
    }

    // TODO - Create tests for `Integer getNumberOfdogs()`
    
    



    
    

}
