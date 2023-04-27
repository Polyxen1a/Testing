package pro.sky.stream_api_and_optional;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import pro.sky.stream_api_and_optional.testing.User;
import pro.sky.stream_api_and_optional.testing.UserDao;
import pro.sky.stream_api_and_optional.testing.UserService;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class UserServiceTest {

    @Mock
    private UserDao dao;

    @InjectMocks
    private UserService userService;

    @Test
    public void checkIfUserExistTrue() {
        when(dao.getUserByName("test")).thenReturn(new User("test"));
        boolean userExists = userService.checkUserExist(
                new User("test")
        );
        assertTrue(userExists);
    }

    @Test
    public void checkIfUserExistFalse() {
        when(dao.getUserByName("test")).thenReturn(null);

        boolean userExists = userService.checkUserExist(
                new User("test")
        );
        assertFalse(userExists);
    }
}
