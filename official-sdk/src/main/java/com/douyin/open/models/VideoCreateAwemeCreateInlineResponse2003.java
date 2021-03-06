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
import com.douyin.open.models.VideoCreateAwemeCreateExtraBody;
import com.douyin.open.models.VideoCreateAwemeCreateInlineResponse2003Data;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import io.swagger.v3.oas.annotations.media.Schema;
/**
 * VideoCreateAwemeCreateInlineResponse2003
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-08-19T14:21:48.922886+08:00[Asia/Shanghai]")
@JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
public class VideoCreateAwemeCreateInlineResponse2003 {
  @JsonProperty("extra")
  private VideoCreateAwemeCreateExtraBody extra = null;

  @JsonProperty("data")
  private VideoCreateAwemeCreateInlineResponse2003Data data = null;

  public VideoCreateAwemeCreateInlineResponse2003 extra(VideoCreateAwemeCreateExtraBody extra) {
    this.extra = extra;
    return this;
  }

   /**
   * Get extra
   * @return extra
  **/
  @Schema(description = "")
  public VideoCreateAwemeCreateExtraBody getExtra() {
    return extra;
  }

  public void setExtra(VideoCreateAwemeCreateExtraBody extra) {
    this.extra = extra;
  }

  public VideoCreateAwemeCreateInlineResponse2003 data(VideoCreateAwemeCreateInlineResponse2003Data data) {
    this.data = data;
    return this;
  }

   /**
   * Get data
   * @return data
  **/
  @Schema(description = "")
  public VideoCreateAwemeCreateInlineResponse2003Data getData() {
    return data;
  }

  public void setData(VideoCreateAwemeCreateInlineResponse2003Data data) {
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
    VideoCreateAwemeCreateInlineResponse2003 inlineResponse2003 = (VideoCreateAwemeCreateInlineResponse2003) o;
    return Objects.equals(this.extra, inlineResponse2003.extra) &&
        Objects.equals(this.data, inlineResponse2003.data);
  }

  @Override
  public int hashCode() {
    return Objects.hash(extra, data);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VideoCreateAwemeCreateInlineResponse2003 {\n");
    
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
