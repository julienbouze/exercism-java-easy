class DifferenceOfSquaresCalculator {

    int computeSquareOfSumTo(int input) {
        int sum = 0;
        for (int i = 0; i <= input; ++i){
            sum += i;
        }
        sum = sum*sum;
        return sum;
        //throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
    }

    int computeSumOfSquaresTo(int input) {
        int sum = 0 ;
        for (int i = 0; i <= input; ++i){
            sum += i*i;
        }
        return sum;
        //throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
    }

    int computeDifferenceOfSquares(int input) {
        return computeSquareOfSumTo(input) - computeSumOfSquaresTo(input);
        //throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
    }

}
