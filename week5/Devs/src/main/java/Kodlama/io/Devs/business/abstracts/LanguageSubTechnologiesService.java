package Kodlama.io.Devs.business.abstracts;


import Kodlama.io.Devs.business.requests.CreateSubTechnologyRequest;
import Kodlama.io.Devs.business.requests.DeleteLanguageRequest;
import Kodlama.io.Devs.business.requests.UpdateLanguageRequest;
import Kodlama.io.Devs.business.responses.GetAllSubTechnologiesResponse;
import Kodlama.io.Devs.business.responses.GetByIdResponse;
import java.util.List;

public interface LanguageSubTechnologiesService {

    List<GetAllSubTechnologiesResponse> getAll();
    void add(CreateSubTechnologyRequest createSubTechnologyRequest) throws Exception;
    void delete(DeleteLanguageRequest deleteLanguageRequest);
    void update(UpdateLanguageRequest updateLanguageRequest, String newName);
    GetByIdResponse getById(int id);
}
