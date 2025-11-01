package br.com.fiap.repository;

import br.com.fiap.entity.MovimentoMoto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MovimentoMotoRepository extends JpaRepository<MovimentoMoto, Integer> {
}
