package lecture48;

public class FirmET extends Company implements Invoice{

    private String ownerName;
    private double startCapital;
    private double currentCapital;
    private int  invoiceNumber;

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
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

    FirmET(String firmName, String startDate, String bulstat, String ownerName, double startCapital, double currentCapital, int invoiceNumber){
        super.setFirmName(firmName);
        super.setStartDate(startDate);
        super.setBulstat(bulstat);
        this.setOwnerName(ownerName);
        this.setStartCapital(startCapital);
        this.setCurrentCapital(currentCapital);
        this.invoiceNumber=invoiceNumber;
    }

 double calcProfit() {
        return this.currentCapital-this.startCapital;
    }
    @Override
    public void printHeader(){
        String invoiceNumberString;
        int spaces=10-String.valueOf(this.invoiceNumber).length();
        invoiceNumberString = String.format("%"+spaces+"s", " ")+String.valueOf(this.invoiceNumber);
        System.out.println("=================================================================================================");
        System.out.printf ("                            INVOICE No %s                 %n",invoiceNumberString);
        System.out.printf("Firm Name:%s%n",this.getFirmName());
        System.out.printf("BULSTAT:%s%n",this.getBulstat());
        System.out.printf("MOL:%s%n",this.getOwnerName());
        System.out.println("=================================================================================================");
        this.invoiceNumber++;
    }
    @Override
    public void printProducts(){
        System.out.println("Not ready yet");
        System.out.println("*************************************************************************************************");
    }



}
