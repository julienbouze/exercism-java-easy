import java.util.Arrays;

class ResistorColor {
    int colorCode(String color) {
        return Arrays.asList(colors()).indexOf(color);
    }

    String[] colors() {
        String[] colorList = new String[]{"black","brown","red","orange","yellow","green","blue","violet","grey","white"};
        return colorList;
    }
}
