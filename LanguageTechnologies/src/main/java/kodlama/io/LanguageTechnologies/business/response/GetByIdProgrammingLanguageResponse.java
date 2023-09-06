package kodlama.io.LanguageTechnologies.business.response;

import kodlama.io.LanguageTechnologies.entities.concretes.ProgrammingLanguage;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetByIdProgrammingLanguageResponse {
    private int id;
    private String name;

    public GetByIdProgrammingLanguageResponse(ProgrammingLanguage programmingLanguage) {
        this.id = programmingLanguage.getId();
        this.name= programmingLanguage.getName();
    }
}
