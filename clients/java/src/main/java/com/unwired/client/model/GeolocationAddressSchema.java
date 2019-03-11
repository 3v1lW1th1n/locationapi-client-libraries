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
import io.swagger.annotations.ApiModel;
import com.google.gson.annotations.SerializedName;

import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/**
 * The physical address of the returned location
 */
@JsonAdapter(GeolocationAddressSchema.Adapter.class)
public enum GeolocationAddressSchema {
  
  NUMBER_0(0l),
  
  NUMBER_1(1l),
  
  NUMBER_2(2l);

  private Long value;

  GeolocationAddressSchema(Long value) {
    this.value = value;
  }

  public Long getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static GeolocationAddressSchema fromValue(String text) {
    for (GeolocationAddressSchema b : GeolocationAddressSchema.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + text + "'");
  }

  public static class Adapter extends TypeAdapter<GeolocationAddressSchema> {
    @Override
    public void write(final JsonWriter jsonWriter, final GeolocationAddressSchema enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public GeolocationAddressSchema read(final JsonReader jsonReader) throws IOException {
      Long value = jsonReader.nextLong();
      return GeolocationAddressSchema.fromValue(String.valueOf(value));
    }
  }
}
