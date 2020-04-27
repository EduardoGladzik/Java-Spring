package gladzik.eduardo.projectdnd.respository;

import gladzik.eduardo.projectdnd.model.SpellsEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

public interface SpellsRepository extends CrudRepository<SpellsEntity, Long> {
}
