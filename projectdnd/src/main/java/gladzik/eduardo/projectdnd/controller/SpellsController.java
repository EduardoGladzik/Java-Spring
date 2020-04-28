package gladzik.eduardo.projectdnd.controller;

import gladzik.eduardo.projectdnd.model.SpellsEntity;
import gladzik.eduardo.projectdnd.respository.SpellsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.*;

/**
* @author Eduardo Gladizk
* @version 1.0
* @since 23/04/2020
*/
@RestController
@RequestMapping("/spells")
public class SpellsController {

    @Autowired
    private SpellsRepository spellsRepository;

    /**
     * @return Retorna todos os feitiços da lista
     */
    @GetMapping
    public ResponseEntity<List<SpellsEntity>> findAll() {
        return new ResponseEntity<List<SpellsEntity>>(
                (List<SpellsEntity>) this.spellsRepository.findAll(),
                new HttpHeaders(), HttpStatus.OK);
    }

    /**
     * @param id
     * @return Retorna os dados do feitiço escolhido pelo usuário
     */
    @GetMapping(path = "/{id}")
    public ResponseEntity<SpellsEntity> findById(@PathVariable("id") long id) {
        if (this.spellsRepository.findById(id).isPresent()) {
            return new ResponseEntity<SpellsEntity>(
                    this.spellsRepository.findById(id).get(),
                    new HttpHeaders(), HttpStatus.OK);
        }
        return new ResponseEntity<SpellsEntity>(HttpStatus.NOT_FOUND);
    }

    /**
     * @param spellsEntity
     * @return Retorna os dados do feitiço que foi criado
     */
    @PostMapping
    public ResponseEntity<SpellsEntity> store(@RequestBody SpellsEntity spellsEntity) {
        return new ResponseEntity<SpellsEntity>(
                this.spellsRepository.save(spellsEntity),
                new HttpHeaders(),
                HttpStatus.CREATED
        );
    }


    /**
     * @param id
     * @param spellsEntity
     * @return Retorna os dados do feitiço que foi atualizado/modificado
     * @throws Exception
     */
    @PutMapping(value = "/{id}")
    public ResponseEntity<SpellsEntity> update(@PathVariable("id") long id,
                                               @RequestBody SpellsEntity spellsEntity) throws Exception {
        if (id == 0 || !this.spellsRepository.existsById(id)) {
            throw new Exception("Error, id not found!");
        }

        return new ResponseEntity<SpellsEntity>(
                this.spellsRepository.save(spellsEntity),
                new HttpHeaders(),
                HttpStatus.OK);
    }

    /**
     * @param id
     * @return Retorna todos os feitiços sem o que foi deletado
     */
    @DeleteMapping(value = "/{id}")
    public ResponseEntity<SpellsEntity> delete(@PathVariable("id") long id) {
        this.spellsRepository.deleteById(id);
        return new ResponseEntity<SpellsEntity>(new HttpHeaders(), HttpStatus.OK);
    }
}
