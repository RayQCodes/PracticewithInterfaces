package PaymentTypes;

import java.util.*;
public class Main {
    public static void main(String[] args){

        Scanner userinput = new Scanner(System.in);
        System.out.println("enter your desired choice");
        int userchoice = userinput.nextInt();
       Boolean running = true;
        while (running) {
            switch (userchoice){
                case 1:
                    System.out.println("you have chosen credit card");
                    System.out.println("enter your desired id, amount and bank you want to use");
                    Double creditCardid = userinput.nextDouble();
                    Double creditcardamount = userinput.nextDouble();
                    String creditCardBankName = userinput.nextLine();
                    Creditcard newCreditcard = new Creditcard(creditCardid, creditcardamount, creditCardBankName);
                    newCreditcard.paymentProcessing(creditCardid, creditcardamount, creditCardBankName);
                    break;
                case 2:
                    System.out.println(" you have chosen cash ");
                    System.out.println("enter your dollar amount , type of bills you want to use and bank you want to use");
                    Double dollarAmount = userinput.nextDouble();
                    Double typeofBills = userinput.nextDouble();
                    String cashbankName = userinput.nextLine();
                    Cash newCashpayment = new Cash(dollarAmount, typeofBills, cashbankName);
                    newCashpayment.paymentProcessing(dollarAmount, typeofBills, cashbankName);
                    break;

                case 3:
                    System.out.println(" you have chosen electronic payment");
                    System.out.println("enter your onlineId, amount and bank you want to use");
                    Double appleId = userinput.nextDouble();
                    Double electronicamount = userinput.nextDouble();
                    String epbankName = userinput.nextLine();
                    Applepay newEP = new Applepay(appleId, electronicamount, epbankName);
                    newEP.paymentProcessing(appleId, electronicamount, epbankName);
                    break;

                case 4:
                    System.out.println("you have chosen a debit card");
                    System.out.println("enter your desired id, amount and bank you want to use");
                    Double debitId = userinput.nextDouble();
                    Double debitAmount = userinput.nextDouble();
                    String debitBankused = userinput.nextLine();
                    DebitCard newdebitCard = new DebitCard(debitId, debitAmount, debitBankused);
                    newdebitCard.paymentProcessing(debitId, debitAmount, debitBankused);
                    break;
                case 5:
                    System.out.println("Thanks for using the payment services have a wonderful day");
                    running = false;
                    break;
            }
        }

    }
}
