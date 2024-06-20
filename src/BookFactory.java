public class BookFactory extends ProductFactory {
    @Override
    public Product createProduct(String... details) {
        return new Book(details[0], details[1]);
    }
}
