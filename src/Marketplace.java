public class Marketplace {
    public static void main(String[] args) {
        ProductFactory bookFactory = new BookFactory();
        Product book = bookFactory.createProduct("The Great Gatsby", "F. Scott Fitzgerald");
        book.displayInfo();

        ProductFactory electronicsFactory = new ElectronicsFactory();
        Product phone = electronicsFactory.createProduct("Apple", "iPhone 13");
        phone.displayInfo();
    }
}
