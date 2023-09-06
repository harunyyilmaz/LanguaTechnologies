package kodlama.io.LanguageTechnologies.dataAccess.abstracts;

import kodlama.io.LanguageTechnologies.entities.concretes.SubTechnology;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SubTechnologyRepository extends JpaRepository<SubTechnology,Integer> {
}
