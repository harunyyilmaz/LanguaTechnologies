package kodlama.io.LanguageTechnologies.business.abstracts;

import kodlama.io.LanguageTechnologies.business.request.CreateProgrammingLanguageRequest;
import kodlama.io.LanguageTechnologies.business.response.GetAllProgrammingLanguageResponse;
import kodlama.io.LanguageTechnologies.business.response.GetByIdProgrammingLanguageResponse;
import kodlama.io.LanguageTechnologies.entities.concretes.ProgrammingLanguage;


import java.util.List;

public interface ProgrammingLanguageService {

    List<GetAllProgrammingLanguageResponse> getAll();

    GetByIdProgrammingLanguageResponse getById(int id) throws Exception;

    ProgrammingLanguage getProgrammingLanguageById(int id);

    void add(CreateProgrammingLanguageRequest createProgrammingLanguageRequest);

    void deleteById(int id);

    void update(CreateProgrammingLanguageRequest createProgrammingLanguageRequest , int id);
}
