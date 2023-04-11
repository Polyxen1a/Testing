package pro.sky.stream_api_and_optional;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import pro.sky.stream_api_and_optional.testing.User;

import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class UserTest {
    private static User user1;
    private static User user2;

    @BeforeAll
    public static void createUsers() {
        user1 = new User();
        user2 = new User("test", 20, "test@test.ru");
    }

    @Test
    public void testCreateUserWithParameters() {
        assertTrue(user2.getEmail() != null && user2.getName() != null);
    }
    @Test
    public void testCreateUserWithoutParameters() {
        assertTrue(user1.getEmail() == null && user1.getName() == null);
    }
    @Test
    public void testCorrectEmail() {
        String char1 = "@";
        String char2 = ".";
        assertTrue(user2.getEmail().contains(char1) && user2.getEmail().contains(char2));
    }

    @Test
    public void testEqualsLoginAndEmail() {
        assertNotEquals(user2.getEmail(), user2.getName());
    }
}
