public class Q3 {

    private int imageWidth;
    private int imageHeight;
    private String colorCode;

    public Q3() {
        this.imageWidth = 0;
        this.imageHeight = 0;
        this.colorCode = "#000000";
    }

    public Q3(int imageWidth, int imageHeight, String colorCode) {
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

    public void setImageWidth(int imageWidth) {
        this.imageWidth = imageWidth;
    }

    public void setImageHeight(int imageHeight) {
        this.imageHeight = imageHeight;
    }

    public void setColorCode(String colorCode) {
        this.colorCode = colorCode;
    }

    public String toString() {
        return "Image Details: Width = " + imageWidth + ", Height = " + imageHeight + ", Color Code = " + colorCode;
    }

    public static void main(String[] args) {

        Q3 defaultImage = new Q3();
        Q3 customImage = new Q3(1920, 1080, "#FF5733");

        System.out.println(defaultImage);
        System.out.println(customImage);
    }
}
