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


    public Employee(String surname, String name, String patronymic, String department, int salary) {

        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
        for (String departmentName : departments) {
            if (departmentName.equals(department)) {
                this.department = department;
            }
        }
        this.salary = salary;
        id = idCounter++;
    }

    // ------------------ own utily methods ---------------------
    public String getEmployeeInitials() {
        return surname + " " + name + " " + patronymic;
    }

//    public void isDepartment(String department) {
//        if (departments.toString().contains(department)) {
//            throw new RuntimeException("Такого отдела не существует");
//        }
//    }


    //   ---------------------- setters-getters area -----------------------
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

    public void setDepartment(String department) {
        for (String departmentName : departments) {
            if (departmentName.equals(department)) {
                this.department = department;
            }
        }
    }

    @Override
    public String toString() {
        return "Сотрудник - " + surname + " " + name + " " + patronymic + ". Отдел - " + department + ". Зарплата в мес. - " + salary + "(id: " + id + ")";
    }

//    ------------------------------------- class end -------------------------------------
    // ------------------ Закомментил геттер для idCounter
//    public static int getIdCounter() {
//        return idCounter;
//    }
//

}
