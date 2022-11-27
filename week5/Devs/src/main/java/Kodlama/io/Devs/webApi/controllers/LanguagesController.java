package Kodlama.io.Devs.webApi.controllers;

import Kodlama.io.Devs.business.abstracts.LanguageService;
import Kodlama.io.Devs.business.requests.CreateLanguageRequest;
import Kodlama.io.Devs.business.requests.DeleteLanguageRequest;
import Kodlama.io.Devs.business.requests.UpdateLanguageRequest;
import Kodlama.io.Devs.business.responses.GetAllLanguagesResponse;
import Kodlama.io.Devs.business.responses.GetByIdResponse;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/languages")
public class LanguagesController {

    private LanguageService languageService;



    public LanguagesController(LanguageService languageService) {
        this.languageService = languageService;
    }


    @GetMapping("/getall")
    private List<GetAllLanguagesResponse> getAll(){
        return languageService.getAll();
    }

    @PostMapping("/add")
    public void add(CreateLanguageRequest createLanguageRequest) throws Exception {
     languageService.add(createLanguageRequest);
    }
    @DeleteMapping("/delete")
    public void delete(DeleteLanguageRequest deleteLanguageRequest){
        languageService.delete(deleteLanguageRequest);
    }
    @PutMapping("/update")
    public void update(UpdateLanguageRequest updateLanguageRequest, int newId, String newName){
        languageService.update(updateLanguageRequest,newName);
    }
    @GetMapping("/getById")
    public GetByIdResponse getById(int id){

        return languageService.getById(id);
    }

}
