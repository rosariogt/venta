public class Producto {

    private int codigo;
    private String nombre;
    private String tipoProducto;

    public Producto(int codigo, String nombre, String tipoProducto) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.tipoProducto = tipoProducto;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
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
}
