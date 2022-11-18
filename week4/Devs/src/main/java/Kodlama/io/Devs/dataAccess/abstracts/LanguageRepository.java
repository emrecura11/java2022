package Kodlama.io.Devs.dataAccess.abstracts;

import Kodlama.io.Devs.entities.concreates.Language;
import org.springframework.stereotype.Service;

import java.util.List;

public interface LanguageRepository {
    public List<Language> getAll();
    public void add(Language language);
    public void delete(Language language);
    public void update(Language language,int newId,String newName);
    public Language getById(int id);

}
