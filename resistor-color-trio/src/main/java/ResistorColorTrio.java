import java.util.Arrays;

class ResistorColorTrio {
    String label(String[] colors) {
        String[] colorList = colors();
        long color1 = Arrays.asList(colorList).indexOf(colors[0])*10 + Arrays.asList(colorList).indexOf(colors[1]);
        long color2 = (int)Math.pow(10,Arrays.asList(colorList).indexOf(colors[2]));
        long color = color1*color2;
        if (color == 0){
            return "0 ohms";
        }
        else if (color < 1000){
            return color + " ohms";
        }
        else if (color < 1000000){
            return color/1000 + " kiloohms";
        }

        else if (color < 1000000000){
            return color/1000000 + " megaohms";
        }
        else if (color < 1000000000000L){
            return color/1000000000 + " gigaohms";
        }
        return Long.toString(color) + " ohms";

        
    }

    String[] colors() {
        String[] colorList = new String[]{"black","brown","red","orange","yellow","green","blue","violet","grey","white"};
        return colorList;
    }
    
}


