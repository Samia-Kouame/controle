package kouame.controle.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import kouame.controle.entities.Article;
import kouame.controle.entities.Categorie;




public interface ArticleRepository extends JpaRepository<Article,Long>{
    List<Article> findByCategorie(Categorie specialite);
	
	List<Article> findByDateProductionBetween(Date dateDebut, Date dateFin);

}
