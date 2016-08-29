package blog;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

/**
 * Created on 29-Aug-16
 */
@Entity
public class Blog {

    @javax.persistence.Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long Id;

    private String name;

    private String description;

    public long getId() {
        return Id;
    }

    public void setId(long id) {
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
