package pl.wsb.fitnesstracker.workoutsession;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
// TODO: Define the Event entity with appropriate fields and annotations
public class WorkoutSession {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    @JoinColumn(name = "Training", nullable = false)
    private int trainingId;
    private LocalDateTime timestamp;
    private double startLatitude;
    private double startLongitude;
    private double endLatitude;
    private double endLongitude;
    private double altitude;
}
