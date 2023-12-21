package io.zipcoder.interfaces;
import org.junit.Assert;
import org.junit.Test;

public class TestPerson {
    @Test
    public void testConstructor(){
        Person person = new Person(1, "Bob");
        long expected = 1L;
        String expectedName = "Bob";
        Assert.assertEquals(expected, person.getId());
        Assert.assertEquals(expectedName, person.getName());
    }

    @Test
    public void testSetName(){
        Person person = new Person(1, "Bob");
        String expected = "Blob";
        person.setName("Blob");
        Assert.assertEquals(expected, person.getName());
    }
}
