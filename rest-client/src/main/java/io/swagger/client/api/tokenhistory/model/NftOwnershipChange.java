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
 * NftOwnershipChange
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-09-08T01:26:53.182Z[GMT]")
public class NftOwnershipChange {
  @SerializedName("from")
  private String from = null;

  @SerializedName("to")
  private String to = null;

  @SerializedName("timestamp")
  private Long timestamp = null;

  public NftOwnershipChange from(String from) {
    this.from = from;
    return this;
  }

   /**
   * 보낸 사람 (직전 소유자) EOA 주소 (20-byte)
   * @return from
  **/
  @Schema(example = "0x5e47b195eeb11d72f5e1d27aebb6d341f1a9bedb", required = true, description = "보낸 사람 (직전 소유자) EOA 주소 (20-byte)")
  public String getFrom() {
    return from;
  }

  public void setFrom(String from) {
    this.from = from;
  }

  public NftOwnershipChange to(String to) {
    this.to = to;
    return this;
  }

   /**
   * 받은 사람 (이 시점의 소유자) EOA 주소 (20-byte)
   * @return to
  **/
  @Schema(example = "0xb4bf60383c64d47f2e667f2fe8f7ed0c9380f770", required = true, description = "받은 사람 (이 시점의 소유자) EOA 주소 (20-byte)")
  public String getTo() {
    return to;
  }

  public void setTo(String to) {
    this.to = to;
  }

  public NftOwnershipChange timestamp(Long timestamp) {
    this.timestamp = timestamp;
    return this;
  }

   /**
   * NFT 소유권이 변경된 시점 (timestamp)
   * @return timestamp
  **/
  @Schema(example = "1592180992", required = true, description = "NFT 소유권이 변경된 시점 (timestamp)")
  public Long getTimestamp() {
    return timestamp;
  }

  public void setTimestamp(Long timestamp) {
    this.timestamp = timestamp;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NftOwnershipChange nftOwnershipChange = (NftOwnershipChange) o;
    return Objects.equals(this.from, nftOwnershipChange.from) &&
        Objects.equals(this.to, nftOwnershipChange.to) &&
        Objects.equals(this.timestamp, nftOwnershipChange.timestamp);
  }

  @Override
  public int hashCode() {
    return Objects.hash(from, to, timestamp);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NftOwnershipChange {\n");
    
    sb.append("    from: ").append(toIndentedString(from)).append("\n");
    sb.append("    to: ").append(toIndentedString(to)).append("\n");
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
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
