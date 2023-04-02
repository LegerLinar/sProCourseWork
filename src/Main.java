import pro.sky.java.course1.course.EmployeeBook;

public class Main {
    public static void main(String[] args) {

        EmployeeBook employeeBook = new EmployeeBook();
//        System.out.println(employeeBook.findEmployeeMaxSalary());
//        System.out.println(employeeBook.findEmployeeMinSalary());
//        employeeBook.printEmployeesData();
//        System.out.println(employeeBook.countMonthSalaryExpenses());
//        System.out.println(employeeBook.countAverageMonthSalary());
//        employeeBook.showEmployeesNames();

        //     ------------------------------------- NEXT LEVEL CALLS AND DATA -------------------------------------


//        employeeBook.toIndexSalary(25);
//        employeeBook.printEmployeesData();
//        employeeBook.findEmployeesMinSalaryByDep("5");
//        employeeBook.findEmployeesMaxSalaryOfDep("5");
//        employeeBook.countSummarySalaryOfDep("5");
//        employeeBook.countAverageSalaryOfDep("1");
//        employeeBook.printEmployeesData();
//        employeeBook.toIndexSalaryOfDep("5", 100);
//        employeeBook.printEmployeesData();
//
//        employeeBook.printDepartment("1");
//        employeeBook.printWhoEarnLess(50000);
//        employeeBook.printWhoEarnMore(70_000);

        //     ------------------------------------- NEXT LEVEL CALLS AND DATA -------------------------------------

        employeeBook.printEmployeesData();
        employeeBook.addNewEmployee("Батиков", "Евгеша", "Батикович", "2", 1_000_000);
        employeeBook.addNewEmployee("Батиков", "Евгеша", "Батикович", "2", 1_000_000);
        employeeBook.addNewEmployee("Батиков", "Евгеша", "Батикович", "2", 1_000_000);
        employeeBook.addNewEmployee("Батиков", "Евгеша", "Батикович", "2", 1_000_000);
//        employeeBook.addNewEmployee("Батиков", "Евгеша", "Батикович", "2", 1_000_000); ------- а вот это уже перебор
        employeeBook.printEmployeesData();


    }

//     ------------------------------------- DEFAULT METHODS AND DATA -------------------------------------


//    public static void printEmployeesData(Employee[] employeesList) {
//        System.out.println("Личный состав:");
//        for (Employee employee : employeesList) {
//            if (employee != null) {
//                System.out.println(employee);
//            } else {
//                System.out.println("Вакантное место");
//            }
//        }
//    }
//
//    public static int countMonthSalaryExpenses(Employee[] employeesList) {
//        int monthSalaryExpenses = 0;
//        for (Employee employee : employeesList) {
//            if (employee != null) {
//                monthSalaryExpenses += employee.getSalary();
//            }
//        }
//        return monthSalaryExpenses;
//    }
//
//    public static String findEmployeeMinSalary(Employee[] employeesList) {
//        int minSalary = 0;
//        String employeeWithMinSalary = "";
//        for (Employee employee : employeesList) {
//            if (employee != null && employee.getSalary() < minSalary || minSalary == 0 && employee != null) {
//                minSalary = employee.getSalary();
//                employeeWithMinSalary = employee.toString();
//            }
//        }
//        return employeeWithMinSalary;
//
//    }
//
//    public static String findEmployeeMaxSalary(Employee[] employeesList) {
//        int maxSalary = 0;
//        String employeeWithMaxSalary = "";
//        for (Employee employee : employeesList) {
//            if (employee != null && employee.getSalary() > maxSalary) {
//                maxSalary = employee.getSalary();
//                employeeWithMaxSalary = employee.toString();
//            }
//        }
//        return employeeWithMaxSalary;
//    }
//
//    public static int countAverageMonthSalary(Employee[] employeesList) {
//        int totalMonthSalary = 0;
//        int employeesCounter = 0;
//        for (Employee employee : employeesList) {
//            if (employee != null) {
//                totalMonthSalary += employee.getSalary();
//                employeesCounter++;
//            }
//        }
//        return totalMonthSalary / employeesCounter;
//    }
//
//    public static void showEmployeesNames(Employee[] employees) {
//        StringBuilder employeesList = new StringBuilder();
//        for (Employee employee : employees) {
//
//            if (employee != null) {
//                employeesList.append(employee.getEmployeeInitials()).append("\n");
//            }
//        }
//        System.out.println(employeesList);
//    }
//
//
//    // ------------------------------------- NEXT LEVEL METHODS   -------------------------------------
//
//    public static void isDepartment(Employee[] employees, String department) {
//        if (!employees[0].getDepartments().contains(department)) {
//            throw new RuntimeException("Такого отдела не существует");
//        }
//    }
//    //проверка на существование отдела
//
//    public static Employee[] getEmployeesByDep(Employee[] employees, String department) {
////        вернет субмассив Employee[] сортированный по department.
//        int subEmployeesCounter = 0;
//        for (Employee employee : employees) {
//            if (employee != null && employee.getDepartment().equals(department)) {
//                subEmployeesCounter++;
//            }
//        }
//
//        Employee[] subEmployeesList = new Employee[subEmployeesCounter];
//
//        int subEmployeesIndexCounter = 0;
//
//        for (Employee employee : employees) {
//            if (employee != null && employee.getDepartment().equals(department)) {
//                subEmployeesList[subEmployeesIndexCounter] = employee;
//                subEmployeesIndexCounter++;
//            }
//        }
//        return subEmployeesList;
//    }
////    создание субмассива отдела для поиска свойств экземпляра Employee в нем
//
//    public static void toIndexSalary(Employee[] employees, int percent) {
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
//    public static void findEmployeesMinSalaryByDep(Employee[] employees, String department) {
//        isDepartment(employees, department);
//        int minSalary = 0;
//        String employeeName = "";
//        for (Employee employee : getEmployeesByDep(employees, department)) {
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
//    public static void findEmployeesMaxSalaryOfDep(Employee[] employees, String department) {
//        isDepartment(employees, department);
//        int maxSalary = 0;
//        String employeeName = "";
//        for (Employee employee : getEmployeesByDep(employees, department)) {
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
//    public static void countSummarySalaryOfDep(Employee[] employees, String department) {
//        isDepartment(employees, department);
//        int summarySalary = 0;
//        for (Employee employee : getEmployeesByDep(employees, department)) {
//
//            summarySalary += employee.getSalary();
//        }
//        System.out.println("Сумма затрат на заработную плату отделу " + department + " в месяц, составляет - " + summarySalary + "руб.");
//    }
//
//
//    public static void countAverageSalaryOfDep(Employee[] employees, String department) {
//        isDepartment(employees, department);
//        int summarySalary = 0;
//        int employeesCounter = 0;
//        for (Employee employee : getEmployeesByDep(employees, department)) {
//            summarySalary += employee.getSalary();
//            employeesCounter++;
//        }
//        int averageSummarySalary = summarySalary / employeesCounter;
//        System.out.println("Средняя заработная плата за месяц в отделе " + department + " составляет - " + averageSummarySalary + "руб.");
//    }
//
//    public static void toIndexSalaryOfDep(Employee[] employees, String department, int percent) {
//        toIndexSalary(getEmployeesByDep(employees, department), percent);
//    }
//
//    public static void printDepartment(Employee[] employees, String department) {
//        isDepartment(employees, department);
//        System.out.println("Сотрудники отдела " + department);
//        for (Employee employee : getEmployeesByDep(employees, department)) {
//            if (employee == null) {
//                System.out.println("В отделе нет сотрудников");
//            }
//            System.out.println(employee.getEmployeeInitials() + ", заработная плата - " + employee.getSalary() + "руб. id - " + employee.getId());
//        }
//    }
//
//    public static void printWhoEarnLess(Employee[] employees, int salary) {
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
//    public static void printWhoEarnMore(Employee[] employees, int salary) {
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

//    -------------------------------------    class end -------------------------------------
}
//    -------------------------------------    refactor for code duplicates templates -------------------------------------

//    public static boolean isDepartment(Employee[] employees, String department) {
//        if (employees[0].getDepartments().contains(department)) {
//            return true;
//        } else {
//            return false;
//        }
//    }


// шаблон для создания под-массива с сотрудниками отдела
//public static boolean isDepartmentEqual(Employee[] employees, String department) {
//    employee.getDepartment().equals(department)
//}

