package Kodlama.io.Devs.webApi.controllers;


import Kodlama.io.Devs.business.abstracts.LanguageSubTechnologiesService;

import Kodlama.io.Devs.business.requests.CreateSubTechnologyRequest;
import Kodlama.io.Devs.business.requests.DeleteLanguageRequest;
import Kodlama.io.Devs.business.requests.UpdateLanguageRequest;

import Kodlama.io.Devs.business.responses.GetAllSubTechnologiesResponse;
import Kodlama.io.Devs.business.responses.GetByIdResponse;
import Kodlama.io.Devs.entities.concreates.Language;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/languages/subTechnologies")

public class LanguageSubTechnologiesController {

    private LanguageSubTechnologiesService languageSubTechnologiesService;

    public LanguageSubTechnologiesController(LanguageSubTechnologiesService languageSubTechnologiesService){
        this.languageSubTechnologiesService=languageSubTechnologiesService;

    }


    @GetMapping("/getall")
    private List<GetAllSubTechnologiesResponse> getAll(){
        return languageSubTechnologiesService.getAll();
    }

    @PostMapping("/add")
    public void add(CreateSubTechnologyRequest createSubTechnologyRequest,Language language) throws Exception {
        languageSubTechnologiesService.add(createSubTechnologyRequest);
    }
    @DeleteMapping("/delete")
    public void delete(DeleteLanguageRequest deleteLanguageRequest){
        languageSubTechnologiesService.delete(deleteLanguageRequest);
    }
    @PutMapping("/update")
    public void update(UpdateLanguageRequest updateLanguageRequest, String newName){
        languageSubTechnologiesService.update(updateLanguageRequest,newName);
    }
    @GetMapping("/getById")
    public GetByIdResponse getById(int id){

        return languageSubTechnologiesService.getById(id);
    }
}
