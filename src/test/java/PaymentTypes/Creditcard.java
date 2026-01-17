package PaymentTypes;

public class Creditcard implements Generalpayment {


    protected Double paymentID;
    protected Double transactionAmount;
    protected String bankName;

    public Creditcard(Double paymentID, Double transactionAmount, String bankName){
        this.paymentID = paymentID;
         this.transactionAmount = transactionAmount;
         this.bankName = bankName;
    }


    public void paymentProcessing(Double paymentID, Double transactionAmount, String bankName) {
        paymentID = this.paymentID;
        transactionAmount = this.transactionAmount;
        bankName  = this.bankName;
        System.out.println("the credit card id " + paymentID + "charged" + transactionAmount + "at " + bankName + ". ");
    }
}
