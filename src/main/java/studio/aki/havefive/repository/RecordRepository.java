package studio.aki.havefive.repository;

import org.springframework.data.repository.CrudRepository;
import studio.aki.havefive.domain.Record;

public interface RecordRepository extends CrudRepository<Record, Long> {
}
