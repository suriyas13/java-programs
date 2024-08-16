public class TestEmployee {
    public static void main(String[] args) {
        // Creating an Employee object
        Employee emp = new Employee("John Doe", 55000.00, 2015, "NI123456C");

        // Testing getter methods
        System.out.println("Employee Name: " + emp.getName());
        System.out.println("Annual Salary: " + emp.getSalary());
        System.out.println("Year Started: " + emp.getYear());
        System.out.println("National Insurance Number: " + emp.getInsurance());

        // Testing setter methods
        emp.setName("Jane Doe");
        emp.setSalary(60000.00);
        emp.setYear(2018);
        emp.setInsurance("NI654321B");

        // Testing getter methods again after setting new values
        System.out.println("\nUpdated Employee Information:");
        System.out.println("Employee Name: " + emp.getName());
        System.out.println("Annual Salary: " + emp.getSalary());
        System.out.println("Year Started: " + emp.getYear());
        System.out.println("National Insurance Number: " + emp.getInsurance());
    }
}
