package pl.wsb.fitnesstracker.user.internal;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import pl.wsb.fitnesstracker.user.api.UserEvent;

public interface UserEventRepository extends JpaRepository<UserEvent, Long> {
    @Query(
            value = "SELECT COUNT(*) FROM user_event WHERE event_id = :eventId",
            nativeQuery = true
    )
    long countParticipants(@Param("eventId") Long eventId);
}
