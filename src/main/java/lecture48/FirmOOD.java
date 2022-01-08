package lecture48;

public class FirmOOD extends Company {
    private String[] owners;
    private double startCapital;
    private double currentCapital;

    public String[] getOwners() {
        return owners;
    }

    public void setOwners(String[] owners) {
        this.owners = owners;
    }

    public double getStartCapital() {
        return startCapital;
    }

    public void setStartCapital(double startCapital) {
        this.startCapital = startCapital;
    }

    public double getCurrentCapital() {
        return currentCapital;
    }

    public void setCurrentCapital(double currentCapital) {
        this.currentCapital = currentCapital;
    }
    FirmOOD(String firmName, String startDate, String bulstat, String[] owners, double startCapital, double currentCapital){
        super.setFirmName(firmName);
        super.setStartDate(startDate);
        super.setBulstat(bulstat);
        this.setOwners(owners);
        this.setStartCapital(startCapital);
        this.setCurrentCapital(currentCapital);
    }


}
