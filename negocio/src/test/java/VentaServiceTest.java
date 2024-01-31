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

        //Creamos cliente
        Cliente cliente = new Cliente("Maria", "M0125");
        assertNotNull(cliente);

        //Creamos tipo de pago de la venta
        Parametrica tipoPago = new Parametrica(EnumTipoPago.GIFTCARD.getCodigo(), EnumTipoPago.GIFTCARD.getDescripcion());
        assertNotNull(tipoPago);

        //Creamos tipo de entrega  de la venta
        Parametrica tipoEntrega = new Parametrica(EnumTipoEntrega.DELIVERY.getCodigo(), EnumTipoEntrega.DELIVERY.getDescripcion());
        assertNotNull(tipoEntrega);

        //Detalle de productos 1 , 2 , 3 , 4 , 5
        DetalleVenta detalle = new DetalleVenta(new BigDecimal(2), new BigDecimal(4), 12345678910L, "producto", "queso", "paquete de 1Kl");
        DetalleVenta detalle2 = new DetalleVenta(new BigDecimal(1), new BigDecimal(11), 12345678910L, "producto", "queso", "paquete de 3Kl");
        DetalleVenta detalle3 = new DetalleVenta(new BigDecimal(2), new BigDecimal(17), 12345678910L, "producto", "queso", "paquete de 5Kl");
        DetalleVenta detalle4 = new DetalleVenta(new BigDecimal(5), new BigDecimal(1), 12345678910L, "producto", "queso", "paquete de 250 Gr");
        DetalleVenta detalle5 = new DetalleVenta(new BigDecimal(2), new BigDecimal(35), 12345678910L, "producto", "queso", "pieza de 10Kl");
        BigDecimal precioTotal = detalle.getCantidad().multiply(detalle.getPrecio()).add(detalle2.getCantidad().multiply(detalle2.getPrecio())).add(detalle3.getCantidad().multiply(detalle3.getPrecio()))
                        .add(detalle4.getCantidad().multiply(detalle4.getPrecio())).add(detalle5.getCantidad().multiply(detalle5.getPrecio()));

        assertNotNull(detalle);
        assertNotNull(detalle2);
        assertNotNull(detalle3);
        assertNotNull(detalle4);
        assertNotNull(detalle5);
        //La cantidad de productos debe ser mayor a cero.
        assertTrue(detalle.getCantidad().intValue()>0);
        assertTrue(detalle2.getCantidad().intValue()>0);
        assertTrue(detalle3.getCantidad().intValue()>0);
        assertTrue(detalle4.getCantidad().intValue()>0);
        assertTrue(detalle5.getCantidad().intValue()>0);
        //El precio de cada detalle debe ser mayor a cero.
        assertTrue(detalle.getPrecio().intValue()>0);
        assertTrue(detalle2.getPrecio().intValue()>0);
        assertTrue(detalle3.getPrecio().intValue()>0);
        assertTrue(detalle4.getPrecio().intValue()>0);
        assertTrue(detalle5.getPrecio().intValue()>0);
        //Validamos que las unidades de medida sean diferentes
        assertTrue(detalle.getTipoProducto().equals(detalle2.getTipoProducto()) && detalle.getNombre().equals(detalle2.getNombre()) && !detalle.getUnidadMedida().equals(detalle2.getUnidadMedida()));
        assertTrue(detalle.getTipoProducto().equals(detalle3.getTipoProducto()) && detalle.getNombre().equals(detalle3.getNombre()) && !detalle.getUnidadMedida().equals(detalle3.getUnidadMedida()));
        assertTrue(detalle.getTipoProducto().equals(detalle4.getTipoProducto()) && detalle.getNombre().equals(detalle4.getNombre()) && !detalle.getUnidadMedida().equals(detalle4.getUnidadMedida()));
        assertTrue(detalle.getTipoProducto().equals(detalle5.getTipoProducto()) && detalle.getNombre().equals(detalle5.getNombre()) && !detalle.getUnidadMedida().equals(detalle5.getUnidadMedida()));

        //Creamos detalle de venta de productos.
        List<DetalleVenta> detalles = new ArrayList<>();
        detalles.add(detalle);
        detalles.add(detalle2);
        detalles.add(detalle3);
        detalles.add(detalle4);
        detalles.add(detalle5);
        assertNotNull(detalles);
        //La cantidad de detalle de productos debe ser mayor a 0
        assertTrue(detalles.size()>0);

        //Creamos nota de venta
        NotaVenta notaVenta = new NotaVenta(cliente,tipoPago,tipoEntrega, new BigDecimal(128), BigDecimal.ZERO,detalles);
        //Validamos que el calculo del precio total sea correcto.
        assertTrue(notaVenta.getMontoTotal().intValue()==precioTotal.intValue());

    }
}