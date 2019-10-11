package com.shaoyu.pojo;


public class People {
    int age;
    String name;

    @Override
    public String toString() {
        return "People{" +
                "age=" + age +
                ", name=" + name +
                '}';
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
