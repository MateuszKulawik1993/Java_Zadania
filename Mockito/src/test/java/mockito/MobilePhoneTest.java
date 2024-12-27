package mockito;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.nio.channels.OverlappingFileLockException;

import static org.junit.jupiter.api.Assertions.*;

class MobilePhoneTest {
    MobilePhone myPhone = Mockito.mock(MobilePhone.class);

    @Test
    public void testDefaultBehaviourOfTestDouble(){
        assertFalse(myPhone.needsCharging());
        Mockito.when(myPhone.needsCharging()).thenReturn(true);
        assertTrue(myPhone.needsCharging());

    }
    @Test
    public void shouldCallLaunchApplication(){
        myPhone.launchApplication("Tetris 40");
        Mockito.verify(myPhone).launchApplication("Tetris 40");
    }
    @Test
    public void testVerificationFailure(){
        myPhone.getFreeStorage();
        Mockito.verify(myPhone.getFreeStorage());
    }
}

