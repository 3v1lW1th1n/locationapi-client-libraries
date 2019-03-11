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

/**
 * BalanceResponseSchema
 */

public class BalanceResponseSchema {
  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private String status;

  public static final String SERIALIZED_NAME_BALANCE_GEOLOCATION = "balance_geolocation";
  @SerializedName(SERIALIZED_NAME_BALANCE_GEOLOCATION)
  private Long balanceGeolocation;

  public static final String SERIALIZED_NAME_BALANCE_GEOCODING = "balance_geocoding";
  @SerializedName(SERIALIZED_NAME_BALANCE_GEOCODING)
  private Long balanceGeocoding;

  public BalanceResponseSchema status(String status) {
    this.status = status;
    return this;
  }

   /**
   * If the request is successful, ok is returned. Otherwise error is returned
   * @return status
  **/
  @ApiModelProperty(example = "error", value = "If the request is successful, ok is returned. Otherwise error is returned")
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public BalanceResponseSchema balanceGeolocation(Long balanceGeolocation) {
    this.balanceGeolocation = balanceGeolocation;
    return this;
  }

   /**
   * Remaining balance left in the account for geolocation requests
   * @return balanceGeolocation
  **/
  @ApiModelProperty(example = "45", value = "Remaining balance left in the account for geolocation requests")
  public Long getBalanceGeolocation() {
    return balanceGeolocation;
  }

  public void setBalanceGeolocation(Long balanceGeolocation) {
    this.balanceGeolocation = balanceGeolocation;
  }

  public BalanceResponseSchema balanceGeocoding(Long balanceGeocoding) {
    this.balanceGeocoding = balanceGeocoding;
    return this;
  }

   /**
   * Remaining balance left in the account for geocoding requests
   * @return balanceGeocoding
  **/
  @ApiModelProperty(example = "55", value = "Remaining balance left in the account for geocoding requests")
  public Long getBalanceGeocoding() {
    return balanceGeocoding;
  }

  public void setBalanceGeocoding(Long balanceGeocoding) {
    this.balanceGeocoding = balanceGeocoding;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BalanceResponseSchema balanceResponseSchema = (BalanceResponseSchema) o;
    return Objects.equals(this.status, balanceResponseSchema.status) &&
        Objects.equals(this.balanceGeolocation, balanceResponseSchema.balanceGeolocation) &&
        Objects.equals(this.balanceGeocoding, balanceResponseSchema.balanceGeocoding);
  }

  @Override
  public int hashCode() {
    return Objects.hash(status, balanceGeolocation, balanceGeocoding);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BalanceResponseSchema {\n");
    
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    balanceGeolocation: ").append(toIndentedString(balanceGeolocation)).append("\n");
    sb.append("    balanceGeocoding: ").append(toIndentedString(balanceGeocoding)).append("\n");
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
