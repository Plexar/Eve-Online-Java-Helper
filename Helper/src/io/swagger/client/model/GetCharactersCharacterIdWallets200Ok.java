package io.swagger.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * 200 ok object
 */
@ApiModel(description = "200 ok object")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-04-25T18:43:46.078Z")
public class GetCharactersCharacterIdWallets200Ok {
  @SerializedName("balance")
  private Long balance = null;

  @SerializedName("wallet_id")
  private Integer walletId = null;

  public GetCharactersCharacterIdWallets200Ok balance(Long balance) {
    this.balance = balance;
    return this;
  }

   /**
   * Wallet's balance in ISK hundredths.
   * @return balance
  **/
  @ApiModelProperty(value = "Wallet's balance in ISK hundredths.")
  public Long getBalance() {
    return balance;
  }

  public void setBalance(Long balance) {
    this.balance = balance;
  }

  public GetCharactersCharacterIdWallets200Ok walletId(Integer walletId) {
    this.walletId = walletId;
    return this;
  }

   /**
   * wallet_id integer
   * @return walletId
  **/
  @ApiModelProperty(value = "wallet_id integer")
  public Integer getWalletId() {
    return walletId;
  }

  public void setWalletId(Integer walletId) {
    this.walletId = walletId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetCharactersCharacterIdWallets200Ok getCharactersCharacterIdWallets200Ok = (GetCharactersCharacterIdWallets200Ok) o;
    return Objects.equals(this.balance, getCharactersCharacterIdWallets200Ok.balance) &&
        Objects.equals(this.walletId, getCharactersCharacterIdWallets200Ok.walletId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(balance, walletId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetCharactersCharacterIdWallets200Ok {\n");
    
    sb.append("    balance: ").append(toIndentedString(balance)).append("\n");
    sb.append("    walletId: ").append(toIndentedString(walletId)).append("\n");
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

