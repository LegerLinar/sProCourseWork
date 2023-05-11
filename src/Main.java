import pro.sky.java.course1.course.EmployeeBook;

public class Main {
    public static void main(String[] args) {

// 1. Перенести проект с EmployeeBook на Map в качестве хранилища сотрудников,
// реализовав методы добавления, удаления и поиска.
//2. Продумать контракт для ключей, чтобы сотрудник
// с одним ФИО существовал только в одном экземпляре, корректно добавлялся и удалялся.
//3. Избавиться от циклов в методах по поиску сотрудника, заменив на методы Map.
//4. Переработать все методы по работе с хранилищем на работу с методами Map.

        EmployeeBook employeeBook = new EmployeeBook();
        employeeBook.printAllEmployeesData();
//        System.out.println(employeeBook.findEmployeeMaxSalary());
//        System.out.println(employeeBook.findEmployeeMinSalary());
//        employeeBook.printAllEmployeesData();
//        System.out.println(employeeBook.countMonthSalaryExpenses());
//        System.out.println(employeeBook.countAverageMonthSalary());
//        employeeBook.showEmployeesNames();

        //     ------------------------------------- MIDDLE LEVEL CALLS  -------------------------------------


//        employeeBook.toIndexSalary(25);
//        employeeBook.printAllEmployeesData();
//        employeeBook.findEmployeesMinSalaryByDep("5");
//        employeeBook.findEmployeesMaxSalaryOfDep("5");
//        employeeBook.countSummarySalaryOfDep("5");
//        employeeBook.countAverageSalaryOfDep("1");
//        employeeBook.printAllEmployeesData();
//        employeeBook.toIndexSalaryOfDep("5", 100);
//        employeeBook.printAllEmployeesData();
//
//        employeeBook.printDepartment("1");
//        employeeBook.printWhoEarnLess(50000);
//        employeeBook.printWhoEarnMore(70_000);

        //     ------------------------------------- LAST LEVEL CALLS  -------------------------------------

//        employeeBook.printAllEmployeesData();
//        employeeBook.addNewEmployee("Батиков", "Евгеша", "Батикович", "2", 1_000_000);
//        employeeBook.addNewEmployee("Батиков", "Евгеша", "Батикович", "2", 1_000_000);
//        employeeBook.addNewEmployee("Батиков", "Евгеша", "Батикович", "2", 1_000_000);
//        employeeBook.addNewEmployee("Батиков", "Евгеша", "Батикович", "2", 1_000_000);
//        employeeBook.addNewEmployee("Батиков", "Евгеша", "Батикович", "2", 1_000_000);
//        employeeBook.printAllEmployeesData();
//        employeeBook.dismissEmployee("Батиков", "Евгеша", "Батикович");
//        employeeBook.dismissEmployee(2);
//        employeeBook.changeEmployeesSalary("Батиков", "Евгеша", "Батикович", 50_000);
//        employeeBook.changeEmployeesSalary(4, 50_000);
//        employeeBook.changeEmployeeDepartment(5, "4");
//        employeeBook.printAllDepartmentPersonnel();
    }

//    -------------------------------------    class end -------------------------------------
}
