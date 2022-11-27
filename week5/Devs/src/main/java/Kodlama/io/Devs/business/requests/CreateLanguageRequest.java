package Kodlama.io.Devs.business.requests;


import Kodlama.io.Devs.entities.concreates.LanguageSubTechnology;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreateLanguageRequest {
    private String name;

}
