package pro.sky.java.course1.course;

import java.util.Arrays;

public class Employee {
    private String surname;
    private String name;
    private String patronymic;
    private String department;
    private int salary;
    private int id;

    private static int idCounter = 1;

    private final String[] departments = {"1", "2", "3", "4", "5"};

//    public Employee(String surname, String name, String patronymic, String department, int salary, int id) {


    public Employee(String surname, String name, String patronymic, int department, int salary) {
        if (department > departments.length || department < 0) {
            throw new IllegalArgumentException("Такого отдела не существует");
        }
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
        this.department = departments[department - 1];
        this.salary = salary;
        id = idCounter++;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getDepartments() {
        return Arrays.toString(departments);
    }



// ------------------ Закомментил сеттеры для утилитарных полей idCounter и setIdCounter и id и геттер для idCounter
// т.к. содержат данные о работе механизма класса но по заданию требовалось
//    public void setId(int id) {
//        this.id = id;
//    }
//    public static int getIdCounter() {
//        return idCounter;
//    }
//
//    public static void setIdCounter(int idCounter) {
//        Employee.idCounter = idCounter;
//    }
//
//
//    public static void setDepartments(String[] departments) {
//        Employee.departments = departments;
//    }
}
