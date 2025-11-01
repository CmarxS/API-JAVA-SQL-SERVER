package br.com.fiap.repository;

import br.com.fiap.entity.LocalizacaoMoto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LocalizacaoMotoRepository extends JpaRepository<LocalizacaoMoto, Integer> {
}
