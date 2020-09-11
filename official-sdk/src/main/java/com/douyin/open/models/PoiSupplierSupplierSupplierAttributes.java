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
import com.douyin.open.models.PoiSupplierSupplierHotelServiceFacility;
import com.douyin.open.models.PoiSupplierSupplierSupplierAttributes1104;
import com.douyin.open.models.PoiSupplierSupplierSupplierAttributes3101;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
/**
 * 店铺属性字段，编号规则：垂直行业 1xxx-酒店民宿 2xxx-餐饮 3xxx-景区 通用属性-9yxxx
 */
@Schema(description = "店铺属性字段，编号规则：垂直行业 1xxx-酒店民宿 2xxx-餐饮 3xxx-景区 通用属性-9yxxx")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-08-13T12:08:47.759385+08:00[Asia/Shanghai]")
@JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
public class PoiSupplierSupplierSupplierAttributes {
  @JsonProperty("1101")
  private List<PoiSupplierSupplierHotelServiceFacility> _1101 = null;

  @JsonProperty("1102")
  private List<PoiSupplierSupplierHotelServiceFacility> _1102 = null;

  @JsonProperty("1103")
  private List<PoiSupplierSupplierHotelServiceFacility> _1103 = null;

  @JsonProperty("1104")
  private PoiSupplierSupplierSupplierAttributes1104 _1104 = null;

  /**
   * 下单模板。1 - 国内模板, 2 - 海外模板
   */
  public enum _1105Enum {
    NUMBER_1(1),
    NUMBER_2(2);

    private Integer value;

    _1105Enum(Integer value) {
      this.value = value;
    }
    @JsonValue
    public Integer getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    @JsonCreator
    public static _1105Enum fromValue(String text) {
      for (_1105Enum b : _1105Enum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

  }  @JsonProperty("1105")
  private _1105Enum _1105 = null;

  @JsonProperty("3101")
  private PoiSupplierSupplierSupplierAttributes3101 _3101 = null;

  public PoiSupplierSupplierSupplierAttributes _1101(List<PoiSupplierSupplierHotelServiceFacility> _1101) {
    this._1101 = _1101;
    return this;
  }

  public PoiSupplierSupplierSupplierAttributes add1101Item(PoiSupplierSupplierHotelServiceFacility _1101Item) {
    if (this._1101 == null) {
      this._1101 = new ArrayList<>();
    }
    this._1101.add(_1101Item);
    return this;
  }

   /**
   * 酒店服务
   * @return _1101
  **/
  @Schema(description = "酒店服务")
  public List<PoiSupplierSupplierHotelServiceFacility> get1101() {
    return _1101;
  }

  public void set1101(List<PoiSupplierSupplierHotelServiceFacility> _1101) {
    this._1101 = _1101;
  }

  public PoiSupplierSupplierSupplierAttributes _1102(List<PoiSupplierSupplierHotelServiceFacility> _1102) {
    this._1102 = _1102;
    return this;
  }

  public PoiSupplierSupplierSupplierAttributes add1102Item(PoiSupplierSupplierHotelServiceFacility _1102Item) {
    if (this._1102 == null) {
      this._1102 = new ArrayList<>();
    }
    this._1102.add(_1102Item);
    return this;
  }

   /**
   * 酒店设施
   * @return _1102
  **/
  @Schema(description = "酒店设施")
  public List<PoiSupplierSupplierHotelServiceFacility> get1102() {
    return _1102;
  }

  public void set1102(List<PoiSupplierSupplierHotelServiceFacility> _1102) {
    this._1102 = _1102;
  }

  public PoiSupplierSupplierSupplierAttributes _1103(List<PoiSupplierSupplierHotelServiceFacility> _1103) {
    this._1103 = _1103;
    return this;
  }

  public PoiSupplierSupplierSupplierAttributes add1103Item(PoiSupplierSupplierHotelServiceFacility _1103Item) {
    if (this._1103 == null) {
      this._1103 = new ArrayList<>();
    }
    this._1103.add(_1103Item);
    return this;
  }

   /**
   * 酒店特色项目
   * @return _1103
  **/
  @Schema(description = "酒店特色项目")
  public List<PoiSupplierSupplierHotelServiceFacility> get1103() {
    return _1103;
  }

  public void set1103(List<PoiSupplierSupplierHotelServiceFacility> _1103) {
    this._1103 = _1103;
  }

  public PoiSupplierSupplierSupplierAttributes _1104(PoiSupplierSupplierSupplierAttributes1104 _1104) {
    this._1104 = _1104;
    return this;
  }

   /**
   * Get _1104
   * @return _1104
  **/
  @Schema(description = "")
  public PoiSupplierSupplierSupplierAttributes1104 get1104() {
    return _1104;
  }

  public void set1104(PoiSupplierSupplierSupplierAttributes1104 _1104) {
    this._1104 = _1104;
  }

  public PoiSupplierSupplierSupplierAttributes _1105(_1105Enum _1105) {
    this._1105 = _1105;
    return this;
  }

   /**
   * 下单模板。1 - 国内模板, 2 - 海外模板
   * @return _1105
  **/
  @Schema(example = "1", description = "下单模板。1 - 国内模板, 2 - 海外模板")
  public _1105Enum get1105() {
    return _1105;
  }

  public void set1105(_1105Enum _1105) {
    this._1105 = _1105;
  }

  public PoiSupplierSupplierSupplierAttributes _3101(PoiSupplierSupplierSupplierAttributes3101 _3101) {
    this._3101 = _3101;
    return this;
  }

   /**
   * Get _3101
   * @return _3101
  **/
  @Schema(description = "")
  public PoiSupplierSupplierSupplierAttributes3101 get3101() {
    return _3101;
  }

  public void set3101(PoiSupplierSupplierSupplierAttributes3101 _3101) {
    this._3101 = _3101;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PoiSupplierSupplierSupplierAttributes supplierAttributes = (PoiSupplierSupplierSupplierAttributes) o;
    return Objects.equals(this._1101, supplierAttributes._1101) &&
        Objects.equals(this._1102, supplierAttributes._1102) &&
        Objects.equals(this._1103, supplierAttributes._1103) &&
        Objects.equals(this._1104, supplierAttributes._1104) &&
        Objects.equals(this._1105, supplierAttributes._1105) &&
        Objects.equals(this._3101, supplierAttributes._3101);
  }

  @Override
  public int hashCode() {
    return Objects.hash(_1101, _1102, _1103, _1104, _1105, _3101);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PoiSupplierSupplierSupplierAttributes {\n");
    
    sb.append("    _1101: ").append(toIndentedString(_1101)).append("\n");
    sb.append("    _1102: ").append(toIndentedString(_1102)).append("\n");
    sb.append("    _1103: ").append(toIndentedString(_1103)).append("\n");
    sb.append("    _1104: ").append(toIndentedString(_1104)).append("\n");
    sb.append("    _1105: ").append(toIndentedString(_1105)).append("\n");
    sb.append("    _3101: ").append(toIndentedString(_3101)).append("\n");
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