package pro.sky.stream_api_and_optional;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import pro.sky.stream_api_and_optional.testing.User;
import pro.sky.stream_api_and_optional.testing.UserDao;
import pro.sky.stream_api_and_optional.testing.UserDaoImpl;

public class UserDaoTest {

    private final UserDao dao = new UserDaoImpl();

    @Test
    public void testUserByUsername() {
        User user = dao.getUserByName("Mary");
        Assertions.assertNotNull(user);
        Assertions.assertNotEquals(user.getName(), "Mary");
    }

    @Test
    public void testUserByNameIsNull() {
        Assertions.assertNull(dao.getUserByName("person"));

    }
}
