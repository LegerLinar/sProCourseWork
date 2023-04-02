package pro.sky.java.course1.course;

import java.util.Objects;

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
        if (isDepartmentExist(department)) {
            this.department = department;
        } else {
            throw new IllegalArgumentException("Такого отдела не существует");
        }
        this.salary = salary;
        id = idCounter++;
    }

    // ------------------ own utily methods ---------------------

    public boolean isDepartmentExist(String department) {
        String departmentNameHolder = "";

        for (String departmentName : departments) {
            if (departmentName.contentEquals(department)) {
                departmentNameHolder = department;
                break;
            }
        }
        if (departmentNameHolder.equals("")) {
            return false;
        } else {
            return true;
        }
    }

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

    public String[] getDepartments() {
        return departments;
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
        return "Сотрудник - " + surname + " " + name + " " + patronymic + ". Отдел - " + department + ". Зарплата в мес. - " + salary + "руб. (id: " + id + ")";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return id == employee.id && surname.equals(employee.surname) && name.equals(employee.name) && patronymic.equals(employee.patronymic);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
//    ------------------------------------- class end -------------------------------------
    // ------------------ Закомментил геттер для idCounter
//    public static int getIdCounter() {
//        return idCounter;
//    }
//

}
