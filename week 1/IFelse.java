public class IFelse {
    public static void main(String[] args){
    /* SImple if example */
    if (true){
        System.out.println("True statement");
    }
    /* If takes an exception with boolean value */
    int num1 = 10, num2 = 20;
    if (num1>num2){
        System.out.println("Greater");
    }
    else if (num1< num2){
        System.out.println("Lesser");
    }
    else{
        System.out.println("Equal");
    }
    if (num1<0){
        System.out.println("num 1 is negative");
    }
    else if(num2 < 0){
        System.out.println("num 2 is negative");
    }
}
}