import enums.EnumTipoPago;

import java.util.ArrayList;
import java.util.List;

public class TipoPagoService {

    public void registrar() {

    }

    public void actualizar() {

    }

    public List<Parametrica> obtenerTipoPagos() {
        List<Parametrica> tiposPago = new ArrayList<>();
        for (EnumTipoPago vEnum : EnumTipoPago.values())
            tiposPago.add(new Parametrica(vEnum.getCodigo(), vEnum.getDescripcion()));
        return tiposPago;
    }
}
