/*
 * 自定义卷码预存
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
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
/**
 * EnterpriseGrouponGrouponCodeCodeDepositInlineResponse200Data
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-08-13T12:08:30.227238+08:00[Asia/Shanghai]")
@JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
public class EnterpriseGrouponGrouponCodeCodeDepositInlineResponse200Data {
  @JsonProperty("error_code")
  private Integer errorCode = null;

  @JsonProperty("description")
  private String description = null;

  @JsonProperty("success_codes")
  private List<String> successCodes = null;

  public EnterpriseGrouponGrouponCodeCodeDepositInlineResponse200Data errorCode(Integer errorCode) {
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

  public EnterpriseGrouponGrouponCodeCodeDepositInlineResponse200Data description(String description) {
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

  public EnterpriseGrouponGrouponCodeCodeDepositInlineResponse200Data successCodes(List<String> successCodes) {
    this.successCodes = successCodes;
    return this;
  }

  public EnterpriseGrouponGrouponCodeCodeDepositInlineResponse200Data addSuccessCodesItem(String successCodesItem) {
    if (this.successCodes == null) {
      this.successCodes = new ArrayList<>();
    }
    this.successCodes.add(successCodesItem);
    return this;
  }

   /**
   * 处理成功的Code
   * @return successCodes
  **/
  @Schema(description = "处理成功的Code")
  public List<String> getSuccessCodes() {
    return successCodes;
  }

  public void setSuccessCodes(List<String> successCodes) {
    this.successCodes = successCodes;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EnterpriseGrouponGrouponCodeCodeDepositInlineResponse200Data inlineResponse200Data = (EnterpriseGrouponGrouponCodeCodeDepositInlineResponse200Data) o;
    return Objects.equals(this.errorCode, inlineResponse200Data.errorCode) &&
        Objects.equals(this.description, inlineResponse200Data.description) &&
        Objects.equals(this.successCodes, inlineResponse200Data.successCodes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(errorCode, description, successCodes);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EnterpriseGrouponGrouponCodeCodeDepositInlineResponse200Data {\n");
    
    sb.append("    errorCode: ").append(toIndentedString(errorCode)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    successCodes: ").append(toIndentedString(successCodes)).append("\n");
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
