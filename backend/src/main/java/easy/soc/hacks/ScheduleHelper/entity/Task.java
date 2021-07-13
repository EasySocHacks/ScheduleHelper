package easy.soc.hacks.ScheduleHelper.entity;

import com.sun.istack.NotNull;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import javax.validation.constraints.DecimalMax;
import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;
import java.util.Date;
import java.util.List;

@Entity
@Table
public class Task {
    @Id
    @GeneratedValue
    private long id;

    @NotNull
    @NotEmpty
    @ManyToOne
    private User user;

    @NotNull
    @NotEmpty
    private String title;

    private String description;

    @CreationTimestamp
    private Date creationTime;

    @NotNull
    @ManyToOne
    private Task parentTask;

    @NotNull
    @OneToMany
    private List<Task> childrenTasks;

    @NotNull
    private boolean isDone = false;

    @NotNull
    @DecimalMin(value = "0.0")
    @DecimalMax(value = "1.0")
    private double progress = 0.0;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getCreationTime() {
        return creationTime;
    }

    public void setCreationTime(Date creationTime) {
        this.creationTime = creationTime;
    }

    public Task getParentTask() {
        return parentTask;
    }

    public void setParentTask(Task parentTask) {
        this.parentTask = parentTask;
    }

    public List<Task> getChildrenTasks() {
        return childrenTasks;
    }

    public void setChildrenTasks(List<Task> childrenTasks) {
        this.childrenTasks = childrenTasks;
    }

    public boolean isDone() {
        return isDone;
    }

    public void setDone(boolean done) {
        isDone = done;
    }

    public double getProgress() {
        return progress;
    }

    public void setProgress(double progress) {
        this.progress = progress;
    }
}
