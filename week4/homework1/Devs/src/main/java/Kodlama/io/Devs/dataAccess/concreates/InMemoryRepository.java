package Kodlama.io.Devs.dataAccess.concreates;

import Kodlama.io.Devs.dataAccess.abstracts.LanguageRepository;
import Kodlama.io.Devs.entities.concreates.Language;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class InMemoryRepository implements LanguageRepository {
    List<Language> languages;

    public InMemoryRepository(){
        languages=new ArrayList<Language>();
        languages.add(new Language(1,"Java"));
        languages.add(new Language(1,"C++"));
        languages.add(new Language(1,"C#"));
        languages.add(new Language(1,"Python"));
        languages.add(new Language(1,"Javascript"));


    }

    @Override
    public List<Language> getAll() {
        return languages;
    }

    @Override
    public void add(Language language) {
        languages.add(language);
    }

    @Override
    public void delete(Language language) {
        for (Language language1 : languages){
            if (language1.equals(language)){
                languages.remove(language);
            }
        }

    }

    @Override
    public void update(Language language, int newId, String newName) {
        for (Language language1 : languages){
            if (language.equals(language1)){
                language1.setId(newId);
                language1.setName(newName);
            }
        }

    }

    @Override
    public Language getById(int id) {
        Language language1=null;

        for (Language language : languages){
            if (language.getId()==id){
                language1=language;
            }
        }
        return language1;
    }
}
