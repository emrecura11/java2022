package Kodlama.io.Devs.business.concreates;

import Kodlama.io.Devs.business.abstracts.LanguageSubTechnologiesService;
import Kodlama.io.Devs.business.requests.CreateSubTechnologyRequest;
import Kodlama.io.Devs.business.requests.DeleteLanguageRequest;
import Kodlama.io.Devs.business.requests.UpdateLanguageRequest;
import Kodlama.io.Devs.business.responses.GetAllSubTechnologiesResponse;
import Kodlama.io.Devs.business.responses.GetByIdResponse;
import Kodlama.io.Devs.dataAccess.abstracts.LanguageRepository;
import Kodlama.io.Devs.dataAccess.abstracts.LanguageSubTechnologiesRepository;
import Kodlama.io.Devs.entities.concreates.Language;
import Kodlama.io.Devs.entities.concreates.LanguageSubTechnology;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class LanguageSubTechnologyManager implements LanguageSubTechnologiesService {

    private LanguageSubTechnologiesRepository languageSubTechnologiesRepository;
    private LanguageRepository languageRepository;

    public LanguageSubTechnologyManager(LanguageSubTechnologiesRepository languageSubTechnologiesRepository, LanguageRepository languageRepository) {
        this.languageSubTechnologiesRepository = languageSubTechnologiesRepository;
        this.languageRepository = languageRepository;
    }

    @Override
    public List<GetAllSubTechnologiesResponse> getAll() {
        List<LanguageSubTechnology> languageSubTechnologies=languageSubTechnologiesRepository.findAll();
        List<GetAllSubTechnologiesResponse> getAllSubTechnologiesResponses=new ArrayList<>();

        for (LanguageSubTechnology languageSubTechnology : languageSubTechnologies){
            GetAllSubTechnologiesResponse getAllSubTechnologiesResponse =new GetAllSubTechnologiesResponse();
            getAllSubTechnologiesResponse.setId(languageSubTechnology.getId());
            getAllSubTechnologiesResponse.setName(languageSubTechnology.getName());
            getAllSubTechnologiesResponse.setLanguage(languageSubTechnology.getLanguage());

            getAllSubTechnologiesResponses.add(getAllSubTechnologiesResponse);
        }
        return getAllSubTechnologiesResponses;
    }

    @Override
    public void add(CreateSubTechnologyRequest createSubTechnologyRequest) throws Exception {
        List<Language> languages=languageRepository.findAll();
        if (createSubTechnologyRequest.getName().isEmpty()){
            throw new Exception("Language can not be empty");
        }
        for (Language language : languages){
            if (language.getSubTechnologies().equals(createSubTechnologyRequest.getName())){
                throw new Exception("Invalid name");
            }
            else {

                LanguageSubTechnology languageSubTechnology=new LanguageSubTechnology();
                languageSubTechnology.setName(createSubTechnologyRequest.getName());
                languageSubTechnologiesRepository.save(languageSubTechnology);
            }

        }

        LanguageSubTechnology languageSubTechnology=new LanguageSubTechnology();
        languageSubTechnology.setName(createSubTechnologyRequest.getName());



        languageSubTechnologiesRepository.save(languageSubTechnology);

    }

    @Override
    public void delete(DeleteLanguageRequest deleteLanguageRequest) {
        for (LanguageSubTechnology languageSubTechnology : languageSubTechnologiesRepository.findAll()){
            if (languageSubTechnology.getName()==deleteLanguageRequest.getName()){
                languageSubTechnologiesRepository.delete(languageSubTechnology);
                break;
            }
        }

    }

    @Override
    public void update(UpdateLanguageRequest updateLanguageRequest, String newName) {


        for (LanguageSubTechnology languageSubTechnology : languageSubTechnologiesRepository.findAll()){
            if (languageSubTechnology.getName()==updateLanguageRequest.getName()){
                languageSubTechnology.setName(updateLanguageRequest.getName());
                break;
            }
        }

    }

    @Override
    public GetByIdResponse getById(int id) {

        GetByIdResponse getByIdResponse=new GetByIdResponse();
        for (Language language : languageRepository.findAll()){
            if (language.getId()==id){
                getByIdResponse.setId(id);
            }
        }
        return getByIdResponse;

    }
}
