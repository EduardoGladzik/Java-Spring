package gladzik.eduardo.exemplo2mysql.repository;

import gladzik.eduardo.exemplo2mysql.model.ClientEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientRepository extends CrudRepository<ClientEntity, Long> {

}
