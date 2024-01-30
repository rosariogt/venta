import java.util.ArrayList;
import java.util.List;

public class RespuestaRegistroVenta {

    private List<Mensaje> mensajes = new ArrayList<>();
    private Long ventaId;

    public List<Mensaje> getMensajes() {
        return mensajes;
    }

    public void setMensajes(List<Mensaje> mensajes) {
        this.mensajes = mensajes;
    }

    public Long getVentaId() {
        return ventaId;
    }

    public void setVentaId(Long ventaId) {
        this.ventaId = ventaId;
    }
}
