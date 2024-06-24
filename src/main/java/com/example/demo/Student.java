package com.example.demo;

public class Student {
    private int id;
    private String name;
    private long number;

    public Student(int id, String name, long number) {
        super();
        this.id = id;
        this.name = name;
        this.number = number;
    }

    public Student() {
        super();
        // TODO Auto-generated constructor stub
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getNumber() {
        return number;
    }

    public void setNumber(long number) {
        this.number = number;
    }

}