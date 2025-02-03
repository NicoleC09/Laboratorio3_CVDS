package edu.eci.cvds.tdd.library.user;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class UserTest {

    public UserTest() {}

    @Test
    public void mustCreateUser() {
        assertDoesNotThrow(()->{
            User user = new User();
        });
    }

    @Test
    public void shouldNotGetName() {
        User user = new User();
        assertNull(user.getName());
    }

    @Test
    public void shouldGetName() {
        User user = new User();
        user.setName("Nicole");
        assertEquals(user.getName(), "Nicole");
    }

    @Test
    public void shouldSetName() {
        
        
    }

    @Test
    public void shouldNotSetName() {
        assertThrows(()->{
            User user = new User();
            user.setName(10);
        });
    }

    @Test
    public void shouldGetId() {
        
        
    }

    @Test
    public void shouldNotGetId() {
        
        
    }

    @Test
    public void shouldSetId() {
        
        
    }

    @Test
    public void shouldNotSetId() {
        
        
    }
}
