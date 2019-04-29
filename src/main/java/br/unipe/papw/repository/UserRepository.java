package br.unipe.papw.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.unipe.papw.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
}
