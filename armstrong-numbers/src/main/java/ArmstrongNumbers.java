class ArmstrongNumbers {

    boolean isArmstrongNumber(int numberToCheck) {
        String ch = Integer.toString(numberToCheck);
        int nb = ch.length();

        int[] tab = new int[nb];
        int sum = 0;
        for (int i = 0; i < ch.length(); i++) {
            // Convertir chaque caractère en chiffre en le soustrayant du caractère '0'
            tab[i] = ch.charAt(i) - '0';
            tab[i] = (int)Math.pow(tab[i],nb);
            sum += tab[i];
        }

        if(numberToCheck == sum){
            return true;
        }
        else{
            return false;
        }
    }

}
