package gladzik.eduardo.lombok.example.model;

/**
 * @author Eduardo Gladzik
 * @version 1.0
 * @since 14/04/2020 16:30
 */

import lombok.*;

@ToString
@AllArgsConstructor @NoArgsConstructor
@Getter @Setter

public class Spells {

    private String name;
    private int range;
    private String classes;

}
