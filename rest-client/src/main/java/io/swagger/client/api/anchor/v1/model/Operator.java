/*
 * Anchor API
 * # Introduction 이 문서는 KAS\\(Klaytn API Service\\)의 Anchor API를 소개하는 문서입니다. Anchor API는 서비스 체인 데이터의 신뢰성을 보장하기 위해 데이터 신뢰성을 증명할 수 있는 메타데이터를 Klaytn 메인 체인에 전송하는 기능을 제공합니다.  자세한 사용 예시는 [튜토리얼](링크)를 확인하십시오.  
 *
 * OpenAPI spec version: 1.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.client.api.anchor.v1.model;

import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.Objects;

/**
 * Anchor용 Operator 정보
 */
@ApiModel(description = "Anchor용 Operator 정보")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-08-27T05:34:32.459Z")



public class Operator {
  @SerializedName("operator")
  private String operator = null;

  @SerializedName("setting")
  private OperatorSetting setting = null;

  public Operator operator(String operator) {
    this.operator = operator;
    return this;
  }

   /**
   * Operator의 클레이튼 계정주소
   * @return operator
  **/
  @ApiModelProperty(example = "1.0062918494800645E48", required = true, value = "Operator의 클레이튼 계정주소")
  public String getOperator() {
    return operator;
  }

  public void setOperator(String operator) {
    this.operator = operator;
  }

  public Operator setting(OperatorSetting setting) {
    this.setting = setting;
    return this;
  }

   /**
   * Get setting
   * @return setting
  **/
  @ApiModelProperty(value = "")
  public OperatorSetting getSetting() {
    return setting;
  }

  public void setSetting(OperatorSetting setting) {
    this.setting = setting;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Operator operator = (Operator) o;
    return Objects.equals(this.operator, operator.operator) &&
        Objects.equals(this.setting, operator.setting);
  }

  @Override
  public int hashCode() {
    return Objects.hash(operator, setting);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Operator {\n");
    
    sb.append("    operator: ").append(toIndentedString(operator)).append("\n");
    sb.append("    setting: ").append(toIndentedString(setting)).append("\n");
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

