import junit.framework.TestCase;

public class ProductoServiceTest extends TestCase {

    private ProductoService productoService = new ProductoService();

    public void testObtenerProductos() {
        var vResult = productoService.obtenerProductos();
        assertTrue(vResult.size() > 0);
    }
}