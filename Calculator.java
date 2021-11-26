//Basic Calculator with int numeralsusing Add, Substract, Multiply, Divide, Porcentage

public class Calculator {
 
 //Basic Calculator with int numerals using Add, Substract, Multiply, Divide, Porcentage

  
  public Calculator(){
  
 }

  //method add:
  public int add(int a, int b){
    return  a+b;
  }

  //method subtract:
  public int subtract(int a, int b){
    return a-b;
  }

  //method multiply:
  public int multiply(int a, int b){
    return a*b;
  }

   //method divide:
  public int divide(int a, int b){
    return a/b;
  }

   //method modulo:
  public int modulo(int a, int b){
    return a%b;
  }
 public static void main(String[] args){
 Calculator myCalculator = new Calculator();
 System.out.println(myCalculator.add(5,7));
 System.out.println(myCalculator.subtract(45,11));
 }

}
