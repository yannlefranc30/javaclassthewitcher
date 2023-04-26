public class thewitcher {
    public static void main(String[] args) {

        String theStr = "the witcher est un bon jeux \u03a0";      // avec caractére
        char theChar = 'a';                             // un seul caractére
        System.out.println( theStr + " vs " + theChar );

        char retourALaLigne = '\n';
        char tabulation = '\t';         // '\0'
        System.out.println( "the witcher" + retourALaLigne + "ciri" + tabulation + "tombraider" );

        char piMaj = '\u03a0';
        //char piMin = '\u03c0';
        char piMin = 960;
        System.out.println( piMaj + " - " + piMin );

    }
}