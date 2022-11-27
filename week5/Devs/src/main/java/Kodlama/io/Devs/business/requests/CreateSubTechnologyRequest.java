package Kodlama.io.Devs.business.requests;

import Kodlama.io.Devs.entities.concreates.Language;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreateSubTechnologyRequest {
    private String name;
    private Language language;
}
