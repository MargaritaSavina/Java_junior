import jakarta.persistence.*;


@Entity
@Table(name = "Courses")
public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String title;
    private int duration;


    public Course(){
    }

    public Course(String title, int duration){
        this.title = title;
        this.duration = duration;
    }

    public int getDuration() {
        return duration;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }


}
