package br.com.gestao.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.gestao.model.Convidado;

public interface ConvidadoRepository extends JpaRepository<Convidado, Long>{
	
}
