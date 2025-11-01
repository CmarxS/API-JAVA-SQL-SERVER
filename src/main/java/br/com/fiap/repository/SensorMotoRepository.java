package br.com.fiap.repository;

import br.com.fiap.entity.SensorMoto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SensorMotoRepository extends JpaRepository<SensorMoto, Integer> {
}
