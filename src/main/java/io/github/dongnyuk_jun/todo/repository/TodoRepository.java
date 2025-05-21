package io.github.dongnyuk_jun.todo.repository;

import io.github.dongnyuk_jun.todo.domain.Todo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TodoRepository extends JpaRepository<Todo, Long> {
}