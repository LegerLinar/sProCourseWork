import pro.sky.java.course1.course.Employee;

public class Main {
    public static void main(String[] args) {
        Employee[] employees = new Employee[10];
        employees[0] = new Employee("Кисложопкин", "Аркадий", "Васильевич", "1", 35000);
        employees[2] = new Employee("Селиванов", "Акакий", "Александрович", "4", 32000);
        employees[4] = new Employee("Кулиджи", "Казимир", "Космосович", "3", 42000);

        System.out.println(findEmployeeMaxSalary(employees));
        System.out.println(findEmployeeMinSalary(employees));
        showEmployeesData(employees);
        System.out.println(countMonthSalaryExpenses(employees));
        System.out.println(countAverageMonthSalary(employees));
        showEmployeesNames(employees);

        //     ------------------------------------- NEXT LEVEL CALLS AND DATA -------------------------------------

        employees[1] = new Employee("Франклин", "Бенджамин", "Батькович", "5", 200_000);
        employees[3] = new Employee("Джугашвили", "Иосиф", "Виссарионович", "5", 1_000);
        employees[5] = new Employee("Хирохито", "Сёма", "Ёсихитович", "4", 100_000);

        toIndexSalary(employees, 11);
        showEmployeesData(employees);
        findEmployeeWithMinSalaryOfDepartment(employees, "5");

    }
//     ------------------------------------- DEFAULT METHODS AND DATA -------------------------------------


    public static void showEmployeesData(Employee[] employeesList) {
        System.out.println("Личный состав:");
        for (Employee employee : employeesList) {
            if (employee != null) {
                System.out.println(employee);
            } else {
                System.out.println("Вакантное место");
            }
        }
    }

    public static int countMonthSalaryExpenses(Employee[] employeesList) {
        int monthSalaryExpenses = 0;
        for (Employee employee : employeesList) {
            if (employee != null) {
                monthSalaryExpenses += employee.getSalary();
            }
        }
        return monthSalaryExpenses;
    }

    public static String findEmployeeMinSalary(Employee[] employeesList) {
        int minSalary = 0;
        String employeeWithMinSalary = "";
        for (Employee employee : employeesList) {
            if (employee != null && employee.getSalary() < minSalary || minSalary == 0 && employee != null) {
                minSalary = employee.getSalary();
                employeeWithMinSalary = employee.toString();
            }
        }
        return employeeWithMinSalary;

    }

    public static String findEmployeeMaxSalary(Employee[] employeesList) {
        int maxSalary = 0;
        String employeeWithMaxSalary = "";
        for (Employee employee : employeesList) {
            if (employee != null && employee.getSalary() > maxSalary) {
                maxSalary = employee.getSalary();
                employeeWithMaxSalary = employee.toString();
            }
        }
        return employeeWithMaxSalary;
    }

    public static int countAverageMonthSalary(Employee[] employeesList) {
        int totalMonthSalary = 0;
        int employeesCounter = 0;
        for (Employee employee : employeesList) {
            if (employee != null) {
                totalMonthSalary += employee.getSalary();
                employeesCounter++;
            }
        }
        return totalMonthSalary / employeesCounter;
    }

    public static void showEmployeesNames(Employee[] employees) {
        StringBuilder employeesList = new StringBuilder();
        for (Employee employee : employees) {

            if (employee != null) {
                employeesList.append(employee.getEmployeeInitials()).append("\n");
            }
        }
        System.out.println(employeesList);
    }


    // ------------------------------------- NEXT LEVEL METHODS   -------------------------------------
    public static void toIndexSalary(Employee[] employees, int percent) {
        int increaseAmount;
        for (Employee employee : employees) {
            if (employee != null) {
                increaseAmount = employee.getSalary() * percent / 100;
                employee.setSalary(employee.getSalary() + increaseAmount);

            }
        }
    }

    public static void findEmployeeWithMinSalaryOfDepartment(Employee[] employees, String department) {
        int minSalary = 0;
        String employeeName = "";
        for (Employee employee : employees) {
            if (employee != null && employee.getDepartment().equals(department)) {
                if (employee.getSalary() < minSalary || minSalary == 0) {
                    minSalary = employee.getSalary();
                    employeeName = employee.getEmployeeInitials();
                }
            }
        }
        if (employeeName.equals("")) {
            System.out.println("В указанном отделе нет сотрудников");
        } else {
            System.out.println("Сотрудник " + employeeName + " получает наименьшую зарплату в отделе " + department);
        }
    }
}
//    -------------------------------------    class end -------------------------------------



