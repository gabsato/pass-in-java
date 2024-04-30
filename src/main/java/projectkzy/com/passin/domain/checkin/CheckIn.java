package projectkzy.com.passin.domain.checkin;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import projectkzy.com.passin.domain.attendee.Attendee;

import java.time.LocalDateTime;

@Entity
@Table(name = "check_ins")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CheckIn {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name="created_at")
    private LocalDateTime createdAt;

    @OneToOne
    @JoinColumn
    private Attendee attendee;
}