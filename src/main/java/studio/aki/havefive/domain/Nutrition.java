package studio.aki.havefive.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.Set;

@Entity(name = "NutritionPlan")
@Table(name = "nutritionplan", schema = "hfdb")
@JsonIgnoreProperties(value = {"id"})
public final class Nutrition implements Serializable {

    @Id()
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", unique = true, nullable = false, updatable = false)
    @JsonProperty(access = JsonProperty.Access.READ_ONLY)
    private Long id;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "cal", nullable = false)
    private double cal;

    @Column(name = "carbohydrate", nullable = false)
    private double carbohydrate;

    @Column(name = "protein", nullable = false)
    private double protein;

    @Column(name = "fat", nullable = false)
    private double fat;

    @Column(name = "date", nullable = false)
    private Date date;

    @Column(name = "foods", nullable = false)
    private Set<Long> foods;

    @Column(name = "tags", nullable = false)
    private Set<String> tags;

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

    public double getCal() {
        return cal;
    }

    public void setCal(double cal) {
        this.cal = cal;
    }

    public double getCarbohydrate() {
        return carbohydrate;
    }

    public void setCarbohydrate(double carbohydrate) {
        this.carbohydrate = carbohydrate;
    }

    public double getProtein() {
        return protein;
    }

    public void setProtein(double protein) {
        this.protein = protein;
    }

    public double getFat() {
        return fat;
    }

    public void setFat(double fat) {
        this.fat = fat;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Set<Long> getFoods() {
        return foods;
    }

    public void setFoods(Set<Long> foods) {
        this.foods = foods;
    }

    public Set<String> getTags() {
        return tags;
    }

    public void setTags(Set<String> tags) {
        this.tags = tags;
    }
}
