class RaindropConverter {

    String convert(int number) {
        String Raindrop = "";
        if ((number % 3) == 0){
            Raindrop += "Pling";
        }
        if ((number % 5) == 0){
            Raindrop += "Plang";
        }
        if ((number % 7) == 0){
            Raindrop += "Plong";
        }
        if ((number % 3) != 0 && (number % 5) != 0 && (number % 7) != 0) {
            Raindrop = Integer.toString(number);
        }
        return Raindrop;
    }

}
