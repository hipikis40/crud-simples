package br.com.aprendendo.spring.repository;

import br.com.aprendendo.spring.entity.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {
}
