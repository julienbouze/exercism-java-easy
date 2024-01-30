class RnaTranscription {

    String transcribe(String dnaStrand) {
        String value = "";
        if (dnaStrand.length() != 0){ 
            for (int i = 0; i < dnaStrand.length();i++){
                switch(dnaStrand.charAt(i)){
                    case 'G' :
                        value += "C";
                        break;
                    case 'C' :
                        value += "G";
                        break;
                    case 'T' :
                        value += "A";
                        break;
                    case 'A' :
                        value += "U";
                        break;
                        default :
                            break;
                }
            }
        }
        return value;
        
    }

}
