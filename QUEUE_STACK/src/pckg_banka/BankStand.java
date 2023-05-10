package pckg_banka;

public class BankStand {
    private int id;
    private static int ctrID = 1;
    private float processingTime;
    private boolean statusProcessing;

    public BankStand(float processingTime){
        this.id = ctrID++;
        this.processingTime = processingTime*id;
        statusProcessing = true;
    }
    public void changeBankStandStatus(boolean newStatus){
        this.statusProcessing = newStatus;
    }
}
