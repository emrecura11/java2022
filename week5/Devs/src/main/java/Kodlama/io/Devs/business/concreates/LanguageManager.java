package Kodlama.io.Devs.business.concreates;

import Kodlama.io.Devs.business.abstracts.LanguageService;
import Kodlama.io.Devs.business.requests.CreateLanguageRequest;
import Kodlama.io.Devs.business.requests.DeleteLanguageRequest;
import Kodlama.io.Devs.business.requests.UpdateLanguageRequest;
import Kodlama.io.Devs.business.responses.GetAllLanguagesResponse;
import Kodlama.io.Devs.business.responses.GetByIdResponse;
import Kodlama.io.Devs.dataAccess.abstracts.LanguageRepository;
import Kodlama.io.Devs.entities.concreates.Language;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class LanguageManager implements LanguageService {

    private LanguageRepository languageRepository;


    public LanguageManager(LanguageRepository languageRepository) {
        this.languageRepository = languageRepository;
    }


    @Override
    public List<GetAllLanguagesResponse> getAll() {
        List<Language> languages =languageRepository.findAll();
        List<GetAllLanguagesResponse> languagesResponses= new ArrayList<>();
        for (Language language : languages){
            GetAllLanguagesResponse responseItem= new GetAllLanguagesResponse();
            responseItem.setName(language.getName());
            responseItem.setId(language.getId());
            languagesResponses.add(responseItem);
        }
        return languagesResponses;
    }


    @Override
    public void add(CreateLanguageRequest createLanguageRequest) throws Exception {
        if (createLanguageRequest.getName().isEmpty()){
            throw new Exception("Language can not be empty");
        }

        for (GetAllLanguagesResponse language1 : getAll()){
            if (language1.getName().toLowerCase().equals(createLanguageRequest.getName().toLowerCase())){
                throw new Exception("Invalid name");
            }
        }
        Language language=new Language();
        language.setName(createLanguageRequest.getName());
        languageRepository.save(language);
    }


    @Override
    public void delete(DeleteLanguageRequest deleteLanguageRequest) {

        for (Language language1 : languageRepository.findAll()){
            if (language1.getName()==deleteLanguageRequest.getName()){
                languageRepository.delete(language1);

            }
        }

    }


    @Override
    public void update(UpdateLanguageRequest updateLanguageRequest, String newName) {
        for (Language language1 : languageRepository.findAll()){
            if (language1.getName()==updateLanguageRequest.getName()){
                language1.setName(newName);
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
