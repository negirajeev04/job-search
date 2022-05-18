
package com.swipejobs.jobsearch.pojo;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.processing.Generated;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "driverLicenseRequired",
    "requiredCertificates",
    "location",
    "billRate",
    "workersRequired",
    "startDate",
    "about",
    "jobTitle",
    "company",
    "guid",
    "jobId"
})
@Generated("jsonschema2pojo")
public class Job {

    @JsonProperty("driverLicenseRequired")
    private Boolean driverLicenseRequired;
    @JsonProperty("requiredCertificates")
    private List<String> requiredCertificates = new ArrayList<String>();
    @JsonProperty("location")
    private Location location;
    @JsonProperty("billRate")
    private String billRate;
    @JsonProperty("workersRequired")
    private Integer workersRequired;
    @JsonProperty("startDate")
    private String startDate;
    @JsonProperty("about")
    private String about;
    @JsonProperty("jobTitle")
    private String jobTitle;
    @JsonProperty("company")
    private String company;
    @JsonProperty("guid")
    private String guid;
    @JsonProperty("jobId")
    private Integer jobId;

    @JsonProperty("driverLicenseRequired")
    public Boolean getDriverLicenseRequired() {
        return driverLicenseRequired;
    }

    @JsonProperty("driverLicenseRequired")
    public void setDriverLicenseRequired(Boolean driverLicenseRequired) {
        this.driverLicenseRequired = driverLicenseRequired;
    }

    public Job withDriverLicenseRequired(Boolean driverLicenseRequired) {
        this.driverLicenseRequired = driverLicenseRequired;
        return this;
    }

    @JsonProperty("requiredCertificates")
    public List<String> getRequiredCertificates() {
        return requiredCertificates;
    }

    @JsonProperty("requiredCertificates")
    public void setRequiredCertificates(List<String> requiredCertificates) {
        this.requiredCertificates = requiredCertificates;
    }

    public Job withRequiredCertificates(List<String> requiredCertificates) {
        this.requiredCertificates = requiredCertificates;
        return this;
    }

    @JsonProperty("location")
    public Location getLocation() {
        return location;
    }

    @JsonProperty("location")
    public void setLocation(Location location) {
        this.location = location;
    }

    public Job withLocation(Location location) {
        this.location = location;
        return this;
    }

    @JsonProperty("billRate")
    public String getBillRate() {
        return billRate;
    }

    @JsonProperty("billRate")
    public void setBillRate(String billRate) {
        this.billRate = billRate;
    }

    public Job withBillRate(String billRate) {
        this.billRate = billRate;
        return this;
    }

    @JsonProperty("workersRequired")
    public Integer getWorkersRequired() {
        return workersRequired;
    }

    @JsonProperty("workersRequired")
    public void setWorkersRequired(Integer workersRequired) {
        this.workersRequired = workersRequired;
    }

    public Job withWorkersRequired(Integer workersRequired) {
        this.workersRequired = workersRequired;
        return this;
    }

    @JsonProperty("startDate")
    public String getStartDate() {
        return startDate;
    }

    @JsonProperty("startDate")
    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public Job withStartDate(String startDate) {
        this.startDate = startDate;
        return this;
    }

    @JsonProperty("about")
    public String getAbout() {
        return about;
    }

    @JsonProperty("about")
    public void setAbout(String about) {
        this.about = about;
    }

    public Job withAbout(String about) {
        this.about = about;
        return this;
    }

    @JsonProperty("jobTitle")
    public String getJobTitle() {
        return jobTitle;
    }

    @JsonProperty("jobTitle")
    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public Job withJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
        return this;
    }

    @JsonProperty("company")
    public String getCompany() {
        return company;
    }

    @JsonProperty("company")
    public void setCompany(String company) {
        this.company = company;
    }

    public Job withCompany(String company) {
        this.company = company;
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

    public Job withGuid(String guid) {
        this.guid = guid;
        return this;
    }

    @JsonProperty("jobId")
    public Integer getJobId() {
        return jobId;
    }

    @JsonProperty("jobId")
    public void setJobId(Integer jobId) {
        this.jobId = jobId;
    }

    public Job withJobId(Integer jobId) {
        this.jobId = jobId;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Job.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("driverLicenseRequired");
        sb.append('=');
        sb.append(((this.driverLicenseRequired == null)?"<null>":this.driverLicenseRequired));
        sb.append(',');
        sb.append("requiredCertificates");
        sb.append('=');
        sb.append(((this.requiredCertificates == null)?"<null>":this.requiredCertificates));
        sb.append(',');
        sb.append("location");
        sb.append('=');
        sb.append(((this.location == null)?"<null>":this.location));
        sb.append(',');
        sb.append("billRate");
        sb.append('=');
        sb.append(((this.billRate == null)?"<null>":this.billRate));
        sb.append(',');
        sb.append("workersRequired");
        sb.append('=');
        sb.append(((this.workersRequired == null)?"<null>":this.workersRequired));
        sb.append(',');
        sb.append("startDate");
        sb.append('=');
        sb.append(((this.startDate == null)?"<null>":this.startDate));
        sb.append(',');
        sb.append("about");
        sb.append('=');
        sb.append(((this.about == null)?"<null>":this.about));
        sb.append(',');
        sb.append("jobTitle");
        sb.append('=');
        sb.append(((this.jobTitle == null)?"<null>":this.jobTitle));
        sb.append(',');
        sb.append("company");
        sb.append('=');
        sb.append(((this.company == null)?"<null>":this.company));
        sb.append(',');
        sb.append("guid");
        sb.append('=');
        sb.append(((this.guid == null)?"<null>":this.guid));
        sb.append(',');
        sb.append("jobId");
        sb.append('=');
        sb.append(((this.jobId == null)?"<null>":this.jobId));
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
        result = ((result* 31)+((this.billRate == null)? 0 :this.billRate.hashCode()));
        result = ((result* 31)+((this.requiredCertificates == null)? 0 :this.requiredCertificates.hashCode()));
        result = ((result* 31)+((this.jobTitle == null)? 0 :this.jobTitle.hashCode()));
        result = ((result* 31)+((this.about == null)? 0 :this.about.hashCode()));
        result = ((result* 31)+((this.driverLicenseRequired == null)? 0 :this.driverLicenseRequired.hashCode()));
        result = ((result* 31)+((this.workersRequired == null)? 0 :this.workersRequired.hashCode()));
        result = ((result* 31)+((this.jobId == null)? 0 :this.jobId.hashCode()));
        result = ((result* 31)+((this.guid == null)? 0 :this.guid.hashCode()));
        result = ((result* 31)+((this.location == null)? 0 :this.location.hashCode()));
        result = ((result* 31)+((this.company == null)? 0 :this.company.hashCode()));
        result = ((result* 31)+((this.startDate == null)? 0 :this.startDate.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Job) == false) {
            return false;
        }
        Job rhs = ((Job) other);
        
        return ((this.jobId == rhs.jobId) || ((this.jobId != null) && this.jobId.equals(rhs.jobId)));
    }

}
