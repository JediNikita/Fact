package org.iadb.iic.apps.factcuid.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import org.threeten.bp.LocalDate;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Company
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-09-30T13:53:20.150Z")




public class Company   {
  @JsonProperty("id")
  private Long id = null;

  @JsonProperty("companyIdNumber")
  private Long companyIdNumber = null;

  @JsonProperty("companyName")
  private String companyName = null;

  @JsonProperty("domicileCountryISO")
  private String domicileCountryISO = null;

  /**
   * Active/Inactive Portfolio
   */
  public enum PortfolioEnum {
    ACTIVE("active"),
    
    INACTIVE("inactive");

    private String value;

    PortfolioEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static PortfolioEnum fromValue(String text) {
      for (PortfolioEnum b : PortfolioEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("portfolio")
  private PortfolioEnum portfolio = null;

  @JsonProperty("lastPdRating")
  private BigDecimal lastPdRating = null;

  @JsonProperty("companyType")
  private String companyType = null;

  @JsonProperty("companyModel")
  private String companyModel = null;

  @JsonProperty("companySector")
  private String companySector = null;

  @JsonProperty("companySpreadType")
  private String companySpreadType = null;

  @JsonProperty("companyLockMask")
  private Integer companyLockMask = null;

  @JsonProperty("companyCreationDate")
  private LocalDate companyCreationDate = null;

  @JsonProperty("companyCreationUser")
  private Integer companyCreationUser = null;

  @JsonProperty("companyModificationDate")
  private LocalDate companyModificationDate = null;

  @JsonProperty("companyModificationUser")
  private Integer companyModificationUser = null;

  @JsonProperty("approvedPD")
  private Integer approvedPD = null;

  @JsonProperty("currentPercForPdGrade")
  private Integer currentPercForPdGrade = null;

  @JsonProperty("pdInProcess")
  private Boolean pdInProcess = null;

  @JsonProperty("factPdStatus")
  private Boolean factPdStatus = null;

  @JsonProperty("isExpired")
  private Boolean isExpired = null;

  @JsonProperty("expirationDate")
  private LocalDate expirationDate = null;

  @JsonProperty("approvedDateTime")
  private LocalDate approvedDateTime = null;

  @JsonProperty("totalAssets")
  private BigDecimal totalAssets = null;

  @JsonProperty("netIncome")
  private BigDecimal netIncome = null;

  @JsonProperty("totalEquity")
  private BigDecimal totalEquity = null;

  @JsonProperty("annualRevenue")
  private BigDecimal annualRevenue = null;

  @JsonProperty("year")
  private Integer year = null;

  @JsonProperty("orgUniqueId")
  private Integer orgUniqueId = null;

  @JsonProperty("economicGroupName")
  private String economicGroupName = null;

  @JsonProperty("riskSectorName")
  private String riskSectorName = null;

  public Company id(Long id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(value = "")


  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public Company companyIdNumber(Long companyIdNumber) {
    this.companyIdNumber = companyIdNumber;
    return this;
  }

  /**
   * Get companyIdNumber
   * @return companyIdNumber
  **/
  @ApiModelProperty(value = "")


  public Long getCompanyIdNumber() {
    return companyIdNumber;
  }

  public void setCompanyIdNumber(Long companyIdNumber) {
    this.companyIdNumber = companyIdNumber;
  }

  public Company companyName(String companyName) {
    this.companyName = companyName;
    return this;
  }

  /**
   * Get companyName
   * @return companyName
  **/
  @ApiModelProperty(value = "")


  public String getCompanyName() {
    return companyName;
  }

  public void setCompanyName(String companyName) {
    this.companyName = companyName;
  }

  public Company domicileCountryISO(String domicileCountryISO) {
    this.domicileCountryISO = domicileCountryISO;
    return this;
  }

  /**
   * Get domicileCountryISO
   * @return domicileCountryISO
  **/
  @ApiModelProperty(value = "")


  public String getDomicileCountryISO() {
    return domicileCountryISO;
  }

  public void setDomicileCountryISO(String domicileCountryISO) {
    this.domicileCountryISO = domicileCountryISO;
  }

  public Company portfolio(PortfolioEnum portfolio) {
    this.portfolio = portfolio;
    return this;
  }

  /**
   * Active/Inactive Portfolio
   * @return portfolio
  **/
  @ApiModelProperty(value = "Active/Inactive Portfolio")


  public PortfolioEnum getPortfolio() {
    return portfolio;
  }

  public void setPortfolio(PortfolioEnum portfolio) {
    this.portfolio = portfolio;
  }

  public Company lastPdRating(BigDecimal lastPdRating) {
    this.lastPdRating = lastPdRating;
    return this;
  }

  /**
   * Last probability of default rating of the company
   * @return lastPdRating
  **/
  @ApiModelProperty(value = "Last probability of default rating of the company")

  @Valid

  public BigDecimal getLastPdRating() {
    return lastPdRating;
  }

  public void setLastPdRating(BigDecimal lastPdRating) {
    this.lastPdRating = lastPdRating;
  }

  public Company companyType(String companyType) {
    this.companyType = companyType;
    return this;
  }

  /**
   * Get companyType
   * @return companyType
  **/
  @ApiModelProperty(value = "")


  public String getCompanyType() {
    return companyType;
  }

  public void setCompanyType(String companyType) {
    this.companyType = companyType;
  }

  public Company companyModel(String companyModel) {
    this.companyModel = companyModel;
    return this;
  }

  /**
   * Get companyModel
   * @return companyModel
  **/
  @ApiModelProperty(value = "")


  public String getCompanyModel() {
    return companyModel;
  }

  public void setCompanyModel(String companyModel) {
    this.companyModel = companyModel;
  }

  public Company companySector(String companySector) {
    this.companySector = companySector;
    return this;
  }

  /**
   * Get companySector
   * @return companySector
  **/
  @ApiModelProperty(value = "")


  public String getCompanySector() {
    return companySector;
  }

  public void setCompanySector(String companySector) {
    this.companySector = companySector;
  }

  public Company companySpreadType(String companySpreadType) {
    this.companySpreadType = companySpreadType;
    return this;
  }

  /**
   * Get companySpreadType
   * @return companySpreadType
  **/
  @ApiModelProperty(value = "")


  public String getCompanySpreadType() {
    return companySpreadType;
  }

  public void setCompanySpreadType(String companySpreadType) {
    this.companySpreadType = companySpreadType;
  }

  public Company companyLockMask(Integer companyLockMask) {
    this.companyLockMask = companyLockMask;
    return this;
  }

  /**
   * internal fact field defaulted to a constant value
   * @return companyLockMask
  **/
  @ApiModelProperty(value = "internal fact field defaulted to a constant value")


  public Integer getCompanyLockMask() {
    return companyLockMask;
  }

  public void setCompanyLockMask(Integer companyLockMask) {
    this.companyLockMask = companyLockMask;
  }

  public Company companyCreationDate(LocalDate companyCreationDate) {
    this.companyCreationDate = companyCreationDate;
    return this;
  }

  /**
   * date of creation
   * @return companyCreationDate
  **/
  @ApiModelProperty(value = "date of creation")

  @Valid

  public LocalDate getCompanyCreationDate() {
    return companyCreationDate;
  }

  public void setCompanyCreationDate(LocalDate companyCreationDate) {
    this.companyCreationDate = companyCreationDate;
  }

  public Company companyCreationUser(Integer companyCreationUser) {
    this.companyCreationUser = companyCreationUser;
    return this;
  }

  /**
   * fact user id
   * @return companyCreationUser
  **/
  @ApiModelProperty(value = "fact user id")


  public Integer getCompanyCreationUser() {
    return companyCreationUser;
  }

  public void setCompanyCreationUser(Integer companyCreationUser) {
    this.companyCreationUser = companyCreationUser;
  }

  public Company companyModificationDate(LocalDate companyModificationDate) {
    this.companyModificationDate = companyModificationDate;
    return this;
  }

  /**
   * date of modification
   * @return companyModificationDate
  **/
  @ApiModelProperty(value = "date of modification")

  @Valid

  public LocalDate getCompanyModificationDate() {
    return companyModificationDate;
  }

  public void setCompanyModificationDate(LocalDate companyModificationDate) {
    this.companyModificationDate = companyModificationDate;
  }

  public Company companyModificationUser(Integer companyModificationUser) {
    this.companyModificationUser = companyModificationUser;
    return this;
  }

  /**
   * fact user id
   * @return companyModificationUser
  **/
  @ApiModelProperty(value = "fact user id")


  public Integer getCompanyModificationUser() {
    return companyModificationUser;
  }

  public void setCompanyModificationUser(Integer companyModificationUser) {
    this.companyModificationUser = companyModificationUser;
  }

  public Company approvedPD(Integer approvedPD) {
    this.approvedPD = approvedPD;
    return this;
  }

  /**
   * PD value post rating workflow completion
   * @return approvedPD
  **/
  @ApiModelProperty(value = "PD value post rating workflow completion")


  public Integer getApprovedPD() {
    return approvedPD;
  }

  public void setApprovedPD(Integer approvedPD) {
    this.approvedPD = approvedPD;
  }

  public Company currentPercForPdGrade(Integer currentPercForPdGrade) {
    this.currentPercForPdGrade = currentPercForPdGrade;
    return this;
  }

  /**
   * numeric equivalent to pd calculated as per metric provided by S&P
   * @return currentPercForPdGrade
  **/
  @ApiModelProperty(value = "numeric equivalent to pd calculated as per metric provided by S&P")


  public Integer getCurrentPercForPdGrade() {
    return currentPercForPdGrade;
  }

  public void setCurrentPercForPdGrade(Integer currentPercForPdGrade) {
    this.currentPercForPdGrade = currentPercForPdGrade;
  }

  public Company pdInProcess(Boolean pdInProcess) {
    this.pdInProcess = pdInProcess;
    return this;
  }

  /**
   * whether pd not yet approved but in process
   * @return pdInProcess
  **/
  @ApiModelProperty(value = "whether pd not yet approved but in process")


  public Boolean isPdInProcess() {
    return pdInProcess;
  }

  public void setPdInProcess(Boolean pdInProcess) {
    this.pdInProcess = pdInProcess;
  }

  public Company factPdStatus(Boolean factPdStatus) {
    this.factPdStatus = factPdStatus;
    return this;
  }

  /**
   * whether any changes in pd
   * @return factPdStatus
  **/
  @ApiModelProperty(value = "whether any changes in pd")


  public Boolean isFactPdStatus() {
    return factPdStatus;
  }

  public void setFactPdStatus(Boolean factPdStatus) {
    this.factPdStatus = factPdStatus;
  }

  public Company isExpired(Boolean isExpired) {
    this.isExpired = isExpired;
    return this;
  }

  /**
   * flag to mark expired PD
   * @return isExpired
  **/
  @ApiModelProperty(value = "flag to mark expired PD")


  public Boolean isIsExpired() {
    return isExpired;
  }

  public void setIsExpired(Boolean isExpired) {
    this.isExpired = isExpired;
  }

  public Company expirationDate(LocalDate expirationDate) {
    this.expirationDate = expirationDate;
    return this;
  }

  /**
   * PD expiration date
   * @return expirationDate
  **/
  @ApiModelProperty(value = "PD expiration date")

  @Valid

  public LocalDate getExpirationDate() {
    return expirationDate;
  }

  public void setExpirationDate(LocalDate expirationDate) {
    this.expirationDate = expirationDate;
  }

  public Company approvedDateTime(LocalDate approvedDateTime) {
    this.approvedDateTime = approvedDateTime;
    return this;
  }

  /**
   * PD workflow approval date time
   * @return approvedDateTime
  **/
  @ApiModelProperty(value = "PD workflow approval date time")

  @Valid

  public LocalDate getApprovedDateTime() {
    return approvedDateTime;
  }

  public void setApprovedDateTime(LocalDate approvedDateTime) {
    this.approvedDateTime = approvedDateTime;
  }

  public Company totalAssets(BigDecimal totalAssets) {
    this.totalAssets = totalAssets;
    return this;
  }

  /**
   * total assets of the company from the statement used to generate the PD
   * @return totalAssets
  **/
  @ApiModelProperty(value = "total assets of the company from the statement used to generate the PD")

  @Valid

  public BigDecimal getTotalAssets() {
    return totalAssets;
  }

  public void setTotalAssets(BigDecimal totalAssets) {
    this.totalAssets = totalAssets;
  }

  public Company netIncome(BigDecimal netIncome) {
    this.netIncome = netIncome;
    return this;
  }

  /**
   * netIncome of the company from the statement used to generate the PD
   * @return netIncome
  **/
  @ApiModelProperty(value = "netIncome of the company from the statement used to generate the PD")

  @Valid

  public BigDecimal getNetIncome() {
    return netIncome;
  }

  public void setNetIncome(BigDecimal netIncome) {
    this.netIncome = netIncome;
  }

  public Company totalEquity(BigDecimal totalEquity) {
    this.totalEquity = totalEquity;
    return this;
  }

  /**
   * total equity of the company from the statement used to generate the PD
   * @return totalEquity
  **/
  @ApiModelProperty(value = "total equity of the company from the statement used to generate the PD")

  @Valid

  public BigDecimal getTotalEquity() {
    return totalEquity;
  }

  public void setTotalEquity(BigDecimal totalEquity) {
    this.totalEquity = totalEquity;
  }

  public Company annualRevenue(BigDecimal annualRevenue) {
    this.annualRevenue = annualRevenue;
    return this;
  }

  /**
   * annual revenue of the company from the statement used to generate the PD
   * @return annualRevenue
  **/
  @ApiModelProperty(value = "annual revenue of the company from the statement used to generate the PD")

  @Valid

  public BigDecimal getAnnualRevenue() {
    return annualRevenue;
  }

  public void setAnnualRevenue(BigDecimal annualRevenue) {
    this.annualRevenue = annualRevenue;
  }

  public Company year(Integer year) {
    this.year = year;
    return this;
  }

  /**
   * year as in the financial statement used to generate the PD
   * @return year
  **/
  @ApiModelProperty(value = "year as in the financial statement used to generate the PD")


  public Integer getYear() {
    return year;
  }

  public void setYear(Integer year) {
    this.year = year;
  }

  public Company orgUniqueId(Integer orgUniqueId) {
    this.orgUniqueId = orgUniqueId;
    return this;
  }

  /**
   * Get orgUniqueId
   * @return orgUniqueId
  **/
  @ApiModelProperty(value = "")


  public Integer getOrgUniqueId() {
    return orgUniqueId;
  }

  public void setOrgUniqueId(Integer orgUniqueId) {
    this.orgUniqueId = orgUniqueId;
  }

  public Company economicGroupName(String economicGroupName) {
    this.economicGroupName = economicGroupName;
    return this;
  }

  /**
   * Get economicGroupName
   * @return economicGroupName
  **/
  @ApiModelProperty(value = "")


  public String getEconomicGroupName() {
    return economicGroupName;
  }

  public void setEconomicGroupName(String economicGroupName) {
    this.economicGroupName = economicGroupName;
  }

  public Company riskSectorName(String riskSectorName) {
    this.riskSectorName = riskSectorName;
    return this;
  }

  /**
   * Get riskSectorName
   * @return riskSectorName
  **/
  @ApiModelProperty(value = "")


  public String getRiskSectorName() {
    return riskSectorName;
  }

  public void setRiskSectorName(String riskSectorName) {
    this.riskSectorName = riskSectorName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Company company = (Company) o;
    return Objects.equals(this.id, company.id) &&
        Objects.equals(this.companyIdNumber, company.companyIdNumber) &&
        Objects.equals(this.companyName, company.companyName) &&
        Objects.equals(this.domicileCountryISO, company.domicileCountryISO) &&
        Objects.equals(this.portfolio, company.portfolio) &&
        Objects.equals(this.lastPdRating, company.lastPdRating) &&
        Objects.equals(this.companyType, company.companyType) &&
        Objects.equals(this.companyModel, company.companyModel) &&
        Objects.equals(this.companySector, company.companySector) &&
        Objects.equals(this.companySpreadType, company.companySpreadType) &&
        Objects.equals(this.companyLockMask, company.companyLockMask) &&
        Objects.equals(this.companyCreationDate, company.companyCreationDate) &&
        Objects.equals(this.companyCreationUser, company.companyCreationUser) &&
        Objects.equals(this.companyModificationDate, company.companyModificationDate) &&
        Objects.equals(this.companyModificationUser, company.companyModificationUser) &&
        Objects.equals(this.approvedPD, company.approvedPD) &&
        Objects.equals(this.currentPercForPdGrade, company.currentPercForPdGrade) &&
        Objects.equals(this.pdInProcess, company.pdInProcess) &&
        Objects.equals(this.factPdStatus, company.factPdStatus) &&
        Objects.equals(this.isExpired, company.isExpired) &&
        Objects.equals(this.expirationDate, company.expirationDate) &&
        Objects.equals(this.approvedDateTime, company.approvedDateTime) &&
        Objects.equals(this.totalAssets, company.totalAssets) &&
        Objects.equals(this.netIncome, company.netIncome) &&
        Objects.equals(this.totalEquity, company.totalEquity) &&
        Objects.equals(this.annualRevenue, company.annualRevenue) &&
        Objects.equals(this.year, company.year) &&
        Objects.equals(this.orgUniqueId, company.orgUniqueId) &&
        Objects.equals(this.economicGroupName, company.economicGroupName) &&
        Objects.equals(this.riskSectorName, company.riskSectorName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, companyIdNumber, companyName, domicileCountryISO, portfolio, lastPdRating, companyType, companyModel, companySector, companySpreadType, companyLockMask, companyCreationDate, companyCreationUser, companyModificationDate, companyModificationUser, approvedPD, currentPercForPdGrade, pdInProcess, factPdStatus, isExpired, expirationDate, approvedDateTime, totalAssets, netIncome, totalEquity, annualRevenue, year, orgUniqueId, economicGroupName, riskSectorName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Company {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    companyIdNumber: ").append(toIndentedString(companyIdNumber)).append("\n");
    sb.append("    companyName: ").append(toIndentedString(companyName)).append("\n");
    sb.append("    domicileCountryISO: ").append(toIndentedString(domicileCountryISO)).append("\n");
    sb.append("    portfolio: ").append(toIndentedString(portfolio)).append("\n");
    sb.append("    lastPdRating: ").append(toIndentedString(lastPdRating)).append("\n");
    sb.append("    companyType: ").append(toIndentedString(companyType)).append("\n");
    sb.append("    companyModel: ").append(toIndentedString(companyModel)).append("\n");
    sb.append("    companySector: ").append(toIndentedString(companySector)).append("\n");
    sb.append("    companySpreadType: ").append(toIndentedString(companySpreadType)).append("\n");
    sb.append("    companyLockMask: ").append(toIndentedString(companyLockMask)).append("\n");
    sb.append("    companyCreationDate: ").append(toIndentedString(companyCreationDate)).append("\n");
    sb.append("    companyCreationUser: ").append(toIndentedString(companyCreationUser)).append("\n");
    sb.append("    companyModificationDate: ").append(toIndentedString(companyModificationDate)).append("\n");
    sb.append("    companyModificationUser: ").append(toIndentedString(companyModificationUser)).append("\n");
    sb.append("    approvedPD: ").append(toIndentedString(approvedPD)).append("\n");
    sb.append("    currentPercForPdGrade: ").append(toIndentedString(currentPercForPdGrade)).append("\n");
    sb.append("    pdInProcess: ").append(toIndentedString(pdInProcess)).append("\n");
    sb.append("    factPdStatus: ").append(toIndentedString(factPdStatus)).append("\n");
    sb.append("    isExpired: ").append(toIndentedString(isExpired)).append("\n");
    sb.append("    expirationDate: ").append(toIndentedString(expirationDate)).append("\n");
    sb.append("    approvedDateTime: ").append(toIndentedString(approvedDateTime)).append("\n");
    sb.append("    totalAssets: ").append(toIndentedString(totalAssets)).append("\n");
    sb.append("    netIncome: ").append(toIndentedString(netIncome)).append("\n");
    sb.append("    totalEquity: ").append(toIndentedString(totalEquity)).append("\n");
    sb.append("    annualRevenue: ").append(toIndentedString(annualRevenue)).append("\n");
    sb.append("    year: ").append(toIndentedString(year)).append("\n");
    sb.append("    orgUniqueId: ").append(toIndentedString(orgUniqueId)).append("\n");
    sb.append("    economicGroupName: ").append(toIndentedString(economicGroupName)).append("\n");
    sb.append("    riskSectorName: ").append(toIndentedString(riskSectorName)).append("\n");
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

