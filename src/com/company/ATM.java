package com.company;

/**
 * Created by gilbertakpan on 11/16/16.
 */
public class ATM {
    private String name;
    private int withdrawal;
    private String options;


    public void chooseName() throws Exception{
        System.out.println("Please enter name ...");
        name = Main.scanner.nextLine();
        System.out.println("Welcome, " + name);
        if(name.isEmpty()) {
            throw new Exception("Invalid Name");

}}
    public void chooseOptions() throws Exception{
        System.out.println("Select Option[Check Balance/Withdrawal/Cancel]");
        options = Main.scanner.nextLine();

    if(options.equalsIgnoreCase("Check Balance")) {
        System.out.println("Your balance is $100");

}   else if(options.equalsIgnoreCase("Withdrawal")) {
        System.out.println("How much?");{
        withdrawal = Main.scanner.nextInt();

    if(withdrawal <=100){
        System.out.println("Take money." + " Your new balance is  " + (100 - withdrawal) + " Have a nice day ");
    }
    else if(withdrawal >100){
        System.out.println("Insufficient Funds");
        }
        }}

    else if(options.equalsIgnoreCase("Cancel")) {
        System.out.println("Thank you and please come again");}

    else {
            throw new Exception("Invalid Option");}
    }

    }


