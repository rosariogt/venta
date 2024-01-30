package enums;

import java.util.HashSet;
import java.util.Set;

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

     public static Set<Integer> getCodigos() {
        Set<Integer> codigoSet = new HashSet<>();
        for (EnumTipoEntrega vEnum : EnumTipoEntrega.values())
            codigoSet.add(vEnum.getCodigo());
        return codigoSet;
    }

}
