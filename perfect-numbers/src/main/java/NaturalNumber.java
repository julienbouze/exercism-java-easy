class NaturalNumber {
    private int number;
    
    NaturalNumber(int number) {
        if (number <1){
            throw new IllegalArgumentException("You must supply a natural number (positive integer)");
        }
        this.number = number;
    }

    public Classification getClassification() {
        int aliquotSum = getAliquotSum();
        if (aliquotSum == number) {
            return Classification.PERFECT;
        } else if (aliquotSum > number) {
            return Classification.ABUNDANT;
        } else {
            return Classification.DEFICIENT;
        }
    }
    
    private int getAliquotSum() {
        if (number == 1) {
            return 0;
        }
        int sum = 1;
        int limit = (int) Math.sqrt(number);
        for (int i = 2; i <= limit; i++) {
            if (number % i == 0) {
                sum += i;
                int factor = number / i;
                if (i != factor) {
                    sum += factor;
                }
            }
        }
        return sum;
    }
}
