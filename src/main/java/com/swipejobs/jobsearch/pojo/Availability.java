
package com.swipejobs.jobsearch.pojo;

import javax.annotation.processing.Generated;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "title",
    "dayIndex"
})
@Generated("jsonschema2pojo")
public class Availability {

    @JsonProperty("title")
    private String title;
    @JsonProperty("dayIndex")
    private Integer dayIndex;

    @JsonProperty("title")
    public String getTitle() {
        return title;
    }

    @JsonProperty("title")
    public void setTitle(String title) {
        this.title = title;
    }

    public Availability withTitle(String title) {
        this.title = title;
        return this;
    }

    @JsonProperty("dayIndex")
    public Integer getDayIndex() {
        return dayIndex;
    }

    @JsonProperty("dayIndex")
    public void setDayIndex(Integer dayIndex) {
        this.dayIndex = dayIndex;
    }

    public Availability withDayIndex(Integer dayIndex) {
        this.dayIndex = dayIndex;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Availability.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("title");
        sb.append('=');
        sb.append(((this.title == null)?"<null>":this.title));
        sb.append(',');
        sb.append("dayIndex");
        sb.append('=');
        sb.append(((this.dayIndex == null)?"<null>":this.dayIndex));
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
        result = ((result* 31)+((this.dayIndex == null)? 0 :this.dayIndex.hashCode()));
        result = ((result* 31)+((this.title == null)? 0 :this.title.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Availability) == false) {
            return false;
        }
        Availability rhs = ((Availability) other);
        return ((((this.dayIndex == rhs.dayIndex)||((this.dayIndex!= null)&&this.dayIndex.equals(rhs.dayIndex))))&&((this.title == rhs.title)||((this.title!= null)&&this.title.equals(rhs.title))));
    }

}
