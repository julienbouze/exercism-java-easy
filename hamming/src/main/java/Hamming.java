public class Hamming {
    String left;
    String right;
    public Hamming(String leftStrand, String rightStrand) {
        if (!leftStrand.isEmpty() && rightStrand.isEmpty()) throw new IllegalArgumentException("right strand must not be empty.");
        if (!rightStrand.isEmpty() && leftStrand.isEmpty()) throw new IllegalArgumentException("left strand must not be empty.");
        if (leftStrand.length() != rightStrand.length()) throw new IllegalArgumentException("leftStrand and rightStrand must be of equal length.");

        this.left = leftStrand;
        this.right = rightStrand;
    }

    public int getHammingDistance() {
        int diff = 0 ;
        for (int i = 0; i < left.length(); ++i){
            if (left.charAt(i) != right.charAt(i)){
                diff++;
            }
        }
        return diff ;
    }
}
