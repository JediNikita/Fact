package org.iadb.iic.apps.factcuid.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;

import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;

/**
 * RiskFacilityLGD
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-10-05T07:05:17.201Z[GMT]")
@Component

public class RiskFacilityLGD   {
  @JsonProperty("facilityId")
  private String facilityId = null;

  @JsonProperty("LGDPerc")
  private BigDecimal lgDPerc = null;

  @JsonProperty("expirationDate")
  private String expirationDate = null;

  @JsonProperty("approvedDatetime")
  private String approvedDatetime = null;

  public RiskFacilityLGD facilityId(String facilityId) {
    this.facilityId = facilityId;
    return this;
  }

  /**
   * Get facilityId
   * @return facilityId
  **/
  @ApiModelProperty(value = "")
  
    public String getFacilityId() {
    return facilityId;
  }

  public void setFacilityId(String facilityId) {
    this.facilityId = facilityId;
  }

  public RiskFacilityLGD lgDPerc(BigDecimal lgDPerc) {
    this.lgDPerc = lgDPerc;
    return this;
  }

  /**
   * Get lgDPerc
   * @return lgDPerc
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public BigDecimal getLgDPerc() {
    return lgDPerc;
  }

  public void setLgDPerc(BigDecimal lgDPerc) {
    this.lgDPerc = lgDPerc;
  }

  public RiskFacilityLGD expirationDate(String expirationDate) {
    this.expirationDate = expirationDate;
    return this;
  }

  /**
   * Get expirationDate
   * @return expirationDate
  **/
  @ApiModelProperty(value = "")
  
    public String getExpirationDate() {
    return expirationDate;
  }

  public void setExpirationDate(String expirationDate) {
    this.expirationDate = expirationDate;
  }

  public RiskFacilityLGD approvedDatetime(String approvedDatetime) {
    this.approvedDatetime = approvedDatetime;
    return this;
  }

  /**
   * Get approvedDatetime
   * @return approvedDatetime
  **/
  @ApiModelProperty(value = "")
  
    public String getApprovedDatetime() {
    return approvedDatetime;
  }

  public void setApprovedDatetime(String approvedDatetime) {
    this.approvedDatetime = approvedDatetime;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RiskFacilityLGD riskFacilityLGD = (RiskFacilityLGD) o;
    return Objects.equals(this.facilityId, riskFacilityLGD.facilityId) &&
        Objects.equals(this.lgDPerc, riskFacilityLGD.lgDPerc) &&
        Objects.equals(this.expirationDate, riskFacilityLGD.expirationDate) &&
        Objects.equals(this.approvedDatetime, riskFacilityLGD.approvedDatetime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(facilityId, lgDPerc, expirationDate, approvedDatetime);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RiskFacilityLGD {\n");
    
    sb.append("    facilityId: ").append(toIndentedString(facilityId)).append("\n");
    sb.append("    lgDPerc: ").append(toIndentedString(lgDPerc)).append("\n");
    sb.append("    expirationDate: ").append(toIndentedString(expirationDate)).append("\n");
    sb.append("    approvedDatetime: ").append(toIndentedString(approvedDatetime)).append("\n");
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
