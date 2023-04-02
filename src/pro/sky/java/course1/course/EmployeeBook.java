package pro.sky.java.course1.course;

public class EmployeeBook {
    private Employee[] employees;

    public EmployeeBook() {
        employees = new Employee[10];
        employees[0] = new Employee("Кисложопкин", "Аркадий", "Васильевич", "1", 35000);
        employees[2] = new Employee("Селиванов", "Акакий", "Александрович", "4", 32000);
        employees[3] = new Employee("Кулиджи", "Казимир", "Космосович", "3", 42000);
        employees[4] = new Employee("Франклин", "Бенджамин", "Батькович", "5", 200_000);
        employees[5] = new Employee("Джугашвили", "Иосиф", "Виссарионович", "5", 1_000);
        employees[6] = new Employee("Хирохито", "Сёма", "Ёсихитович", "4", 100_000);
    }

//

    public Employee[] getEmployees() {
        return employees;
    }

    public void setEmployees(Employee[] employees) {
        this.employees = employees;
    }

    public void printEmployeesData() {
        System.out.println("Личный состав:");
        for (Employee employee : employees) {
            if (employee != null) {
                System.out.println(employee);
            } else {
                System.out.println("Вакантное место");
            }
        }
    }

    public int countMonthSalaryExpenses() {
        int monthSalaryExpenses = 0;
        for (Employee employee : employees) {
            if (employee != null) {
                monthSalaryExpenses += employee.getSalary();
            }
        }
        return monthSalaryExpenses;
    }

    public String findEmployeeMinSalary() {
        int minSalary = 0;
        String employeeWithMinSalary = "";
        for (Employee employee : employees) {
            if (employee != null && employee.getSalary() < minSalary || minSalary == 0 && employee != null) {
                minSalary = employee.getSalary();
                employeeWithMinSalary = employee.toString();
            }
        }
        return employeeWithMinSalary;

    }

    public String findEmployeeMaxSalary() {
        int maxSalary = 0;
        String employeeWithMaxSalary = "";
        for (Employee employee : employees) {
            if (employee != null && employee.getSalary() > maxSalary) {
                maxSalary = employee.getSalary();
                employeeWithMaxSalary = employee.toString();
            }
        }
        return employeeWithMaxSalary;
    }

    public int countAverageMonthSalary() {
        int totalMonthSalary = 0;
        int employeesCounter = 0;
        for (Employee employee : employees) {
            if (employee != null) {
                totalMonthSalary += employee.getSalary();
                employeesCounter++;
            }
        }
        return totalMonthSalary / employeesCounter;
    }

    public void showEmployeesNames() {
        StringBuilder employeesString = new StringBuilder();
        for (Employee employee : employees) {

            if (employee != null) {
                employeesString.append(employee.getEmployeeInitials()).append("\n");
            }
        }
        System.out.println(employeesString);
    }


    // ------------------------------------- NEXT LEVEL METHODS   -------------------------------------

    public void isDepartment(String department) {
        byte verifier = 0;
        for (Employee employee : employees) {
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

    public Employee[] getEmployeesByDep(String department) {
//        вернет субмассив Employee[] сортированный по department.
        int subEmployeesCounter = 0;
        for (Employee employee : employees) {
            if (employee != null && employee.getDepartment().equals(department)) {
                subEmployeesCounter++;
            }
        }
        if (subEmployeesCounter == 0) {
            System.out.println("В отделе нет сотрудников");
        }
        Employee[] subEmployees = new Employee[subEmployeesCounter];

        int subEmployeesIndexCounter = 0;

        for (Employee employee : employees) {
            if (employee != null && employee.getDepartment().equals(department)) {
                subEmployees[subEmployeesIndexCounter] = employee;
                subEmployeesIndexCounter++;
            }
        }
        return subEmployees;
    }
//    создание субмассива отдела для поиска свойств экземпляра Employee в нем

    public void toIndexSalary(int percent) {
        int increaseAmount;
        for (Employee employee : employees) {
            if (employee != null) {
                increaseAmount = employee.getSalary() * percent / 100;
                employee.setSalary(employee.getSalary() + increaseAmount);

            }
        }
    }

    public void findEmployeesMinSalaryByDep(String department) {
        isDepartment(department);
        int minSalary = 0;
        String employeeName = "";
        for (Employee employee : getEmployeesByDep(department)) {
            if (employee.getSalary() < minSalary || minSalary == 0) {
                minSalary = employee.getSalary();
                employeeName = employee.getEmployeeInitials();
            }
        }
        if (employeeName.equals("")) {
            System.out.println("В указанном отделе нет сотрудников");
        } else {
            System.out.println("Сотрудник " + employeeName + " получает наименьшую зарплату в отделе " + department + " - " + minSalary + "руб.");
        }
    }

    public void findEmployeesMaxSalaryOfDep(String department) {
        isDepartment(department);
        int maxSalary = 0;
        String employeeName = "";
        for (Employee employee : getEmployeesByDep(department)) {
            if (employee.getSalary() > maxSalary || maxSalary == 0) {
                maxSalary = employee.getSalary();
                employeeName = employee.getEmployeeInitials();
            }
        }
        if (employeeName.equals("")) {
            System.out.println("В указанном отделе нет сотрудников");
        } else {
            System.out.println("Сотрудник " + employeeName + " получает наибольшую зарплату в отделе " + department + " - " + maxSalary + "руб.");
        }


    }

    public void countSummarySalaryOfDep(String department) {
        isDepartment(department);
        int summarySalary = 0;
        for (Employee employee : getEmployeesByDep(department)) {

            summarySalary += employee.getSalary();
        }
        System.out.println("Сумма затрат на заработную плату отделу " + department + " в месяц, составляет - " + summarySalary + "руб.");
    }


    public void countAverageSalaryOfDep(String department) {
        isDepartment(department);
        int summarySalary = 0;
        int employeesCounter = 0;
        for (Employee employee : getEmployeesByDep(department)) {
            summarySalary += employee.getSalary();
            employeesCounter++;
        }
        int averageSummarySalary = summarySalary / employeesCounter;
        System.out.println("Средняя заработная плата за месяц в отделе " + department + " составляет - " + averageSummarySalary + "руб.");
    }

    public void toIndexSalaryOfDep(String department, int percent) {
        int increaseAmount;
        for (Employee employee : getEmployeesByDep(department)) {
            if (employee != null) {
                increaseAmount = employee.getSalary() * percent / 100;
                employee.setSalary(employee.getSalary() + increaseAmount);

            }
        }
        ;
    }

    public void printDepartment(String department) {
        isDepartment(department);
        System.out.println("Сотрудники отдела " + department);
        for (Employee employee : getEmployeesByDep(department)) {
            if (employee == null) {
                System.out.println("В отделе нет сотрудников");
            }

            System.out.println(employee.getEmployeeInitials() + ", заработная плата - " + employee.getSalary() + "руб. id - " + employee.getId());
        }
    }

    public void printWhoEarnLess(int salary) {
        System.out.println("Сотрудники зарабатывающие менее " + salary + " руб.");
        int existCounter = 0;
        for (Employee employee : employees) {
            if (employee != null && employee.getSalary() < salary) {
                existCounter = employee.getSalary();
                System.out.println(employee);
            }
        }
        if (existCounter == 0) {
            System.out.println("Сотрудников с зарплатой ниже " + salary + "руб. нет");
        }
    }

    public void printWhoEarnMore(int salary) {
        System.out.println("Сотрудники зарабатывающие более " + salary + " руб.");
        int existCounter = 0;
        for (Employee employee : employees) {
            if (employee != null && employee.getSalary() >= salary) {
                existCounter = employee.getSalary();
                System.out.println(employee);
            }
        }
        if (existCounter == 0) {
            System.out.println("Сотрудников с зарплатой выше или равной " + salary + "руб. нет");
        }
    }

//    –––––––––––––––––––– Last Level –––––––––––––––––––––––

    public void addNewEmployee(String surname, String name, String patronymic, String department, int salary) {
        int voidSpotNumber = 0;
        boolean isVacancy = false;
        for (Employee employee : employees) {
            if (employee == null) {
                isVacancy = true;
                break;
            }
            voidSpotNumber++;
        }
        if (isVacancy) {
            employees[voidSpotNumber] = new Employee(surname, name, patronymic, department, salary);
            System.out.println("Сотрудник добавлен");
        } else {
            throw new RuntimeException("Свободных вакансий нет. Чтобы нанять кого-то нужного, нужно сначала уволить кого-нибудь ненужного");
        }
    }

    public void dismissEmployeeByFullName(String surname, String name, String patronymic) {
        String searchedPerson = surname + " " + name + " " + patronymic;
        int targetToDismissPlace = 0;
        boolean isVictimFound = false;
        for (Employee employee : employees) {
            if (employee != null && employee.getEmployeeInitials().contentEquals(searchedPerson)) {
                isVictimFound = true;
                break;
            }
            targetToDismissPlace++;
        }
        if (isVictimFound) {
            employees[targetToDismissPlace] = null;
            System.out.println("Сотрудник уволен");
        } else {
            throw new IllegalArgumentException("Сотрудник с такими ФИО не найден, попробуйте поиск по id");
        }
    }

    public void dismissEmployeeById(int id) {
        int targetToDismissPlace = 0;
        boolean isVictimFound = false;
        for (Employee employee : employees) {
            if (employee != null && employee.getId() == id) {
                isVictimFound = true;
                break;
            }
            targetToDismissPlace++;
        }
        if (isVictimFound) {
            employees[targetToDismissPlace] = null;
            System.out.println("Сотрудник уволен");
        } else {
            throw new IllegalArgumentException("Сотрудник с таким id не найден, попробуйте поиск по ФИО");
        }
    }

    //    boolean searchEmployee(String surname, String name, String patronymic, int id) {
//        String searchedPerson = surname + " " + name + " " + patronymic;
//        boolean employeeFound = false;
//        for (Employee employee : employees) {
//            if (employee != null && employee.getEmployeeInitials().contentEquals(searchedPerson) || employee != null && employee.getId() == id) {
//                employeeFound = true;
//                break;
//            }
//        }
//        return employeeFound;
//    }
    public void changeEmployeesSalary(String surname, String name, String patronymic, int changeSalary) {
        String searchedPerson = surname + " " + name + " " + patronymic;
        boolean employeeFound = false;
        String employeeFoundName = "";
        int employeeFoundId = 0;

        for (Employee employee : employees) {
            if (employee != null && employee.getEmployeeInitials().contentEquals(searchedPerson)) {
                employee.setSalary(employee.getSalary() + changeSalary);
                employeeFound = true;
                employeeFoundName = employee.getEmployeeInitials();
                employeeFoundId = employee.getId();
                break;
            }
        }

        if (employeeFound) {
            System.out.println("Зарплата сотрудника " + employeeFoundName + " ( id " + employeeFoundId + ") изменена");
        } else {
            System.out.println("Сотрудник не найден");
        }
    }
//    –––––––––––––––––––––––– Class End ––––––––––––––––––––––––
}
