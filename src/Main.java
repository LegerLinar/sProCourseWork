import pro.sky.java.course1.course.Employee;

public class Main {
    public static void main(String[] args) {
        Employee[] employees = new Employee[10];
        employees[0] = new Employee("Кисложопкин", "Аркадий", "Васильевич", 1, 35000);
        employees[2] = new Employee("Селиванов", "Акакий", "Александрович", 1, 32000);
        employees[4] = new Employee("Кулиджи", "Казимир", "Космосович", 1, 42000);

        showEmployeesData(employees);
        System.out.println(countMonthSalaryExpenses(employees));
        System.out.println(countAverageMonthSalary(employees));
        showEmployeesNames(employees);
    }

    public static void showEmployeesData(Employee[] employeesList) {
        System.out.println("Личный состав:");
        for (int i = 0; i < employeesList.length; i++) {
            if (employeesList[i] != null) {
                System.out.println(employeesList[i].toString());
            } else {
                System.out.println("Вакантное место");
            }
        }
    }


    public static int countMonthSalaryExpenses(Employee[] employeesList){
        int monthSalaryExpenses = 0;
        for (int i = 0; i < employeesList.length; i++) {
            if (employeesList[i] != null) {
                monthSalaryExpenses += employeesList[i].getSalary();
            }
        }
        return monthSalaryExpenses;
        }

    public static String findEmployeeMinSalary(Employee[] employeesList){
        int minSalary = 0;
        String employeeWithMinSalary = "";
        for (int i = 0; i < employeesList.length; i++) {
            if(employeesList[i] != null && employeesList[i].getSalary() < minSalary || minSalary == 0 && employeesList[i] != null){
                minSalary = employeesList[i].getSalary();
                employeeWithMinSalary = employeesList[i].toString();
            }
            else{

            }
        }
        return employeeWithMinSalary;

    }

    public static String findEmployeeMaxSalary(Employee[] employeesList){
        int maxSalary = 0;
        String employeeWithMaxSalary = "";
        for (int i = 0; i < employeesList.length; i++) {
            if (employeesList[i] != null && employeesList[i].getSalary() > maxSalary) {
                maxSalary = employeesList[i].getSalary();
                employeeWithMaxSalary = employeesList[i].toString();
            }
        }
        return employeeWithMaxSalary;
    }

    public static int countAverageMonthSalary(Employee[] employeesList) {
        int totalMonthSalary = 0;
        int employeesCounter = 0;
        for (int i = 0; i < employeesList.length; i++) {
            if (employeesList[i] != null) {
                totalMonthSalary += employeesList[i].getSalary();
                employeesCounter++;
            }
        }
        return totalMonthSalary / employeesCounter;
    }

    public static void showEmployeesNames(Employee[] employees) {
        String employeesList = "";
        for (int i = 0; i < employees.length; i++) {

            if (employees[i] != null) {
                employeesList += employees[i].getSurname() + " " + employees[i].getName() + " " + employees[i].getPatronymic() + "\n";
            }
        }
        System.out.println(employeesList);
    }

//    -------------------------------------    class end -------------------------------------
}


