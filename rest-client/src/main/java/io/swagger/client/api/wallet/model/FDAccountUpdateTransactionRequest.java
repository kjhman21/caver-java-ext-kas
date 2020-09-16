/*
 * Wallet API
 * # Introduction Wallet API는 클레이튼 계정을 만들어 관리하고 트랜잭션을 전송하는 API입니다. Wallet API로 Klaytn 계정을 만들면 여러분은 개인키를 따로 관리할 필요가 없습니다. Wallet API는 BApp을 위해 Klaytn 계정 개인키를 안전하게 보관하는 지갑을 제공합니다. Wallet API 사용에 관한 자세한 내용은 [튜토리얼](링크)을 확인하십시오.  Wallet API는 크게 Klaytn 계정을 만들고 관리하는 Account 파트와 여러 종류의 트랜잭션을 전송하는 Transaction 파트로 나뉩니다.  Wallet API는 Klaytn 계정을 생성, 삭제, 모니터링하고 계정을 다중 서명 계정(Multisig 계정)으로 업데이트하며 KAS에 등록된 모든 계정의 개인키를 관리합니다.  또 Wallet API는 트랜잭션을 만들어 Klaytn에 전송합니다. 이 트랜잭션에는 다중 서명 계정이 보내는 트랜잭션도 포함됩니다. 다중 서명 시 임계값\\(Threshold\\)을 만족하면 트랜잭션은 Klaytn에 자동으로 전송됩니다. 다중 서명에 관한 자세한 내용은 [다음](링크)을 확인하십시오.  트랜잭션은 크게 기본 트랜잭션과 수수료 대납 트랜잭션으로 나뉩니다. 수수료 대납 트랜잭션은 크게 글로벌 수수료 대납 트랜잭션과 사용자 수수료 대납 트랜잭션으로 나뉩니다. 글로벌 수수료 대납 트랜잭션은 Ground X의 KAS 계정에서 트랜잭션 수수료를 일단 대납해주고 나중에 여러분에게 이 수수료를 청구하는 방식입니다. 사용자 수수료 대납 트랜잭션은 여러분이 직접 트랜잭션 수수료를 대납하는 계정을 만들고, 트랜잭션을 보낼 때 이 대납 계정이 트랜잭션 수수료를 납부하도록 하는 방식입니다.  Wallet API는 아래와 같은 기능 및 제약사항을 갖고 있습니다.  | Version | Item | Description | | :--- | :--- | :--- | | 2.0 | 제약사항 | Cypress(Mainnet), Baobab(Testnet) 지원\\(Service Chain 미지원\\) | |  |  | 외부 관리키에 대한 계정 관리 미지원 | |  |  | RLP 인코딩된 트랜잭션의 다중 서명 미지원 | |  | 계정관리 | 계정 생성, 조회, 삭제 | |  |  | 다중 서명 계정 업데이트 | |  | 트랜잭션 관리 | [Basic](https://ko.docs.klaytn.com/klaytn/design/transactions/basic) 트랜잭션 생성 및 전송 | |  |  | [FeeDelegatedWithRatio](https://ko.docs.klaytn.com/klaytn/design/transactions/partial-fee-delegation) 트랜잭션 생성 및 전송 | |  |  | RLP 인코딩된 트랜잭션\\([Legacy](https://ko.docs.klaytn.com/klaytn/design/transactions/basic#txtypelegacytransaction), [Basic](https://ko.docs.klaytn.com/klaytn/design/transactions/basic), [FeeDelegatedWithRatio](https://ko.docs.klaytn.com/klaytn/design/transactions/partial-fee-delegation)\\) 생성 및 전송 | |  |  | 다중 서명 트랜잭션 관리 및 전송 | |  | 관리자 | 리소스 풀 관리\\(생성, 풀 조회, 삭제, 계정 조회\\) |  
 *
 * OpenAPI spec version: 2.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package io.swagger.client.api.wallet.model;

import com.google.gson.annotations.SerializedName;
import io.swagger.v3.oas.annotations.media.Schema;

import java.util.Objects;

/**
 * 대납 계정 업데이트 트랜잭션 요청 스키마
 */
@Schema(description = "대납 계정 업데이트 트랜잭션 요청 스키마")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-09-16T01:51:46.881Z[GMT]")
public class FDAccountUpdateTransactionRequest {
  @SerializedName("from")
  private String from = null;

  @SerializedName("accountKey")
  private AccountUpdateKey accountKey = null;

  @SerializedName("nonce")
  private Long nonce = null;

  @SerializedName("gas")
  private Long gas = null;

  @SerializedName("submit")
  private Boolean submit = null;

  @SerializedName("feeRatio")
  private Long feeRatio = null;

  public FDAccountUpdateTransactionRequest from(String from) {
    this.from = from;
    return this;
  }

   /**
   * 트랜잭션을 보내는 Klaytn 계정 주소
   * @return from
  **/
  @Schema(example = "0x5bb85d4032354E88020595AFAFC081C24098202e", required = true, description = "트랜잭션을 보내는 Klaytn 계정 주소")
  public String getFrom() {
    return from;
  }

  public void setFrom(String from) {
    this.from = from;
  }

  public FDAccountUpdateTransactionRequest accountKey(AccountUpdateKey accountKey) {
    this.accountKey = accountKey;
    return this;
  }

   /**
   * Get accountKey
   * @return accountKey
  **/
  @Schema(description = "")
  public AccountUpdateKey getAccountKey() {
    return accountKey;
  }

  public void setAccountKey(AccountUpdateKey accountKey) {
    this.accountKey = accountKey;
  }

  public FDAccountUpdateTransactionRequest nonce(Long nonce) {
    this.nonce = nonce;
    return this;
  }

   /**
   * 보내는 트랜잭션을 식별하는 유일한 값
   * @return nonce
  **/
  @Schema(example = "0", description = "보내는 트랜잭션을 식별하는 유일한 값")
  public Long getNonce() {
    return nonce;
  }

  public void setNonce(Long nonce) {
    this.nonce = nonce;
  }

  public FDAccountUpdateTransactionRequest gas(Long gas) {
    this.gas = gas;
    return this;
  }

   /**
   * 해당 트랜잭션을 보낼 때 사용할 트랜잭션 수수료(gas)의 최대값
   * @return gas
  **/
  @Schema(example = "1000000", description = "해당 트랜잭션을 보낼 때 사용할 트랜잭션 수수료(gas)의 최대값")
  public Long getGas() {
    return gas;
  }

  public void setGas(Long gas) {
    this.gas = gas;
  }

  public FDAccountUpdateTransactionRequest submit(Boolean submit) {
    this.submit = submit;
    return this;
  }

   /**
   * 해당 트랜잭션을 Klaytn에 전송할지 여부
   * @return submit
  **/
  @Schema(example = "true", description = "해당 트랜잭션을 Klaytn에 전송할지 여부")
  public Boolean isSubmit() {
    return submit;
  }

  public void setSubmit(Boolean submit) {
    this.submit = submit;
  }

  public FDAccountUpdateTransactionRequest feeRatio(Long feeRatio) {
    this.feeRatio = feeRatio;
    return this;
  }

   /**
   * 전체 트랜잭션 수수료에서 수수료 대납자가 대납할 수수료의 비율(1~99)
   * @return feeRatio
  **/
  @Schema(example = "0", description = "전체 트랜잭션 수수료에서 수수료 대납자가 대납할 수수료의 비율(1~99)")
  public Long getFeeRatio() {
    return feeRatio;
  }

  public void setFeeRatio(Long feeRatio) {
    this.feeRatio = feeRatio;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FDAccountUpdateTransactionRequest fdAccountUpdateTransactionRequest = (FDAccountUpdateTransactionRequest) o;
    return Objects.equals(this.from, fdAccountUpdateTransactionRequest.from) &&
        Objects.equals(this.accountKey, fdAccountUpdateTransactionRequest.accountKey) &&
        Objects.equals(this.nonce, fdAccountUpdateTransactionRequest.nonce) &&
        Objects.equals(this.gas, fdAccountUpdateTransactionRequest.gas) &&
        Objects.equals(this.submit, fdAccountUpdateTransactionRequest.submit) &&
        Objects.equals(this.feeRatio, fdAccountUpdateTransactionRequest.feeRatio);
  }

  @Override
  public int hashCode() {
    return Objects.hash(from, accountKey, nonce, gas, submit, feeRatio);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FDAccountUpdateTransactionRequest {\n");
    
    sb.append("    from: ").append(toIndentedString(from)).append("\n");
    sb.append("    accountKey: ").append(toIndentedString(accountKey)).append("\n");
    sb.append("    nonce: ").append(toIndentedString(nonce)).append("\n");
    sb.append("    gas: ").append(toIndentedString(gas)).append("\n");
    sb.append("    submit: ").append(toIndentedString(submit)).append("\n");
    sb.append("    feeRatio: ").append(toIndentedString(feeRatio)).append("\n");
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
