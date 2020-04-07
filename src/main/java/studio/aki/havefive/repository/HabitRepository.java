package studio.aki.havefive.repository;

import org.springframework.data.repository.CrudRepository;
import studio.aki.havefive.domain.Habit;

public interface HabitRepository extends CrudRepository<Habit, Long> {
}
