package kodlama.io.LanguageTechnologies.business.concretes;

import kodlama.io.LanguageTechnologies.business.abstracts.SubTechnologyService;
import kodlama.io.LanguageTechnologies.business.request.CreateSubTechnologyRequest;
import kodlama.io.LanguageTechnologies.business.request.DeleteSubTechnologyRequest;
import kodlama.io.LanguageTechnologies.business.response.GetAllSubTechnologyResponse;
import kodlama.io.LanguageTechnologies.business.response.GetByIdSubTechnologyResponse;
import kodlama.io.LanguageTechnologies.dataAccess.abstracts.SubTechnologyRepository;
import kodlama.io.LanguageTechnologies.entities.concretes.SubTechnology;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class SubTechnologyManager implements SubTechnologyService {

    private SubTechnologyRepository subTechnologyRepository;

    public SubTechnologyManager(SubTechnologyRepository subTechnologyRepository) {
        this.subTechnologyRepository = subTechnologyRepository;
    }

    @Override
    public List<GetAllSubTechnologyResponse> getAll() {
        List<SubTechnology> subTechnologies = subTechnologyRepository.findAll();
        List<GetAllSubTechnologyResponse> subTechnologyResponses = new ArrayList<GetAllSubTechnologyResponse>();

        for (SubTechnology subTechnology : subTechnologies){
            GetAllSubTechnologyResponse responseItem = new GetAllSubTechnologyResponse();
            responseItem.setId(subTechnology.getId());
            responseItem.setName(subTechnology.getName());
            subTechnologyResponses.add(responseItem);
        }


        return subTechnologyResponses;
    }

    @Override
    public GetByIdSubTechnologyResponse getById(int id) throws Exception {
        SubTechnology subTechnology = subTechnologyRepository.findById(id).orElse(null);
        if (subTechnology == null){
            throw new Exception("SubTechnology could not find");
        }
        return new GetByIdSubTechnologyResponse(subTechnology);
    }

    @Override
    public SubTechnology getSubTechnologyById(int id) {
        return subTechnologyRepository.findById(id).orElse(null);
    }

    @Override
    public void add(CreateSubTechnologyRequest createSubTechnologyRequest) {
        SubTechnology subTechnology = new SubTechnology();
        subTechnology.setName(createSubTechnologyRequest.getName());
        this.subTechnologyRepository.save(subTechnology);

    }

    @Override
    public void deleteById(DeleteSubTechnologyRequest deleteSubTechnologyRequest) {
        this.subTechnologyRepository.deleteById(deleteSubTechnologyRequest.getDeleteId());
    }

    @Override
    public void update(CreateSubTechnologyRequest createSubTechnologyRequest, int id) {
        SubTechnology subTechnology = subTechnologyRepository.findById(id).get();
        subTechnology.setName(createSubTechnologyRequest.getName());
        this.subTechnologyRepository.save(subTechnology);
    }
}
