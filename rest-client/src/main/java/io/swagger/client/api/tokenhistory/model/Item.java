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
 * Item
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-09-03T07:40:07.509Z")



public class Item {
  @SerializedName("feePayer")
  private String feePayer = null;

  @SerializedName("feeRatio")
  private Integer feeRatio = null;

  @SerializedName("fee")
  private String fee = null;

  @SerializedName("from")
  private String from = null;

  @SerializedName("to")
  private String to = null;

  @SerializedName("transactionHash")
  private String transactionHash = null;

  @SerializedName("transactionIndex")
  private Integer transactionIndex = null;

  @SerializedName("transferType")
  private String transferType = null;

  @SerializedName("typeInt")
  private Integer typeInt = null;

  @SerializedName("value")
  private String value = null;

  @SerializedName("contract")
  private FtContract contract = null;

  @SerializedName("formattedValue")
  private String formattedValue = null;

  @SerializedName("transaction")
  private Transaction transaction = null;

  @SerializedName("tokenId")
  private String tokenId = null;

  public Item feePayer(String feePayer) {
    this.feePayer = feePayer;
    return this;
  }

   /**
   * 수수료 대납 계정 주소 (20-byte)
   * @return feePayer
  **/
  @ApiModelProperty(example = "1.1926938606617004E48", value = "수수료 대납 계정 주소 (20-byte)")
  public String getFeePayer() {
    return feePayer;
  }

  public void setFeePayer(String feePayer) {
    this.feePayer = feePayer;
  }

  public Item feeRatio(Integer feeRatio) {
    this.feeRatio = feeRatio;
    return this;
  }

   /**
   * 수수료 대납 비율
   * @return feeRatio
  **/
  @ApiModelProperty(example = "100", value = "수수료 대납 비율")
  public Integer getFeeRatio() {
    return feeRatio;
  }

  public void setFeeRatio(Integer feeRatio) {
    this.feeRatio = feeRatio;
  }

  public Item fee(String fee) {
    this.fee = fee;
    return this;
  }

   /**
   * 가스비
   * @return fee
  **/
  @ApiModelProperty(example = "42069", value = "가스비")
  public String getFee() {
    return fee;
  }

  public void setFee(String fee) {
    this.fee = fee;
  }

  public Item from(String from) {
    this.from = from;
    return this;
  }

   /**
   * 보낸 사람 EOA 주소 (20-byte)
   * @return from
  **/
  @ApiModelProperty(example = "5.3824395526049505E47", value = "보낸 사람 EOA 주소 (20-byte)")
  public String getFrom() {
    return from;
  }

  public void setFrom(String from) {
    this.from = from;
  }

  public Item to(String to) {
    this.to = to;
    return this;
  }

   /**
   * 받은 사람 EOA 주소 (20-byte)
   * @return to
  **/
  @ApiModelProperty(example = "1.0318861629967498E48", value = "받은 사람 EOA 주소 (20-byte)")
  public String getTo() {
    return to;
  }

  public void setTo(String to) {
    this.to = to;
  }

  public Item transactionHash(String transactionHash) {
    this.transactionHash = transactionHash;
    return this;
  }

   /**
   * 트랜잭션 해시
   * @return transactionHash
  **/
  @ApiModelProperty(example = "8.894164055280364E76", value = "트랜잭션 해시")
  public String getTransactionHash() {
    return transactionHash;
  }

  public void setTransactionHash(String transactionHash) {
    this.transactionHash = transactionHash;
  }

  public Item transactionIndex(Integer transactionIndex) {
    this.transactionIndex = transactionIndex;
    return this;
  }

   /**
   * 트랜잭션 인덱스
   * @return transactionIndex
  **/
  @ApiModelProperty(example = "1", value = "트랜잭션 인덱스")
  public Integer getTransactionIndex() {
    return transactionIndex;
  }

  public void setTransactionIndex(Integer transactionIndex) {
    this.transactionIndex = transactionIndex;
  }

  public Item transferType(String transferType) {
    this.transferType = transferType;
    return this;
  }

   /**
   * 거래내역 유형
   * @return transferType
  **/
  @ApiModelProperty(example = "klay", value = "거래내역 유형")
  public String getTransferType() {
    return transferType;
  }

  public void setTransferType(String transferType) {
    this.transferType = transferType;
  }

  public Item typeInt(Integer typeInt) {
    this.typeInt = typeInt;
    return this;
  }

   /**
   * 트랜잭션 유형
   * @return typeInt
  **/
  @ApiModelProperty(example = "50", value = "트랜잭션 유형")
  public Integer getTypeInt() {
    return typeInt;
  }

  public void setTypeInt(Integer typeInt) {
    this.typeInt = typeInt;
  }

  public Item value(String value) {
    this.value = value;
    return this;
  }

   /**
   * KLAY 전송량 (16진수)
   * @return value
  **/
  @ApiModelProperty(example = "10", value = "KLAY 전송량 (16진수)")
  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }

  public Item contract(FtContract contract) {
    this.contract = contract;
    return this;
  }

   /**
   * Get contract
   * @return contract
  **/
  @ApiModelProperty(value = "")
  public FtContract getContract() {
    return contract;
  }

  public void setContract(FtContract contract) {
    this.contract = contract;
  }

  public Item formattedValue(String formattedValue) {
    this.formattedValue = formattedValue;
    return this;
  }

   /**
   * decimal을 적용한 변환값
   * @return formattedValue
  **/
  @ApiModelProperty(example = "2.0E-18", value = "decimal을 적용한 변환값")
  public String getFormattedValue() {
    return formattedValue;
  }

  public void setFormattedValue(String formattedValue) {
    this.formattedValue = formattedValue;
  }

  public Item transaction(Transaction transaction) {
    this.transaction = transaction;
    return this;
  }

   /**
   * Get transaction
   * @return transaction
  **/
  @ApiModelProperty(value = "")
  public Transaction getTransaction() {
    return transaction;
  }

  public void setTransaction(Transaction transaction) {
    this.transaction = transaction;
  }

  public Item tokenId(String tokenId) {
    this.tokenId = tokenId;
    return this;
  }

   /**
   * 토큰 식별자 (16진수)
   * @return tokenId
  **/
  @ApiModelProperty(example = "1", value = "토큰 식별자 (16진수)")
  public String getTokenId() {
    return tokenId;
  }

  public void setTokenId(String tokenId) {
    this.tokenId = tokenId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Item item = (Item) o;
    return Objects.equals(this.feePayer, item.feePayer) &&
        Objects.equals(this.feeRatio, item.feeRatio) &&
        Objects.equals(this.fee, item.fee) &&
        Objects.equals(this.from, item.from) &&
        Objects.equals(this.to, item.to) &&
        Objects.equals(this.transactionHash, item.transactionHash) &&
        Objects.equals(this.transactionIndex, item.transactionIndex) &&
        Objects.equals(this.transferType, item.transferType) &&
        Objects.equals(this.typeInt, item.typeInt) &&
        Objects.equals(this.value, item.value) &&
        Objects.equals(this.contract, item.contract) &&
        Objects.equals(this.formattedValue, item.formattedValue) &&
        Objects.equals(this.transaction, item.transaction) &&
        Objects.equals(this.tokenId, item.tokenId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(feePayer, feeRatio, fee, from, to, transactionHash, transactionIndex, transferType, typeInt, value, contract, formattedValue, transaction, tokenId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Item {\n");
    
    sb.append("    feePayer: ").append(toIndentedString(feePayer)).append("\n");
    sb.append("    feeRatio: ").append(toIndentedString(feeRatio)).append("\n");
    sb.append("    fee: ").append(toIndentedString(fee)).append("\n");
    sb.append("    from: ").append(toIndentedString(from)).append("\n");
    sb.append("    to: ").append(toIndentedString(to)).append("\n");
    sb.append("    transactionHash: ").append(toIndentedString(transactionHash)).append("\n");
    sb.append("    transactionIndex: ").append(toIndentedString(transactionIndex)).append("\n");
    sb.append("    transferType: ").append(toIndentedString(transferType)).append("\n");
    sb.append("    typeInt: ").append(toIndentedString(typeInt)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    contract: ").append(toIndentedString(contract)).append("\n");
    sb.append("    formattedValue: ").append(toIndentedString(formattedValue)).append("\n");
    sb.append("    transaction: ").append(toIndentedString(transaction)).append("\n");
    sb.append("    tokenId: ").append(toIndentedString(tokenId)).append("\n");
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

