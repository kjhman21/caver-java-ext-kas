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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.Objects;

/**
 * any type of data will be allowed
 */
@ApiModel(description = "any type of data will be allowed")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-08-11T05:23:06.644Z")



public class Payload {
  @SerializedName("id")
  private String id = null;

  @SerializedName("block_number")
  private Integer blockNumber = null;

  @SerializedName("block_root_hash")
  private String blockRootHash = null;

  @SerializedName("custom_field")
  private String customField = null;

  @SerializedName("custom_numfield")
  private Integer customNumfield = null;

  public Payload id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(example = "1", required = true, value = "")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Payload blockNumber(Integer blockNumber) {
    this.blockNumber = blockNumber;
    return this;
  }

   /**
   * Get blockNumber
   * @return blockNumber
  **/
  @ApiModelProperty(example = "10", value = "")
  public Integer getBlockNumber() {
    return blockNumber;
  }

  public void setBlockNumber(Integer blockNumber) {
    this.blockNumber = blockNumber;
  }

  public Payload blockRootHash(String blockRootHash) {
    this.blockRootHash = blockRootHash;
    return this;
  }

   /**
   * Get blockRootHash
   * @return blockRootHash
  **/
  @ApiModelProperty(example = "2.3966747012839547E76", value = "")
  public String getBlockRootHash() {
    return blockRootHash;
  }

  public void setBlockRootHash(String blockRootHash) {
    this.blockRootHash = blockRootHash;
  }

  public Payload customField(String customField) {
    this.customField = customField;
    return this;
  }

   /**
   * Get customField
   * @return customField
  **/
  @ApiModelProperty(example = "custom data field", value = "")
  public String getCustomField() {
    return customField;
  }

  public void setCustomField(String customField) {
    this.customField = customField;
  }

  public Payload customNumfield(Integer customNumfield) {
    this.customNumfield = customNumfield;
    return this;
  }

   /**
   * Get customNumfield
   * @return customNumfield
  **/
  @ApiModelProperty(example = "1234", value = "")
  public Integer getCustomNumfield() {
    return customNumfield;
  }

  public void setCustomNumfield(Integer customNumfield) {
    this.customNumfield = customNumfield;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Payload payload = (Payload) o;
    return Objects.equals(this.id, payload.id) &&
        Objects.equals(this.blockNumber, payload.blockNumber) &&
        Objects.equals(this.blockRootHash, payload.blockRootHash) &&
        Objects.equals(this.customField, payload.customField) &&
        Objects.equals(this.customNumfield, payload.customNumfield);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, blockNumber, blockRootHash, customField, customNumfield);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Payload {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    blockNumber: ").append(toIndentedString(blockNumber)).append("\n");
    sb.append("    blockRootHash: ").append(toIndentedString(blockRootHash)).append("\n");
    sb.append("    customField: ").append(toIndentedString(customField)).append("\n");
    sb.append("    customNumfield: ").append(toIndentedString(customNumfield)).append("\n");
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

