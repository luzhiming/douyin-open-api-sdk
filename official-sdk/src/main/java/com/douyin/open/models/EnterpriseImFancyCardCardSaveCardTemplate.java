/*
 * 创建动态消息卡片
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
import com.douyin.open.models.EnterpriseImFancyCardCardSaveCardModule;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
/**
 * EnterpriseImFancyCardCardSaveCardTemplate
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-08-13T12:10:06.392159+08:00[Asia/Shanghai]")
@JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
public class EnterpriseImFancyCardCardSaveCardTemplate {
  @JsonProperty("template_key")
  private String templateKey = null;

  @JsonProperty("modules")
  private List<EnterpriseImFancyCardCardSaveCardModule> modules = new ArrayList<>();

  @JsonProperty("props")
  private String props = null;

  public EnterpriseImFancyCardCardSaveCardTemplate templateKey(String templateKey) {
    this.templateKey = templateKey;
    return this;
  }

   /**
   * 模版key
   * @return templateKey
  **/
  @Schema(example = "default", required = true, description = "模版key")
  public String getTemplateKey() {
    return templateKey;
  }

  public void setTemplateKey(String templateKey) {
    this.templateKey = templateKey;
  }

  public EnterpriseImFancyCardCardSaveCardTemplate modules(List<EnterpriseImFancyCardCardSaveCardModule> modules) {
    this.modules = modules;
    return this;
  }

  public EnterpriseImFancyCardCardSaveCardTemplate addModulesItem(EnterpriseImFancyCardCardSaveCardModule modulesItem) {
    this.modules.add(modulesItem);
    return this;
  }

   /**
   * 卡片模块列表
   * @return modules
  **/
  @Schema(required = true, description = "卡片模块列表")
  public List<EnterpriseImFancyCardCardSaveCardModule> getModules() {
    return modules;
  }

  public void setModules(List<EnterpriseImFancyCardCardSaveCardModule> modules) {
    this.modules = modules;
  }

  public EnterpriseImFancyCardCardSaveCardTemplate props(String props) {
    this.props = props;
    return this;
  }

   /**
   * 卡片属性 json string
   * @return props
  **/
  @Schema(example = "{\"icon\": \"http://\"}", description = "卡片属性 json string")
  public String getProps() {
    return props;
  }

  public void setProps(String props) {
    this.props = props;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EnterpriseImFancyCardCardSaveCardTemplate cardTemplate = (EnterpriseImFancyCardCardSaveCardTemplate) o;
    return Objects.equals(this.templateKey, cardTemplate.templateKey) &&
        Objects.equals(this.modules, cardTemplate.modules) &&
        Objects.equals(this.props, cardTemplate.props);
  }

  @Override
  public int hashCode() {
    return Objects.hash(templateKey, modules, props);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EnterpriseImFancyCardCardSaveCardTemplate {\n");
    
    sb.append("    templateKey: ").append(toIndentedString(templateKey)).append("\n");
    sb.append("    modules: ").append(toIndentedString(modules)).append("\n");
    sb.append("    props: ").append(toIndentedString(props)).append("\n");
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