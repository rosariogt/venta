import java.util.HashMap;
import java.util.Map;

public class ClienteService {

    private Map<String, Cliente> clientesMap = new HashMap<>();

    public ClienteService() {
        this.clientesMap.put("9887788", new Cliente("Boris", "444-5"));
        this.clientesMap.put("7584585", new Cliente("Maria", "458-7"));
        this.clientesMap.put("9686869", new Cliente("Pablo", "125-3"));
        this.clientesMap.put("7412547", new Cliente("Carlos", "789-6"));
    }

    public Boolean obtenerPorDocumento(String numeroDocumento) {
        return true;
    }

    public void registrar(Cliente cliente) {

    }
}
