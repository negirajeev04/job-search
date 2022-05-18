
package com.swipejobs.jobsearch.pojo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "rating",
    "isActive",
    "certificates",
    "skills",
    "jobSearchAddress",
    "transportation",
    "hasDriversLicense",
    "availability",
    "phone",
    "email",
    "name",
    "age",
    "guid",
    "userId"
})
@Generated("jsonschema2pojo")
public class Worker {

    @JsonProperty("rating")
    private Integer rating;
    @JsonProperty("isActive")
    private Boolean isActive;
    @JsonProperty("certificates")
    private List<String> certificates = new ArrayList<String>();
    @JsonProperty("skills")
    private List<String> skills = new ArrayList<String>();
    @JsonProperty("jobSearchAddress")
    private JobSearchAddress jobSearchAddress;
    @JsonProperty("transportation")
    private String transportation;
    @JsonProperty("hasDriversLicense")
    private Boolean hasDriversLicense;
    @JsonProperty("availability")
    private List<Availability> availability = new ArrayList<Availability>();
    @JsonProperty("phone")
    private String phone;
    @JsonProperty("email")
    private String email;
    @JsonProperty("name")
    private Name name;
    @JsonProperty("age")
    private Integer age;
    @JsonProperty("guid")
    private String guid;
    @JsonProperty("userId")
    private Integer userId;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("rating")
    public Integer getRating() {
        return rating;
    }

    @JsonProperty("rating")
    public void setRating(Integer rating) {
        this.rating = rating;
    }

    public Worker withRating(Integer rating) {
        this.rating = rating;
        return this;
    }

    @JsonProperty("isActive")
    public Boolean getIsActive() {
        return isActive;
    }

    @JsonProperty("isActive")
    public void setIsActive(Boolean isActive) {
        this.isActive = isActive;
    }

    public Worker withIsActive(Boolean isActive) {
        this.isActive = isActive;
        return this;
    }

    @JsonProperty("certificates")
    public List<String> getCertificates() {
        return certificates;
    }

    @JsonProperty("certificates")
    public void setCertificates(List<String> certificates) {
        this.certificates = certificates;
    }

    public Worker withCertificates(List<String> certificates) {
        this.certificates = certificates;
        return this;
    }

    @JsonProperty("skills")
    public List<String> getSkills() {
        return skills;
    }

    @JsonProperty("skills")
    public void setSkills(List<String> skills) {
        this.skills = skills;
    }

    public Worker withSkills(List<String> skills) {
        this.skills = skills;
        return this;
    }

    @JsonProperty("jobSearchAddress")
    public JobSearchAddress getJobSearchAddress() {
        return jobSearchAddress;
    }

    @JsonProperty("jobSearchAddress")
    public void setJobSearchAddress(JobSearchAddress jobSearchAddress) {
        this.jobSearchAddress = jobSearchAddress;
    }

    public Worker withJobSearchAddress(JobSearchAddress jobSearchAddress) {
        this.jobSearchAddress = jobSearchAddress;
        return this;
    }

    @JsonProperty("transportation")
    public String getTransportation() {
        return transportation;
    }

    @JsonProperty("transportation")
    public void setTransportation(String transportation) {
        this.transportation = transportation;
    }

    public Worker withTransportation(String transportation) {
        this.transportation = transportation;
        return this;
    }

    @JsonProperty("hasDriversLicense")
    public Boolean getHasDriversLicense() {
        return hasDriversLicense;
    }

    @JsonProperty("hasDriversLicense")
    public void setHasDriversLicense(Boolean hasDriversLicense) {
        this.hasDriversLicense = hasDriversLicense;
    }

    public Worker withHasDriversLicense(Boolean hasDriversLicense) {
        this.hasDriversLicense = hasDriversLicense;
        return this;
    }

    @JsonProperty("availability")
    public List<Availability> getAvailability() {
        return availability;
    }

    @JsonProperty("availability")
    public void setAvailability(List<Availability> availability) {
        this.availability = availability;
    }

    public Worker withAvailability(List<Availability> availability) {
        this.availability = availability;
        return this;
    }

    @JsonProperty("phone")
    public String getPhone() {
        return phone;
    }

    @JsonProperty("phone")
    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Worker withPhone(String phone) {
        this.phone = phone;
        return this;
    }

    @JsonProperty("email")
    public String getEmail() {
        return email;
    }

    @JsonProperty("email")
    public void setEmail(String email) {
        this.email = email;
    }

    public Worker withEmail(String email) {
        this.email = email;
        return this;
    }

    @JsonProperty("name")
    public Name getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(Name name) {
        this.name = name;
    }

    public Worker withName(Name name) {
        this.name = name;
        return this;
    }

    @JsonProperty("age")
    public Integer getAge() {
        return age;
    }

    @JsonProperty("age")
    public void setAge(Integer age) {
        this.age = age;
    }

    public Worker withAge(Integer age) {
        this.age = age;
        return this;
    }

    @JsonProperty("guid")
    public String getGuid() {
        return guid;
    }

    @JsonProperty("guid")
    public void setGuid(String guid) {
        this.guid = guid;
    }

    public Worker withGuid(String guid) {
        this.guid = guid;
        return this;
    }

    @JsonProperty("userId")
    public Integer getUserId() {
        return userId;
    }

    @JsonProperty("userId")
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Worker withUserId(Integer userId) {
        this.userId = userId;
        return this;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    public Worker withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Worker.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("rating");
        sb.append('=');
        sb.append(((this.rating == null)?"<null>":this.rating));
        sb.append(',');
        sb.append("isActive");
        sb.append('=');
        sb.append(((this.isActive == null)?"<null>":this.isActive));
        sb.append(',');
        sb.append("certificates");
        sb.append('=');
        sb.append(((this.certificates == null)?"<null>":this.certificates));
        sb.append(',');
        sb.append("skills");
        sb.append('=');
        sb.append(((this.skills == null)?"<null>":this.skills));
        sb.append(',');
        sb.append("jobSearchAddress");
        sb.append('=');
        sb.append(((this.jobSearchAddress == null)?"<null>":this.jobSearchAddress));
        sb.append(',');
        sb.append("transportation");
        sb.append('=');
        sb.append(((this.transportation == null)?"<null>":this.transportation));
        sb.append(',');
        sb.append("hasDriversLicense");
        sb.append('=');
        sb.append(((this.hasDriversLicense == null)?"<null>":this.hasDriversLicense));
        sb.append(',');
        sb.append("availability");
        sb.append('=');
        sb.append(((this.availability == null)?"<null>":this.availability));
        sb.append(',');
        sb.append("phone");
        sb.append('=');
        sb.append(((this.phone == null)?"<null>":this.phone));
        sb.append(',');
        sb.append("email");
        sb.append('=');
        sb.append(((this.email == null)?"<null>":this.email));
        sb.append(',');
        sb.append("name");
        sb.append('=');
        sb.append(((this.name == null)?"<null>":this.name));
        sb.append(',');
        sb.append("age");
        sb.append('=');
        sb.append(((this.age == null)?"<null>":this.age));
        sb.append(',');
        sb.append("guid");
        sb.append('=');
        sb.append(((this.guid == null)?"<null>":this.guid));
        sb.append(',');
        sb.append("userId");
        sb.append('=');
        sb.append(((this.userId == null)?"<null>":this.userId));
        sb.append(',');
        sb.append("additionalProperties");
        sb.append('=');
        sb.append(((this.additionalProperties == null)?"<null>":this.additionalProperties));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = ((result* 31)+((this.rating == null)? 0 :this.rating.hashCode()));
        result = ((result* 31)+((this.availability == null)? 0 :this.availability.hashCode()));
        result = ((result* 31)+((this.isActive == null)? 0 :this.isActive.hashCode()));
        result = ((result* 31)+((this.userId == null)? 0 :this.userId.hashCode()));
        result = ((result* 31)+((this.transportation == null)? 0 :this.transportation.hashCode()));
        result = ((result* 31)+((this.skills == null)? 0 :this.skills.hashCode()));
        result = ((result* 31)+((this.jobSearchAddress == null)? 0 :this.jobSearchAddress.hashCode()));
        result = ((result* 31)+((this.certificates == null)? 0 :this.certificates.hashCode()));
        result = ((result* 31)+((this.hasDriversLicense == null)? 0 :this.hasDriversLicense.hashCode()));
        result = ((result* 31)+((this.phone == null)? 0 :this.phone.hashCode()));
        result = ((result* 31)+((this.name == null)? 0 :this.name.hashCode()));
        result = ((result* 31)+((this.guid == null)? 0 :this.guid.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.email == null)? 0 :this.email.hashCode()));
        result = ((result* 31)+((this.age == null)? 0 :this.age.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Worker) == false) {
            return false;
        }
        Worker rhs = ((Worker) other);
        
        return ((this.guid == rhs.guid) || ((this.guid != null) && this.guid.equals(rhs.guid)));
    }

}
