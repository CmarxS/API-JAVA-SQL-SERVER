package br.com.fiap.repository;

import br.com.fiap.entity.ManutencaoMoto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ManutencaoMotoRepository extends JpaRepository<ManutencaoMoto, Integer> {
}
