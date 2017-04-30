package io.swagger.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.GetDogmaEffectsEffectIdModifier;
import java.util.ArrayList;
import java.util.List;

/**
 * 200 ok object
 */
@ApiModel(description = "200 ok object")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-04-25T18:43:46.078Z")
public class GetDogmaEffectsEffectIdOk {
  @SerializedName("description")
  private String description = null;

  @SerializedName("disallow_auto_repeat")
  private Boolean disallowAutoRepeat = null;

  @SerializedName("discharge_attribute_id")
  private Integer dischargeAttributeId = null;

  @SerializedName("display_name")
  private String displayName = null;

  @SerializedName("duration_attribute_id")
  private Integer durationAttributeId = null;

  @SerializedName("effect_category")
  private Integer effectCategory = null;

  @SerializedName("effect_id")
  private Integer effectId = null;

  @SerializedName("electronic_chance")
  private Boolean electronicChance = null;

  @SerializedName("falloff_attribute_id")
  private Integer falloffAttributeId = null;

  @SerializedName("icon_id")
  private Integer iconId = null;

  @SerializedName("is_assistance")
  private Boolean isAssistance = null;

  @SerializedName("is_offensive")
  private Boolean isOffensive = null;

  @SerializedName("is_warp_safe")
  private Boolean isWarpSafe = null;

  @SerializedName("modifiers")
  private List<GetDogmaEffectsEffectIdModifier> modifiers = new ArrayList<GetDogmaEffectsEffectIdModifier>();

  @SerializedName("name")
  private String name = null;

  @SerializedName("post_expression")
  private Integer postExpression = null;

  @SerializedName("pre_expression")
  private Integer preExpression = null;

  @SerializedName("published")
  private Boolean published = null;

  @SerializedName("range_attribute_id")
  private Integer rangeAttributeId = null;

  @SerializedName("range_chance")
  private Boolean rangeChance = null;

  @SerializedName("tracking_speed_attribute_id")
  private Integer trackingSpeedAttributeId = null;

  public GetDogmaEffectsEffectIdOk description(String description) {
    this.description = description;
    return this;
  }

   /**
   * description string
   * @return description
  **/
  @ApiModelProperty(value = "description string")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public GetDogmaEffectsEffectIdOk disallowAutoRepeat(Boolean disallowAutoRepeat) {
    this.disallowAutoRepeat = disallowAutoRepeat;
    return this;
  }

   /**
   * disallow_auto_repeat boolean
   * @return disallowAutoRepeat
  **/
  @ApiModelProperty(value = "disallow_auto_repeat boolean")
  public Boolean getDisallowAutoRepeat() {
    return disallowAutoRepeat;
  }

  public void setDisallowAutoRepeat(Boolean disallowAutoRepeat) {
    this.disallowAutoRepeat = disallowAutoRepeat;
  }

  public GetDogmaEffectsEffectIdOk dischargeAttributeId(Integer dischargeAttributeId) {
    this.dischargeAttributeId = dischargeAttributeId;
    return this;
  }

   /**
   * discharge_attribute_id integer
   * @return dischargeAttributeId
  **/
  @ApiModelProperty(value = "discharge_attribute_id integer")
  public Integer getDischargeAttributeId() {
    return dischargeAttributeId;
  }

  public void setDischargeAttributeId(Integer dischargeAttributeId) {
    this.dischargeAttributeId = dischargeAttributeId;
  }

  public GetDogmaEffectsEffectIdOk displayName(String displayName) {
    this.displayName = displayName;
    return this;
  }

   /**
   * display_name string
   * @return displayName
  **/
  @ApiModelProperty(value = "display_name string")
  public String getDisplayName() {
    return displayName;
  }

  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }

  public GetDogmaEffectsEffectIdOk durationAttributeId(Integer durationAttributeId) {
    this.durationAttributeId = durationAttributeId;
    return this;
  }

   /**
   * duration_attribute_id integer
   * @return durationAttributeId
  **/
  @ApiModelProperty(value = "duration_attribute_id integer")
  public Integer getDurationAttributeId() {
    return durationAttributeId;
  }

  public void setDurationAttributeId(Integer durationAttributeId) {
    this.durationAttributeId = durationAttributeId;
  }

  public GetDogmaEffectsEffectIdOk effectCategory(Integer effectCategory) {
    this.effectCategory = effectCategory;
    return this;
  }

   /**
   * effect_category integer
   * @return effectCategory
  **/
  @ApiModelProperty(value = "effect_category integer")
  public Integer getEffectCategory() {
    return effectCategory;
  }

  public void setEffectCategory(Integer effectCategory) {
    this.effectCategory = effectCategory;
  }

  public GetDogmaEffectsEffectIdOk effectId(Integer effectId) {
    this.effectId = effectId;
    return this;
  }

   /**
   * effect_id integer
   * @return effectId
  **/
  @ApiModelProperty(required = true, value = "effect_id integer")
  public Integer getEffectId() {
    return effectId;
  }

  public void setEffectId(Integer effectId) {
    this.effectId = effectId;
  }

  public GetDogmaEffectsEffectIdOk electronicChance(Boolean electronicChance) {
    this.electronicChance = electronicChance;
    return this;
  }

   /**
   * electronic_chance boolean
   * @return electronicChance
  **/
  @ApiModelProperty(value = "electronic_chance boolean")
  public Boolean getElectronicChance() {
    return electronicChance;
  }

  public void setElectronicChance(Boolean electronicChance) {
    this.electronicChance = electronicChance;
  }

  public GetDogmaEffectsEffectIdOk falloffAttributeId(Integer falloffAttributeId) {
    this.falloffAttributeId = falloffAttributeId;
    return this;
  }

   /**
   * falloff_attribute_id integer
   * @return falloffAttributeId
  **/
  @ApiModelProperty(value = "falloff_attribute_id integer")
  public Integer getFalloffAttributeId() {
    return falloffAttributeId;
  }

  public void setFalloffAttributeId(Integer falloffAttributeId) {
    this.falloffAttributeId = falloffAttributeId;
  }

  public GetDogmaEffectsEffectIdOk iconId(Integer iconId) {
    this.iconId = iconId;
    return this;
  }

   /**
   * icon_id integer
   * @return iconId
  **/
  @ApiModelProperty(value = "icon_id integer")
  public Integer getIconId() {
    return iconId;
  }

  public void setIconId(Integer iconId) {
    this.iconId = iconId;
  }

  public GetDogmaEffectsEffectIdOk isAssistance(Boolean isAssistance) {
    this.isAssistance = isAssistance;
    return this;
  }

   /**
   * is_assistance boolean
   * @return isAssistance
  **/
  @ApiModelProperty(value = "is_assistance boolean")
  public Boolean getIsAssistance() {
    return isAssistance;
  }

  public void setIsAssistance(Boolean isAssistance) {
    this.isAssistance = isAssistance;
  }

  public GetDogmaEffectsEffectIdOk isOffensive(Boolean isOffensive) {
    this.isOffensive = isOffensive;
    return this;
  }

   /**
   * is_offensive boolean
   * @return isOffensive
  **/
  @ApiModelProperty(value = "is_offensive boolean")
  public Boolean getIsOffensive() {
    return isOffensive;
  }

  public void setIsOffensive(Boolean isOffensive) {
    this.isOffensive = isOffensive;
  }

  public GetDogmaEffectsEffectIdOk isWarpSafe(Boolean isWarpSafe) {
    this.isWarpSafe = isWarpSafe;
    return this;
  }

   /**
   * is_warp_safe boolean
   * @return isWarpSafe
  **/
  @ApiModelProperty(value = "is_warp_safe boolean")
  public Boolean getIsWarpSafe() {
    return isWarpSafe;
  }

  public void setIsWarpSafe(Boolean isWarpSafe) {
    this.isWarpSafe = isWarpSafe;
  }

  public GetDogmaEffectsEffectIdOk modifiers(List<GetDogmaEffectsEffectIdModifier> modifiers) {
    this.modifiers = modifiers;
    return this;
  }

  public GetDogmaEffectsEffectIdOk addModifiersItem(GetDogmaEffectsEffectIdModifier modifiersItem) {
    this.modifiers.add(modifiersItem);
    return this;
  }

   /**
   * modifiers array
   * @return modifiers
  **/
  @ApiModelProperty(value = "modifiers array")
  public List<GetDogmaEffectsEffectIdModifier> getModifiers() {
    return modifiers;
  }

  public void setModifiers(List<GetDogmaEffectsEffectIdModifier> modifiers) {
    this.modifiers = modifiers;
  }

  public GetDogmaEffectsEffectIdOk name(String name) {
    this.name = name;
    return this;
  }

   /**
   * name string
   * @return name
  **/
  @ApiModelProperty(value = "name string")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public GetDogmaEffectsEffectIdOk postExpression(Integer postExpression) {
    this.postExpression = postExpression;
    return this;
  }

   /**
   * post_expression integer
   * @return postExpression
  **/
  @ApiModelProperty(value = "post_expression integer")
  public Integer getPostExpression() {
    return postExpression;
  }

  public void setPostExpression(Integer postExpression) {
    this.postExpression = postExpression;
  }

  public GetDogmaEffectsEffectIdOk preExpression(Integer preExpression) {
    this.preExpression = preExpression;
    return this;
  }

   /**
   * pre_expression integer
   * @return preExpression
  **/
  @ApiModelProperty(value = "pre_expression integer")
  public Integer getPreExpression() {
    return preExpression;
  }

  public void setPreExpression(Integer preExpression) {
    this.preExpression = preExpression;
  }

  public GetDogmaEffectsEffectIdOk published(Boolean published) {
    this.published = published;
    return this;
  }

   /**
   * published boolean
   * @return published
  **/
  @ApiModelProperty(value = "published boolean")
  public Boolean getPublished() {
    return published;
  }

  public void setPublished(Boolean published) {
    this.published = published;
  }

  public GetDogmaEffectsEffectIdOk rangeAttributeId(Integer rangeAttributeId) {
    this.rangeAttributeId = rangeAttributeId;
    return this;
  }

   /**
   * range_attribute_id integer
   * @return rangeAttributeId
  **/
  @ApiModelProperty(value = "range_attribute_id integer")
  public Integer getRangeAttributeId() {
    return rangeAttributeId;
  }

  public void setRangeAttributeId(Integer rangeAttributeId) {
    this.rangeAttributeId = rangeAttributeId;
  }

  public GetDogmaEffectsEffectIdOk rangeChance(Boolean rangeChance) {
    this.rangeChance = rangeChance;
    return this;
  }

   /**
   * range_chance boolean
   * @return rangeChance
  **/
  @ApiModelProperty(value = "range_chance boolean")
  public Boolean getRangeChance() {
    return rangeChance;
  }

  public void setRangeChance(Boolean rangeChance) {
    this.rangeChance = rangeChance;
  }

  public GetDogmaEffectsEffectIdOk trackingSpeedAttributeId(Integer trackingSpeedAttributeId) {
    this.trackingSpeedAttributeId = trackingSpeedAttributeId;
    return this;
  }

   /**
   * tracking_speed_attribute_id integer
   * @return trackingSpeedAttributeId
  **/
  @ApiModelProperty(value = "tracking_speed_attribute_id integer")
  public Integer getTrackingSpeedAttributeId() {
    return trackingSpeedAttributeId;
  }

  public void setTrackingSpeedAttributeId(Integer trackingSpeedAttributeId) {
    this.trackingSpeedAttributeId = trackingSpeedAttributeId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetDogmaEffectsEffectIdOk getDogmaEffectsEffectIdOk = (GetDogmaEffectsEffectIdOk) o;
    return Objects.equals(this.description, getDogmaEffectsEffectIdOk.description) &&
        Objects.equals(this.disallowAutoRepeat, getDogmaEffectsEffectIdOk.disallowAutoRepeat) &&
        Objects.equals(this.dischargeAttributeId, getDogmaEffectsEffectIdOk.dischargeAttributeId) &&
        Objects.equals(this.displayName, getDogmaEffectsEffectIdOk.displayName) &&
        Objects.equals(this.durationAttributeId, getDogmaEffectsEffectIdOk.durationAttributeId) &&
        Objects.equals(this.effectCategory, getDogmaEffectsEffectIdOk.effectCategory) &&
        Objects.equals(this.effectId, getDogmaEffectsEffectIdOk.effectId) &&
        Objects.equals(this.electronicChance, getDogmaEffectsEffectIdOk.electronicChance) &&
        Objects.equals(this.falloffAttributeId, getDogmaEffectsEffectIdOk.falloffAttributeId) &&
        Objects.equals(this.iconId, getDogmaEffectsEffectIdOk.iconId) &&
        Objects.equals(this.isAssistance, getDogmaEffectsEffectIdOk.isAssistance) &&
        Objects.equals(this.isOffensive, getDogmaEffectsEffectIdOk.isOffensive) &&
        Objects.equals(this.isWarpSafe, getDogmaEffectsEffectIdOk.isWarpSafe) &&
        Objects.equals(this.modifiers, getDogmaEffectsEffectIdOk.modifiers) &&
        Objects.equals(this.name, getDogmaEffectsEffectIdOk.name) &&
        Objects.equals(this.postExpression, getDogmaEffectsEffectIdOk.postExpression) &&
        Objects.equals(this.preExpression, getDogmaEffectsEffectIdOk.preExpression) &&
        Objects.equals(this.published, getDogmaEffectsEffectIdOk.published) &&
        Objects.equals(this.rangeAttributeId, getDogmaEffectsEffectIdOk.rangeAttributeId) &&
        Objects.equals(this.rangeChance, getDogmaEffectsEffectIdOk.rangeChance) &&
        Objects.equals(this.trackingSpeedAttributeId, getDogmaEffectsEffectIdOk.trackingSpeedAttributeId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, disallowAutoRepeat, dischargeAttributeId, displayName, durationAttributeId, effectCategory, effectId, electronicChance, falloffAttributeId, iconId, isAssistance, isOffensive, isWarpSafe, modifiers, name, postExpression, preExpression, published, rangeAttributeId, rangeChance, trackingSpeedAttributeId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetDogmaEffectsEffectIdOk {\n");
    
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    disallowAutoRepeat: ").append(toIndentedString(disallowAutoRepeat)).append("\n");
    sb.append("    dischargeAttributeId: ").append(toIndentedString(dischargeAttributeId)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    durationAttributeId: ").append(toIndentedString(durationAttributeId)).append("\n");
    sb.append("    effectCategory: ").append(toIndentedString(effectCategory)).append("\n");
    sb.append("    effectId: ").append(toIndentedString(effectId)).append("\n");
    sb.append("    electronicChance: ").append(toIndentedString(electronicChance)).append("\n");
    sb.append("    falloffAttributeId: ").append(toIndentedString(falloffAttributeId)).append("\n");
    sb.append("    iconId: ").append(toIndentedString(iconId)).append("\n");
    sb.append("    isAssistance: ").append(toIndentedString(isAssistance)).append("\n");
    sb.append("    isOffensive: ").append(toIndentedString(isOffensive)).append("\n");
    sb.append("    isWarpSafe: ").append(toIndentedString(isWarpSafe)).append("\n");
    sb.append("    modifiers: ").append(toIndentedString(modifiers)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    postExpression: ").append(toIndentedString(postExpression)).append("\n");
    sb.append("    preExpression: ").append(toIndentedString(preExpression)).append("\n");
    sb.append("    published: ").append(toIndentedString(published)).append("\n");
    sb.append("    rangeAttributeId: ").append(toIndentedString(rangeAttributeId)).append("\n");
    sb.append("    rangeChance: ").append(toIndentedString(rangeChance)).append("\n");
    sb.append("    trackingSpeedAttributeId: ").append(toIndentedString(trackingSpeedAttributeId)).append("\n");
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

