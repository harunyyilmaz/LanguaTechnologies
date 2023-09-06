package kodlama.io.LanguageTechnologies.business.response;

import kodlama.io.LanguageTechnologies.entities.concretes.SubTechnology;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class GetByIdSubTechnologyResponse {
    private int id;
    private String name;

    public GetByIdSubTechnologyResponse(SubTechnology subTechnology) {
        this.id=subTechnology.getId();
        this.name=subTechnology.getName();
    }
}
