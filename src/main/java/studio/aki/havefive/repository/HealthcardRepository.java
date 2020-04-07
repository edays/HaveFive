package studio.aki.havefive.repository;

import org.springframework.data.repository.CrudRepository;
import studio.aki.havefive.domain.Healthcard;

public interface HealthcardRepository extends CrudRepository<Healthcard, Long> {
}
