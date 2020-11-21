package save.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import save.POJO.Action;

public interface ActionRepository extends JpaRepository<Action, Integer>{

}
