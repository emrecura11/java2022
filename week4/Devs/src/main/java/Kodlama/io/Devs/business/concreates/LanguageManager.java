package Kodlama.io.Devs.business.concreates;

import Kodlama.io.Devs.business.abstracts.LanguageService;
import Kodlama.io.Devs.dataAccess.abstracts.LanguageRepository;
import Kodlama.io.Devs.entities.concreates.Language;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class LanguageManager implements LanguageService {

    private LanguageRepository languageRepository;


    public LanguageManager(LanguageRepository languageRepository) {
        this.languageRepository = languageRepository;
    }

    @Override
    public List<Language> getAll() {
        return languageRepository.getAll();
    }

    @Override
    public void add(Language language) throws Exception {

        if (language.getName().isEmpty()){
            throw new Exception("Language can not be empty");
        }

        for (Language language1 : getAll()){
            if (language1.getName().toLowerCase().equals(language.getName().toLowerCase())){
                throw new Exception("Invalid name");
            }
        }
        languageRepository.add(language);
    }

    @Override
    public void delete(Language language) {
        for (Language language1 : getAll()){
            if (language1.equals(language)){
                languageRepository.delete(language);
            }
        }
    }

    @Override
    public void update(Language language, int newId, String newName) {
        for (Language language1 : getAll()){
            if (language1.equals(language)){
                languageRepository.update(language1,newId,newName);
            }
        }

    }

    @Override
    public Language getById(int id) {
        Language language2=null;
        for (Language language1 : getAll()){
            if (language1.getId()==id){
                language2=language1;
            }
        }
        return languageRepository.getById(id);
    }
}
