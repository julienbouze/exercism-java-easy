import java.util.List;
import java.util.ArrayList;

class ProteinTranslator {

    List<String> translate(String rnaSequence) throws IllegalArgumentException {
        ArrayList<String> protein = new ArrayList<String>();
        boolean stopped = false;
        for (int i = 0; i < rnaSequence.length(); i+=3) {
            if (stopped)
                break;
            try{
                switch (rnaSequence.substring(i, i + 3)) {
                    case "AUG":
                        protein.add("Methionine");
                        break;
                    case "UUU":
                    case "UUC": 
                        protein.add("Phenylalanine");
                        break;
                    case "UUA":
                    case "UUG":
                        protein.add("Leucine");
                        break;
                    case "UCU":
                    case "UCC":
                    case "UCA":
                    case "UCG":
                        protein.add("Serine");
                        break;
                    case "UAU":
                    case "UAC":
                        protein.add("Tyrosine");
                        break;
                    case "UGU":
                    case "UGC":
                        protein.add("Cysteine");
                        break;
                    case "UGG":
                        protein.add("Tryptophan");
                        break;
                    case "UAA":
                    case "UAG":
                    case "UGA":
                        stopped = true;
                        break;
                    default:
                        throw new IllegalArgumentException("Invalid codon");
                }
            }
            catch(StringIndexOutOfBoundsException e) {
                throw new IllegalArgumentException("Invalid codon");
            }
        }
        return protein;
    }
}