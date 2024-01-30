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
        DetalleVenta [] detalleventa= new DetalleVenta[5];
        detalleventa[0]= new DetalleVenta(new BigDecimal(2), new BigDecimal(4), 12345678910L, "producto", "queso", "paquete de 1Kl");
        detalleventa[1] = new DetalleVenta(new BigDecimal(1), new BigDecimal(11), 12345678910L, "producto", "queso", "paquete de 3Kl");
        detalleventa[2] = new DetalleVenta(new BigDecimal(2), new BigDecimal(17), 12345678910L, "producto", "queso", "paquete de 5Kl");
        detalleventa[3] = new DetalleVenta(new BigDecimal(5), new BigDecimal(1), 12345678910L, "producto", "queso", "paquete de 250 Gr");
        detalleventa[4] = new DetalleVenta(new BigDecimal(2), new BigDecimal(35), 12345678910L, "producto", "queso", "pieza de 10Kl");
        BigDecimal precioTotal= new BigDecimal(0);
        for (int i=0;i<5;i++){
            BigDecimal precio=detalleventa[i].getPrecio();
            BigDecimal cantidad=detalleventa[i].getCantidad();
            precioTotal=precioTotal.add(precio.multiply(cantidad));
        }
        for (int i=0;i<5;i++) {
            assertNotNull(detalleventa[i]);
        }

        //La cantidad de productos debe ser mayor a cero.
        for (int i=0;i<5;i++) {
            assertTrue(detalleventa[i].getCantidad().intValue()>0);
        }

        //El precio de cada detalle debe ser mayor a cero.
        for (int i=0;i<5;i++) {
            assertTrue(detalleventa[i].getPrecio().intValue()>0);
        }

        //Validamos que las unidades de medida sean diferentes
        assertTrue(detalleventa[0].getTipoProducto().equals(detalleventa[1].getTipoProducto()) && detalleventa[0].getNombre().equals(detalleventa[1].getNombre()) && !detalleventa[0].getUnidadMedida().equals(detalleventa[1].getUnidadMedida()));
        assertTrue(detalleventa[0].getTipoProducto().equals(detalleventa[2].getTipoProducto()) && detalleventa[0].getNombre().equals(detalleventa[2].getNombre()) && !detalleventa[0].getUnidadMedida().equals(detalleventa[2].getUnidadMedida()));
        assertTrue(detalleventa[0].getTipoProducto().equals(detalleventa[3].getTipoProducto()) && detalleventa[0].getNombre().equals(detalleventa[3].getNombre()) && !detalleventa[0].getUnidadMedida().equals(detalleventa[3].getUnidadMedida()));
        assertTrue(detalleventa[0].getTipoProducto().equals(detalleventa[4].getTipoProducto()) && detalleventa[0].getNombre().equals(detalleventa[4].getNombre()) && !detalleventa[0].getUnidadMedida().equals(detalleventa[4].getUnidadMedida()));

        //Creamos detalle de venta de productos.
        List<DetalleVenta> detalles = new ArrayList<>();
        for(int i=0;i<5;i++){
            detalles.add(detalleventa[i]);
        }
        assertNotNull(detalles);

        //La cantidad de detalle de productos debe ser mayor a 0
        assertTrue(detalles.size()>0);

        //Creamos nota de venta
        NotaVenta notaVenta = new NotaVenta(cliente,tipoPago,tipoEntrega, new BigDecimal(128), BigDecimal.ZERO,detalles);
        //Validamos que el calculo del precio total sea correcto.
        assertTrue(notaVenta.getMontoTotal().intValue()==precioTotal.intValue());

    }
}