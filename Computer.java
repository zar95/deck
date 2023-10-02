public class Computer {
    private String computerNumber;
    private String icdModel;
    private int RamSize;
    private  int hddSize;
    private boolean hasGPU;

    public Computer(String computerNumber, String icdModel, int ramSize, int hddSize, boolean hasGPU) {
        this.computerNumber = computerNumber;
        this.icdModel = icdModel;
        RamSize = ramSize;
        this.hddSize = hddSize;
        this.hasGPU = hasGPU;
    }

    public void setComputerNumber(String computerNumber) {
        this.computerNumber = computerNumber;
    }

    public void setIcdModel(String icdModel) {
        this.icdModel = icdModel;
    }

    public void setRamSize(int ramSize) {
        RamSize = ramSize;
    }

    public void setHddSize(int hddSize) {
        this.hddSize = hddSize;
    }

    public void setHasGPU(boolean hasGPU) {
        this.hasGPU = hasGPU;
    }

    public String getComputerNumber() {
        return computerNumber;
    }

    public String getIcdModel() {
        return icdModel;
    }

    public int getRamSize() {
        return RamSize;
    }

    public int getHddSize() {
        return hddSize;
    }

    public boolean isHasGPU() {
        return hasGPU;
    }

    public boolean equals(Computer c2){

        return this.computerNumber.equals(c2.computerNumber)? true : false;

    }

public String tostring(){
         return String.format("Computer number = %s  : ICD MOdel = %s : RAM size = %d : HDD size = %d : hasGPU =",computerNumber,icdModel,getRamSize(),hddSize,hasGPU );
}

public Computer clone(){
        return new Computer(this.computerNumber,this.icdModel,this.RamSize,this.hddSize,this.hasGPU);

}

}
