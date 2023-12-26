package io.zipcoder.interfaces;
import org.junit.Assert;
import org.junit.Test;

public class TestStudent {
    Student student = new Student(1L, "Bob");
    @Test
    public void learnTest(){
        student.learn(10.0);
        double expected = 10.0;
        System.out.println(student.getTotalStudyTime());
        Assert.assertEquals(expected, student.getTotalStudyTime(), 0);
    }
    @Test
    public void instanceOfPersonTest(){
        Assert.assertTrue(student instanceof Person);
    }
    @Test
    public void instanceOfLearnerTest(){
        Assert.assertTrue(student instanceof Learner);
    }
}
