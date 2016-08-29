package blog;

import javax.persistence.*;

/**
 * Created on 29-Aug-16
 */
@Entity
public class BlogPost {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String title;
    private String content;

    @ManyToOne(fetch = FetchType.LAZY, targetEntity = Blog.class)
    @JoinColumn(name = "blog", nullable = true, referencedColumnName = "id")
    private Blog blog;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Blog getBlog() {
        return blog;
    }

    public void setBlog(Blog blog) {
        this.blog = blog;
    }
}
