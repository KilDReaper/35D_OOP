public class inputoutput {
    public static void main(String[] args) {
        /* User output */
        System.out.println("This sentence will have line break");
        /* System.out.print */
        System.out.print("This will not have break");
        System.out.print("This line will continue");
        /* String formatting using system.out.printf
         * %s String, %d Intergral, %f floating point, %b boolean 
         * this will also not break line
         */
        System.out.printf("Hello %s, good morning", "World" );
        System.out.printf( "The number is %d", 10);
        /* Can use multiple formatter */
        System.out.printf( "\nThe floating %f and boolean %b" , 10.3f, false);
        
    }
}
