package gladzik.eduardo.lombok.example.controller;

import gladzik.eduardo.lombok.example.model.Spells;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

/**
 * @author Eduardo Gladzik
 * @version 1.0
 * @since 15/04/2020 16:47
 */

@RestController
public class SpellsController {

    /**
     * @return Returns the details of the Acid Arrow spell
     */
    @GetMapping("/spells/acid-arrow")
    public Spells getSpell() {
        Spells spells = new Spells();
        spells.setName("Acid Arrow");
        spells.setRange(90);
        spells.setClasses("Wizard");
        return spells;
    }

    /**
     * @return Returns an ArrayList with the Spells that were previously defined
     * */
    @GetMapping("/spells")
    public ArrayList<Spells> getSpells() {
        Spells spells1 = new Spells();
        spells1.setName("Acid Arrow");
        spells1.setRange(90);
        spells1.setClasses("Wizard");

        Spells spells2 = new Spells();
        spells2.setName("Acid Splash");
        spells2.setRange(60);
        spells2.setClasses("Wizard");

        ArrayList<Spells> spells = new ArrayList<>();
        spells.add(spells1);
        spells.add(spells2);
        return spells;
    }
}
