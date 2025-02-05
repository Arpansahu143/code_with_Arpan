class Image {
    private int imageWidth;
    private int imageHeight;
    private String colorCode;

    public Image(int imageWidth, int imageHeight, String colorCode) {
        this.imageWidth = imageWidth;
        this.imageHeight = imageHeight;
        this.colorCode = colorCode;
    }

    public int getImageWidth() {
        return imageWidth;
    }

    public int getImageHeight() {
        return imageHeight;
    }

    public String getColorCode() {
        return colorCode;
    }

    public String toString() {
        return "Image [Width=" + imageWidth + ", Height=" + imageHeight + ", ColorCode=" + colorCode + "]";
    }
}

class ImageLibrary {
    private Image[] images;
    private int size;

    public ImageLibrary(int capacity) {
        images = new Image[capacity];
        size = 0;
    }

    public boolean insertImage(Image img) {
        if (size < images.length) {
            images[size] = img;
            size++;
            return true;
        }
        return false;
    }

    public Image getImage(int index) {
        if (index >= 0 && index < size) {
            return images[index];
        }
        return null;
    }

    public int searchImage(int width, int height, String colorCode) {
        for (int i = 0; i < size; i++) {
            if (images[i].getImageWidth() == width && images[i].getImageHeight() == height && images[i].getColorCode().equals(colorCode)) {
                return i;
            }
        }
        return -1;
    }
}

public class Q5 {
    public static void main(String[] args) {
        ImageLibrary library = new ImageLibrary(5);

        Image img1 = new Image(1920, 1080, "#FF5733");
        Image img2 = new Image(1280, 720, "#33FF57");

        library.insertImage(img1);
        library.insertImage(img2);

        System.out.println("Image at index 0: " + library.getImage(0));
        System.out.println("Image at index 1: " + library.getImage(1));

        int index = library.searchImage(1920, 1080, "#FF5733");
        System.out.println("Searched image found at index: " + index);
    }
}
