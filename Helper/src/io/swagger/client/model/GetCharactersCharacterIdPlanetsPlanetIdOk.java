package io.swagger.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.GetCharactersCharacterIdPlanetsPlanetIdLink;
import io.swagger.client.model.GetCharactersCharacterIdPlanetsPlanetIdPin;
import io.swagger.client.model.GetCharactersCharacterIdPlanetsPlanetIdRoute;
import java.util.ArrayList;
import java.util.List;

/**
 * 200 ok object
 */
@ApiModel(description = "200 ok object")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-04-25T18:43:46.078Z")
public class GetCharactersCharacterIdPlanetsPlanetIdOk {
  @SerializedName("links")
  private List<GetCharactersCharacterIdPlanetsPlanetIdLink> links = new ArrayList<GetCharactersCharacterIdPlanetsPlanetIdLink>();

  @SerializedName("pins")
  private List<GetCharactersCharacterIdPlanetsPlanetIdPin> pins = new ArrayList<GetCharactersCharacterIdPlanetsPlanetIdPin>();

  @SerializedName("routes")
  private List<GetCharactersCharacterIdPlanetsPlanetIdRoute> routes = new ArrayList<GetCharactersCharacterIdPlanetsPlanetIdRoute>();

  public GetCharactersCharacterIdPlanetsPlanetIdOk links(List<GetCharactersCharacterIdPlanetsPlanetIdLink> links) {
    this.links = links;
    return this;
  }

  public GetCharactersCharacterIdPlanetsPlanetIdOk addLinksItem(GetCharactersCharacterIdPlanetsPlanetIdLink linksItem) {
    this.links.add(linksItem);
    return this;
  }

   /**
   * links array
   * @return links
  **/
  @ApiModelProperty(required = true, value = "links array")
  public List<GetCharactersCharacterIdPlanetsPlanetIdLink> getLinks() {
    return links;
  }

  public void setLinks(List<GetCharactersCharacterIdPlanetsPlanetIdLink> links) {
    this.links = links;
  }

  public GetCharactersCharacterIdPlanetsPlanetIdOk pins(List<GetCharactersCharacterIdPlanetsPlanetIdPin> pins) {
    this.pins = pins;
    return this;
  }

  public GetCharactersCharacterIdPlanetsPlanetIdOk addPinsItem(GetCharactersCharacterIdPlanetsPlanetIdPin pinsItem) {
    this.pins.add(pinsItem);
    return this;
  }

   /**
   * pins array
   * @return pins
  **/
  @ApiModelProperty(required = true, value = "pins array")
  public List<GetCharactersCharacterIdPlanetsPlanetIdPin> getPins() {
    return pins;
  }

  public void setPins(List<GetCharactersCharacterIdPlanetsPlanetIdPin> pins) {
    this.pins = pins;
  }

  public GetCharactersCharacterIdPlanetsPlanetIdOk routes(List<GetCharactersCharacterIdPlanetsPlanetIdRoute> routes) {
    this.routes = routes;
    return this;
  }

  public GetCharactersCharacterIdPlanetsPlanetIdOk addRoutesItem(GetCharactersCharacterIdPlanetsPlanetIdRoute routesItem) {
    this.routes.add(routesItem);
    return this;
  }

   /**
   * routes array
   * @return routes
  **/
  @ApiModelProperty(required = true, value = "routes array")
  public List<GetCharactersCharacterIdPlanetsPlanetIdRoute> getRoutes() {
    return routes;
  }

  public void setRoutes(List<GetCharactersCharacterIdPlanetsPlanetIdRoute> routes) {
    this.routes = routes;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetCharactersCharacterIdPlanetsPlanetIdOk getCharactersCharacterIdPlanetsPlanetIdOk = (GetCharactersCharacterIdPlanetsPlanetIdOk) o;
    return Objects.equals(this.links, getCharactersCharacterIdPlanetsPlanetIdOk.links) &&
        Objects.equals(this.pins, getCharactersCharacterIdPlanetsPlanetIdOk.pins) &&
        Objects.equals(this.routes, getCharactersCharacterIdPlanetsPlanetIdOk.routes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(links, pins, routes);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetCharactersCharacterIdPlanetsPlanetIdOk {\n");
    
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    pins: ").append(toIndentedString(pins)).append("\n");
    sb.append("    routes: ").append(toIndentedString(routes)).append("\n");
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

