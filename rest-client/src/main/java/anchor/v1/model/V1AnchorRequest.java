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
 * V1AnchorRequest
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-08-11T05:23:06.644Z")



public class V1AnchorRequest {
  @SerializedName("operator")
  private String operator = null;

  @SerializedName("payload")
  private Payload payload = null;

  public V1AnchorRequest operator(String operator) {
    this.operator = operator;
    return this;
  }

   /**
   * Get operator
   * @return operator
  **/
  @ApiModelProperty(example = "1.3816493241555154E48", required = true, value = "")
  public String getOperator() {
    return operator;
  }

  public void setOperator(String operator) {
    this.operator = operator;
  }

  public V1AnchorRequest payload(Payload payload) {
    this.payload = payload;
    return this;
  }

   /**
   * Get payload
   * @return payload
  **/
  @ApiModelProperty(value = "")
  public Payload getPayload() {
    return payload;
  }

  public void setPayload(Payload payload) {
    this.payload = payload;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1AnchorRequest v1AnchorRequest = (V1AnchorRequest) o;
    return Objects.equals(this.operator, v1AnchorRequest.operator) &&
        Objects.equals(this.payload, v1AnchorRequest.payload);
  }

  @Override
  public int hashCode() {
    return Objects.hash(operator, payload);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1AnchorRequest {\n");
    
    sb.append("    operator: ").append(toIndentedString(operator)).append("\n");
    sb.append("    payload: ").append(toIndentedString(payload)).append("\n");
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

