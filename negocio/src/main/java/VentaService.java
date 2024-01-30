import enums.EnumTipoEntrega;
import enums.EnumTipoPago;

import java.util.ArrayList;
import java.util.List;

public class VentaService {

    public RespuestaRegistroVenta registrar(NotaVenta notaVenta) {
        RespuestaRegistroVenta respuesta = new RespuestaRegistroVenta();
        var mensajes = verificarParametricas(notaVenta);
        if (!mensajes.isEmpty()) {
            respuesta.setMensajes(mensajes);
            return respuesta;
        }

        return null;
    }

    private List<Mensaje> verificarParametricas(NotaVenta notaVenta) {
        List<Mensaje> mensajes = new ArrayList<>();
        if (EnumTipoPago.getCodigos().contains(notaVenta.getTipoPago()))
            mensajes.add(new Mensaje(1, "NO EXISTE TIPO DE PAGO"));
        if (EnumTipoEntrega.getCodigos().contains(notaVenta.getTipoEntrega()))
            mensajes.add(new Mensaje(2, "NO EXISTE TIPO DE ENTREGA"));
        return mensajes;
    }

}
