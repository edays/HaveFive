package studio.aki.havefive.repository;

import org.springframework.data.repository.CrudRepository;
import studio.aki.havefive.domain.Food;

public interface FoodRepository extends CrudRepository<Food, Long> {

}
