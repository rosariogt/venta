import java.math.BigDecimal;
import java.util.List;

public class NotaVenta {
    private Cliente cliente;
    private Parametrica tipoPago;
    private Parametrica tipoEntrega;
    private BigDecimal montoTotal;
    private BigDecimal montoDescuento;
    private List<DetalleVenta> detalles;

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Parametrica getTipoPago() {
        return tipoPago;
    }

    public void setTipoPago(Parametrica tipoPago) {
        this.tipoPago = tipoPago;
    }

    public Parametrica getTipoEntrega() {
        return tipoEntrega;
    }

    public void setTipoEntrega(Parametrica tipoEntrega) {
        this.tipoEntrega = tipoEntrega;
    }

    public BigDecimal getMontoTotal() {
        return montoTotal;
    }

    public void setMontoTotal(BigDecimal montoTotal) {
        this.montoTotal = montoTotal;
    }

    public BigDecimal getMontoDescuento() {
        return montoDescuento;
    }

    public void setMontoDescuento(BigDecimal montoDescuento) {
        this.montoDescuento = montoDescuento;
    }

    public List<DetalleVenta> getDetalles() {
        return detalles;
    }

    public void setDetalles(List<DetalleVenta> detalles) {
        this.detalles = detalles;
    }
}

