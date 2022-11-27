package Kodlama.io.Devs.dataAccess.abstracts;

import Kodlama.io.Devs.entities.concreates.Language;
import org.springframework.data.jpa.repository.JpaRepository;


public interface  LanguageRepository extends JpaRepository<Language,Integer> {


}
