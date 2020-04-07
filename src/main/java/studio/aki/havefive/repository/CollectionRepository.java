package studio.aki.havefive.repository;

import org.springframework.data.repository.CrudRepository;
import studio.aki.havefive.domain.Collection;

public interface CollectionRepository extends CrudRepository<Collection, Long> {
}
