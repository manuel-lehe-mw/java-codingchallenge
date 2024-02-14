public class Main{
    public static void main(String[] args){
        System.out.println("Hello, world!!");
        System.out.println(isValidPin("12345"));
    }
    /**
     * A pin is valid when it satisfies the following criteria
     * - only digits / numbers
     * - exactly 5 of them
     * - not all the same. e.g. '11111'
     * - less then 4 of them are in sequence asc. e.g. '12347' is not allowed
     * - also descending
     *
     * optional:
     * - not more than 3 of them can be the same digit insteaf of all the same
     */
    public static boolean isValidPin(String pin){
        // TO-DO: implement method
        return true;
    }
}