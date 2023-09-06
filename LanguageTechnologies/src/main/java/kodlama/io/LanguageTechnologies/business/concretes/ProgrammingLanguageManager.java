package kodlama.io.LanguageTechnologies.business.concretes;

import kodlama.io.LanguageTechnologies.business.abstracts.ProgrammingLanguageService;
import kodlama.io.LanguageTechnologies.business.request.CreateProgrammingLanguageRequest;
import kodlama.io.LanguageTechnologies.business.response.GetAllProgrammingLanguageResponse;
import kodlama.io.LanguageTechnologies.business.response.GetByIdProgrammingLanguageResponse;
import kodlama.io.LanguageTechnologies.dataAccess.abstracts.ProgrammingLanguageRepository;
import kodlama.io.LanguageTechnologies.entities.concretes.ProgrammingLanguage;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProgrammingLanguageManager implements ProgrammingLanguageService {

    private ProgrammingLanguageRepository programmingLanguageRepository;

    public ProgrammingLanguageManager(ProgrammingLanguageRepository programmingLanguageRepository) {
        this.programmingLanguageRepository = programmingLanguageRepository;
    }

    @Override
    public List<GetAllProgrammingLanguageResponse> getAll() {

        List<ProgrammingLanguage> programmingLanguages = programmingLanguageRepository.findAll();
        List<GetAllProgrammingLanguageResponse> programmingLanguageResponses = new ArrayList<GetAllProgrammingLanguageResponse>();

        for (ProgrammingLanguage programmingLanguage : programmingLanguages){
            GetAllProgrammingLanguageResponse responseItem = new GetAllProgrammingLanguageResponse();
            responseItem.setId(programmingLanguage.getId());
            responseItem.setName(programmingLanguage.getName());
            programmingLanguageResponses.add(responseItem);
        }
        return programmingLanguageResponses;
    }

    @Override
    public GetByIdProgrammingLanguageResponse getById(int id) throws Exception {
        ProgrammingLanguage programmingLanguage = programmingLanguageRepository.findById(id).orElse(null);
        if(programmingLanguage == null){
             throw new Exception("ProgrammingLanguage could not find");
        }
        return new GetByIdProgrammingLanguageResponse(programmingLanguage);
    }

    @Override
    public ProgrammingLanguage getProgrammingLanguageById(int id) {
        return null;
    }

    @Override
    public void add(CreateProgrammingLanguageRequest createProgrammingLanguageRequest) {
        ProgrammingLanguage programmingLanguage = new ProgrammingLanguage();
        programmingLanguage.setName(createProgrammingLanguageRequest.getName());
        this.programmingLanguageRepository.save(programmingLanguage);

    }

    @Override
    public void deleteById(int id) {
        this.programmingLanguageRepository.deleteById(id);

    }

    @Override
    public void update(CreateProgrammingLanguageRequest createProgrammingLanguageRequest, int id) {
        ProgrammingLanguage programmingLanguage = programmingLanguageRepository.findById(id).get();
        programmingLanguage.setName(createProgrammingLanguageRequest.getName());
        this.programmingLanguageRepository.save(programmingLanguage);
    }
}
