public class App {
    public static void main(String[] args) {

        // I clear the screen
        System.out.print("\033[H\033[2J") ;  

        String word = "FUDGE" ;

        // I bring in my classes
        AsteriskLogger aLogger = new AsteriskLogger() ;
        SpacedLogger sLogger = new SpacedLogger() ;

        System.out.println("\n1. Asterisk Log:") ;
        aLogger.log(word) ;

        System.out.println("\n2. Asterisk Error:") ;
        aLogger.error(word) ;

        System.out.println("\n3. Spaced Log:") ;
        sLogger.log(word) ;

        System.out.println("\n4. Spaced Error:") ;
        sLogger.error(word) ;

        System.out.println("\n") ;

    }
}
