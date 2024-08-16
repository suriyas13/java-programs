
class Employee extends Person {
    double salary;
    int year_work;
    String insurance_number;

    public Employee(String name, double s, int y, String i) {
        super(name);
        salary = s;
        year_work = y;
        insurance_number = i;
    }

    public void setSalary(double s) {
        salary = s;
    }

    public double getSalary() {
        return salary;
    }

    public void setYear(int y) {
        year_work = y;
    }

    public int getYear() {
        return year_work;
    }

    public void setInsurance(String i) {
        insurance_number = i;
    }

    public String getInsurance() {
        return insurance_number;
    }
}