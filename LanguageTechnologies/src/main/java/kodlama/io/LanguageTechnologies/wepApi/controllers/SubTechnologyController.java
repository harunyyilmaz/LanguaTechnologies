package kodlama.io.LanguageTechnologies.wepApi.controllers;

import kodlama.io.LanguageTechnologies.business.abstracts.SubTechnologyService;
import kodlama.io.LanguageTechnologies.business.request.CreateSubTechnologyRequest;
import kodlama.io.LanguageTechnologies.business.request.DeleteSubTechnologyRequest;
import kodlama.io.LanguageTechnologies.business.response.GetAllSubTechnologyResponse;
import kodlama.io.LanguageTechnologies.business.response.GetByIdSubTechnologyResponse;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/subTechnology")
public class SubTechnologyController {

    private SubTechnologyService subTechnologyService;

    public SubTechnologyController(SubTechnologyService subTechnologyService) {
        this.subTechnologyService = subTechnologyService;
    }

    @GetMapping("/getall")
    public List<GetAllSubTechnologyResponse> getAll() {
        return subTechnologyService.getAll();
    }

    @PutMapping("/update")
    public void update(@RequestBody CreateSubTechnologyRequest createSubTechnologyRequest , int id){
        this.subTechnologyService.update(createSubTechnologyRequest , id);
    }

    @DeleteMapping("/deleteById")
    public void deleteById(@RequestBody DeleteSubTechnologyRequest deleteSubTechnologyRequest){
        this.subTechnologyService.deleteById(deleteSubTechnologyRequest);
    }
    @GetMapping("/id")
    public GetByIdSubTechnologyResponse getById(@PathVariable int id) throws Exception{
        return subTechnologyService.getById(id);
    }

    @GetMapping("/add")
    public void add(@RequestBody CreateSubTechnologyRequest createSubTechnologyRequest){
        this.subTechnologyService.add(createSubTechnologyRequest);
    }


}
