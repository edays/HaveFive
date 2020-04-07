package studio.aki.havefive.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.*;
import java.io.Serializable;

@Entity(name = "HealthCard")
@Table(name = "healthcard", schema = "hfdb")
@JsonIgnoreProperties(value = {"id"})
public final class Healthcard implements Serializable {

    @Id()
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", unique = true, nullable = false, updatable = false)
    @JsonProperty(access = JsonProperty.Access.READ_ONLY)
    private Long id;

    @OneToOne
    @JoinColumn(name = "bodyId")
    private Body body;

    @Column(name = "bodyFatRate")
    private double bodyFatRate;

    @Column(name = "bmr")
    private double bmr;

    @Column(name = "leanWeight")
    private double leanWeight;

    @Column(name = "heartRateSedentary")
    private int heartRateSedentary;

    @Column(name = "heartRateCardio")
    private int heartRateCardio;

    @Column(name = "heartRateHIIT")
    private int heartRateHIIT;

    @Column(name = "bloodPressureHigh")
    private double bloodPressureHigh;

    @Column(name = "bloodPressureLow")
    private double bloodPressureLow;

    @Column(name = "bloodSugar")
    private double bloodSugar;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Body getBody() {
        return body;
    }

    public void setBody(Body body) {
        this.body = body;
    }

    public double getBodyFatRate() {
        return bodyFatRate;
    }

    public void setBodyFatRate(double bodyFatRate) {
        this.bodyFatRate = bodyFatRate;
    }

    public double getBmr() {
        return bmr;
    }

    public void setBmr(double bmr) {
        this.bmr = bmr;
    }

    public double getLeanWeight() {
        return leanWeight;
    }

    public void setLeanWeight(double leanWeight) {
        this.leanWeight = leanWeight;
    }

    public int getHeartRateSedentary() {
        return heartRateSedentary;
    }

    public void setHeartRateSedentary(int heartRateSedentary) {
        this.heartRateSedentary = heartRateSedentary;
    }

    public int getHeartRateCardio() {
        return heartRateCardio;
    }

    public void setHeartRateCardio(int heartRateCardio) {
        this.heartRateCardio = heartRateCardio;
    }

    public int getHeartRateHIIT() {
        return heartRateHIIT;
    }

    public void setHeartRateHIIT(int heartRateHIIT) {
        this.heartRateHIIT = heartRateHIIT;
    }

    public double getBloodPressureHigh() {
        return bloodPressureHigh;
    }

    public void setBloodPressureHigh(double bloodPressureHigh) {
        this.bloodPressureHigh = bloodPressureHigh;
    }

    public double getBloodPressureLow() {
        return bloodPressureLow;
    }

    public void setBloodPressureLow(double bloodPressureLow) {
        this.bloodPressureLow = bloodPressureLow;
    }

    public double getBloodSugar() {
        return bloodSugar;
    }

    public void setBloodSugar(double bloodSugar) {
        this.bloodSugar = bloodSugar;
    }
}
