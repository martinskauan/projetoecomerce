package despertartech.ecommerce.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import despertartech.ecommerce.model.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria, Long> {
	public List<Categoria> findAllByDescricaoContainingIgnoreCase( String descricao);
}
