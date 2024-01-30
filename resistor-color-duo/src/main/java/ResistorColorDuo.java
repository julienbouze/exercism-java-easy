import java.util.Arrays;

class ResistorColorDuo {
    int value(String[] colors) {
        int color1 = Arrays.asList(colors()).indexOf(colors[0])*10;
        int color2 = Arrays.asList(colors()).indexOf(colors[1]);
        return color1 + color2;
    }

    String[] colors() {
        String[] colorList = new String[]{"black","brown","red","orange","yellow","green","blue","violet","grey","white"};
        return colorList;
    }
}

