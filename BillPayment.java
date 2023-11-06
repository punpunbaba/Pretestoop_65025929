public class BillPayment {
    private String billType;
    private int billLastUnit;
    private int billCurrentUnit;
    private double billResult;

    public BillPayment(String type, int lastUnit) {
        billType = type;
        billLastUnit = lastUnit;
        billCurrentUnit = 0;
        billResult = 0.0;
    }

    public int getBillCurrentUnit() {
        return billCurrentUnit;
    }

    public int calculateUnit() {
        return billCurrentUnit - billLastUnit;
    }

    public void displayBill() {
        System.out.println("My payment bill is: " + billType);
        System.out.println("The result is: " + billResult);
    }

}
