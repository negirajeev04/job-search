
package com.swipejobs.jobsearch.pojo;

import javax.annotation.processing.Generated;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "unit", "maxJobDistance", "longitude", "latitude" })
@Generated("jsonschema2pojo")
public class JobSearchAddress {

	@JsonProperty("unit")
	private String unit;
	@JsonProperty("maxJobDistance")
	private Integer maxJobDistance;
	@JsonProperty("longitude")
	private Double longitude;
	@JsonProperty("latitude")
	private Double latitude;

	@JsonProperty("unit")
	public String getUnit() {
		return unit;
	}

	@JsonProperty("unit")
	public void setUnit(String unit) {
		this.unit = unit;
	}

	public JobSearchAddress withUnit(String unit) {
		this.unit = unit;
		return this;
	}

	@JsonProperty("maxJobDistance")
	public Integer getMaxJobDistance() {
		return maxJobDistance;
	}

	@JsonProperty("maxJobDistance")
	public void setMaxJobDistance(Integer maxJobDistance) {
		this.maxJobDistance = maxJobDistance;
	}

	public JobSearchAddress withMaxJobDistance(Integer maxJobDistance) {
		this.maxJobDistance = maxJobDistance;
		return this;
	}

	@JsonProperty("longitude")
	public Double getLongitude() {
		return longitude;
	}

	@JsonProperty("longitude")
	public void setLongitude(Double longitude) {
		this.longitude = longitude;
	}

	public JobSearchAddress withLongitude(Double longitude) {
		this.longitude = longitude;
		return this;
	}

	@JsonProperty("latitude")
	public Double getLatitude() {
		return latitude;
	}

	@JsonProperty("latitude")
	public void setLatitude(Double latitude) {
		this.latitude = latitude;
	}

	public JobSearchAddress withLatitude(Double latitude) {
		this.latitude = latitude;
		return this;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(JobSearchAddress.class.getName()).append('@')
				.append(Integer.toHexString(System.identityHashCode(this))).append('[');
		sb.append("unit");
		sb.append('=');
		sb.append(((this.unit == null) ? "<null>" : this.unit));
		sb.append(',');
		sb.append("maxJobDistance");
		sb.append('=');
		sb.append(this.maxJobDistance);
		sb.append(',');
		sb.append("longitude");
		sb.append('=');
		sb.append(this.longitude);
		sb.append(',');
		sb.append("latitude");
		sb.append('=');
		sb.append(this.latitude);
		sb.append(']');
		return sb.toString();
	}

	@Override
	public int hashCode() {
		int result = 1;
		result = ((result * 31) + ((this.unit == null) ? 0 : this.unit.hashCode()));
		result = ((result * 31) + ((this.maxJobDistance == null) ? 0 : this.maxJobDistance.hashCode()));
		result = ((result * 31) + ((this.longitude == null) ? 0 : this.longitude.hashCode()));
		result = ((result * 31) + ((this.latitude == null) ? 0 : this.latitude.hashCode()));
		return result;
	}

	@Override
	public boolean equals(Object other) {
		if (other == this) {
			return true;
		}
		if ((other instanceof JobSearchAddress) == false) {
			return false;
		}
		JobSearchAddress rhs = ((JobSearchAddress) other);
		return ((this.unit == rhs.unit) || ((this.unit != null) && this.unit.equals(rhs.unit)))
				&& ((this.maxJobDistance == rhs.maxJobDistance) || ((this.maxJobDistance != null) && this.maxJobDistance.equals(rhs.maxJobDistance)))
				&& ((this.longitude == rhs.longitude) || ((this.longitude != null) && this.longitude.equals(rhs.longitude)))
				&& ((this.latitude == rhs.latitude) || ((this.latitude != null) && this.latitude.equals(rhs.latitude)));
	}

}
