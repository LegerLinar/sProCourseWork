import pro.sky.java.course1.course.Employee;

public class Main {
    public static void main(String[] args) {
        Employee annaPetrovna = new Employee("Petrova", "Anna", "Petrovna", 2, 3200);
        Employee annaPetrovna1 = new Employee("Petrova", "Anna", "Petrovna", 4, 3200);
        Employee annaPetrovna2 = new Employee("Petrova", "Anna", "Petrovna", 1, 3200);
        Employee annaPetrovna3 = new Employee("Petrova", "Anna", "Petrovna", 3, 3200);
        System.out.println(annaPetrovna.getDepartments());
    }
}