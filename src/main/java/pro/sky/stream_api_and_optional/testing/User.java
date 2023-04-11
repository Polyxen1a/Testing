package pro.sky.stream_api_and_optional.testing;

import java.util.Objects;

public class User {
    private String name;
    private String email;

    public User() {

    }

    public User(String name) {
        this.name = name;
    }

    public User(String name, int age, String email) {
        this.name = name;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return false;
    }
    @Override
    public int hashCode() {
        return Objects.hash(name, email);
    }
    }

