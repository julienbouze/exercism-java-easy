class Acronym {
    private final String phrase;
    Acronym(String phrase) {
        this.phrase = phrase;
    }
    String get() {
        String acronyms = "";
        boolean isPreviousCharSeparator = false;
        for (int i = 0; i < phrase.length(); i++) {
            boolean isSeparator = !isSeparator(phrase.charAt(i));
            if (!isPreviousCharSeparator && isSeparator) {
                acronyms += String.valueOf(phrase.charAt(i)).toUpperCase();
            }
            isPreviousCharSeparator = isSeparator;
        }
        return acronyms;
    }
    boolean isSeparator(char ch) {
        if (ch == ' ' || ch == '-' || ch == '_') {
            return true;
        }
        return false;
    }
}