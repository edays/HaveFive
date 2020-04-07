package studio.aki.havefive.repository;

import org.springframework.data.repository.CrudRepository;
import studio.aki.havefive.domain.Nutrition;

public interface NutritionRepository extends CrudRepository<Nutrition, Long> {
}
