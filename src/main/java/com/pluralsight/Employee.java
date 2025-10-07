package com.pluralsight;

public class Employee {

    //params (do they have a specific name in java?)
    private static int id;
    private static String name;
    private static float hoursWorked;
    private static float payRate;

    //constructors
    public Employee() {
        this.id = 0;
        this.name = "";
        this.hoursWorked = 0.0f;
        this.payRate = 0.0f;
    }

    public Employee(int id, String name, float hoursWorked, float payRate) {
        this.id = id;
        this.name = name;
        this.hoursWorked = hoursWorked;
        this.payRate = payRate;
    }


    //getters setters
    public static int getId() {
        return id;
    }

    public static void setId(int id) {
        Employee.id = id;
    }

    public static String getName() {
        return name;
    }

    public static void setName(String name) {
        Employee.name = name;
    }

    public static float getHoursWorked() {
        return hoursWorked;
    }

    public static void setHoursWorked(float hoursWorked) {
        Employee.hoursWorked = hoursWorked;
    }

    public static float getPayRate() {
        return payRate;
    }

    public static void setPayRate(float payRate) {
        Employee.payRate = payRate;
    }


}
