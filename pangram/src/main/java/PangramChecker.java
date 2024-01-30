public class PangramChecker {

    public boolean isPangram(String input) {
        Boolean pangram = true;
        String alphabet = "abcdefghijklmnopqrstuvwxyz" ;
        for (int i = 0; i<25; ++i){
            String alpha = Character.toString(alphabet.charAt(i));
            if (!input.toLowerCase().contains(alpha)){
                pangram = false;
            }
        }
        return pangram;
    }

}
