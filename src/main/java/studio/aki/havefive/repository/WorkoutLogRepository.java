package studio.aki.havefive.repository;

import org.springframework.data.repository.CrudRepository;
import studio.aki.havefive.domain.WorkoutLog;

public interface WorkoutLogRepository extends CrudRepository<WorkoutLog, Long> {
}
