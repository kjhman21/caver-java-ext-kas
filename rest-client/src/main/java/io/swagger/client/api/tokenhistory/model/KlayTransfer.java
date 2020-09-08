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
import io.swagger.v3.oas.annotations.media.Schema;

import java.util.Objects;

/**
 * KlayTransfer
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-09-08T01:26:53.182Z[GMT]")
public class KlayTransfer implements AnyOfTransferArrayItems {
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

  public KlayTransfer feePayer(String feePayer) {
    this.feePayer = feePayer;
    return this;
  }

   /**
   * 수수료 대납 계정 주소 (20-byte)
   * @return feePayer
  **/
  @Schema(example = "0xd0ea3e0eabaea095ea3ba231c043dbf8c0feb40a", required = true, description = "수수료 대납 계정 주소 (20-byte)")
  public String getFeePayer() {
    return feePayer;
  }

  public void setFeePayer(String feePayer) {
    this.feePayer = feePayer;
  }

  public KlayTransfer feeRatio(Integer feeRatio) {
    this.feeRatio = feeRatio;
    return this;
  }

   /**
   * 수수료 대납 비율
   * @return feeRatio
  **/
  @Schema(example = "100", required = true, description = "수수료 대납 비율")
  public Integer getFeeRatio() {
    return feeRatio;
  }

  public void setFeeRatio(Integer feeRatio) {
    this.feeRatio = feeRatio;
  }

  public KlayTransfer fee(String fee) {
    this.fee = fee;
    return this;
  }

   /**
   * 가스비
   * @return fee
  **/
  @Schema(example = "0xa455", required = true, description = "가스비")
  public String getFee() {
    return fee;
  }

  public void setFee(String fee) {
    this.fee = fee;
  }

  public KlayTransfer from(String from) {
    this.from = from;
    return this;
  }

   /**
   * 보낸 사람 EOA 주소 (20-byte)
   * @return from
  **/
  @Schema(example = "0x5e47b195eeb11d72f5e1d27aebb6d341f1a9bedb", required = true, description = "보낸 사람 EOA 주소 (20-byte)")
  public String getFrom() {
    return from;
  }

  public void setFrom(String from) {
    this.from = from;
  }

  public KlayTransfer to(String to) {
    this.to = to;
    return this;
  }

   /**
   * 받은 사람 EOA 주소 (20-byte)
   * @return to
  **/
  @Schema(example = "0xb4bf60383c64d47f2e667f2fe8f7ed0c9380f770", required = true, description = "받은 사람 EOA 주소 (20-byte)")
  public String getTo() {
    return to;
  }

  public void setTo(String to) {
    this.to = to;
  }

  public KlayTransfer transactionHash(String transactionHash) {
    this.transactionHash = transactionHash;
    return this;
  }

   /**
   * 트랜잭션 해시
   * @return transactionHash
  **/
  @Schema(example = "0xc4a32f41e829f50c4e8774be68864f522120a2047db2143b59b3919ebd9234f8", required = true, description = "트랜잭션 해시")
  public String getTransactionHash() {
    return transactionHash;
  }

  public void setTransactionHash(String transactionHash) {
    this.transactionHash = transactionHash;
  }

  public KlayTransfer transactionIndex(Integer transactionIndex) {
    this.transactionIndex = transactionIndex;
    return this;
  }

   /**
   * 트랜잭션 인덱스
   * @return transactionIndex
  **/
  @Schema(example = "1", required = true, description = "트랜잭션 인덱스")
  public Integer getTransactionIndex() {
    return transactionIndex;
  }

  public void setTransactionIndex(Integer transactionIndex) {
    this.transactionIndex = transactionIndex;
  }

  public KlayTransfer transferType(String transferType) {
    this.transferType = transferType;
    return this;
  }

   /**
   * 거래내역 유형
   * @return transferType
  **/
  @Schema(example = "klay", required = true, description = "거래내역 유형")
  public String getTransferType() {
    return transferType;
  }

  public void setTransferType(String transferType) {
    this.transferType = transferType;
  }

  public KlayTransfer typeInt(Integer typeInt) {
    this.typeInt = typeInt;
    return this;
  }

   /**
   * 트랜잭션 유형
   * @return typeInt
  **/
  @Schema(example = "50", required = true, description = "트랜잭션 유형")
  public Integer getTypeInt() {
    return typeInt;
  }

  public void setTypeInt(Integer typeInt) {
    this.typeInt = typeInt;
  }

  public KlayTransfer value(String value) {
    this.value = value;
    return this;
  }

   /**
   * KLAY 전송량 (16진수)
   * @return value
  **/
  @Schema(example = "0xa", required = true, description = "KLAY 전송량 (16진수)")
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
    KlayTransfer klayTransfer = (KlayTransfer) o;
    return Objects.equals(this.feePayer, klayTransfer.feePayer) &&
        Objects.equals(this.feeRatio, klayTransfer.feeRatio) &&
        Objects.equals(this.fee, klayTransfer.fee) &&
        Objects.equals(this.from, klayTransfer.from) &&
        Objects.equals(this.to, klayTransfer.to) &&
        Objects.equals(this.transactionHash, klayTransfer.transactionHash) &&
        Objects.equals(this.transactionIndex, klayTransfer.transactionIndex) &&
        Objects.equals(this.transferType, klayTransfer.transferType) &&
        Objects.equals(this.typeInt, klayTransfer.typeInt) &&
        Objects.equals(this.value, klayTransfer.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(feePayer, feeRatio, fee, from, to, transactionHash, transactionIndex, transferType, typeInt, value);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class KlayTransfer {\n");
    
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
