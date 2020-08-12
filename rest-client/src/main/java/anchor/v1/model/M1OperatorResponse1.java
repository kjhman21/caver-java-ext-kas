/*
 * Anchor API
 * Anchor API - **TODO** : define error type with Klaytn cell 
 *
 * OpenAPI spec version: 1.0.0
 * Contact: luffy.choi@groundx.xyz
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package anchor.v1.model;

import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;

import java.util.Objects;

/**
 * M1OperatorResponse1
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-08-11T05:23:06.644Z")



public class M1OperatorResponse1 {
  @SerializedName("code")
  private Integer code = null;

  @SerializedName("result")
  private Result7 result = null;

  public M1OperatorResponse1 code(Integer code) {
    this.code = code;
    return this;
  }

   /**
   * Get code
   * @return code
  **/
  @ApiModelProperty(example = "0", value = "")
  public Integer getCode() {
    return code;
  }

  public void setCode(Integer code) {
    this.code = code;
  }

  public M1OperatorResponse1 result(Result7 result) {
    this.result = result;
    return this;
  }

   /**
   * Get result
   * @return result
  **/
  @ApiModelProperty(value = "")
  public Result7 getResult() {
    return result;
  }

  public void setResult(Result7 result) {
    this.result = result;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    M1OperatorResponse1 m1OperatorResponse1 = (M1OperatorResponse1) o;
    return Objects.equals(this.code, m1OperatorResponse1.code) &&
        Objects.equals(this.result, m1OperatorResponse1.result);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, result);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class M1OperatorResponse1 {\n");
    
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    result: ").append(toIndentedString(result)).append("\n");
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

