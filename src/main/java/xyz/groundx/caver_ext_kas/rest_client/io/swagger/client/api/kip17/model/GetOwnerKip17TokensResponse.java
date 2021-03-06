/*
 * KIP-17 API
 *   # Error Codes  ## 400: Bad Request   | Code | Messages |   | --- | --- |   | 1100050 | incorrect request 1100101 | data don't exist 1100251 | its value is out of range; size 1104401 | failed to get an account |   ## 404: Not Found   | Code | Messages |   | --- | --- |   | 1104404 | Token not found |   ## 409: Conflict   | Code | Messages |   | --- | --- |   | 1104400 | Duplicate alias - test |  
 *
 * OpenAPI spec version: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package xyz.groundx.caver_ext_kas.rest_client.io.swagger.client.api.kip17.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import xyz.groundx.caver_ext_kas.rest_client.io.swagger.client.api.kip17.model.GetOwnerKip17TokensResponseItem;
/**
 * GetOwnerKip17TokensResponse
 */


public class GetOwnerKip17TokensResponse {
  @SerializedName("cursor")
  private String cursor = null;

  @SerializedName("items")
  private List<GetOwnerKip17TokensResponseItem> items = new ArrayList<GetOwnerKip17TokensResponseItem>();

  public GetOwnerKip17TokensResponse cursor(String cursor) {
    this.cursor = cursor;
    return this;
  }

   /**
   * Offset for the next batch
   * @return cursor
  **/
  @Schema(required = true, description = "Offset for the next batch")
  public String getCursor() {
    return cursor;
  }

  public void setCursor(String cursor) {
    this.cursor = cursor;
  }

  public GetOwnerKip17TokensResponse items(List<GetOwnerKip17TokensResponseItem> items) {
    this.items = items;
    return this;
  }

  public GetOwnerKip17TokensResponse addItemsItem(GetOwnerKip17TokensResponseItem itemsItem) {
    this.items.add(itemsItem);
    return this;
  }

   /**
   * Get items
   * @return items
  **/
  @Schema(required = true, description = "")
  public List<GetOwnerKip17TokensResponseItem> getItems() {
    return items;
  }

  public void setItems(List<GetOwnerKip17TokensResponseItem> items) {
    this.items = items;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetOwnerKip17TokensResponse getOwnerKip17TokensResponse = (GetOwnerKip17TokensResponse) o;
    return Objects.equals(this.cursor, getOwnerKip17TokensResponse.cursor) &&
        Objects.equals(this.items, getOwnerKip17TokensResponse.items);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cursor, items);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetOwnerKip17TokensResponse {\n");
    
    sb.append("    cursor: ").append(toIndentedString(cursor)).append("\n");
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
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
