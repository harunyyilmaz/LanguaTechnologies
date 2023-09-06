package kodlama.io.LanguageTechnologies.business.abstracts;

import kodlama.io.LanguageTechnologies.business.request.CreateSubTechnologyRequest;
import kodlama.io.LanguageTechnologies.business.request.DeleteSubTechnologyRequest;
import kodlama.io.LanguageTechnologies.business.response.GetAllSubTechnologyResponse;
import kodlama.io.LanguageTechnologies.business.response.GetByIdSubTechnologyResponse;
import kodlama.io.LanguageTechnologies.entities.concretes.SubTechnology;

import java.util.List;

public interface SubTechnologyService {

    List<GetAllSubTechnologyResponse> getAll();

    GetByIdSubTechnologyResponse getById(int id) throws Exception;

    SubTechnology getSubTechnologyById(int id);

    void add(CreateSubTechnologyRequest createSubTechnologyRequest);

    void deleteById(DeleteSubTechnologyRequest deleteSubTechnologyRequest);

    void update(CreateSubTechnologyRequest createSubTechnologyRequest , int id);
}
