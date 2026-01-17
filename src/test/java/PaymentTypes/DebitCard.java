package PaymentTypes;

public class DebitCard implements Generalpayment {
    Double transactionAmount;
    Double bankUserId;
    String bankName;

    public DebitCard(Double transactionAmount, Double bankUserId, String bankName){
        this.transactionAmount = transactionAmount;
        this.bankUserId = bankUserId;
        this.bankName = bankName;
    }

    public void paymentProcessing(Double paymentID, Double transactionAmount, String bankName) {

        paymentID = this.bankUserId;
        transactionAmount = this.transactionAmount;
        bankName = this.bankName;

        System.out.println("congratulations , user ID" + paymentID + "just charged" + transactionAmount + "$ " + "at " + bankName + ". ");
        System.out.println("Thanks for shopping at" + bankName);

    }
}
