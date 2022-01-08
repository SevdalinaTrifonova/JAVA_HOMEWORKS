package lecture48;

public class Company {
    private String firmName;
    private String startDate;
    private String bulstat;

    public String getFirmName() {
        return firmName;
    }

    public void setFirmName(String firmName) {
        this.firmName = firmName;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getBulstat() {
        return bulstat;
    }

    public void setBulstat(String bulstat) {
        if (bulstat.length()==10) {
            this.bulstat = bulstat;
        }
    }


}
