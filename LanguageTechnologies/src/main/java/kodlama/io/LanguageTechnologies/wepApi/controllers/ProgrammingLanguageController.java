package kodlama.io.LanguageTechnologies.wepApi.controllers;

import kodlama.io.LanguageTechnologies.business.abstracts.ProgrammingLanguageService;
import kodlama.io.LanguageTechnologies.business.request.CreateProgrammingLanguageRequest;
import kodlama.io.LanguageTechnologies.business.response.GetAllProgrammingLanguageResponse;
import kodlama.io.LanguageTechnologies.business.response.GetByIdProgrammingLanguageResponse;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/ProgrammingLanguage")
public class ProgrammingLanguageController {

    private ProgrammingLanguageService programmingLanguageService;

    public ProgrammingLanguageController(ProgrammingLanguageService programmingLanguageService) {
        this.programmingLanguageService = programmingLanguageService;
    }

    @GetMapping("/getall")
    public List<GetAllProgrammingLanguageResponse> getAll() {
        return programmingLanguageService.getAll();
    }

    @PostMapping("/add")
    public void add(@RequestBody CreateProgrammingLanguageRequest createProgrammingLanguageRequest){
        this.programmingLanguageService.add(createProgrammingLanguageRequest);
    }

    @DeleteMapping("/deleteById")
    public void deleteById(@RequestParam int id){
        this.programmingLanguageService.deleteById(id);
    }

    @GetMapping("/id")
    public GetByIdProgrammingLanguageResponse getById(@PathVariable int id) throws Exception{
        return this.programmingLanguageService.getById(id);
    }

    @PutMapping("/update")
    public void update(@RequestBody CreateProgrammingLanguageRequest createProgrammingLanguageRequest , int id){
        this.programmingLanguageService.update(createProgrammingLanguageRequest , id);
    }


}
