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
 * Transaction
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-09-03T07:40:07.509Z")



public class Transaction {
  @SerializedName("feePayer")
  private String feePayer = null;

  @SerializedName("feeRatio")
  private Integer feeRatio = null;

  @SerializedName("fee")
  private String fee = null;

  @SerializedName("from")
  private String from = null;

  @SerializedName("timestamp")
  private Long timestamp = null;

  @SerializedName("transactionHash")
  private String transactionHash = null;

  @SerializedName("typeInt")
  private Integer typeInt = null;

  @SerializedName("value")
  private String value = null;

  public Transaction feePayer(String feePayer) {
    this.feePayer = feePayer;
    return this;
  }

   /**
   * 수수료 대납 계정 주소 (20-byte)
   * @return feePayer
  **/
  @ApiModelProperty(example = "1.1926938606617004E48", required = true, value = "수수료 대납 계정 주소 (20-byte)")
  public String getFeePayer() {
    return feePayer;
  }

  public void setFeePayer(String feePayer) {
    this.feePayer = feePayer;
  }

  public Transaction feeRatio(Integer feeRatio) {
    this.feeRatio = feeRatio;
    return this;
  }

   /**
   * 수수료 대납 비율
   * @return feeRatio
  **/
  @ApiModelProperty(example = "100", required = true, value = "수수료 대납 비율")
  public Integer getFeeRatio() {
    return feeRatio;
  }

  public void setFeeRatio(Integer feeRatio) {
    this.feeRatio = feeRatio;
  }

  public Transaction fee(String fee) {
    this.fee = fee;
    return this;
  }

   /**
   * 가스비
   * @return fee
  **/
  @ApiModelProperty(example = "42069", required = true, value = "가스비")
  public String getFee() {
    return fee;
  }

  public void setFee(String fee) {
    this.fee = fee;
  }

  public Transaction from(String from) {
    this.from = from;
    return this;
  }

   /**
   * 트랜잭션을 전송한 사람의 EOA 주소 (20-byte)
   * @return from
  **/
  @ApiModelProperty(example = "5.3824395526049505E47", required = true, value = "트랜잭션을 전송한 사람의 EOA 주소 (20-byte)")
  public String getFrom() {
    return from;
  }

  public void setFrom(String from) {
    this.from = from;
  }

  public Transaction timestamp(Long timestamp) {
    this.timestamp = timestamp;
    return this;
  }

   /**
   * 트랜잭션 발생 시간 (timestamp)
   * @return timestamp
  **/
  @ApiModelProperty(example = "1592180992", required = true, value = "트랜잭션 발생 시간 (timestamp)")
  public Long getTimestamp() {
    return timestamp;
  }

  public void setTimestamp(Long timestamp) {
    this.timestamp = timestamp;
  }

  public Transaction transactionHash(String transactionHash) {
    this.transactionHash = transactionHash;
    return this;
  }

   /**
   * 트랜잭션 해시 (32-byte)
   * @return transactionHash
  **/
  @ApiModelProperty(example = "8.894164055280364E76", required = true, value = "트랜잭션 해시 (32-byte)")
  public String getTransactionHash() {
    return transactionHash;
  }

  public void setTransactionHash(String transactionHash) {
    this.transactionHash = transactionHash;
  }

  public Transaction typeInt(Integer typeInt) {
    this.typeInt = typeInt;
    return this;
  }

   /**
   * 트랜잭션 유형
   * @return typeInt
  **/
  @ApiModelProperty(example = "10", required = true, value = "트랜잭션 유형")
  public Integer getTypeInt() {
    return typeInt;
  }

  public void setTypeInt(Integer typeInt) {
    this.typeInt = typeInt;
  }

  public Transaction value(String value) {
    this.value = value;
    return this;
  }

   /**
   * KLAY 전송량 (16진수)
   * @return value
  **/
  @ApiModelProperty(example = "10", required = true, value = "KLAY 전송량 (16진수)")
  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Transaction transaction = (Transaction) o;
    return Objects.equals(this.feePayer, transaction.feePayer) &&
        Objects.equals(this.feeRatio, transaction.feeRatio) &&
        Objects.equals(this.fee, transaction.fee) &&
        Objects.equals(this.from, transaction.from) &&
        Objects.equals(this.timestamp, transaction.timestamp) &&
        Objects.equals(this.transactionHash, transaction.transactionHash) &&
        Objects.equals(this.typeInt, transaction.typeInt) &&
        Objects.equals(this.value, transaction.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(feePayer, feeRatio, fee, from, timestamp, transactionHash, typeInt, value);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Transaction {\n");
    
    sb.append("    feePayer: ").append(toIndentedString(feePayer)).append("\n");
    sb.append("    feeRatio: ").append(toIndentedString(feeRatio)).append("\n");
    sb.append("    fee: ").append(toIndentedString(fee)).append("\n");
    sb.append("    from: ").append(toIndentedString(from)).append("\n");
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
    sb.append("    transactionHash: ").append(toIndentedString(transactionHash)).append("\n");
    sb.append("    typeInt: ").append(toIndentedString(typeInt)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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

