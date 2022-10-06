import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ConnectTest {

    @Test
    public void deveRetornarNomeUsuario() {
        Connect.getConn().setUser("root");
        assertEquals("root", Connect.getConn().getUser());
    }

    @Test
    public void deveRetornarBancoDeDados() {
        Connect.getConn().setDatabase("Banco de dados 1");
        assertEquals("Banco de dados 1", Connect.getConn().getDatabase());
    }

    @Test
    public void deveAlterarSenhaAlterada() {
        Connect.getConn().setPassword("senha-antinga123");
        Connect.getConn().setPassword("novasenha");
        assertEquals("novasenha", Connect.getConn().getPassword());
    }

    @Test
    public void deveRetornarHostAlterado() {
        Connect.getConn().setHost("db");
        Connect.getConn().setHost("database");
        assertEquals("database", Connect.getConn().getHost());
    }
}