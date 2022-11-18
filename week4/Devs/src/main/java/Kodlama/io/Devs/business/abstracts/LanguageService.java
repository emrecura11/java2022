package Kodlama.io.Devs.business.abstracts;

import Kodlama.io.Devs.entities.concreates.Language;

import java.util.List;

public interface LanguageService {
    public List<Language> getAll();
    public void add(Language language) throws Exception;
    public void delete(Language language);
    public void update(Language language,int newId,String newName);
    public Language getById(int id);
}
