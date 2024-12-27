package mockito.user;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class UserServiceTest {

    @Test
    void testFindUserById_UserExists() {
        // Mockowanie repozytorium
        UserRepository userRepository = mock(UserRepository.class);
        UserService userService = new UserService(userRepository);

        User user = new User(1L, "John Doe", "john@example.com");
        when(userRepository.findById(1L)).thenReturn(Optional.of(user));

        // Testowanie
        User foundUser = userService.findUserById(1L);

        // Assercje
        assertEquals("John Doe", foundUser.getName());
        assertEquals("john@example.com", foundUser.getEmail());
        verify(userRepository, times(1)).findById(1L);
    }

    @Test
    void testFindUserById_UserDoesNotExist() {
        // Mockowanie repozytorium
        UserRepository userRepository = Mockito.mock(UserRepository.class);
        UserService userService = new UserService(userRepository);

        when(userRepository.findById(1L)).thenReturn(Optional.empty());

        // Testowanie
        RuntimeException exception = assertThrows(RuntimeException.class, () -> userService.findUserById(1L));
        assertEquals("User not found", exception.getMessage());

        verify(userRepository, times(1)).findById(1L);
    }

    @Test
    void testCreateUser() {
        // Mockowanie repozytorium
        UserRepository userRepository = Mockito.mock(UserRepository.class);
        UserService userService = new UserService(userRepository);

        User user = new User(2L, "Jane Doe", "jane@example.com");

        // Testowanie
        userService.createUser(user);

        // Weryfikacja
        verify(userRepository, times(1)).save(user);
    }
}