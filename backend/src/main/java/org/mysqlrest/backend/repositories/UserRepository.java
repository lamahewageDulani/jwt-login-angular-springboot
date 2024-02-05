package org.mysqlrest.backend.repositories;

import org.mysqlrest.backend.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
