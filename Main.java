public class Main {
    public static void main(String[] args) {

       BankAccount account = new BankAccount("66642069");
//       BankAccount bankAccount1= new BankAccount();

//      account.setAccountNumber("123-456-789");
      account.setAccountHolder("Customer_One");
      account.setBalace(112233);

        System.out.println(" Az elso ugyfel szamlaszama: " + account.getAccountNumber()+
                "\n A számlatulajdonos neve: "+ account.getAccountHolder()+
                        "\n Egyenlege: " +account.getBalance());

/*      bankAccount1.setAccountNumber("987-654-321");
      bankAccount1.setAccountHolder("Customer_two");
      bankAccount1.setBalace(332211);

        System.out.println(" Az masodik ugyfel szamlaszama: " + bankAccount1.getAccountNumber()+
                "\n A számlatulajdonos neve: "+ bankAccount1.getAccountHolder()+
                "\n Egyenlege: " +bankAccount1.getBalance());
*/
        Car myCar = new Car("Toyota", "Camry", 2022);
        System.out.println(myCar.getBrand()); // Output: Toyota

        Car defaultCar = new Car();
        System.out.println(defaultCar.getModel()); // Output: Unknown
    }
}
