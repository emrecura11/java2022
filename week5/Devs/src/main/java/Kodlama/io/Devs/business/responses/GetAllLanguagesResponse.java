package Kodlama.io.Devs.business.responses;


import Kodlama.io.Devs.entities.concreates.Language;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetAllLanguagesResponse {
    private int id;
    private String name;

}
