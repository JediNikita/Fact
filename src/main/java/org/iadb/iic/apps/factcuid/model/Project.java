package org.iadb.iic.apps.factcuid.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import org.threeten.bp.LocalDate;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Project
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-10-03T11:06:16.982Z")




public class Project   {
  @JsonProperty("id")
  private Long id = null;

  @JsonProperty("companyId")
  private Long companyId = null;

  @JsonProperty("elementId")
  private Long elementId = null;

  @JsonProperty("userGroupId")
  private Long userGroupId = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("number")
  private String number = null;

  @JsonProperty("operationNumber")
  private String operationNumber = null;

  @JsonProperty("opusOtherCompanyCount")
  private Long opusOtherCompanyCount = null;

  @JsonProperty("opusSector")
  private String opusSector = null;

  @JsonProperty("opusSection")
  private String opusSection = null;

  @JsonProperty("lockMask")
  private Integer lockMask = null;

  @JsonProperty("creationDate")
  private LocalDate creationDate = null;

  @JsonProperty("creationUser")
  private Integer creationUser = null;

  @JsonProperty("modificationDate")
  private LocalDate modificationDate = null;

  @JsonProperty("modificationUser")
  private Integer modificationUser = null;

  @JsonProperty("analysisDate")
  private LocalDate analysisDate = null;

  @JsonProperty("status")
  private String status = null;

  @JsonProperty("colpathJurisdictionCountryISO")
  private Long colpathJurisdictionCountryISO = null;

  @JsonProperty("senpathJurisdictionCountryISO")
  private Long senpathJurisdictionCountryISO = null;

  @JsonProperty("sectorFacilitySenpath")
  private Long sectorFacilitySenpath = null;

  @JsonProperty("sectorFacilityColpath")
  private Long sectorFacilityColpath = null;

  @JsonProperty("activeStatus")
  private String activeStatus = null;

  @JsonProperty("isHistorical")
  private Integer isHistorical = null;

  @JsonProperty("historicalProjectId")
  private Long historicalProjectId = null;

  @JsonProperty("companyFinalPDRating")
  private BigDecimal companyFinalPDRating = null;

  @JsonProperty("maestroCreatorId")
  private Integer maestroCreatorId = null;

  public Project id(Long id) {
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

  public Project companyId(Long companyId) {
    this.companyId = companyId;
    return this;
  }

  /**
   * Get companyId
   * @return companyId
  **/
  @ApiModelProperty(value = "")


  public Long getCompanyId() {
    return companyId;
  }

  public void setCompanyId(Long companyId) {
    this.companyId = companyId;
  }

  public Project elementId(Long elementId) {
    this.elementId = elementId;
    return this;
  }

  /**
   * Get elementId
   * @return elementId
  **/
  @ApiModelProperty(value = "")


  public Long getElementId() {
    return elementId;
  }

  public void setElementId(Long elementId) {
    this.elementId = elementId;
  }

  public Project userGroupId(Long userGroupId) {
    this.userGroupId = userGroupId;
    return this;
  }

  /**
   * Get userGroupId
   * @return userGroupId
  **/
  @ApiModelProperty(value = "")


  public Long getUserGroupId() {
    return userGroupId;
  }

  public void setUserGroupId(Long userGroupId) {
    this.userGroupId = userGroupId;
  }

  public Project name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(value = "")


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Project number(String number) {
    this.number = number;
    return this;
  }

  /**
   * Get number
   * @return number
  **/
  @ApiModelProperty(value = "")


  public String getNumber() {
    return number;
  }

  public void setNumber(String number) {
    this.number = number;
  }

  public Project operationNumber(String operationNumber) {
    this.operationNumber = operationNumber;
    return this;
  }

  /**
   * Get operationNumber
   * @return operationNumber
  **/
  @ApiModelProperty(value = "")


  public String getOperationNumber() {
    return operationNumber;
  }

  public void setOperationNumber(String operationNumber) {
    this.operationNumber = operationNumber;
  }

  public Project opusOtherCompanyCount(Long opusOtherCompanyCount) {
    this.opusOtherCompanyCount = opusOtherCompanyCount;
    return this;
  }

  /**
   * Get opusOtherCompanyCount
   * @return opusOtherCompanyCount
  **/
  @ApiModelProperty(value = "")


  public Long getOpusOtherCompanyCount() {
    return opusOtherCompanyCount;
  }

  public void setOpusOtherCompanyCount(Long opusOtherCompanyCount) {
    this.opusOtherCompanyCount = opusOtherCompanyCount;
  }

  public Project opusSector(String opusSector) {
    this.opusSector = opusSector;
    return this;
  }

  /**
   * Get opusSector
   * @return opusSector
  **/
  @ApiModelProperty(value = "")


  public String getOpusSector() {
    return opusSector;
  }

  public void setOpusSector(String opusSector) {
    this.opusSector = opusSector;
  }

  public Project opusSection(String opusSection) {
    this.opusSection = opusSection;
    return this;
  }

  /**
   * Get opusSection
   * @return opusSection
  **/
  @ApiModelProperty(value = "")


  public String getOpusSection() {
    return opusSection;
  }

  public void setOpusSection(String opusSection) {
    this.opusSection = opusSection;
  }

  public Project lockMask(Integer lockMask) {
    this.lockMask = lockMask;
    return this;
  }

  /**
   * internal fact field defaulted to a constant value
   * @return lockMask
  **/
  @ApiModelProperty(value = "internal fact field defaulted to a constant value")


  public Integer getLockMask() {
    return lockMask;
  }

  public void setLockMask(Integer lockMask) {
    this.lockMask = lockMask;
  }

  public Project creationDate(LocalDate creationDate) {
    this.creationDate = creationDate;
    return this;
  }

  /**
   * date time of creation of project in fact
   * @return creationDate
  **/
  @ApiModelProperty(value = "date time of creation of project in fact")

  @Valid

  public LocalDate getCreationDate() {
    return creationDate;
  }

  public void setCreationDate(LocalDate creationDate) {
    this.creationDate = creationDate;
  }

  public Project creationUser(Integer creationUser) {
    this.creationUser = creationUser;
    return this;
  }

  /**
   * fact user id
   * @return creationUser
  **/
  @ApiModelProperty(value = "fact user id")


  public Integer getCreationUser() {
    return creationUser;
  }

  public void setCreationUser(Integer creationUser) {
    this.creationUser = creationUser;
  }

  public Project modificationDate(LocalDate modificationDate) {
    this.modificationDate = modificationDate;
    return this;
  }

  /**
   * date time of creation of project in fact
   * @return modificationDate
  **/
  @ApiModelProperty(value = "date time of creation of project in fact")

  @Valid

  public LocalDate getModificationDate() {
    return modificationDate;
  }

  public void setModificationDate(LocalDate modificationDate) {
    this.modificationDate = modificationDate;
  }

  public Project modificationUser(Integer modificationUser) {
    this.modificationUser = modificationUser;
    return this;
  }

  /**
   * fact user id
   * @return modificationUser
  **/
  @ApiModelProperty(value = "fact user id")


  public Integer getModificationUser() {
    return modificationUser;
  }

  public void setModificationUser(Integer modificationUser) {
    this.modificationUser = modificationUser;
  }

  public Project analysisDate(LocalDate analysisDate) {
    this.analysisDate = analysisDate;
    return this;
  }

  /**
   * date time of LGD creation
   * @return analysisDate
  **/
  @ApiModelProperty(value = "date time of LGD creation")

  @Valid

  public LocalDate getAnalysisDate() {
    return analysisDate;
  }

  public void setAnalysisDate(LocalDate analysisDate) {
    this.analysisDate = analysisDate;
  }

  public Project status(String status) {
    this.status = status;
    return this;
  }

  /**
   * values taken are 'ready for workflow' 'draft created'
   * @return status
  **/
  @ApiModelProperty(value = "values taken are 'ready for workflow' 'draft created'")


  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public Project colpathJurisdictionCountryISO(Long colpathJurisdictionCountryISO) {
    this.colpathJurisdictionCountryISO = colpathJurisdictionCountryISO;
    return this;
  }

  /**
   * Get colpathJurisdictionCountryISO
   * @return colpathJurisdictionCountryISO
  **/
  @ApiModelProperty(value = "")


  public Long getColpathJurisdictionCountryISO() {
    return colpathJurisdictionCountryISO;
  }

  public void setColpathJurisdictionCountryISO(Long colpathJurisdictionCountryISO) {
    this.colpathJurisdictionCountryISO = colpathJurisdictionCountryISO;
  }

  public Project senpathJurisdictionCountryISO(Long senpathJurisdictionCountryISO) {
    this.senpathJurisdictionCountryISO = senpathJurisdictionCountryISO;
    return this;
  }

  /**
   * Get senpathJurisdictionCountryISO
   * @return senpathJurisdictionCountryISO
  **/
  @ApiModelProperty(value = "")


  public Long getSenpathJurisdictionCountryISO() {
    return senpathJurisdictionCountryISO;
  }

  public void setSenpathJurisdictionCountryISO(Long senpathJurisdictionCountryISO) {
    this.senpathJurisdictionCountryISO = senpathJurisdictionCountryISO;
  }

  public Project sectorFacilitySenpath(Long sectorFacilitySenpath) {
    this.sectorFacilitySenpath = sectorFacilitySenpath;
    return this;
  }

  /**
   * Get sectorFacilitySenpath
   * @return sectorFacilitySenpath
  **/
  @ApiModelProperty(value = "")


  public Long getSectorFacilitySenpath() {
    return sectorFacilitySenpath;
  }

  public void setSectorFacilitySenpath(Long sectorFacilitySenpath) {
    this.sectorFacilitySenpath = sectorFacilitySenpath;
  }

  public Project sectorFacilityColpath(Long sectorFacilityColpath) {
    this.sectorFacilityColpath = sectorFacilityColpath;
    return this;
  }

  /**
   * Get sectorFacilityColpath
   * @return sectorFacilityColpath
  **/
  @ApiModelProperty(value = "")


  public Long getSectorFacilityColpath() {
    return sectorFacilityColpath;
  }

  public void setSectorFacilityColpath(Long sectorFacilityColpath) {
    this.sectorFacilityColpath = sectorFacilityColpath;
  }

  public Project activeStatus(String activeStatus) {
    this.activeStatus = activeStatus;
    return this;
  }

  /**
   * active/inactive
   * @return activeStatus
  **/
  @ApiModelProperty(value = "active/inactive")


  public String getActiveStatus() {
    return activeStatus;
  }

  public void setActiveStatus(String activeStatus) {
    this.activeStatus = activeStatus;
  }

  public Project isHistorical(Integer isHistorical) {
    this.isHistorical = isHistorical;
    return this;
  }

  /**
   * Get isHistorical
   * @return isHistorical
  **/
  @ApiModelProperty(value = "")


  public Integer getIsHistorical() {
    return isHistorical;
  }

  public void setIsHistorical(Integer isHistorical) {
    this.isHistorical = isHistorical;
  }

  public Project historicalProjectId(Long historicalProjectId) {
    this.historicalProjectId = historicalProjectId;
    return this;
  }

  /**
   * Get historicalProjectId
   * @return historicalProjectId
  **/
  @ApiModelProperty(value = "")


  public Long getHistoricalProjectId() {
    return historicalProjectId;
  }

  public void setHistoricalProjectId(Long historicalProjectId) {
    this.historicalProjectId = historicalProjectId;
  }

  public Project companyFinalPDRating(BigDecimal companyFinalPDRating) {
    this.companyFinalPDRating = companyFinalPDRating;
    return this;
  }

  /**
   * Get companyFinalPDRating
   * @return companyFinalPDRating
  **/
  @ApiModelProperty(value = "")

  @Valid

  public BigDecimal getCompanyFinalPDRating() {
    return companyFinalPDRating;
  }

  public void setCompanyFinalPDRating(BigDecimal companyFinalPDRating) {
    this.companyFinalPDRating = companyFinalPDRating;
  }

  public Project maestroCreatorId(Integer maestroCreatorId) {
    this.maestroCreatorId = maestroCreatorId;
    return this;
  }

  /**
   * Get maestroCreatorId
   * @return maestroCreatorId
  **/
  @ApiModelProperty(value = "")


  public Integer getMaestroCreatorId() {
    return maestroCreatorId;
  }

  public void setMaestroCreatorId(Integer maestroCreatorId) {
    this.maestroCreatorId = maestroCreatorId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Project project = (Project) o;
    return Objects.equals(this.id, project.id) &&
        Objects.equals(this.companyId, project.companyId) &&
        Objects.equals(this.elementId, project.elementId) &&
        Objects.equals(this.userGroupId, project.userGroupId) &&
        Objects.equals(this.name, project.name) &&
        Objects.equals(this.number, project.number) &&
        Objects.equals(this.operationNumber, project.operationNumber) &&
        Objects.equals(this.opusOtherCompanyCount, project.opusOtherCompanyCount) &&
        Objects.equals(this.opusSector, project.opusSector) &&
        Objects.equals(this.opusSection, project.opusSection) &&
        Objects.equals(this.lockMask, project.lockMask) &&
        Objects.equals(this.creationDate, project.creationDate) &&
        Objects.equals(this.creationUser, project.creationUser) &&
        Objects.equals(this.modificationDate, project.modificationDate) &&
        Objects.equals(this.modificationUser, project.modificationUser) &&
        Objects.equals(this.analysisDate, project.analysisDate) &&
        Objects.equals(this.status, project.status) &&
        Objects.equals(this.colpathJurisdictionCountryISO, project.colpathJurisdictionCountryISO) &&
        Objects.equals(this.senpathJurisdictionCountryISO, project.senpathJurisdictionCountryISO) &&
        Objects.equals(this.sectorFacilitySenpath, project.sectorFacilitySenpath) &&
        Objects.equals(this.sectorFacilityColpath, project.sectorFacilityColpath) &&
        Objects.equals(this.activeStatus, project.activeStatus) &&
        Objects.equals(this.isHistorical, project.isHistorical) &&
        Objects.equals(this.historicalProjectId, project.historicalProjectId) &&
        Objects.equals(this.companyFinalPDRating, project.companyFinalPDRating) &&
        Objects.equals(this.maestroCreatorId, project.maestroCreatorId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, companyId, elementId, userGroupId, name, number, operationNumber, opusOtherCompanyCount, opusSector, opusSection, lockMask, creationDate, creationUser, modificationDate, modificationUser, analysisDate, status, colpathJurisdictionCountryISO, senpathJurisdictionCountryISO, sectorFacilitySenpath, sectorFacilityColpath, activeStatus, isHistorical, historicalProjectId, companyFinalPDRating, maestroCreatorId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Project {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    companyId: ").append(toIndentedString(companyId)).append("\n");
    sb.append("    elementId: ").append(toIndentedString(elementId)).append("\n");
    sb.append("    userGroupId: ").append(toIndentedString(userGroupId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    number: ").append(toIndentedString(number)).append("\n");
    sb.append("    operationNumber: ").append(toIndentedString(operationNumber)).append("\n");
    sb.append("    opusOtherCompanyCount: ").append(toIndentedString(opusOtherCompanyCount)).append("\n");
    sb.append("    opusSector: ").append(toIndentedString(opusSector)).append("\n");
    sb.append("    opusSection: ").append(toIndentedString(opusSection)).append("\n");
    sb.append("    lockMask: ").append(toIndentedString(lockMask)).append("\n");
    sb.append("    creationDate: ").append(toIndentedString(creationDate)).append("\n");
    sb.append("    creationUser: ").append(toIndentedString(creationUser)).append("\n");
    sb.append("    modificationDate: ").append(toIndentedString(modificationDate)).append("\n");
    sb.append("    modificationUser: ").append(toIndentedString(modificationUser)).append("\n");
    sb.append("    analysisDate: ").append(toIndentedString(analysisDate)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    colpathJurisdictionCountryISO: ").append(toIndentedString(colpathJurisdictionCountryISO)).append("\n");
    sb.append("    senpathJurisdictionCountryISO: ").append(toIndentedString(senpathJurisdictionCountryISO)).append("\n");
    sb.append("    sectorFacilitySenpath: ").append(toIndentedString(sectorFacilitySenpath)).append("\n");
    sb.append("    sectorFacilityColpath: ").append(toIndentedString(sectorFacilityColpath)).append("\n");
    sb.append("    activeStatus: ").append(toIndentedString(activeStatus)).append("\n");
    sb.append("    isHistorical: ").append(toIndentedString(isHistorical)).append("\n");
    sb.append("    historicalProjectId: ").append(toIndentedString(historicalProjectId)).append("\n");
    sb.append("    companyFinalPDRating: ").append(toIndentedString(companyFinalPDRating)).append("\n");
    sb.append("    maestroCreatorId: ").append(toIndentedString(maestroCreatorId)).append("\n");
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

