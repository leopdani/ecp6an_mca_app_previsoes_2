package exercicio9.eng2020_1_a09.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import exercicio9.eng2020_1_a09.model.Previsao;

public interface PrevisoesRepository extends JpaRepository<Previsao, Long> {

}