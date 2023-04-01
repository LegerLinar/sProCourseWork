import pro.sky.java.course1.course.Employee;

public class Main {
    public static void main(String[] args) {
        Employee[] employees = new Employee[10];
        employees[0] = new Employee("a", "b", "c", 1, 35000);
        employees[2] = new Employee("a", "b", "c", 1, 32000);
        employees[4] = new Employee("a", "b", "c", 1, 42000);

//        employees[2] = new Employee("a", "b", "c", 1, 35000);
//        getEmployeesData(employees);
//        countMonthSalaryExpenses(employees);
        System.out.println(findEmployeeMaxSalary(employees));
    }
    public static void getEmployeesData(Employee[] employeesList) {
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
            if (employeesList[i] != null && employeesList[i].getSalary() > maxSalary){
                maxSalary = employeesList[i].getSalary();
                employeeWithMaxSalary = employeesList[i].toString();
            }
        }
        return employeeWithMaxSalary;
    }
//    -------------------------------------    class end -------------------------------------
}


