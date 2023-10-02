public class Employee {

    private String EmployeeId;
    private  String name;
    private final static String designation = "Lab Attendent";

    public Employee(String employeeId, String name) {
        EmployeeId = employeeId;
        this.name = name;
    }

    public void setEmployeeId(String employeeId) {
        EmployeeId = employeeId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmployeeId() {
        return EmployeeId;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "EmployeeId='" + EmployeeId + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
