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


    public String getName() {
        return name;
    }



    public String getPatronymic() {
        return patronymic;
    }


    public String getDepartment() {
        return department;
    }

    public int getSalary() {
        return salary;
    }

    public int getId() {
        return id;
    }

    public String getDepartments() {
        return Arrays.toString(departments);
    }

//    Setters

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void setDepartment(int department) {
        if (department > departments.length || department < 0) {
            throw new IllegalArgumentException("Такого отдела не существует");
        }
        this.department = departments[department - 1];
    }

    @Override
    public String toString() {
        return "Сотрудник - " + name + " " + surname + " " + patronymic + ". Отдел - " + department + ". Зарплата в мес. - " + salary + "(id: " + id + ")";
    }

//    ------------------------------------- class end -------------------------------------
    // ------------------ Закомментил геттер для idCounter
//    public static int getIdCounter() {
//        return idCounter;
//    }
//

}
