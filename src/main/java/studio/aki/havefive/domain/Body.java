package studio.aki.havefive.domain;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import javax.persistence.*;
import javax.validation.constraints.DecimalMax;
import javax.validation.constraints.DecimalMin;
import java.io.Serializable;

@Entity(name = "Body")
@Table(name = "body", schema = "hfdb")
@JsonIgnoreProperties(value = {"id"})
public final class Body implements Serializable {

    @Id()
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", unique = true, nullable = false, updatable = false)
    @JsonProperty(access = JsonProperty.Access.READ_ONLY)
    private Long id;

    @Column(name = "age")
    @DecimalMin(value = "16", message = "Age must be larger than 15")
    @DecimalMax(value = "150", message = "Age must be smaller than 151")
    private int age;

    @Column(name = "sex")
    private byte sex;

    @Column(name = "height")
    private double height;

    @Column(name = "weight")
    private double weight;

    @OneToOne(mappedBy = "body", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private Long chestId;

    @OneToOne(mappedBy = "body", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private Long backId;

    @OneToOne(mappedBy = "body", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private Long legId;

    @OneToOne(mappedBy = "body", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private Long shoulderId;

    @OneToOne(mappedBy = "body", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private Long armId;

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public byte getSex() {
        return sex;
    }

    public void setSex(byte sex) {
        this.sex = sex;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public Long getChestId() {
        return chestId;
    }

    public void setChestId(Long chestId) {
        this.chestId = chestId;
    }

    public Long getBackId() {
        return backId;
    }

    public void setBackId(Long backId) {
        this.backId = backId;
    }

    public Long getLegId() {
        return legId;
    }

    public void setLegId(Long legId) {
        this.legId = legId;
    }

    public Long getShoulderId() {
        return shoulderId;
    }

    public void setShoulderId(Long shoulderId) {
        this.shoulderId = shoulderId;
    }

    public Long getArmId() {
        return armId;
    }

    public void setArmId(Long armId) {
        this.armId = armId;
    }
}
