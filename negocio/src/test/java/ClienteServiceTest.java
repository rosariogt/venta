import junit.framework.TestCase;

public class ClienteServiceTest extends TestCase {

    private ClienteService clienteService = new ClienteService();

    public void testObtener() {
        var numeroDocumento = "9887788";
        var cliente = clienteService.obtenerPorDocumento(numeroDocumento);
        assertNotNull(cliente);
    }

    public void testObtenerClienteConDocumentoCero() {
        var numeroDocumento = "0";
        var cliente = clienteService.obtenerPorDocumento(numeroDocumento);
        assertNull(cliente);
    }

    public void testObtenerClienteConDocumentoVacio() {
        var numeroDocumento = "";
        var cliente = clienteService.obtenerPorDocumento(numeroDocumento);
        assertNull(cliente);
    }

}