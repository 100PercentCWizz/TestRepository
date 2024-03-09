
public class AsteriskLogger implements Logger {
    public void log (String in_str) {
        System.out.println("***" + in_str + "***") ;
    }
    public void error (String in_str) {
        String error_string = "***Error: " + in_str + "***";
        for ( int index = 0 ; index < error_string.length() ; index ++ ) {
            System.out.print("*") ;
        }
        System.out.println() ;
        System.out.println(error_string) ;
        for ( int index = 0 ; index < error_string.length() ; index ++ ) {
            System.out.print("*") ;
        }
        System.out.println() ;
    }
}
