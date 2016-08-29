package blog;

import javax.persistence.*;
import java.util.Collection;
import java.util.HashSet;

/**
 * Created on 29-Aug-16
 */
@Entity
public class Blog {

    @javax.persistence.Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String name;

    private String description;

    @OneToMany(mappedBy = "blog", fetch = FetchType.LAZY, targetEntity = BlogPost.class, cascade = CascadeType.REMOVE)
    private Collection<BlogPost> blogPosts = new HashSet<BlogPost>();

    public long getId() {
        return id;
    }

    public void setId(long id) {
        id = id;
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

    public Collection<BlogPost> getBlogPosts() {
        return blogPosts;
    }

    public void setBlogPosts(Collection<BlogPost> blogPosts) {
        this.blogPosts = blogPosts;
    }
}
