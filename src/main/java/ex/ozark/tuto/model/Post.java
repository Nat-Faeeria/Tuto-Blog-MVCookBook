package ex.ozark.tuto.model;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by dev on 22/07/15.
 */
@Named("post")
@RequestScoped
public class Post {

    private String author;
    private LocalDateTime creationDate;
    private LocalDateTime updateDate;
    private String title;
    private String content;
    private List<String> comments;

    public Post() {
        this.comments=new ArrayList<>();
    }

    public Post(String author, LocalDateTime creationDate, LocalDateTime updateDate, String title, String content, List<String> comments) {
        this.author = author;
        this.creationDate = creationDate;
        this.updateDate = updateDate;
        this.title = title;
        this.content = content;
        this.comments = comments;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public LocalDateTime getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(LocalDateTime creationDate) {
        this.creationDate = creationDate;
    }

    public LocalDateTime getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(LocalDateTime updateDate) {
        this.updateDate = updateDate;
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

    public List<String> getComments() {
        return comments;
    }

    public void setComments(List<String> comments) {
        this.comments = comments;
    }
}
