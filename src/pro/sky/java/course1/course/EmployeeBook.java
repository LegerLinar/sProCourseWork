package pro.sky.java.course1.course;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EmployeeBook {
    private Map<String, Employee> employeeMap;


    public EmployeeBook() {
        employeeMap = new HashMap<>(Map.of(
                "Кисложопкин Аркадий Васильевич",
                new Employee("Кисложопкин", "Аркадий", "Васильевич", "1", 35000),
                "Селиванов Акакий Александрович",
                new Employee("Селиванов", "Акакий", "Александрович", "4", 32000),
                "Кулиджи Казимир Космосович",
                new Employee("Кулиджи", "Казимир", "Космосович", "3", 42000),
                "Франклин Бенджамин Батькович",
                new Employee("Франклин", "Бенджамин", "Батькович", "5", 200_000),
                "Джугашвили Иосиф Виссарионович",
                new Employee("Джугашвили", "Иосиф", "Виссарионович", "5", 1_000),
                "Хирохито Сёма Ёсихитович",
                new Employee("Хирохито", "Сёма", "Ёсихитович", "4", 100_000)
        ));
    }

//

    public Map<String, Employee> getEmployees() {
        return employeeMap;
    }

    public void printAllEmployeesData() {
        System.out.println("Личный состав:");
        for (Employee employee : employeeMap.values()) {
            System.out.println(employee);
        }
    }

    public int countMonthSalaryExpenses() {
        int monthSalaryExpenses = 0;
        for (Employee employee :
                employeeMap.values()) {
            monthSalaryExpenses += employee.getSalary();
        }
        return monthSalaryExpenses;
    }

    public String findEmployeeMinSalary() {
        int minSalary = 0;
        String employeeWithMinSalary = "";
        for (Employee employee : employeeMap.values()) {
            if (employee.getSalary() < minSalary || minSalary == 0) {
                minSalary = employee.getSalary();
                employeeWithMinSalary = employee.toString();
            }
        }
        return employeeWithMinSalary;

    }

    public String findEmployeeMaxSalary() {
        int maxSalary = 0;
        String employeeWithMaxSalary = "";
        for (Employee employee : employeeMap.values()) {
            if (employee.getSalary() > maxSalary) {
                maxSalary = employee.getSalary();
                employeeWithMaxSalary = employee.toString();
            }
        }
        return employeeWithMaxSalary;
    }

    public int countAverageMonthSalary() {
        int totalMonthSalary = 0;
        int employeesCounter = 0;
        for (Employee employee : employeeMap.values()) {
            totalMonthSalary += employee.getSalary();
            employeesCounter++;
        }
        return totalMonthSalary / employeesCounter;
    }

    public void showEmployeesNames() {
        StringBuilder employeesString = new StringBuilder();
        for (String employee : employeeMap.keySet()) {
            System.out.println(employee);
        }
    }


    // ------------------------------------- NEXT LEVEL METHODS   -------------------------------------

    public void isDepartment(String department) {
        byte verifier = 0;
        for (Employee employee : employeeMap.values()) {
            if (employee != null && employee.isDepartmentExist(department)) {
                verifier++;
                break;
            }
        }
        if (verifier == 0) {
            throw new IllegalArgumentException("Введите название существующего отдела");
        }
    }
    //проверка на существование отдела

    public List<Employee> getEmployeesByDep(String department) {
        int subEmployeesCounter = 0;
        List<Employee> subEmployeeList = new ArrayList<>(0);
        for (Employee employee : employeeMap.values()) {
            if (employee.getDepartment().contentEquals(department)) {
                subEmployeeList.add(employee);

            }
        }
        if (subEmployeeList.isEmpty()) {
            System.out.println("В отделе нет сотрудников");
        }
        return subEmployeeList;
    }
//    создание субмассива отдела для поиска свойств экземпляра Employee в нем

//    public void toIndexSalary(int percent) {
//        int increaseAmount;
//        for (Employee employee : employees) {
//            if (employee != null) {
//                increaseAmount = employee.getSalary() * percent / 100;
//                employee.setSalary(employee.getSalary() + increaseAmount);
//
//            }
//        }
//    }
//
//    public void findEmployeesMinSalaryByDep(String department) {
//        isDepartment(department);
//        int minSalary = 0;
//        String employeeName = "";
//        for (Employee employee : getEmployeesByDep(department)) {
//            if (employee.getSalary() < minSalary || minSalary == 0) {
//                minSalary = employee.getSalary();
//                employeeName = employee.getEmployeeInitials();
//            }
//        }
//        if (employeeName.equals("")) {
//            System.out.println("В указанном отделе нет сотрудников");
//        } else {
//            System.out.println("Сотрудник " + employeeName + " получает наименьшую зарплату в отделе " + department + " - " + minSalary + "руб.");
//        }
//    }
//
//    public void findEmployeesMaxSalaryOfDep(String department) {
//        isDepartment(department);
//        int maxSalary = 0;
//        String employeeName = "";
//        for (Employee employee : getEmployeesByDep(department)) {
//            if (employee.getSalary() > maxSalary || maxSalary == 0) {
//                maxSalary = employee.getSalary();
//                employeeName = employee.getEmployeeInitials();
//            }
//        }
//        if (employeeName.equals("")) {
//            System.out.println("В указанном отделе нет сотрудников");
//        } else {
//            System.out.println("Сотрудник " + employeeName + " получает наибольшую зарплату в отделе " + department + " - " + maxSalary + "руб.");
//        }
//
//
//    }
//
//    public void countSummarySalaryOfDep(String department) {
//        isDepartment(department);
//        int summarySalary = 0;
//        for (Employee employee : getEmployeesByDep(department)) {
//
//            summarySalary += employee.getSalary();
//        }
//        System.out.println("Сумма затрат на заработную плату отделу " + department + " в месяц, составляет - " + summarySalary + "руб.");
//    }
//
//
//    public void countAverageSalaryOfDep(String department) {
//        isDepartment(department);
//        int summarySalary = 0;
//        int employeesCounter = 0;
//        for (Employee employee : getEmployeesByDep(department)) {
//            summarySalary += employee.getSalary();
//            employeesCounter++;
//        }
//        int averageSummarySalary = summarySalary / employeesCounter;
//        System.out.println("Средняя заработная плата за месяц в отделе " + department + " составляет - " + averageSummarySalary + "руб.");
//    }
//
//    public void toIndexSalaryOfDep(String department, int percent) {
//        int increaseAmount;
//        for (Employee employee : getEmployeesByDep(department)) {
//            if (employee != null) {
//                increaseAmount = employee.getSalary() * percent / 100;
//                employee.setSalary(employee.getSalary() + increaseAmount);
//
//            }
//        }
//        ;
//    }
//
//    public void printDepartment(String department) {
//        isDepartment(department);
//        System.out.println("Сотрудники отдела " + department);
//        for (Employee employee : getEmployeesByDep(department)) {
//            if (employee == null) {
//                System.out.println("В отделе нет сотрудников");
//            }
//
//            System.out.println(employee.getEmployeeInitials() + ", заработная плата - " + employee.getSalary() + "руб. id - " + employee.getId());
//        }
//    }
//
//    public void printWhoEarnLess(int salary) {
//        System.out.println("Сотрудники зарабатывающие менее " + salary + " руб.");
//        int existCounter = 0;
//        for (Employee employee : employees) {
//            if (employee != null && employee.getSalary() < salary) {
//                existCounter = employee.getSalary();
//                System.out.println(employee);
//            }
//        }
//        if (existCounter == 0) {
//            System.out.println("Сотрудников с зарплатой ниже " + salary + "руб. нет");
//        }
//    }
//
//    public void printWhoEarnMore(int salary) {
//        System.out.println("Сотрудники зарабатывающие более " + salary + " руб.");
//        int existCounter = 0;
//        for (Employee employee : employees) {
//            if (employee != null && employee.getSalary() >= salary) {
//                existCounter = employee.getSalary();
//                System.out.println(employee);
//            }
//        }
//        if (existCounter == 0) {
//            System.out.println("Сотрудников с зарплатой выше или равной " + salary + "руб. нет");
//        }
//    }
//
////    –––––––––––––––––––– Last Level –––––––––––––––––––––––
//
//    int searchEmployee(String surname, String name, String patronymic) {
//        String searchedPerson = surname + " " + name + " " + patronymic;
//        boolean employeeFound = false;
//        int employeeFoundIndex = 0;
//        for (Employee employee : employees) {
//            if (employee != null && employee.getEmployeeInitials().contentEquals(searchedPerson)) {
//                employeeFound = true;
//                break;
//            }
//            employeeFoundIndex++;
//        }
//        if (employeeFound) {
//            return employeeFoundIndex;
//        } else {
//            return -1;
//        }
//
//    }
//
//    int searchEmployee(int id) {
//        int searchedPersonId = id;
//        boolean employeeFound = false;
//        int employeeFoundIndex = 0;
//        for (Employee employee : employees) {
//            if (employee != null && employee.getId() == id) {
//                employeeFound = true;
//                break;
//            }
//            employeeFoundIndex++;
//        }
//        if (employeeFound) {
//            return employeeFoundIndex;
//        } else {
//            return -1;
//        }
//    }
//
//    //    /\/\/\/\/\/\/\/\/\/\/\/\/\/\ util private methods /\/\/\/\/\/\/\/\/\/\/\/\/\/\
//    public void addNewEmployee(String surname, String name, String patronymic, String department, int salary) {
//        int voidSpotNumber = 0;
//        boolean isVacancy = false;
//        for (Employee employee : employees) {
//            if (employee == null) {
//                isVacancy = true;
//                break;
//            }
//            voidSpotNumber++;
//        }
//        if (isVacancy) {
//            employees[voidSpotNumber] = new Employee(surname, name, patronymic, department, salary);
//            System.out.println("Сотрудник добавлен");
//        } else {
//            throw new RuntimeException("Свободных вакансий нет. Чтобы нанять кого-то нужного, нужно сначала уволить кого-нибудь ненужного");
//        }
//    }
//
//    public void dismissEmployee(String surname, String name, String patronymic) {
//        int foundEmployeeIndex = searchEmployee(surname, name, patronymic);
//        if (foundEmployeeIndex != -1) {
//            System.out.println("Сотрудник " + employees[foundEmployeeIndex].getEmployeeInitials() + " уволен");
//            employees[foundEmployeeIndex] = null;
//        } else {
//            throw new IllegalArgumentException("Сотрудник с такими ФИО не найден, попробуйте поиск по id");
//        }
//    }
//
//    public void dismissEmployee(int id) {
//        int foundEmployeeIndex = searchEmployee(id);
//
//        if (foundEmployeeIndex != -1) {
//            System.out.println("Сотрудник " + employees[foundEmployeeIndex].getEmployeeInitials() + " уволен");
//            employees[foundEmployeeIndex] = null;
//        } else {
//            throw new IllegalArgumentException("Сотрудник с таким id не найден, попробуйте поиск по ФИО");
//        }
//    }
//
//
//    public void changeEmployeesSalary(String surname, String name, String patronymic, int changeSalary) {
//
//        int foundEmployeeIndex = searchEmployee(surname, name, patronymic);
//        if (foundEmployeeIndex != -1) {
//            employees[foundEmployeeIndex].setSalary(employees[foundEmployeeIndex].getSalary() + changeSalary);
//            System.out.println("Зарплата сотрудника " + employees[foundEmployeeIndex].getEmployeeInitials() + " (id: " + employees[foundEmployeeIndex].getId() + ") изменена");
//        } else {
//            System.out.println("Сотрудник не найден");
//        }
//    }
//
//    public void changeEmployeesSalary(int id, int changeSalary) {
//
//        int foundEmployeeIndex = searchEmployee(id);
//        if (foundEmployeeIndex != -1) {
//            employees[foundEmployeeIndex].setSalary(employees[foundEmployeeIndex].getSalary() + changeSalary);
//            System.out.println("Зарплата сотрудника " + employees[foundEmployeeIndex].getEmployeeInitials() + " (id: " + employees[foundEmployeeIndex].getId() + ") изменена");
//        } else {
//            System.out.println("Сотрудник не найден");
//        }
//    }
//
//    public void changeEmployeeDepartment(String surname, String name, String patronymic, String department) {
//        int foundEmployeeIndex = searchEmployee(surname, name, patronymic);
//        if (foundEmployeeIndex != -1) {
//            employees[foundEmployeeIndex].setDepartment(department);
//            System.out.println("Сотрудник " + employees[foundEmployeeIndex].getEmployeeInitials() + " переведен в отдел " + employees[foundEmployeeIndex].getDepartment());
//        } else {
//            System.out.println("Сотрудник не найден");
//        }
//    }
//
//    public void changeEmployeeDepartment(int id, String department) {
//        isDepartment(department);
//        int foundEmployeeIndex = searchEmployee(id);
//        if (foundEmployeeIndex != -1) {
//            employees[foundEmployeeIndex].setDepartment(department);
//            System.out.println("Сотрудник " + employees[foundEmployeeIndex].getEmployeeInitials() + " переведен в отдел " + employees[foundEmployeeIndex].getDepartment());
//        } else {
//            System.out.println("Сотрудник не найден");
//        }
//    }
//
//    public String[] printActualDepartments() {
//        int departmentsAmount = 0;
//        for (Employee employee : employees) {
//            if (employee != null) {
//                departmentsAmount = employee.getDepartments().size();
//                break;
//            }
//        }
//        String[] actualDepartments = new String[departmentsAmount];
//        for (Employee employee : employees) {
//            if (employee != null) {
//                for (int i = 0; i < employee.getDepartments().length; i++) {
//                    actualDepartments[i] = employee.getDepartments()[i];
//                }
//
//                break;
//            }
//        }
//
//        return actualDepartments;
//    }
//
//    public void printAllDepartmentPersonnel() {
//
//        for (String actualDepartment : printActualDepartments()) {
//            System.out.println("Отдел " + actualDepartment + ":");
//            for (Employee employee : getEmployeesByDep(actualDepartment)) {
//                if (employee == null) {
//                    System.out.println("В отделе нет сотрудников");
//                }
//
//                System.out.println(employee.getEmployeeInitials() + ", id: " + employee.getId());
//
//            }
//        }
//    }
//
//
//    –––––––––––––––––––––––    Class End ––––––––––––––––––––––––
}
