public class Producto {

    private String codigo;
    private String nombre;
    private String tipoProducto;
    private String unidadMedida;

    public Producto(String codigo, String nombre, String tipoProducto, String unidadMedida) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.tipoProducto = tipoProducto;
        this.unidadMedida = unidadMedida;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipoProducto() {
        return tipoProducto;
    }

    public void setTipoProducto(String tipoProducto) {
        this.tipoProducto = tipoProducto;
    }

    public String getUnidadMedida() {
        return unidadMedida;
    }

    public void setUnidadMedida(String unidadMedida) {
        this.unidadMedida = unidadMedida;
    }
    
}
