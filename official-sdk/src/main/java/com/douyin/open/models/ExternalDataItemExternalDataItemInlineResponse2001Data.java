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
import com.douyin.open.models.ExternalDataItemExternalDataItemExternalItemLike;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
/**
 * ExternalDataItemExternalDataItemInlineResponse2001Data
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-08-13T12:05:48.688040+08:00[Asia/Shanghai]")
@JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
public class ExternalDataItemExternalDataItemInlineResponse2001Data {
  @JsonProperty("error_code")
  private Integer errorCode = null;

  @JsonProperty("description")
  private String description = null;

  @JsonProperty("result_list")
  private List<ExternalDataItemExternalDataItemExternalItemLike> resultList = null;

  public ExternalDataItemExternalDataItemInlineResponse2001Data errorCode(Integer errorCode) {
    this.errorCode = errorCode;
    return this;
  }

   /**
   * Get errorCode
   * @return errorCode
  **/
  @Schema(required = true, description = "")
  public Integer getErrorCode() {
    return errorCode;
  }

  public void setErrorCode(Integer errorCode) {
    this.errorCode = errorCode;
  }

  public ExternalDataItemExternalDataItemInlineResponse2001Data description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @Schema(required = true, description = "")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public ExternalDataItemExternalDataItemInlineResponse2001Data resultList(List<ExternalDataItemExternalDataItemExternalItemLike> resultList) {
    this.resultList = resultList;
    return this;
  }

  public ExternalDataItemExternalDataItemInlineResponse2001Data addResultListItem(ExternalDataItemExternalDataItemExternalItemLike resultListItem) {
    if (this.resultList == null) {
      this.resultList = new ArrayList<>();
    }
    this.resultList.add(resultListItem);
    return this;
  }

   /**
   * Get resultList
   * @return resultList
  **/
  @Schema(description = "")
  public List<ExternalDataItemExternalDataItemExternalItemLike> getResultList() {
    return resultList;
  }

  public void setResultList(List<ExternalDataItemExternalDataItemExternalItemLike> resultList) {
    this.resultList = resultList;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExternalDataItemExternalDataItemInlineResponse2001Data inlineResponse2001Data = (ExternalDataItemExternalDataItemInlineResponse2001Data) o;
    return Objects.equals(this.errorCode, inlineResponse2001Data.errorCode) &&
        Objects.equals(this.description, inlineResponse2001Data.description) &&
        Objects.equals(this.resultList, inlineResponse2001Data.resultList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(errorCode, description, resultList);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExternalDataItemExternalDataItemInlineResponse2001Data {\n");
    
    sb.append("    errorCode: ").append(toIndentedString(errorCode)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    resultList: ").append(toIndentedString(resultList)).append("\n");
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
