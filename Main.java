class Main {
  public static void main(String[] args) {
    
    System.out.println("Here is ISBN Number 1: ");//Telling the user which ISBN Number's information is provided
ISBN n = new ISBN("111111111");//setting the object to the given string isbn 9 digit code

    //Running the functions for the object and printing each response
    System.out.println(n.calculateCheckDigit());
    System.out.println(n.generateNumber());
    System.out.println(n.Display());

    
    System.out.println("\n\nHere is ISBN Number 2: ");//Telling the user which ISBN Number's information is provided
ISBN n2 = new ISBN("123456789");//setting the object to the given string isbn 9 digit code

    //Running the functions for the object and printing each response
    System.out.println(n2.calculateCheckDigit());
    System.out.println(n2.generateNumber());
    System.out.println(n2.Display());
    
    System.out.println("\n\nHere is ISBN Number 3: "); //Telling the user which ISBN Number's information is provided
ISBN n3 = new ISBN("122334678");//setting the object to the given string isbn 9 digit code

    //Running the functions for the object and printing each response
    System.out.println(n3.calculateCheckDigit());
    System.out.println(n3.generateNumber());
    System.out.println(n3.Display());
    
    System.out.println("\n\nHere is ISBN Number 4: ");//Telling the user which ISBN Number's information is provided
ISBN n4 = new ISBN("786547899");//setting the object to the given string isbn 9 digit code
    //Running the functions for the object and printing each response
    System.out.println(n4.calculateCheckDigit());
    System.out.println(n4.generateNumber());
    System.out.println(n4.Display());
  }
}