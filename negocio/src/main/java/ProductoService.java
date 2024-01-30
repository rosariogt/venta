import java.util.List;

public class ProductoService {

   private Map<String, Producto> productosMap = new HashMap<>();
    
   public ProductoService() {
        this.productosMap.put("01", new Producto("01", "tela", "producto", "metros"));
        this.productosMap.put("02", new Producto("02", "pintura", "producto", "litros"));
        this.productosMap.put("03", new Producto("03", "barniz", "producto", "litros"));
        this.productosMap.put("04", new Producto("0", "pintados", "servicio", "dias"));
    }

    public Map<String, Producto> getProductosMap() {
        return productosMap;
    }

    public void setProductosMap(Map<String, Producto> productosMap) {
        this.productosMap = productosMap;
    }

    public List<Producto> obtenerProductos() {
        return productosMap.values().stream().collect(Collectors.toList());
    }

}
