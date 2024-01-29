package enums;

public enum EnumTipoEntrega {

    DELIVERY(1, "DELIVERY"),
    ENTREGA_EXPRESS(2, "ENTREGA EXPRESS"),
    ENVIO_ESTANDAR(3, "ENVIO ESTANDAR");

    private Integer codigo;
    private String descripcion;

    public Integer getCodigo() {
        return codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    EnumTipoEntrega(Integer codigo, String descripcion) {
        this.codigo = codigo;
        this.descripcion = descripcion;
    }

}
