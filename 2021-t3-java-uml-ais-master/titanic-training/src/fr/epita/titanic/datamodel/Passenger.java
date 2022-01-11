package fr.epita.titanic.datamodel;

import java.util.Objects;

public class Passenger {
    //PassengerId,Pclass,Name,Sex,Age,SibSp,Parch,Ticket,Fare,Cabin,Embarked

    private Integer passengerId;
    private Integer survived;
    private Integer pClass;
    private String name;
    private String sex;
    private Double age;
    private Integer sibSp;
    private Integer parch;
    private String ticket;
    private Double fare;
    private String cabin;
    private String embarked;

    public Integer getSurvived() {
        return survived;
    }

    public void setSurvived(Integer survived) {
        this.survived = survived;
    }

    public Integer getPassengerId() {
        return passengerId;
    }

    public void setPassengerId(Integer passengerId) {
        this.passengerId = passengerId;
    }

    public Integer getpClass() {
        return pClass;
    }

    public void setpClass(Integer pClass) {
        this.pClass = pClass;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Double getAge() {
        return age;
    }

    public void setAge(Double age) {
        this.age = age;
    }

    public Integer getSibSp() {
        return sibSp;
    }

    public void setSibSp(Integer sibSp) {
        this.sibSp = sibSp;
    }

    public Integer getParch() {
        return parch;
    }

    public void setParch(Integer parch) {
        this.parch = parch;
    }

    public String getTicket() {
        return ticket;
    }

    public void setTicket(String ticket) {
        this.ticket = ticket;
    }

    public Double getFare() {
        return fare;
    }

    public void setFare(Double fare) {
        this.fare = fare;
    }

    public String getCabin() {
        return cabin;
    }

    public void setCabin(String cabin) {
        this.cabin = cabin;
    }

    public String getEmbarked() {
        return embarked;
    }

    public void setEmbarked(String embarked) {
        this.embarked = embarked;
    }


    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("{");
        sb.append("\"passengerId\":")
                .append(passengerId);
        sb.append(",\"survived\":")
                .append(survived);
        sb.append(",\"pClass\":")
                .append(pClass);
        sb.append(",\"name\":\"")
                .append(Objects.toString(name, "")).append('\"');
        sb.append(",\"sex\":\"")
                .append(Objects.toString(sex, "")).append('\"');
        sb.append(",\"age\":")
                .append(age);
        sb.append(",\"sibSp\":")
                .append(sibSp);
        sb.append(",\"parch\":")
                .append(parch);
        sb.append(",\"ticket\":\"")
                .append(Objects.toString(ticket, "")).append('\"');
        sb.append(",\"fare\":")
                .append(fare);
        sb.append(",\"cabin\":\"")
                .append(Objects.toString(cabin, "")).append('\"');
        sb.append(",\"embarked\":\"")
                .append(Objects.toString(embarked, "")).append('\"');
        sb.append('}');
        return sb.toString();
    }
}
