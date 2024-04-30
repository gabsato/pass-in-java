package projectkzy.com.passin.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import projectkzy.com.passin.domain.checkin.CheckIn;

import java.util.Optional;

public interface CheckinRepository extends JpaRepository<CheckIn, Integer> {
    Optional<CheckIn> findByAttendeeId(String attendeeId);
}
