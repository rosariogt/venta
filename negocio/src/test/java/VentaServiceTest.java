import enums.EnumTipoEntrega;
import enums.EnumTipoPago;
import junit.framework.TestCase;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class VentaServiceTest{
    @Test
    void registrar(){
        Cliente cliente = new Cliente("Maria", "M0125");
        Parametrica tipoPago = new Parametrica(EnumTipoPago.GIFTCARD.getCodigo(), EnumTipoPago.GIFTCARD.getDescripcion());
        Parametrica tipoEntrega = new Parametrica(EnumTipoEntrega.DELIVERY.getCodigo(), EnumTipoEntrega.DELIVERY.getDescripcion());

        DetalleVenta detalle = new DetalleVenta(new BigDecimal(2), new BigDecimal(4), 12345678910L, "producto", "queso", "paquete de 1Kl");
        DetalleVenta detalle2 = new DetalleVenta(new BigDecimal(1), new BigDecimal(11), 12345678910L, "producto", "queso", "paquete de 3Kl");
        DetalleVenta detalle3 = new DetalleVenta(new BigDecimal(2), new BigDecimal(17), 12345678910L, "producto", "queso", "paquete de 5Kl");
        DetalleVenta detalle4 = new DetalleVenta(new BigDecimal(5), new BigDecimal(1), 12345678910L, "producto", "queso", "paquete de 250 Gr");
        DetalleVenta detalle5 = new DetalleVenta(new BigDecimal(2), new BigDecimal(35), 12345678910L, "producto", "queso", "pieza de 10Kl");

        List<DetalleVenta> detalles = new ArrayList<>();
        detalles.add(detalle);
        detalles.add(detalle2);
        detalles.add(detalle3);
        detalles.add(detalle4);
        detalles.add(detalle5);

        NotaVenta notaVenta = new NotaVenta(cliente,tipoPago,tipoEntrega, new BigDecimal(128), BigDecimal.ZERO,detalles);

        assertAll(
                () -> assertNotNull(cliente),
                () -> assertNotNull(tipoPago),
                () -> assertNotNull(tipoEntrega),
                () -> assertNotNull(notaVenta),
                () -> assertEquals("M0125", cliente.getCodigo())
        );
    }
}