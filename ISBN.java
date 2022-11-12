import java.util.Random;//Importing Java randomizer
class ISBN{//class name is ISBN
  private String isbn;//Declare a private instance variable to hold the 9-digit ISBN number.
  public ISBN(){//Default constructor
    isbn = "";//initialize the isbn to be empty
  }
  public ISBN(String isbn){//Define a constructor with one integer parameter and assign the parameter value to the instance variable.
    this.isbn = isbn;//using this keyword to keep things simple
  }
  public String calculateCheckDigit(){//function for finding the sum of the digits in the 9 digit ISBN
    int numIsbn = Integer.parseInt(isbn);//changing the string into an integer
    int sum = 0;//initialize a sum to 0
    while (numIsbn != 0)//while the isbn is not 0
        {
            sum = sum + numIsbn % 10;//find the remainder of the isbn and 10 and add the sum to that
            numIsbn = numIsbn/10;//divide the isbn by 10
        }
    String stringSum = String.valueOf(sum);//changing the sum into a string
    return stringSum;//return the string of the sum
  }
  public String generateNumber(){//function to provide the ISBN as well as the the sum, returns string

    String total = calculateCheckDigit();//call the previous function and save the return value
    total = isbn+ " "+total;//concatenate the sum and the original isbn value
    return total;//return the string value
  }
  public String Display(){//function to explain what shelf the isbn number belongs to
    int shelf =0;//initialize the shelf to 0
    if(Integer.parseInt(calculateCheckDigit())<50){// after calling the check digit function, if the sum is less than 50 do the following
      Random rand = new Random();//set random
      shelf = rand.nextInt(1,5);// random number between 1 and 5, set the shelf number to that
    }
    else{//if the sum is greater than 50
      shelf =6;//set the shelf to 6
    }
    return "Shelf Number " +shelf;//return string of the shelf number
  }
  }
