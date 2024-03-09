
public class SpacedLogger implements Logger {
    public void log (String in_str) {
        for ( int index = 0 ; index < in_str.length() ; index ++ ) {
            System.out.print( in_str.charAt(index) + " " ) ;
        }
        System.out.println();
    }
    public void error (String in_str) {
        System.out.print("ERROR: ");
        for ( int index = 0 ; index < in_str.length() ; index ++ ) {
            System.out.print( in_str.charAt(index) + " " ) ;
        }
    }
}
