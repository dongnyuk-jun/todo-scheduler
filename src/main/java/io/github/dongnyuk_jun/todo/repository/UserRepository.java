package io.github.dongnyuk_jun.todo.repository;

import io.github.dongnyuk_jun.todo.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByUsername(String username);
}
