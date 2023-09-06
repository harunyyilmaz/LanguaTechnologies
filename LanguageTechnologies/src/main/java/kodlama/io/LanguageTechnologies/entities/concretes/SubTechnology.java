package kodlama.io.LanguageTechnologies.entities.concretes;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Table(name="SubTechnology")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class SubTechnology {
    @Column(name="id")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name="name")
    private String name;

    @ManyToOne
    @JoinColumn(name = "programmingLanguage_id")
    private ProgrammingLanguage programmingLanguage;
}
