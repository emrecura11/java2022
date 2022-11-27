package Kodlama.io.Devs.entities.concreates;


import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import javax.persistence.*;


@Table(name="languagesSubTechnology")
@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity

public class LanguageSubTechnology {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "name")
    private String name;

    @ManyToOne
    //@JoinColumn(name = "subTechnologies")
    @JoinColumn(name = "subTechnologies")
    @JsonIgnore
    private Language language;

}
