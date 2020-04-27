package gladzik.eduardo.projectdnd.model;

import lombok.*;
import org.springframework.stereotype.Component;

import javax.persistence.*;

/**
 * @author Eduardo Gladzik
 * @version 1.0
 * @since 23/04/2020
 */
@Component //<- SpringBoot

@Getter @Setter
@NoArgsConstructor @AllArgsConstructor
@ToString

@Entity //<- JPA - Java persistence API
@Table(name = "spells") //<- ''
public class SpellsEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_spell")
    private long id;

    @Column(name = "name")
    private String name;

    @Column(name = "range")
    private int range;

    @Column(name = "duration")
    private String duration;

    @Column(name = "spell_level")
    private int level;

    @Column(name = "classes")
    private String classes;

    @Column(name = "casting")
    private String casting;
}
