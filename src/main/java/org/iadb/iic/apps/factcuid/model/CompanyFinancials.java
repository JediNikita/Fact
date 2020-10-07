package org.iadb.iic.apps.factcuid.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;

/**
 * CompanyFinancials
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-10-05T06:03:11.204Z[GMT]")
@Component

public class CompanyFinancials   {
  @JsonProperty("companyId")
  private String companyId = null;

  @JsonProperty("approvedPD")
  private String approvedPD = null;

  @JsonProperty("currentPercForPDGrade")
  private BigDecimal currentPercForPDGrade = null;

  @JsonProperty("PDInProcess")
  private String pdInProcess = null;

  @JsonProperty("factPDStatus")
  private String factPDStatus = null;

  @JsonProperty("isExpired")
  private Integer isExpired = null;

  @JsonProperty("expirationDate")
  private String expirationDate = null;

  @JsonProperty("approvedDateTime")
  private String approvedDateTime = null;

  @JsonProperty("lastPDRating")
  private String lastPDRating = null;

  @JsonProperty("totalAssets")
  private Double totalAssets = null;

  @JsonProperty("totalAssetsValidDate")
  private String totalAssetsValidDate = null;

  @JsonProperty("netIncome")
  private Double netIncome = null;

  @JsonProperty("netIncomeValidDate")
  private String netIncomeValidDate = null;

  @JsonProperty("totalEquity")
  private Double totalEquity = null;

  @JsonProperty("totalEquityValidDate")
  private String totalEquityValidDate = null;

  @JsonProperty("totalRevenue")
  private Double totalRevenue = null;

  @JsonProperty("totalRevenueValidDate")
  private String totalRevenueValidDate = null;

  public CompanyFinancials companyId(String companyId) {
    this.companyId = companyId;
    return this;
  }

  /**
   * Get companyId
   * @return companyId
  **/
  @ApiModelProperty(value = "")
  
    public String getCompanyId() {
    return companyId;
  }

  public void setCompanyId(String companyId) {
    this.companyId = companyId;
  }

  public CompanyFinancials approvedPD(String approvedPD) {
    this.approvedPD = approvedPD;
    return this;
  }

  /**
   * Get approvedPD
   * @return approvedPD
  **/
  @ApiModelProperty(value = "")
  
    public String getApprovedPD() {
    return approvedPD;
  }

  public void setApprovedPD(String approvedPD) {
    this.approvedPD = approvedPD;
  }

  public CompanyFinancials currentPercForPDGrade(BigDecimal currentPercForPDGrade) {
    this.currentPercForPDGrade = currentPercForPDGrade;
    return this;
  }

  /**
   * Get currentPercForPDGrade
   * @return currentPercForPDGrade
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public BigDecimal getCurrentPercForPDGrade() {
    return currentPercForPDGrade;
  }

  public void setCurrentPercForPDGrade(BigDecimal currentPercForPDGrade) {
    this.currentPercForPDGrade = currentPercForPDGrade;
  }

  public CompanyFinancials pdInProcess(String pdInProcess) {
    this.pdInProcess = pdInProcess;
    return this;
  }

  /**
   * Get pdInProcess
   * @return pdInProcess
  **/
  @ApiModelProperty(value = "")
  
    public String isPdInProcess() {
    return pdInProcess;
  }

  public void setPdInProcess(String pdInProcess) {
    this.pdInProcess = pdInProcess;
  }

  public CompanyFinancials factPDStatus(String factPDStatus) {
    this.factPDStatus = factPDStatus;
    return this;
  }

  /**
   * Get factPDStatus
   * @return factPDStatus
  **/
  @ApiModelProperty(value = "")
  
    public String getFactPDStatus() {
    return factPDStatus;
  }

  public void setFactPDStatus(String factPDStatus) {
    this.factPDStatus = factPDStatus;
  }

  public CompanyFinancials isExpired(Integer isExpired) {
    this.isExpired = isExpired;
    return this;
  }

  /**
   * Get isExpired
   * @return isExpired
  **/
  @ApiModelProperty(value = "")
  
    public Integer isIsExpired() {
    return isExpired;
  }

  public void setIsExpired(Integer isExpired) {
    this.isExpired = isExpired;
  }

  public CompanyFinancials expirationDate(String expirationDate) {
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

  public CompanyFinancials approvedDateTime(String approvedDateTime) {
    this.approvedDateTime = approvedDateTime;
    return this;
  }

  /**
   * Get approvedDateTime
   * @return approvedDateTime
  **/
  @ApiModelProperty(value = "")
  
    public String getApprovedDateTime() {
    return approvedDateTime;
  }

  public void setApprovedDateTime(String approvedDateTime) {
    this.approvedDateTime = approvedDateTime;
  }

  public CompanyFinancials lastPDRating(String lastPDRating) {
    this.lastPDRating = lastPDRating;
    return this;
  }

  /**
   * Get lastPDRating
   * @return lastPDRating
  **/
  @ApiModelProperty(value = "")
  
    public String getLastPDRating() {
    return lastPDRating;
  }

  public void setLastPDRating(String lastPDRating) {
    this.lastPDRating = lastPDRating;
  }

  public CompanyFinancials totalAssets(Double totalAssets) {
    this.totalAssets = totalAssets;
    return this;
  }

  /**
   * Get totalAssets
   * @return totalAssets
  **/
  @ApiModelProperty(value = "")
  
    public Double getTotalAssets() {
    return totalAssets;
  }

  public void setTotalAssets(Double totalAssets) {
    this.totalAssets = totalAssets;
  }

  public CompanyFinancials totalAssetsValidDate(String totalAssetsValidDate) {
    this.totalAssetsValidDate = totalAssetsValidDate;
    return this;
  }

  /**
   * Get totalAssetsValidDate
   * @return totalAssetsValidDate
  **/
  @ApiModelProperty(value = "")
  
    public String getTotalAssetsValidDate() {
    return totalAssetsValidDate;
  }

  public void setTotalAssetsValidDate(String totalAssetsValidDate) {
    this.totalAssetsValidDate = totalAssetsValidDate;
  }

  public CompanyFinancials netIncome(Double netIncome) {
    this.netIncome = netIncome;
    return this;
  }

  /**
   * Get netIncome
   * @return netIncome
  **/
  @ApiModelProperty(value = "")
  
    public Double getNetIncome() {
    return netIncome;
  }

  public void setNetIncome(Double d) {
    this.netIncome = d;
  }

  public CompanyFinancials netIncomeValidDate(String netIncomeValidDate) {
    this.netIncomeValidDate = netIncomeValidDate;
    return this;
  }

  /**
   * Get netIncomeValidDate
   * @return netIncomeValidDate
  **/
  @ApiModelProperty(value = "")
  
    public String getNetIncomeValidDate() {
    return netIncomeValidDate;
  }

  public void setNetIncomeValidDate(String netIncomeValidDate) {
    this.netIncomeValidDate = netIncomeValidDate;
  }

  public CompanyFinancials totalEquity(Double totalEquity) {
    this.totalEquity = totalEquity;
    return this;
  }

  /**
   * Get totalEquity
   * @return totalEquity
  **/
  @ApiModelProperty(value = "")
  
    public Double getTotalEquity() {
    return totalEquity;
  }

  public void setTotalEquity(Double totalEquity) {
    this.totalEquity = totalEquity;
  }

  public CompanyFinancials totalEquityValidDate(String totalEquityValidDate) {
    this.totalEquityValidDate = totalEquityValidDate;
    return this;
  }

  /**
   * Get totalEquityValidDate
   * @return totalEquityValidDate
  **/
  @ApiModelProperty(value = "")
  
    public String getTotalEquityValidDate() {
    return totalEquityValidDate;
  }

  public void setTotalEquityValidDate(String totalEquityValidDate) {
    this.totalEquityValidDate = totalEquityValidDate;
  }

  public CompanyFinancials totalRevenue(Double totalRevenue) {
    this.totalRevenue = totalRevenue;
    return this;
  }

  /**
   * Get totalRevenue
   * @return totalRevenue
  **/
  @ApiModelProperty(value = "")
  
    public Double getTotalRevenue() {
    return totalRevenue;
  }

  public void setTotalRevenue(Double totalRevenue) {
    this.totalRevenue = totalRevenue;
  }

  public CompanyFinancials totalRevenueValidDate(String totalRevenueValidDate) {
    this.totalRevenueValidDate = totalRevenueValidDate;
    return this;
  }

  /**
   * Get totalRevenueValidDate
   * @return totalRevenueValidDate
  **/
  @ApiModelProperty(value = "")
  
    public String getTotalRevenueValidDate() {
    return totalRevenueValidDate;
  }

  public void setTotalRevenueValidDate(String totalRevenueValidDate) {
    this.totalRevenueValidDate = totalRevenueValidDate;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CompanyFinancials companyFinancials = (CompanyFinancials) o;
    return Objects.equals(this.companyId, companyFinancials.companyId) &&
        Objects.equals(this.approvedPD, companyFinancials.approvedPD) &&
        Objects.equals(this.currentPercForPDGrade, companyFinancials.currentPercForPDGrade) &&
        Objects.equals(this.pdInProcess, companyFinancials.pdInProcess) &&
        Objects.equals(this.factPDStatus, companyFinancials.factPDStatus) &&
        Objects.equals(this.isExpired, companyFinancials.isExpired) &&
        Objects.equals(this.expirationDate, companyFinancials.expirationDate) &&
        Objects.equals(this.approvedDateTime, companyFinancials.approvedDateTime) &&
        Objects.equals(this.lastPDRating, companyFinancials.lastPDRating) &&
        Objects.equals(this.totalAssets, companyFinancials.totalAssets) &&
        Objects.equals(this.totalAssetsValidDate, companyFinancials.totalAssetsValidDate) &&
        Objects.equals(this.netIncome, companyFinancials.netIncome) &&
        Objects.equals(this.netIncomeValidDate, companyFinancials.netIncomeValidDate) &&
        Objects.equals(this.totalEquity, companyFinancials.totalEquity) &&
        Objects.equals(this.totalEquityValidDate, companyFinancials.totalEquityValidDate) &&
        Objects.equals(this.totalRevenue, companyFinancials.totalRevenue) &&
        Objects.equals(this.totalRevenueValidDate, companyFinancials.totalRevenueValidDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(companyId, approvedPD, currentPercForPDGrade, pdInProcess, factPDStatus, isExpired, expirationDate, approvedDateTime, lastPDRating, totalAssets, totalAssetsValidDate, netIncome, netIncomeValidDate, totalEquity, totalEquityValidDate, totalRevenue, totalRevenueValidDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CompanyFinancials {\n");
    
    sb.append("    companyId: ").append(toIndentedString(companyId)).append("\n");
    sb.append("    approvedPD: ").append(toIndentedString(approvedPD)).append("\n");
    sb.append("    currentPercForPDGrade: ").append(toIndentedString(currentPercForPDGrade)).append("\n");
    sb.append("    pdInProcess: ").append(toIndentedString(pdInProcess)).append("\n");
    sb.append("    factPDStatus: ").append(toIndentedString(factPDStatus)).append("\n");
    sb.append("    isExpired: ").append(toIndentedString(isExpired)).append("\n");
    sb.append("    expirationDate: ").append(toIndentedString(expirationDate)).append("\n");
    sb.append("    approvedDateTime: ").append(toIndentedString(approvedDateTime)).append("\n");
    sb.append("    lastPDRating: ").append(toIndentedString(lastPDRating)).append("\n");
    sb.append("    totalAssets: ").append(toIndentedString(totalAssets)).append("\n");
    sb.append("    totalAssetsValidDate: ").append(toIndentedString(totalAssetsValidDate)).append("\n");
    sb.append("    netIncome: ").append(toIndentedString(netIncome)).append("\n");
    sb.append("    netIncomeValidDate: ").append(toIndentedString(netIncomeValidDate)).append("\n");
    sb.append("    totalEquity: ").append(toIndentedString(totalEquity)).append("\n");
    sb.append("    totalEquityValidDate: ").append(toIndentedString(totalEquityValidDate)).append("\n");
    sb.append("    totalRevenue: ").append(toIndentedString(totalRevenue)).append("\n");
    sb.append("    totalRevenueValidDate: ").append(toIndentedString(totalRevenueValidDate)).append("\n");
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
