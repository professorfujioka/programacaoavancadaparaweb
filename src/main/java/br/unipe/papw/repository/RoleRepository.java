package br.unipe.papw.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.unipe.papw.model.Role;

public interface RoleRepository extends JpaRepository<Role, Long>{
}
