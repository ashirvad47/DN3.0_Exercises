
public class InventoryManagerTest {
    public static void main(String[] args) {
        InventoryManager manager = new InventoryManager();

       
        Product product1 = new Product("1", "Laptop", 10, 799.99);
        Product product2 = new Product("2", "Smartphone", 20, 499.99);

        manager.addProduct(product1);
        manager.addProduct(product2);


        Product retrievedProduct = manager.getProduct("1");
        if (retrievedProduct != null) {
            System.out.println("Retrieved Product: " + retrievedProduct.getProductName());
        } else {
            System.out.println("Product with ID 1 not found.");
        }

   
        Product updatedProduct = new Product("1", "Laptop", 8, 749.99);
        manager.updateProduct("1", updatedProduct);

     
        Product updatedRetrievedProduct = manager.getProduct("1");
        if (updatedRetrievedProduct != null) {
            System.out.println("Updated Product Price: " + updatedRetrievedProduct.getPrice());
        } else {
            System.out.println("Product with ID 1 not found after update.");
        }

     
        manager.deleteProduct("2");

       
        Product deletedProduct = manager.getProduct("2");
        if (deletedProduct == null) {
            System.out.println("Product with ID 2 (Smartphone) successfully deleted.");
        } else {
            System.out.println("Failed to delete product with ID 2.");
        }
    }
}
