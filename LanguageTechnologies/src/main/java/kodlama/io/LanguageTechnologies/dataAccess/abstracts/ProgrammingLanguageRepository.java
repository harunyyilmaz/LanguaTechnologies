package kodlama.io.LanguageTechnologies.dataAccess.abstracts;

import kodlama.io.LanguageTechnologies.entities.concretes.ProgrammingLanguage;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProgrammingLanguageRepository extends JpaRepository<ProgrammingLanguage,Integer> {
}
