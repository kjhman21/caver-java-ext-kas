/*
 * KAS Token History API v0.7.0
 * # Types Token History API는 다음과 같은 타입을 사용합니다.   ## KlayTransfer | Field Name         | Description                     | Example           | Type   | |--------------------|---------------------------------|-------------------|--------| | `feePayer`         | 수수료 대납 계정 주소 (20-byte) | \"0x7e57...f602\"   | string | | `feeRatio`         | 수수료 대납 비율                | 50                | number | | `fee`              | 가스비                          | \"0x5e63748a64800\" | string | | `from`             | 보낸 사람 EOA 주소 (20-byte)    | \"0x2828...6e22\"   | string | | `status`           | status                          | 1                 | number | | `timestamp`        | 트랜잭션 발생 시간 (timestamp)  | 1592180992        | number | | `to`               | 받은 사람 EOA 주소 (20-byte)    | \"0xce8e...cbf4\"   | string | | `transactionHash`  | 트랜잭션 해시                   | \"0x618e...d8c1\"   | string | | `transactionIndex` | 트랜잭션 인덱스                 | 1                 | number | | `transferType`     | 거래내역 유형                   | \"klay\"            | string | | `typeInt`          | 트랜잭션 유형                   | 10                | number | | `value`            | KLAY 전송량 (16진수)            | \"0xa\"             | string |    ## FtTransfer | Field Name       | Description                  | Example                | Type          | |------------------|------------------------------|------------------------|---------------| | `contract`       | 연관 컨트랙트                | *omitted*              | `FtContract`  | | `formattedValue` | `decimal`을 적용한 변환값    | \"0.000000000000000002\" | string        | | `from`           | 보낸 사람 EOA 주소 (20-byte) | \"0x2828...6e22\"        | string        | | `to`             | 받은 사람 EOA 주소 (20-byte) | \"0xce8e...cbf4\"        | string        | | `transaction`    | 거래내역                     | *omitted*              | `Transaction` | | `transferType`   | 거래내역 유형                | \"ft\"                   | string        | | `value`          | 전송한 토큰 개수 (16진수)    | \"0x2\"                  | string        |  ## NftTransfer | Field Name     | Description                  | Example         | Type          | |----------------|------------------------------|-----------------|---------------| | `contract`     | 연관 컨트랙트                | *omitted*       | `NftContract` | | `from`         | 보낸 사람 EOA 주소 (20-byte) | \"0x2828...6e22\" | string        | | `to`           | 받은 사람 EOA 주소 (20-byte) | \"0xce8e...cbf4\" | string        | | `tokenId`      | 토큰 식별자 (16진수)         | \"0x1\"           | string        | | `transaction`  | 거래내역                     | *omitted*       | `Transaction` | | `transferType` | 거래내역 유형                | \"nft\"           | string        |   ## Transaction | Field Name        | Description                               | Example           | Type   | |-------------------|-------------------------------------------|-------------------|--------| | `feePayer`        | 수수료 대납 계정 주소 (20-byte)           | \"0x7e57...f602\"   | string | | `feeRatio`        | 수수료 대납 비율                          | 50                | number | | `fee`             | 가스비                                    | \"0x5e63748a64800\" | string | | `from`            | 트랜잭션을 전송한 사람 EOA 주소 (20-byte) | \"0x2828...6e22\"   | string | | `timestamp`       | 트랜잭션 발생 시간 (timestamp)            | 1592180992        | number | | `transactionHash` | 트랜잭션 해시 (32-byte)                   | \"0xa762...01bf\"   | string | | `typeInt`         | 트랜잭션 유형                             | 10                | number | | `value`           | KLAY 전송량 (16진수)                      | \"0xa\"             | string |     ## FtContract | Field Name | Description             | Example                                      | Type   | |------------|-------------------------|----------------------------------------------|--------| | `address`  | 컨트랙트 주소 (20-byte) | \"0xc7565d24af561fe783aa73747ca0eda1f09f1118\" | string | | `decimals` | 토큰 자릿수             | 10                                           | number | | `name`     | 컨트랙트 이름           | \"Test Contract\"                              | string | | `symbol`   | 컨트랙트 심볼           | \"TSTC\"                                       | string |        ## NftContract | Field Name | Description             | Example                                      | Type   | |------------|-------------------------|----------------------------------------------|--------| | `address`  | 컨트랙트 주소 (20-byte) | \"0xc7565d24af561fe783aa73747ca0eda1f09f1118\" | string | | `name`     | 컨트랙트 이름           | \"Test Contract\"                              | string | | `symbol`   | 컨트랙트 심볼           | \"TSTC\"                                       | string |  ## FtContractDetail | Field Name    | Description                                                                                                        | Example         | Type   | |---------------|--------------------------------------------------------------------------------------------------------------------|-----------------|--------| | `address`     | 컨트랙트 주소 (20-byte)                                                                                            | \"0xdc8c...9dd8\" | string | | `createdAt`   | 라벨링된 시점 (timestamp)                                                                                          | 1592180992      | number | | `decimals`    | 토큰 자릿수                                                                                                        | 8               | number | | `deletedAt`   | 라벨링이 삭제된 시점 (timestamp); 삭제되지 않았을 경우 0                                                           | 0               | number | | `link`        | 컨트랙트 고유 정보, 컨트랙트를 대표하는 이미지의 URL `icon`과<br /> 컨트랙트를 대표하는 웹사이트 URL `website` 값을 가짐 | *omitted*       | object | | `name`        | 컨트랙트 이름                                                                                                      | \"Test Coin\"     | string | | `symbol`      | 컨트랙트 심볼                                                                                                      | \"TSTC\"          | string | | `totalSupply` | 총 발행량 (16진수로 표기)                                                                                          | \"0x174876e800\"  | string | | `type`        | 컨트랙트 유형 (kip, erc)                                                                                           | \"kip\"           | string | | `updatedAt`   | 라벨링 정보가 마지막으로 변경된 시점 (timestamp)                                                                   | 1592180992      | number |  ## NftContractDetail | Field Name    | Description                                              | Example         | Type   | |---------------|----------------------------------------------------------|-----------------|--------| | `address`     | 컨트랙트 주소 (20-byte)                                  | \"0x04a9...446f\" | string | | `name`        | 컨트랙트 이름                                            | \"Test Coin\"     | string | | `symbol`      | 컨트랙트 심볼                                            | \"TSTC\"          | string | | `totalSupply` | 총 발행량 (16진수로 표기)                                | \"0x174876e800\"  | string | | `type`        | 컨트랙트 유형 (kip, erc)                                 | \"erc\"           | string | | `createdAt`   | 라벨링된 시점 (timestamp)                                | 1592180992      | number | | `updatedAt`   | 라벨링 정보가 마지막으로 변경된 시점 (timestamp)         | 1592180992      | number | | `deletedAt`   | 라벨링이 삭제된 시점 (timestamp); 삭제되지 않았을 경우 0 | 0               | number |   ## NFT | Field Name        | Description                                    | Example                           | Type   | |-------------------|------------------------------------------------|-----------------------------------|--------| | `owner`           | 소유자 EOA 주소 (20-byte)                      | \"0x3926...1f5a\"                   | string | | `previousOwner`   | 직전 소유자 EOA 주소 (20-byte)                 | \"0x09d9...776f\"                   | string | | `tokenId`         | 토큰 ID (16진수)                               | \"0x1\"                             | string | | `tokenUri`        | 토큰 고유의 URL                                | \"https://link.to/your/token.json\" | string | | `transactionHash` | 마지막 트랜잭션 해시 (32-byte)                 | \"0x13f3...30b0\"                   | string | | `createdAt`       | 토큰이 생성된 시점 (timestamp)                 | 1592180992                        | number | | `updatedAt`       | 토큰 정보가 마지막으로 변경된 시점 (timestamp) | 1592180992                        | number |    ## NftOwnershipChange | Field Name  | Description                      | Example         | Type   | |-------------|----------------------------------|-----------------|--------| | `from`      | 직전 소유자 EOA 주소 (20-byte)   | \"0x09d9...776f\" | string | | `timestamp` | 소유권이 변경된 시점 (timestamp) | 1592180992      | number | | `to`        | 소유자 EOA 주소 (20-byte)        | \"0x3926...1f5a\" | string |   
 *
 * OpenAPI spec version: 0.7.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.client.api.tokenhistory.v2.model;

import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;

import java.util.Objects;

/**
 * Nft
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-08-21T06:29:48.263Z")



public class Nft {
  @SerializedName("owner")
  private String owner = null;

  @SerializedName("previousOwner")
  private String previousOwner = null;

  @SerializedName("tokenId")
  private String tokenId = null;

  @SerializedName("tokenUri")
  private String tokenUri = null;

  @SerializedName("transactionHash")
  private String transactionHash = null;

  @SerializedName("createdAt")
  private Long createdAt = null;

  @SerializedName("updatedAt")
  private Long updatedAt = null;

  public Nft owner(String owner) {
    this.owner = owner;
    return this;
  }

   /**
   * Token owner address
   * @return owner
  **/
  @ApiModelProperty(example = "0x5e47b195eeb11d72f5e1d27aebb6d341f1a9bedb", required = true, value = "Token owner address")
  public String getOwner() {
    return owner;
  }

  public void setOwner(String owner) {
    this.owner = owner;
  }

  public Nft previousOwner(String previousOwner) {
    this.previousOwner = previousOwner;
    return this;
  }

   /**
   * Token&#39;s previous owner address
   * @return previousOwner
  **/
  @ApiModelProperty(example = "0xb4bf60383c64d47f2e667f2fe8f7ed0c9380f770", required = true, value = "Token's previous owner address")
  public String getPreviousOwner() {
    return previousOwner;
  }

  public void setPreviousOwner(String previousOwner) {
    this.previousOwner = previousOwner;
  }

  public Nft tokenId(String tokenId) {
    this.tokenId = tokenId;
    return this;
  }

   /**
   * Token identifier (hex)
   * @return tokenId
  **/
  @ApiModelProperty(example = "0x1", required = true, value = "Token identifier (hex)")
  public String getTokenId() {
    return tokenId;
  }

  public void setTokenId(String tokenId) {
    this.tokenId = tokenId;
  }

  public Nft tokenUri(String tokenUri) {
    this.tokenUri = tokenUri;
    return this;
  }

   /**
   * URL to a NFT description
   * @return tokenUri
  **/
  @ApiModelProperty(example = "https://link.to/nft/1", required = true, value = "URL to a NFT description")
  public String getTokenUri() {
    return tokenUri;
  }

  public void setTokenUri(String tokenUri) {
    this.tokenUri = tokenUri;
  }

  public Nft transactionHash(String transactionHash) {
    this.transactionHash = transactionHash;
    return this;
  }

   /**
   * Last transaction hash
   * @return transactionHash
  **/
  @ApiModelProperty(example = "0xc4a32f41e829f50c4e8774be68864f522120a2047db2143b59b3919ebd9234f8", required = true, value = "Last transaction hash")
  public String getTransactionHash() {
    return transactionHash;
  }

  public void setTransactionHash(String transactionHash) {
    this.transactionHash = transactionHash;
  }

  public Nft createdAt(Long createdAt) {
    this.createdAt = createdAt;
    return this;
  }

   /**
   * Contract labelled timestamp
   * @return createdAt
  **/
  @ApiModelProperty(required = true, value = "Contract labelled timestamp")
  public Long getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(Long createdAt) {
    this.createdAt = createdAt;
  }

  public Nft updatedAt(Long updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

   /**
   * Contract label updated timestamp
   * @return updatedAt
  **/
  @ApiModelProperty(required = true, value = "Contract label updated timestamp")
  public Long getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(Long updatedAt) {
    this.updatedAt = updatedAt;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Nft nft = (Nft) o;
    return Objects.equals(this.owner, nft.owner) &&
        Objects.equals(this.previousOwner, nft.previousOwner) &&
        Objects.equals(this.tokenId, nft.tokenId) &&
        Objects.equals(this.tokenUri, nft.tokenUri) &&
        Objects.equals(this.transactionHash, nft.transactionHash) &&
        Objects.equals(this.createdAt, nft.createdAt) &&
        Objects.equals(this.updatedAt, nft.updatedAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(owner, previousOwner, tokenId, tokenUri, transactionHash, createdAt, updatedAt);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Nft {\n");
    
    sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
    sb.append("    previousOwner: ").append(toIndentedString(previousOwner)).append("\n");
    sb.append("    tokenId: ").append(toIndentedString(tokenId)).append("\n");
    sb.append("    tokenUri: ").append(toIndentedString(tokenUri)).append("\n");
    sb.append("    transactionHash: ").append(toIndentedString(transactionHash)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
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
