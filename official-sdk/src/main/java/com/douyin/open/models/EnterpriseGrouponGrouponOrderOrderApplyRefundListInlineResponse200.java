/*
 * 团购活动用户申请退款订单列表
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
import com.douyin.open.models.EnterpriseGrouponGrouponOrderOrderApplyRefundListExtraBody;
import com.douyin.open.models.EnterpriseGrouponGrouponOrderOrderApplyRefundListInlineResponse200Data;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import io.swagger.v3.oas.annotations.media.Schema;
/**
 * EnterpriseGrouponGrouponOrderOrderApplyRefundListInlineResponse200
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-08-13T12:07:30.282044+08:00[Asia/Shanghai]")
@JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
public class EnterpriseGrouponGrouponOrderOrderApplyRefundListInlineResponse200 {
  @JsonProperty("extra")
  private EnterpriseGrouponGrouponOrderOrderApplyRefundListExtraBody extra = null;

  @JsonProperty("data")
  private EnterpriseGrouponGrouponOrderOrderApplyRefundListInlineResponse200Data data = null;

  public EnterpriseGrouponGrouponOrderOrderApplyRefundListInlineResponse200 extra(EnterpriseGrouponGrouponOrderOrderApplyRefundListExtraBody extra) {
    this.extra = extra;
    return this;
  }

   /**
   * Get extra
   * @return extra
  **/
  @Schema(description = "")
  public EnterpriseGrouponGrouponOrderOrderApplyRefundListExtraBody getExtra() {
    return extra;
  }

  public void setExtra(EnterpriseGrouponGrouponOrderOrderApplyRefundListExtraBody extra) {
    this.extra = extra;
  }

  public EnterpriseGrouponGrouponOrderOrderApplyRefundListInlineResponse200 data(EnterpriseGrouponGrouponOrderOrderApplyRefundListInlineResponse200Data data) {
    this.data = data;
    return this;
  }

   /**
   * Get data
   * @return data
  **/
  @Schema(description = "")
  public EnterpriseGrouponGrouponOrderOrderApplyRefundListInlineResponse200Data getData() {
    return data;
  }

  public void setData(EnterpriseGrouponGrouponOrderOrderApplyRefundListInlineResponse200Data data) {
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
    EnterpriseGrouponGrouponOrderOrderApplyRefundListInlineResponse200 inlineResponse200 = (EnterpriseGrouponGrouponOrderOrderApplyRefundListInlineResponse200) o;
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
    sb.append("class EnterpriseGrouponGrouponOrderOrderApplyRefundListInlineResponse200 {\n");
    
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