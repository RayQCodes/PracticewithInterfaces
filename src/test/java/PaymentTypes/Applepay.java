package PaymentTypes;

public class Applepay implements Generalpayment {

    Double applePasscode;
    Double transactionAmount;
    String electronicTapservice;
    public Applepay(Double applePasscode, Double transactionAmount, String electronicTapservice ){
        this.applePasscode = applePasscode;
        this.transactionAmount = transactionAmount;
        this.electronicTapservice = electronicTapservice;
    }
    public void paymentProcessing(Double applePass, Double transactionAmount, String electronicTapservice){
        applePass = this.applePasscode;
        transactionAmount = this.transactionAmount;
        electronicTapservice = this.electronicTapservice;

        System.out.println("the apple id" + applePass + "charged" + transactionAmount + "using" + electronicTapservice);
        System.out.println("thanks for using electronictap with " + electronicTapservice);

    }
}
