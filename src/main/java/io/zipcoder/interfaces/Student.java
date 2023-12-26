package io.zipcoder.interfaces;

public class Student extends Person implements Learner{
    private double totalStudyTime;
    public Student(long id, String name) {
        super(id, name);
        this.totalStudyTime = 0;
    }

    @Override
    public void learn(double numberOfHours) {
        this.totalStudyTime += numberOfHours;
    }

    @Override
    public double getTotalStudyTime() {
        return totalStudyTime;
    }
}
