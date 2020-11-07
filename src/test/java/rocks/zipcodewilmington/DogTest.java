package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Animal;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.Mammal;

import java.util.Date;
/**
 * @author leon on 4/19/18.
 */
public class DogTest {
    // TODO - Create tests for `new Dog(String name, Date birthDate, Integer id)`
    // TODO - Create tests for `speak`
    // TODO - Create tests for `setBirthDate(Date birthDate)`
    // TODO - Create tests for `void eat(Food food)`
    // TODO - Create tests for `Integer getId()`
    // TODO - Create test to check Animal inheritance; google search `java instanceof keyword`
    // TODO - Create test to check Mammal inheritance; google search `java instanceof keyword`
    private Dog dog;
    @Before
    public void startUp()
    {
       this.dog= new Dog();

    }
    @Test
    public void checkConstructor()
    {
        //Given
        String givenName= "Fluffy";
        Date givenBirthDate= new Date();
        Integer givenId=0;

        Dog dog= new Dog(givenName,givenBirthDate,givenId);
       //when
        String retrieveName=dog.getName();
        Date retrieveDate=dog.getBirthDate();
        Integer retrieveId=dog.getId();

       //then
     Assert.assertEquals(givenName,dog.getName());
     Assert.assertEquals(givenBirthDate,dog.getBirthDate());
     Assert.assertEquals(givenId,dog.getId());

    }
    @Test
    public void setNameTest() {
        // Given (a name exists and a dog exists)
        Dog dog = new Dog(null, null, null);
        String givenName = "Milo";

        // When (a dog's name is set to the given name)
        dog.setName(givenName);

        // Then (we expect to get the given name from the dog)
        String dogName = dog.getName();
        Assert.assertEquals(dogName, givenName);
    }

    @Test
    public void setBirthDate() {
        // Given (a name exists and a dog exists)
        Dog dog = new Dog(null, null, null);
        Date expected = new Date();

        // When (a dog's name is set to the given name)
        dog.setBirthDate(expected);

        // Then (we expect to get the given name from the dog)
        String dogName = dog.getName();
        Assert.assertEquals(expected, dog.getBirthDate());
    }
   @Test
    public void speak()
    {
        Dog dog=new Dog(null,null,null);
        String expectedBark="bark!";
       // dog.setId(expectedId);
        Assert.assertEquals(expectedBark,dog.speak());

    }

    @Test
    public void getId()
    {
        String givenName = "Zula";
        Date givenBirthDate = new Date();
        Integer givenId = 5;

        // When (a cat is constructed)
        Dog dog = new Dog(givenName, givenBirthDate, givenId);

        Assert.assertEquals(givenId,dog.getId());

    }
    @Test
    public void implementTest() {
        // given
        Dog dog = new Dog();

        // when
        boolean outcome = dog instanceof Animal;

        // then
        Assert.assertTrue(outcome);
    }

    // TODO - Create test to check Mammal inheritance; google search `java instanceof keyword`
    @Test
    public void inheritanceTest() {
        // given
        Dog dog = new Dog();

        // when
        boolean outcome = dog instanceof Mammal;

        // then
        Assert.assertTrue(outcome);
    }
    @Test
    public void eat() {
        // given

        int currentNo=dog.getNumberOfMealsEaten()+1;
        Food food = new Food();
        dog.eat(food);
        int expectedNo=dog.getNumberOfMealsEaten();
        // then
        Assert.assertEquals(currentNo,expectedNo);
    }


}
