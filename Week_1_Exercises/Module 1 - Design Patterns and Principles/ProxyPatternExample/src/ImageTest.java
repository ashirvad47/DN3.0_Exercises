
public class ImageTest {
    public static void main(String[] args) {
        Image image1 = new ProxyImage("image1.jpg");
        Image image2 = new ProxyImage("image2.jpg");

        // Display image1
        image1.display();

        // Display image1 again (should be cached)
        image1.display();

        // Display image2
        image2.display();
    }
}