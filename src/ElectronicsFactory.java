public class ElectronicsFactory extends ProductFactory {
    @Override
    public Product createProduct(String... details) {
        return new Electronics(details[0], details[1]);
    }
}
