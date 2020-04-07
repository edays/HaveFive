package studio.aki.havefive.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.*;
import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.Size;
import java.io.Serializable;

@Entity(name = "Art")
@Table(name = "art", schema = "hfdb")
@JsonIgnoreProperties(value = {"id"})
public final class Art implements Serializable {

    @Id()
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", unique = true, nullable = false, updatable = false)
    @JsonProperty(access = JsonProperty.Access.READ_ONLY)
    private Long id;

    @Column(name = "name", nullable = false)
    @Size(min = 1, max = 100, message = "name must be 1 to 1000 characters")
    private String name;

    @Column(name = "year")
    private int year;

    @Column(name = "author", nullable = false)
    @Size(min = 1, max = 100, message = "author must be 1 to 1000 characters")
    private String author;

    @Column(name = "type", nullable = false)
    @Size(min = 1, max = 10, message = "name must be 1 to 10 characters")
    private String type;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
