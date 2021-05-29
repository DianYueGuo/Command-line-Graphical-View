package commandLineGraphicalView;

public class View {

    private Pixel[][] bitmap;
    private int width;
    private int height;

    public View(int width, int height) {
        this(width, height, 0);
    }

    public View(int width, int height, int value) throws IllegalArgumentException {
        if(width < 0 || height < 0) throw new IllegalArgumentException("width and height shouldn't be negative");

        this.width = width;
        this.height = height;

        bitmap = new Pixel[width][height];

        for(int i = 0; i < width; i++) {
            for(int j = 0; j < height; j++) {
                bitmap[i][j] = new Pixel(value);
            }
        }
    }


    public void set(int x, int y, int value) throws IllegalArgumentException {
        if(value < 0 || value > 255) throw new IllegalArgumentException("value should between 0 and 255");

        bitmap[x][y].set(value);
    }


    public void show() {
        for(int i = 0; i < width; i++) {
            for(int j = 0; j < height; j++) {
                bitmap[i][j].show();
            }
            System.out.println();
        }
    }

}