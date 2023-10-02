import java.util.Arrays;

public class Lab {
    private String Lab_id;
    private Computer[] computers;
    private LabStatus status ;
    private Employee labAttendent;

    public Lab(String lab_id, Computer[] computer, LabStatus status, Employee labAttendent) {
        Lab_id = lab_id;
        this.computers = computers;
        this.status = status;
        this.labAttendent = labAttendent;
    }

    public void setLab_id(String lab_id) {
        Lab_id = lab_id;
    }

    public void setComputer(Computer[] computer) {
        this.computers = computer;
    }

    public void setStatus(LabStatus status) {
        this.status = status;
    }

    public void setLabAttendent(Employee labAttendent) {
        this.labAttendent = labAttendent;
    }

    public String getLab_id() {
        return Lab_id;
    }

    public Computer[] getComputer() {
        return computers;
    }

    public LabStatus getStatus() {
        return status;
    }

    public Employee getLabAttendent() {
        return labAttendent;
    }
    int counter = 0;
    public void addComputer(Computer computer){
        computers[counter++] = new Computer(computer.getComputerNumber(), computer.getIcdModel(), computer.getRamSize(), computer.getHddSize(), computer.isHasGPU());
    }

    @Override
    public String toString() {
        return "Lab{" +
                "Lab_id='" + Lab_id + '\'' +
                ", computers=" + Arrays.toString(computers) +
                ", status=" + status +
                ", labAttendent=" + labAttendent +
                '}';
    }
}
