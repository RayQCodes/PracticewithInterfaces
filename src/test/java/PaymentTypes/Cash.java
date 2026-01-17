package PaymentTypes;

public class Cash implements Generalpayment {
    protected Double dollarAmount;
    protected Double typeofBills;
    protected String transferService;
    public Cash(Double dollarAmount, Double typeofBills, String transferService){
        this.dollarAmount = dollarAmount;
        this.typeofBills = typeofBills;
        this.transferService = transferService;
    }

    public void paymentProcessing(Double dollarAmount, Double typeOfBills, String transferService) {
        dollarAmount = this.dollarAmount;
        typeOfBills = this.typeofBills;
        transferService = this.transferService;

        System.out.println("thanks so much , you have decided to pay " + dollarAmount + "with " + typeOfBills + "using " + transferService);
        System.out.println("again thank you for using the cash transfer service to pay");
    }
}
