package Kodlama.io.Devs.business.abstracts;

import Kodlama.io.Devs.business.requests.CreateLanguageRequest;
import Kodlama.io.Devs.business.requests.DeleteLanguageRequest;
import Kodlama.io.Devs.business.requests.UpdateLanguageRequest;
import Kodlama.io.Devs.business.responses.GetAllLanguagesResponse;
import Kodlama.io.Devs.business.responses.GetByIdResponse;
import Kodlama.io.Devs.entities.concreates.Language;

import java.util.List;

public interface LanguageService {
    List<GetAllLanguagesResponse> getAll();
    void add(CreateLanguageRequest createLanguageRequest) throws Exception;
    void delete(DeleteLanguageRequest deleteLanguageRequest);
    void update(UpdateLanguageRequest updateLanguageRequest, String newName);
    GetByIdResponse getById(int id);
}
