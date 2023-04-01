package pro.sky.java.course1.course;

public class Employee {
    private String surname;
    private String name;
    private String patronymic;
    private String department;
    private int salary;
    private int id;

    private static int idCounter = 1;

//    public Employee(String surname, String name, String patronymic, String department, int salary, int id) {


    public Employee(String surname, String name, String patronymic, String department, int salary) {
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
        this.department = department;
        this.salary = salary;
        id = idCounter++;
    }
}
