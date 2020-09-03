/*
 * th-0.7.0-v2-public
 * # Introduction  Token History API는 KLAY, FT (KIP-7, Labeled ERC-20), NFT (KIP-17, Labeled ERC-721) 토큰 정보, 이들 토큰을 주고받은 기록을 조회하는 기능을 제공합니다. 여러분은 특정 EOA가 KLAY를 주고받은 기록을 확인하거나 EOA가 가지고 있는 NFT 정보를 불러오는 등 Token History API를 다양하게 활용할 수 있습니다.   Token History API 사용에 관한 자세한 내용은 [튜토리얼](https://klaytn.com)을 확인하십시오.   이 문서 혹은 KAS에 관한 문의는 [개발자 포럼](https://forum.klaytn.com/)을 방문해 도움을 받으십시오  
 *
 * OpenAPI spec version: 0.7.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.client.api.tokenhistory.model;

import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;

import java.util.Objects;

/**
 * NftContractDetail
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-09-03T07:40:07.509Z")



public class NftContractDetail {
  @SerializedName("address")
  private String address = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("symbol")
  private String symbol = null;

  @SerializedName("totalSupply")
  private String totalSupply = null;

  @SerializedName("createdAt")
  private Long createdAt = null;

  @SerializedName("updatedAt")
  private Long updatedAt = null;

  @SerializedName("deletedAt")
  private Long deletedAt = null;

  @SerializedName("type")
  private String type = null;

  @SerializedName("status")
  private String status = null;

  public NftContractDetail address(String address) {
    this.address = address;
    return this;
  }

   /**
   * 컨트랙트 주소 (20-byte)
   * @return address
  **/
  @ApiModelProperty(example = "1.1380151414068366E48", required = true, value = "컨트랙트 주소 (20-byte)")
  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public NftContractDetail name(String name) {
    this.name = name;
    return this;
  }

   /**
   * 토큰 이름
   * @return name
  **/
  @ApiModelProperty(example = "Test Token", required = true, value = "토큰 이름")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public NftContractDetail symbol(String symbol) {
    this.symbol = symbol;
    return this;
  }

   /**
   * 토큰 심볼
   * @return symbol
  **/
  @ApiModelProperty(example = "TSTC", required = true, value = "토큰 심볼")
  public String getSymbol() {
    return symbol;
  }

  public void setSymbol(String symbol) {
    this.symbol = symbol;
  }

  public NftContractDetail totalSupply(String totalSupply) {
    this.totalSupply = totalSupply;
    return this;
  }

   /**
   * 총 발행량 (16진수로 표기)
   * @return totalSupply
  **/
  @ApiModelProperty(example = "100000000000", required = true, value = "총 발행량 (16진수로 표기)")
  public String getTotalSupply() {
    return totalSupply;
  }

  public void setTotalSupply(String totalSupply) {
    this.totalSupply = totalSupply;
  }

  public NftContractDetail createdAt(Long createdAt) {
    this.createdAt = createdAt;
    return this;
  }

   /**
   * 라벨링된 시점 (timestamp)
   * @return createdAt
  **/
  @ApiModelProperty(example = "1592180992", required = true, value = "라벨링된 시점 (timestamp)")
  public Long getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(Long createdAt) {
    this.createdAt = createdAt;
  }

  public NftContractDetail updatedAt(Long updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

   /**
   * 라벨링 정보가 마지막으로 변경된 시점 (timestamp)
   * @return updatedAt
  **/
  @ApiModelProperty(example = "1592180992", required = true, value = "라벨링 정보가 마지막으로 변경된 시점 (timestamp)")
  public Long getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(Long updatedAt) {
    this.updatedAt = updatedAt;
  }

  public NftContractDetail deletedAt(Long deletedAt) {
    this.deletedAt = deletedAt;
    return this;
  }

   /**
   * 라벨링이 삭제된 시점 (timestamp); 삭제되지 않았을 경우 0
   * @return deletedAt
  **/
  @ApiModelProperty(example = "1592180992", required = true, value = "라벨링이 삭제된 시점 (timestamp); 삭제되지 않았을 경우 0")
  public Long getDeletedAt() {
    return deletedAt;
  }

  public void setDeletedAt(Long deletedAt) {
    this.deletedAt = deletedAt;
  }

  public NftContractDetail type(String type) {
    this.type = type;
    return this;
  }

   /**
   * 컨트랙트 유형 (kip, erc)
   * @return type
  **/
  @ApiModelProperty(example = "kip", required = true, value = "컨트랙트 유형 (kip, erc)")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public NftContractDetail status(String status) {
    this.status = status;
    return this;
  }

   /**
   * 컨트랙트 라벨링 상태 (completed, processing, failed, cancelled)
   * @return status
  **/
  @ApiModelProperty(example = "completed", required = true, value = "컨트랙트 라벨링 상태 (completed, processing, failed, cancelled)")
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NftContractDetail nftContractDetail = (NftContractDetail) o;
    return Objects.equals(this.address, nftContractDetail.address) &&
        Objects.equals(this.name, nftContractDetail.name) &&
        Objects.equals(this.symbol, nftContractDetail.symbol) &&
        Objects.equals(this.totalSupply, nftContractDetail.totalSupply) &&
        Objects.equals(this.createdAt, nftContractDetail.createdAt) &&
        Objects.equals(this.updatedAt, nftContractDetail.updatedAt) &&
        Objects.equals(this.deletedAt, nftContractDetail.deletedAt) &&
        Objects.equals(this.type, nftContractDetail.type) &&
        Objects.equals(this.status, nftContractDetail.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(address, name, symbol, totalSupply, createdAt, updatedAt, deletedAt, type, status);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NftContractDetail {\n");
    
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    symbol: ").append(toIndentedString(symbol)).append("\n");
    sb.append("    totalSupply: ").append(toIndentedString(totalSupply)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    deletedAt: ").append(toIndentedString(deletedAt)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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

