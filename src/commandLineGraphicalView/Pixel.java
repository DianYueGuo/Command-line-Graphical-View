package src.commandLineGraphicalView;

class Pixel {
    
    private int value;
    private static String chars;

    Pixel() {
        this(0);
    }

    Pixel(int value) throws IllegalArgumentException {
        if(value < 0 || value > 255) throw new IllegalArgumentException("value should between 0 and 255");

        chars = " .'`^\",:;Il!i><~+_-?][}{1)(|\\/tfjrxnuvczXYUJCLQ0OZmwqpdbkhao*#MW&8%B@$";

        this.value = value;
    }

    void show() {
        System.out.print(chars.charAt(value * (chars.length() - 1) / 255));
    }

}
