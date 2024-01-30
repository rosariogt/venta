package enums;

import java.util.HashSet;
import java.util.Set;

public enum EnumTipoPago {
    EFECTIVO(1, "EFECTIVO"),
    TARJETA(2, "TARJETA"),
    GIFTCARD(3, "GIFTCARD");

    private Integer codigo;
    private String descripcion;

    public Integer getCodigo() {
        return codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    EnumTipoPago(Integer codigo, String descripcion) {
        this.codigo = codigo;
        this.descripcion = descripcion;
    }

    public static Set<Integer> getCodigos() {
        Set<Integer> codigoSet = new HashSet<>();
        for (EnumTipoPago vEnum : EnumTipoPago.values())
            codigoSet.add(vEnum.getCodigo());
        return codigoSet;
    }

}
