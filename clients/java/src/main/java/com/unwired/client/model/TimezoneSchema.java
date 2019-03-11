/*
 * Location API
 * Geolocation, Geocoding and Maps
 *
 * OpenAPI spec version: 2.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.unwired.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.math.BigDecimal;

/**
 * Timezone object found for the location.
 */
@ApiModel(description = "Timezone object found for the location.")

public class TimezoneSchema {
  public static final String SERIALIZED_NAME_SHORT_NAME = "short_name";
  @SerializedName(SERIALIZED_NAME_SHORT_NAME)
  private String shortName;

  public static final String SERIALIZED_NAME_OFFSET_SEC = "offset_sec";
  @SerializedName(SERIALIZED_NAME_OFFSET_SEC)
  private BigDecimal offsetSec;

  public static final String SERIALIZED_NAME_NOW_IN_DST = "now_in_dst";
  @SerializedName(SERIALIZED_NAME_NOW_IN_DST)
  private String nowInDst;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public TimezoneSchema shortName(String shortName) {
    this.shortName = shortName;
    return this;
  }

   /**
   * Short name of the Timezone
   * @return shortName
  **/
  @ApiModelProperty(value = "Short name of the Timezone")
  public String getShortName() {
    return shortName;
  }

  public void setShortName(String shortName) {
    this.shortName = shortName;
  }

  public TimezoneSchema offsetSec(BigDecimal offsetSec) {
    this.offsetSec = offsetSec;
    return this;
  }

   /**
   * The offset from UTC (in seconds) for the given location. Considers DST savings.
   * @return offsetSec
  **/
  @ApiModelProperty(value = "The offset from UTC (in seconds) for the given location. Considers DST savings.")
  public BigDecimal getOffsetSec() {
    return offsetSec;
  }

  public void setOffsetSec(BigDecimal offsetSec) {
    this.offsetSec = offsetSec;
  }

  public TimezoneSchema nowInDst(String nowInDst) {
    this.nowInDst = nowInDst;
    return this;
  }

   /**
   * Represents whether the zone currently observing DST or not
   * @return nowInDst
  **/
  @ApiModelProperty(value = "Represents whether the zone currently observing DST or not")
  public String getNowInDst() {
    return nowInDst;
  }

  public void setNowInDst(String nowInDst) {
    this.nowInDst = nowInDst;
  }

  public TimezoneSchema name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Timezone name of the Location
   * @return name
  **/
  @ApiModelProperty(value = "Timezone name of the Location")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TimezoneSchema timezoneSchema = (TimezoneSchema) o;
    return Objects.equals(this.shortName, timezoneSchema.shortName) &&
        Objects.equals(this.offsetSec, timezoneSchema.offsetSec) &&
        Objects.equals(this.nowInDst, timezoneSchema.nowInDst) &&
        Objects.equals(this.name, timezoneSchema.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(shortName, offsetSec, nowInDst, name);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TimezoneSchema {\n");
    
    sb.append("    shortName: ").append(toIndentedString(shortName)).append("\n");
    sb.append("    offsetSec: ").append(toIndentedString(offsetSec)).append("\n");
    sb.append("    nowInDst: ").append(toIndentedString(nowInDst)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
