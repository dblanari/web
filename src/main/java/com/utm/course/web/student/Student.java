package com.utm.course.web.student;

public class Student {
    String name;
    int age;
    private final Address address;
    boolean isUpdated;

    public Student(Address address) {
        this.address = address;
    }

    public void save() {
        address.save();
    }

    public boolean update(){
        isUpdated=address.update();
        return isUpdated;
    }
}
