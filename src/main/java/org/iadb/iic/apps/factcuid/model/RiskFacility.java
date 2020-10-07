package org.iadb.iic.apps.factcuid.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

/**
 * RiskFacility
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-10-05T06:03:11.204Z[GMT]")
@Component

public class RiskFacility   {
  @JsonProperty("factId")
  private Integer factId = null;

  @JsonProperty("ProjId")
  private Integer projId = null;

  @JsonProperty("facLoanNumber")
  private String facLoanNumber = null;

  @JsonProperty("facNumber")
  private String facNumber = null;

  @JsonProperty("facOpusAmount")
  private Integer facOpusAmount = null;

  @JsonProperty("facDescription")
  private String facDescription = null;

  public RiskFacility factId(Integer factId) {
    this.factId = factId;
    return this;
  }

  /**
   * Get factId
   * @return factId
  **/
  @ApiModelProperty(value = "")
  
    public Integer getFactId() {
    return factId;
  }

  public void setFactId(Integer factId) {
    this.factId = factId;
  }

  public RiskFacility projId(Integer projId) {
    this.projId = projId;
    return this;
  }

  /**
   * Get projId
   * @return projId
  **/
  @ApiModelProperty(value = "")
  
    public Integer getProjId() {
    return projId;
  }

  public void setProjId(Integer projId) {
    this.projId = projId;
  }

  public RiskFacility facLoanNumber(String facLoanNumber) {
    this.facLoanNumber = facLoanNumber;
    return this;
  }

  /**
   * Get facLoanNumber
   * @return facLoanNumber
  **/
  @ApiModelProperty(value = "")
  
    public String getFacLoanNumber() {
    return facLoanNumber;
  }

  public void setFacLoanNumber(String facLoanNumber) {
    this.facLoanNumber = facLoanNumber;
  }

  public RiskFacility facNumber(String facNumber) {
    this.facNumber = facNumber;
    return this;
  }

  /**
   * Get facNumber
   * @return facNumber
  **/
  @ApiModelProperty(value = "")
  
    public String getFacNumber() {
    return facNumber;
  }

  public void setFacNumber(String facNumber) {
    this.facNumber = facNumber;
  }

  public RiskFacility facOpusAmount(Integer facOpusAmount) {
    this.facOpusAmount = facOpusAmount;
    return this;
  }

  /**
   * Get facOpusAmount
   * @return facOpusAmount
  **/
  @ApiModelProperty(value = "")
  
    public Integer getFacOpusAmount() {
    return facOpusAmount;
  }

  public void setFacOpusAmount(Integer facOpusAmount) {
    this.facOpusAmount = facOpusAmount;
  }

  public RiskFacility facDescription(String facDescription) {
    this.facDescription = facDescription;
    return this;
  }

  /**
   * Get facDescription
   * @return facDescription
  **/
  @ApiModelProperty(value = "")
  
    public String getFacDescription() {
    return facDescription;
  }

  public void setFacDescription(String facDescription) {
    this.facDescription = facDescription;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RiskFacility riskFacility = (RiskFacility) o;
    return Objects.equals(this.factId, riskFacility.factId) &&
        Objects.equals(this.projId, riskFacility.projId) &&
        Objects.equals(this.facLoanNumber, riskFacility.facLoanNumber) &&
        Objects.equals(this.facNumber, riskFacility.facNumber) &&
        Objects.equals(this.facOpusAmount, riskFacility.facOpusAmount) &&
        Objects.equals(this.facDescription, riskFacility.facDescription);
  }

  @Override
  public int hashCode() {
    return Objects.hash(factId, projId, facLoanNumber, facNumber, facOpusAmount, facDescription);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RiskFacility {\n");
    
    sb.append("    factId: ").append(toIndentedString(factId)).append("\n");
    sb.append("    projId: ").append(toIndentedString(projId)).append("\n");
    sb.append("    facLoanNumber: ").append(toIndentedString(facLoanNumber)).append("\n");
    sb.append("    facNumber: ").append(toIndentedString(facNumber)).append("\n");
    sb.append("    facOpusAmount: ").append(toIndentedString(facOpusAmount)).append("\n");
    sb.append("    facDescription: ").append(toIndentedString(facDescription)).append("\n");
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
