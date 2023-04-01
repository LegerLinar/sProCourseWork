import pro.sky.java.course1.course.Employee;

public class Main {
    public static void main(String[] args) {
        Employee[] employees = new Employee[10];
        employees[1] = new Employee("a", "b", "c", 1, 35000);
//        employees[2] = new Employee("a", "b", "c", 1, 35000);
//        getEmployeesData(employees);
        countMonthSalaryExpenses(employees);

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


    public static void countMonthSalaryExpenses(Employee[] employeesList){
        int monthSalary = 0;
        for (int i = 0; i < employeesList.length; i++) {
            if (employeesList[i] != null) {
                monthSalary += employeesList[i].getSalary();
            }
        }
            System.out.println("Затраты на зарплату сотрудникам в месяц - " + monthSalary + "руб.");
        }
        }


