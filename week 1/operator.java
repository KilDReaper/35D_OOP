public class operator {
    public static void main(String[] args){
        // /* Arithematic Operators */
        // int a = 10;
        // int b =10;
        // int sum = a + b; // here the "+" is an arithematic operators
        // System.out.println("Addition for a + b is: " +sum);
        // System.out.println("Difference for a - b is: "+ (a-b));
        // System.out.println("Multiplication for a x b is: "+(a*b));
        // System.out.println("Division for a and b is: "+(a/b));
        // System.out.println("Modulo for a and b is: "+(a%2));

        // /* Assignment operators */
        // int aNumber1;
        // aNumber1 = 10;
        // /* or declare and assign */
        // int aNumber2 = 20;
        // /* assign with another variable */
        // int aNumber3 = aNumber1;
        // System.out.println("Assignment with =+" +(aNumber1+10));
        // aNumber2 -=30;
        // System.out.println("Assignment with -=" +aNumber2);
        
        // /* Relational operators */
        // int rNumber1 = 10;
        // int rNumber2 = 20;
        // System.out.println("rNumber1 = rNumber2?" +(rNumber1 == rNumber2));
        // System.out.println("rNumber1 > rNumber2?" + (rNumber1>rNumber2));
        // System.out.println("rNumber1 >= rNumber2?" + (rNumber1 >=rNumber2));
        // System.out.println("rNumber1 not equal to rNumber2?" +(rNumber1!=rNumber2));

        // /* Logical operators */
        // int lNumber = 10; 
        // int lNumber2 = 12;
        // boolean lExpression1 = lNumber == lNumber2;
        // boolean lExpression2 = lNumber <= lNumber2;
        // System.out.println("And operator uses && " + (lExpression1 && lExpression2));
        // System.out.println("Or operator uses || " + (lExpression1 || lExpression2));
        // System.out.println("Not operator uses ! " + !lExpression1);

        // /* Unary operators */
        // int uNumber1 = 10;
        // uNumber1++; //meaning uNumber1 = uNumber1 + 1
        // System.out.println("Unary for increament is ++ " + uNumber1);
        // uNumber1--;
        // System.out.println("Unary for decreament is -- " + uNumber1);
       
 
 
        // /* Ternary Operator */
        // int tNumber1 = 10, tNumber2 = 10;
        // boolean tExpression = tNumber1 == tNumber2;
 
 
        // /*
        //  * One line is else, see the given example in if else
        //  * String output;
        //  * if(tExpression == true){
        //  * output = "True statement";
        //  * }else{
        //  * output = "False Statement";
        //  * }
        //  */
 
        //  String output = tExpression ? "True Statement" : "False Statement" ;
        // /* Here we can assign a string out with one expression
        //  * if expression is true it will  return the value after the "?"
        //  * if the expression is false it will return the value after the ":"
        //  */

        int a = 10;
        int b = 18;
        System.out.println("a is greater than or equal to 18?" + (a>=b));

        int p = 1000;
        float r = 0.1f;
        int t = 3;
        float i = p*t*r /100;
        System.out.println("The interest is: " + i);

        int length = 20;
        int breath = 10;
        System.out.println("The area of rect is: " + (length*breath));
        System.out.println("The perimeter os rect is: " + (2*(length+breath)));

        String output = a>=b? "True" : "False";
        System.out.println(output);
    }    
}
