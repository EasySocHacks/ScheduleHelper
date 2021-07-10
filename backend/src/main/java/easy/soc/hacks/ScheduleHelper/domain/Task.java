package easy.soc.hacks.ScheduleHelper.domain;

import com.sun.istack.NotNull;

import javax.persistence.*;

@Entity
@Table
public class Task {
    @Id
    @GeneratedValue
    private long id;

    @NotNull
    @OneToOne
    private User user;

    @NotNull
    private String title;
}
