package pro.sky.stream_api_and_optional.testing;

import java.util.List;

public interface UserDao {
    User getUserByName(String name);

    List<User> findAllUsers();
}
