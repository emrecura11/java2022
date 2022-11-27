package Kodlama.io.Devs.entities.concreates;


import lombok.*;

import javax.persistence.*;
import java.util.List;


@Table(name="languages")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Language {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "name")
    private String name;

    @OneToMany (cascade = CascadeType.ALL)
    @JoinColumn (name = "language", referencedColumnName = "id")
    private List<LanguageSubTechnology> subTechnologies;


}
