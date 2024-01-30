import junit.framework.TestCase;

public class TipoPagoServiceTest extends TestCase {

    private TipoPagoService tipoPagoService = new TipoPagoService();
    public void testObtenerTipoPagoOk() {
        var tipoPago = tipoPagoService.obtenerTipoPagos();
        assertTrue(tipoPago.size() > 0);
    }

}