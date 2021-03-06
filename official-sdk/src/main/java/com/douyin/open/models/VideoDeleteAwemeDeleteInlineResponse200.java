/*
 * 
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.douyin.open.models;

import java.util.Objects;
import java.util.Arrays;
import com.douyin.open.models.VideoDeleteAwemeDeleteExtraBody;
import com.douyin.open.models.VideoDeleteAwemeDeleteInlineResponse200Data;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import io.swagger.v3.oas.annotations.media.Schema;
/**
 * VideoDeleteAwemeDeleteInlineResponse200
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-08-13T12:03:43.957033+08:00[Asia/Shanghai]")
@JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
public class VideoDeleteAwemeDeleteInlineResponse200 {
  @JsonProperty("extra")
  private VideoDeleteAwemeDeleteExtraBody extra = null;

  @JsonProperty("data")
  private VideoDeleteAwemeDeleteInlineResponse200Data data = null;

  public VideoDeleteAwemeDeleteInlineResponse200 extra(VideoDeleteAwemeDeleteExtraBody extra) {
    this.extra = extra;
    return this;
  }

   /**
   * Get extra
   * @return extra
  **/
  @Schema(description = "")
  public VideoDeleteAwemeDeleteExtraBody getExtra() {
    return extra;
  }

  public void setExtra(VideoDeleteAwemeDeleteExtraBody extra) {
    this.extra = extra;
  }

  public VideoDeleteAwemeDeleteInlineResponse200 data(VideoDeleteAwemeDeleteInlineResponse200Data data) {
    this.data = data;
    return this;
  }

   /**
   * Get data
   * @return data
  **/
  @Schema(description = "")
  public VideoDeleteAwemeDeleteInlineResponse200Data getData() {
    return data;
  }

  public void setData(VideoDeleteAwemeDeleteInlineResponse200Data data) {
    this.data = data;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VideoDeleteAwemeDeleteInlineResponse200 inlineResponse200 = (VideoDeleteAwemeDeleteInlineResponse200) o;
    return Objects.equals(this.extra, inlineResponse200.extra) &&
        Objects.equals(this.data, inlineResponse200.data);
  }

  @Override
  public int hashCode() {
    return Objects.hash(extra, data);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VideoDeleteAwemeDeleteInlineResponse200 {\n");
    
    sb.append("    extra: ").append(toIndentedString(extra)).append("\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
