package pro.sky.stream_api_and_optional.testing;

import java.util.Arrays;
import java.util.List;

public class UserDaoImpl implements UserDao {
    private final List<User> users;
    public UserDaoImpl() {
        this.users = Arrays.asList(
                new User("Marie", "marie@mail.ru"),
                new User("Piter", "piter@mail.ru")
        );
    }

    @Override
    public User getUserByName(String name) {
        for (User user : users) {
            if (user.getName().equals(name)) {
                return user;
            }
        }
        return null;
    }
    @Override
    public List<User> findAllUsers() {
        return users;
    }
}
