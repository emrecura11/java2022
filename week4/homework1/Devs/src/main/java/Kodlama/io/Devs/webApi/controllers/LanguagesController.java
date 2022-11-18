package Kodlama.io.Devs.webApi.controllers;

import Kodlama.io.Devs.business.abstracts.LanguageService;
import Kodlama.io.Devs.entities.concreates.Language;
import org.springframework.beans.factory.annotation.Autowired;
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
    private List<Language> getAll(){
        return languageService.getAll();
    }

    @PostMapping("/add")
    public void add(Language language) throws Exception {
     languageService.add(language);
    }
    @DeleteMapping("/delete")
    public void delete(Language language){
        languageService.delete(language);
    }
    @PutMapping("/update")
    public void update(Language language,int newId,String newName){
        languageService.update(language,newId,newName);
    }
    @GetMapping("/getById")
    public Language getById(int id){

        return languageService.getById(id);
    }

}
