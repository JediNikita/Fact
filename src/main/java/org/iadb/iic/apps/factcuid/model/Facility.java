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
 * Facility
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-10-03T11:06:16.982Z")




public class Facility   {
  @JsonProperty("id")
  private Long id = null;

  @JsonProperty("elementId")
  private Long elementId = null;

  @JsonProperty("userGroupId")
  private Long userGroupId = null;

  @JsonProperty("senpathProjectId")
  private Long senpathProjectId = null;

  @JsonProperty("colpathProjectId")
  private Long colpathProjectId = null;

  @JsonProperty("path")
  private String path = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("number")
  private Integer number = null;

  @JsonProperty("description")
  private String description = null;

  @JsonProperty("facLockMask")
  private Integer facLockMask = null;

  @JsonProperty("facCreationDate")
  private LocalDate facCreationDate = null;

  @JsonProperty("facCreationUser")
  private Integer facCreationUser = null;

  @JsonProperty("facModificationDate")
  private LocalDate facModificationDate = null;

  @JsonProperty("facModificationUser")
  private Long facModificationUser = null;

  @JsonProperty("subSectorType")
  private String subSectorType = null;

  @JsonProperty("sentypeColpath")
  private String sentypeColpath = null;

  @JsonProperty("sentypeSenpath")
  private String sentypeSenpath = null;

  @JsonProperty("debtBelowPercent")
  private BigDecimal debtBelowPercent = null;

  @JsonProperty("ccfPercent")
  private BigDecimal ccfPercent = null;

  @JsonProperty("ead")
  private BigDecimal ead = null;

  @JsonProperty("outstanding")
  private BigDecimal outstanding = null;

  @JsonProperty("limit")
  private BigDecimal limit = null;

  @JsonProperty("baseLGD")
  private BigDecimal baseLGD = null;

  @JsonProperty("senpathGuarId")
  private Integer senpathGuarId = null;

  @JsonProperty("colpathGuarId")
  private Integer colpathGuarId = null;

  @JsonProperty("colpathColId")
  private Integer colpathColId = null;

  @JsonProperty("overrideFRR")
  private BigDecimal overrideFRR = null;

  @JsonProperty("guarCovPercent")
  private BigDecimal guarCovPercent = null;

  @JsonProperty("finaLGD")
  private BigDecimal finaLGD = null;

  @JsonProperty("totalAssets")
  private BigDecimal totalAssets = null;

  @JsonProperty("totalLiability")
  private BigDecimal totalLiability = null;

  @JsonProperty("totalSeniorLiability")
  private BigDecimal totalSeniorLiability = null;

  @JsonProperty("assetCoverageRatio")
  private BigDecimal assetCoverageRatio = null;

  @JsonProperty("adjustedBaseLGD")
  private BigDecimal adjustedBaseLGD = null;

  @JsonProperty("FRR")
  private BigDecimal FRR = null;

  @JsonProperty("initialPacBaseLGD")
  private BigDecimal initialPacBaseLGD = null;

  @JsonProperty("overrideJustification")
  private BigDecimal overrideJustification = null;

  @JsonProperty("companyFinalPDRating")
  private BigDecimal companyFinalPDRating = null;

  @JsonProperty("pdToUpdate")
  private Integer pdToUpdate = null;

  @JsonProperty("finalGrade")
  private BigDecimal finalGrade = null;

  @JsonProperty("finalGradePct")
  private BigDecimal finalGradePct = null;

  @JsonProperty("finalGradeOverride")
  private Long finalGradeOverride = null;

  @JsonProperty("opusId")
  private Long opusId = null;

  @JsonProperty("loanNumber")
  private Long loanNumber = null;

  @JsonProperty("opusAmount")
  private Long opusAmount = null;

  @JsonProperty("noPathProjectId")
  private Long noPathProjectId = null;

  @JsonProperty("impairedLoan")
  private Long impairedLoan = null;

  @JsonProperty("specificLoss")
  private Long specificLoss = null;

  @JsonProperty("lastApprovedLGD")
  private BigDecimal lastApprovedLGD = null;

  @JsonProperty("approvedDateTime")
  private LocalDate approvedDateTime = null;

  @JsonProperty("lastApprover")
  private Integer lastApprover = null;

  public Facility id(Long id) {
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

  public Facility elementId(Long elementId) {
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

  public Facility userGroupId(Long userGroupId) {
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

  public Facility senpathProjectId(Long senpathProjectId) {
    this.senpathProjectId = senpathProjectId;
    return this;
  }

  /**
   * Get senpathProjectId
   * @return senpathProjectId
  **/
  @ApiModelProperty(value = "")


  public Long getSenpathProjectId() {
    return senpathProjectId;
  }

  public void setSenpathProjectId(Long senpathProjectId) {
    this.senpathProjectId = senpathProjectId;
  }

  public Facility colpathProjectId(Long colpathProjectId) {
    this.colpathProjectId = colpathProjectId;
    return this;
  }

  /**
   * Get colpathProjectId
   * @return colpathProjectId
  **/
  @ApiModelProperty(value = "")


  public Long getColpathProjectId() {
    return colpathProjectId;
  }

  public void setColpathProjectId(Long colpathProjectId) {
    this.colpathProjectId = colpathProjectId;
  }

  public Facility path(String path) {
    this.path = path;
    return this;
  }

  /**
   * Get path
   * @return path
  **/
  @ApiModelProperty(value = "")


  public String getPath() {
    return path;
  }

  public void setPath(String path) {
    this.path = path;
  }

  public Facility name(String name) {
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

  public Facility number(Integer number) {
    this.number = number;
    return this;
  }

  /**
   * Get number
   * @return number
  **/
  @ApiModelProperty(value = "")


  public Integer getNumber() {
    return number;
  }

  public void setNumber(Integer number) {
    this.number = number;
  }

  public Facility description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Get description
   * @return description
  **/
  @ApiModelProperty(value = "")


  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public Facility facLockMask(Integer facLockMask) {
    this.facLockMask = facLockMask;
    return this;
  }

  /**
   * internal fact field defaulted to a constant value
   * @return facLockMask
  **/
  @ApiModelProperty(value = "internal fact field defaulted to a constant value")


  public Integer getFacLockMask() {
    return facLockMask;
  }

  public void setFacLockMask(Integer facLockMask) {
    this.facLockMask = facLockMask;
  }

  public Facility facCreationDate(LocalDate facCreationDate) {
    this.facCreationDate = facCreationDate;
    return this;
  }

  /**
   * date time of creation of facility in fact
   * @return facCreationDate
  **/
  @ApiModelProperty(value = "date time of creation of facility in fact")

  @Valid

  public LocalDate getFacCreationDate() {
    return facCreationDate;
  }

  public void setFacCreationDate(LocalDate facCreationDate) {
    this.facCreationDate = facCreationDate;
  }

  public Facility facCreationUser(Integer facCreationUser) {
    this.facCreationUser = facCreationUser;
    return this;
  }

  /**
   * fact user id
   * @return facCreationUser
  **/
  @ApiModelProperty(value = "fact user id")


  public Integer getFacCreationUser() {
    return facCreationUser;
  }

  public void setFacCreationUser(Integer facCreationUser) {
    this.facCreationUser = facCreationUser;
  }

  public Facility facModificationDate(LocalDate facModificationDate) {
    this.facModificationDate = facModificationDate;
    return this;
  }

  /**
   * date time of creation of facility in fact
   * @return facModificationDate
  **/
  @ApiModelProperty(value = "date time of creation of facility in fact")

  @Valid

  public LocalDate getFacModificationDate() {
    return facModificationDate;
  }

  public void setFacModificationDate(LocalDate facModificationDate) {
    this.facModificationDate = facModificationDate;
  }

  public Facility facModificationUser(Long facModificationUser) {
    this.facModificationUser = facModificationUser;
    return this;
  }

  /**
   * fact user id
   * @return facModificationUser
  **/
  @ApiModelProperty(value = "fact user id")


  public Long getFacModificationUser() {
    return facModificationUser;
  }

  public void setFacModificationUser(Long facModificationUser) {
    this.facModificationUser = facModificationUser;
  }

  public Facility subSectorType(String subSectorType) {
    this.subSectorType = subSectorType;
    return this;
  }

  /**
   * Get subSectorType
   * @return subSectorType
  **/
  @ApiModelProperty(value = "")


  public String getSubSectorType() {
    return subSectorType;
  }

  public void setSubSectorType(String subSectorType) {
    this.subSectorType = subSectorType;
  }

  public Facility sentypeColpath(String sentypeColpath) {
    this.sentypeColpath = sentypeColpath;
    return this;
  }

  /**
   * Get sentypeColpath
   * @return sentypeColpath
  **/
  @ApiModelProperty(value = "")


  public String getSentypeColpath() {
    return sentypeColpath;
  }

  public void setSentypeColpath(String sentypeColpath) {
    this.sentypeColpath = sentypeColpath;
  }

  public Facility sentypeSenpath(String sentypeSenpath) {
    this.sentypeSenpath = sentypeSenpath;
    return this;
  }

  /**
   * Get sentypeSenpath
   * @return sentypeSenpath
  **/
  @ApiModelProperty(value = "")


  public String getSentypeSenpath() {
    return sentypeSenpath;
  }

  public void setSentypeSenpath(String sentypeSenpath) {
    this.sentypeSenpath = sentypeSenpath;
  }

  public Facility debtBelowPercent(BigDecimal debtBelowPercent) {
    this.debtBelowPercent = debtBelowPercent;
    return this;
  }

  /**
   * Get debtBelowPercent
   * @return debtBelowPercent
  **/
  @ApiModelProperty(value = "")

  @Valid

  public BigDecimal getDebtBelowPercent() {
    return debtBelowPercent;
  }

  public void setDebtBelowPercent(BigDecimal debtBelowPercent) {
    this.debtBelowPercent = debtBelowPercent;
  }

  public Facility ccfPercent(BigDecimal ccfPercent) {
    this.ccfPercent = ccfPercent;
    return this;
  }

  /**
   * Get ccfPercent
   * @return ccfPercent
  **/
  @ApiModelProperty(value = "")

  @Valid

  public BigDecimal getCcfPercent() {
    return ccfPercent;
  }

  public void setCcfPercent(BigDecimal ccfPercent) {
    this.ccfPercent = ccfPercent;
  }

  public Facility ead(BigDecimal ead) {
    this.ead = ead;
    return this;
  }

  /**
   * Get ead
   * @return ead
  **/
  @ApiModelProperty(value = "")

  @Valid

  public BigDecimal getEad() {
    return ead;
  }

  public void setEad(BigDecimal ead) {
    this.ead = ead;
  }

  public Facility outstanding(BigDecimal outstanding) {
    this.outstanding = outstanding;
    return this;
  }

  /**
   * Get outstanding
   * @return outstanding
  **/
  @ApiModelProperty(value = "")

  @Valid

  public BigDecimal getOutstanding() {
    return outstanding;
  }

  public void setOutstanding(BigDecimal outstanding) {
    this.outstanding = outstanding;
  }

  public Facility limit(BigDecimal limit) {
    this.limit = limit;
    return this;
  }

  /**
   * Get limit
   * @return limit
  **/
  @ApiModelProperty(value = "")

  @Valid

  public BigDecimal getLimit() {
    return limit;
  }

  public void setLimit(BigDecimal limit) {
    this.limit = limit;
  }

  public Facility baseLGD(BigDecimal baseLGD) {
    this.baseLGD = baseLGD;
    return this;
  }

  /**
   * Get baseLGD
   * @return baseLGD
  **/
  @ApiModelProperty(value = "")

  @Valid

  public BigDecimal getBaseLGD() {
    return baseLGD;
  }

  public void setBaseLGD(BigDecimal baseLGD) {
    this.baseLGD = baseLGD;
  }

  public Facility senpathGuarId(Integer senpathGuarId) {
    this.senpathGuarId = senpathGuarId;
    return this;
  }

  /**
   * Get senpathGuarId
   * @return senpathGuarId
  **/
  @ApiModelProperty(value = "")


  public Integer getSenpathGuarId() {
    return senpathGuarId;
  }

  public void setSenpathGuarId(Integer senpathGuarId) {
    this.senpathGuarId = senpathGuarId;
  }

  public Facility colpathGuarId(Integer colpathGuarId) {
    this.colpathGuarId = colpathGuarId;
    return this;
  }

  /**
   * Get colpathGuarId
   * @return colpathGuarId
  **/
  @ApiModelProperty(value = "")


  public Integer getColpathGuarId() {
    return colpathGuarId;
  }

  public void setColpathGuarId(Integer colpathGuarId) {
    this.colpathGuarId = colpathGuarId;
  }

  public Facility colpathColId(Integer colpathColId) {
    this.colpathColId = colpathColId;
    return this;
  }

  /**
   * Get colpathColId
   * @return colpathColId
  **/
  @ApiModelProperty(value = "")


  public Integer getColpathColId() {
    return colpathColId;
  }

  public void setColpathColId(Integer colpathColId) {
    this.colpathColId = colpathColId;
  }

  public Facility overrideFRR(BigDecimal overrideFRR) {
    this.overrideFRR = overrideFRR;
    return this;
  }

  /**
   * Get overrideFRR
   * @return overrideFRR
  **/
  @ApiModelProperty(value = "")

  @Valid

  public BigDecimal getOverrideFRR() {
    return overrideFRR;
  }

  public void setOverrideFRR(BigDecimal overrideFRR) {
    this.overrideFRR = overrideFRR;
  }

  public Facility guarCovPercent(BigDecimal guarCovPercent) {
    this.guarCovPercent = guarCovPercent;
    return this;
  }

  /**
   * Get guarCovPercent
   * @return guarCovPercent
  **/
  @ApiModelProperty(value = "")

  @Valid

  public BigDecimal getGuarCovPercent() {
    return guarCovPercent;
  }

  public void setGuarCovPercent(BigDecimal guarCovPercent) {
    this.guarCovPercent = guarCovPercent;
  }

  public Facility finaLGD(BigDecimal finaLGD) {
    this.finaLGD = finaLGD;
    return this;
  }

  /**
   * Get finaLGD
   * @return finaLGD
  **/
  @ApiModelProperty(value = "")

  @Valid

  public BigDecimal getFinaLGD() {
    return finaLGD;
  }

  public void setFinaLGD(BigDecimal finaLGD) {
    this.finaLGD = finaLGD;
  }

  public Facility totalAssets(BigDecimal totalAssets) {
    this.totalAssets = totalAssets;
    return this;
  }

  /**
   * Get totalAssets
   * @return totalAssets
  **/
  @ApiModelProperty(value = "")

  @Valid

  public BigDecimal getTotalAssets() {
    return totalAssets;
  }

  public void setTotalAssets(BigDecimal totalAssets) {
    this.totalAssets = totalAssets;
  }

  public Facility totalLiability(BigDecimal totalLiability) {
    this.totalLiability = totalLiability;
    return this;
  }

  /**
   * Get totalLiability
   * @return totalLiability
  **/
  @ApiModelProperty(value = "")

  @Valid

  public BigDecimal getTotalLiability() {
    return totalLiability;
  }

  public void setTotalLiability(BigDecimal totalLiability) {
    this.totalLiability = totalLiability;
  }

  public Facility totalSeniorLiability(BigDecimal totalSeniorLiability) {
    this.totalSeniorLiability = totalSeniorLiability;
    return this;
  }

  /**
   * Get totalSeniorLiability
   * @return totalSeniorLiability
  **/
  @ApiModelProperty(value = "")

  @Valid

  public BigDecimal getTotalSeniorLiability() {
    return totalSeniorLiability;
  }

  public void setTotalSeniorLiability(BigDecimal totalSeniorLiability) {
    this.totalSeniorLiability = totalSeniorLiability;
  }

  public Facility assetCoverageRatio(BigDecimal assetCoverageRatio) {
    this.assetCoverageRatio = assetCoverageRatio;
    return this;
  }

  /**
   * Get assetCoverageRatio
   * @return assetCoverageRatio
  **/
  @ApiModelProperty(value = "")

  @Valid

  public BigDecimal getAssetCoverageRatio() {
    return assetCoverageRatio;
  }

  public void setAssetCoverageRatio(BigDecimal assetCoverageRatio) {
    this.assetCoverageRatio = assetCoverageRatio;
  }

  public Facility adjustedBaseLGD(BigDecimal adjustedBaseLGD) {
    this.adjustedBaseLGD = adjustedBaseLGD;
    return this;
  }

  /**
   * Get adjustedBaseLGD
   * @return adjustedBaseLGD
  **/
  @ApiModelProperty(value = "")

  @Valid

  public BigDecimal getAdjustedBaseLGD() {
    return adjustedBaseLGD;
  }

  public void setAdjustedBaseLGD(BigDecimal adjustedBaseLGD) {
    this.adjustedBaseLGD = adjustedBaseLGD;
  }

  public Facility FRR(BigDecimal FRR) {
    this.FRR = FRR;
    return this;
  }

  /**
   * Get FRR
   * @return FRR
  **/
  @ApiModelProperty(value = "")

  @Valid

  public BigDecimal getFRR() {
    return FRR;
  }

  public void setFRR(BigDecimal FRR) {
    this.FRR = FRR;
  }

  public Facility initialPacBaseLGD(BigDecimal initialPacBaseLGD) {
    this.initialPacBaseLGD = initialPacBaseLGD;
    return this;
  }

  /**
   * Get initialPacBaseLGD
   * @return initialPacBaseLGD
  **/
  @ApiModelProperty(value = "")

  @Valid

  public BigDecimal getInitialPacBaseLGD() {
    return initialPacBaseLGD;
  }

  public void setInitialPacBaseLGD(BigDecimal initialPacBaseLGD) {
    this.initialPacBaseLGD = initialPacBaseLGD;
  }

  public Facility overrideJustification(BigDecimal overrideJustification) {
    this.overrideJustification = overrideJustification;
    return this;
  }

  /**
   * Get overrideJustification
   * @return overrideJustification
  **/
  @ApiModelProperty(value = "")

  @Valid

  public BigDecimal getOverrideJustification() {
    return overrideJustification;
  }

  public void setOverrideJustification(BigDecimal overrideJustification) {
    this.overrideJustification = overrideJustification;
  }

  public Facility companyFinalPDRating(BigDecimal companyFinalPDRating) {
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

  public Facility pdToUpdate(Integer pdToUpdate) {
    this.pdToUpdate = pdToUpdate;
    return this;
  }

  /**
   * Get pdToUpdate
   * @return pdToUpdate
  **/
  @ApiModelProperty(value = "")


  public Integer getPdToUpdate() {
    return pdToUpdate;
  }

  public void setPdToUpdate(Integer pdToUpdate) {
    this.pdToUpdate = pdToUpdate;
  }

  public Facility finalGrade(BigDecimal finalGrade) {
    this.finalGrade = finalGrade;
    return this;
  }

  /**
   * Get finalGrade
   * @return finalGrade
  **/
  @ApiModelProperty(value = "")

  @Valid

  public BigDecimal getFinalGrade() {
    return finalGrade;
  }

  public void setFinalGrade(BigDecimal finalGrade) {
    this.finalGrade = finalGrade;
  }

  public Facility finalGradePct(BigDecimal finalGradePct) {
    this.finalGradePct = finalGradePct;
    return this;
  }

  /**
   * Get finalGradePct
   * @return finalGradePct
  **/
  @ApiModelProperty(value = "")

  @Valid

  public BigDecimal getFinalGradePct() {
    return finalGradePct;
  }

  public void setFinalGradePct(BigDecimal finalGradePct) {
    this.finalGradePct = finalGradePct;
  }

  public Facility finalGradeOverride(Long finalGradeOverride) {
    this.finalGradeOverride = finalGradeOverride;
    return this;
  }

  /**
   * Get finalGradeOverride
   * @return finalGradeOverride
  **/
  @ApiModelProperty(value = "")


  public Long getFinalGradeOverride() {
    return finalGradeOverride;
  }

  public void setFinalGradeOverride(Long finalGradeOverride) {
    this.finalGradeOverride = finalGradeOverride;
  }

  public Facility opusId(Long opusId) {
    this.opusId = opusId;
    return this;
  }

  /**
   * Get opusId
   * @return opusId
  **/
  @ApiModelProperty(value = "")


  public Long getOpusId() {
    return opusId;
  }

  public void setOpusId(Long opusId) {
    this.opusId = opusId;
  }

  public Facility loanNumber(Long loanNumber) {
    this.loanNumber = loanNumber;
    return this;
  }

  /**
   * Get loanNumber
   * @return loanNumber
  **/
  @ApiModelProperty(value = "")


  public Long getLoanNumber() {
    return loanNumber;
  }

  public void setLoanNumber(Long loanNumber) {
    this.loanNumber = loanNumber;
  }

  public Facility opusAmount(Long opusAmount) {
    this.opusAmount = opusAmount;
    return this;
  }

  /**
   * Get opusAmount
   * @return opusAmount
  **/
  @ApiModelProperty(value = "")


  public Long getOpusAmount() {
    return opusAmount;
  }

  public void setOpusAmount(Long opusAmount) {
    this.opusAmount = opusAmount;
  }

  public Facility noPathProjectId(Long noPathProjectId) {
    this.noPathProjectId = noPathProjectId;
    return this;
  }

  /**
   * Get noPathProjectId
   * @return noPathProjectId
  **/
  @ApiModelProperty(value = "")


  public Long getNoPathProjectId() {
    return noPathProjectId;
  }

  public void setNoPathProjectId(Long noPathProjectId) {
    this.noPathProjectId = noPathProjectId;
  }

  public Facility impairedLoan(Long impairedLoan) {
    this.impairedLoan = impairedLoan;
    return this;
  }

  /**
   * Get impairedLoan
   * @return impairedLoan
  **/
  @ApiModelProperty(value = "")


  public Long getImpairedLoan() {
    return impairedLoan;
  }

  public void setImpairedLoan(Long impairedLoan) {
    this.impairedLoan = impairedLoan;
  }

  public Facility specificLoss(Long specificLoss) {
    this.specificLoss = specificLoss;
    return this;
  }

  /**
   * Get specificLoss
   * @return specificLoss
  **/
  @ApiModelProperty(value = "")


  public Long getSpecificLoss() {
    return specificLoss;
  }

  public void setSpecificLoss(Long specificLoss) {
    this.specificLoss = specificLoss;
  }

  public Facility lastApprovedLGD(BigDecimal lastApprovedLGD) {
    this.lastApprovedLGD = lastApprovedLGD;
    return this;
  }

  /**
   * Get lastApprovedLGD
   * @return lastApprovedLGD
  **/
  @ApiModelProperty(value = "")

  @Valid

  public BigDecimal getLastApprovedLGD() {
    return lastApprovedLGD;
  }

  public void setLastApprovedLGD(BigDecimal lastApprovedLGD) {
    this.lastApprovedLGD = lastApprovedLGD;
  }

  public Facility approvedDateTime(LocalDate approvedDateTime) {
    this.approvedDateTime = approvedDateTime;
    return this;
  }

  /**
   * lgd approval date time
   * @return approvedDateTime
  **/
  @ApiModelProperty(value = "lgd approval date time")

  @Valid

  public LocalDate getApprovedDateTime() {
    return approvedDateTime;
  }

  public void setApprovedDateTime(LocalDate approvedDateTime) {
    this.approvedDateTime = approvedDateTime;
  }

  public Facility lastApprover(Integer lastApprover) {
    this.lastApprover = lastApprover;
    return this;
  }

  /**
   * Get lastApprover
   * @return lastApprover
  **/
  @ApiModelProperty(value = "")


  public Integer getLastApprover() {
    return lastApprover;
  }

  public void setLastApprover(Integer lastApprover) {
    this.lastApprover = lastApprover;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Facility facility = (Facility) o;
    return Objects.equals(this.id, facility.id) &&
        Objects.equals(this.elementId, facility.elementId) &&
        Objects.equals(this.userGroupId, facility.userGroupId) &&
        Objects.equals(this.senpathProjectId, facility.senpathProjectId) &&
        Objects.equals(this.colpathProjectId, facility.colpathProjectId) &&
        Objects.equals(this.path, facility.path) &&
        Objects.equals(this.name, facility.name) &&
        Objects.equals(this.number, facility.number) &&
        Objects.equals(this.description, facility.description) &&
        Objects.equals(this.facLockMask, facility.facLockMask) &&
        Objects.equals(this.facCreationDate, facility.facCreationDate) &&
        Objects.equals(this.facCreationUser, facility.facCreationUser) &&
        Objects.equals(this.facModificationDate, facility.facModificationDate) &&
        Objects.equals(this.facModificationUser, facility.facModificationUser) &&
        Objects.equals(this.subSectorType, facility.subSectorType) &&
        Objects.equals(this.sentypeColpath, facility.sentypeColpath) &&
        Objects.equals(this.sentypeSenpath, facility.sentypeSenpath) &&
        Objects.equals(this.debtBelowPercent, facility.debtBelowPercent) &&
        Objects.equals(this.ccfPercent, facility.ccfPercent) &&
        Objects.equals(this.ead, facility.ead) &&
        Objects.equals(this.outstanding, facility.outstanding) &&
        Objects.equals(this.limit, facility.limit) &&
        Objects.equals(this.baseLGD, facility.baseLGD) &&
        Objects.equals(this.senpathGuarId, facility.senpathGuarId) &&
        Objects.equals(this.colpathGuarId, facility.colpathGuarId) &&
        Objects.equals(this.colpathColId, facility.colpathColId) &&
        Objects.equals(this.overrideFRR, facility.overrideFRR) &&
        Objects.equals(this.guarCovPercent, facility.guarCovPercent) &&
        Objects.equals(this.finaLGD, facility.finaLGD) &&
        Objects.equals(this.totalAssets, facility.totalAssets) &&
        Objects.equals(this.totalLiability, facility.totalLiability) &&
        Objects.equals(this.totalSeniorLiability, facility.totalSeniorLiability) &&
        Objects.equals(this.assetCoverageRatio, facility.assetCoverageRatio) &&
        Objects.equals(this.adjustedBaseLGD, facility.adjustedBaseLGD) &&
        Objects.equals(this.FRR, facility.FRR) &&
        Objects.equals(this.initialPacBaseLGD, facility.initialPacBaseLGD) &&
        Objects.equals(this.overrideJustification, facility.overrideJustification) &&
        Objects.equals(this.companyFinalPDRating, facility.companyFinalPDRating) &&
        Objects.equals(this.pdToUpdate, facility.pdToUpdate) &&
        Objects.equals(this.finalGrade, facility.finalGrade) &&
        Objects.equals(this.finalGradePct, facility.finalGradePct) &&
        Objects.equals(this.finalGradeOverride, facility.finalGradeOverride) &&
        Objects.equals(this.opusId, facility.opusId) &&
        Objects.equals(this.loanNumber, facility.loanNumber) &&
        Objects.equals(this.opusAmount, facility.opusAmount) &&
        Objects.equals(this.noPathProjectId, facility.noPathProjectId) &&
        Objects.equals(this.impairedLoan, facility.impairedLoan) &&
        Objects.equals(this.specificLoss, facility.specificLoss) &&
        Objects.equals(this.lastApprovedLGD, facility.lastApprovedLGD) &&
        Objects.equals(this.approvedDateTime, facility.approvedDateTime) &&
        Objects.equals(this.lastApprover, facility.lastApprover);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, elementId, userGroupId, senpathProjectId, colpathProjectId, path, name, number, description, facLockMask, facCreationDate, facCreationUser, facModificationDate, facModificationUser, subSectorType, sentypeColpath, sentypeSenpath, debtBelowPercent, ccfPercent, ead, outstanding, limit, baseLGD, senpathGuarId, colpathGuarId, colpathColId, overrideFRR, guarCovPercent, finaLGD, totalAssets, totalLiability, totalSeniorLiability, assetCoverageRatio, adjustedBaseLGD, FRR, initialPacBaseLGD, overrideJustification, companyFinalPDRating, pdToUpdate, finalGrade, finalGradePct, finalGradeOverride, opusId, loanNumber, opusAmount, noPathProjectId, impairedLoan, specificLoss, lastApprovedLGD, approvedDateTime, lastApprover);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Facility {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    elementId: ").append(toIndentedString(elementId)).append("\n");
    sb.append("    userGroupId: ").append(toIndentedString(userGroupId)).append("\n");
    sb.append("    senpathProjectId: ").append(toIndentedString(senpathProjectId)).append("\n");
    sb.append("    colpathProjectId: ").append(toIndentedString(colpathProjectId)).append("\n");
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    number: ").append(toIndentedString(number)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    facLockMask: ").append(toIndentedString(facLockMask)).append("\n");
    sb.append("    facCreationDate: ").append(toIndentedString(facCreationDate)).append("\n");
    sb.append("    facCreationUser: ").append(toIndentedString(facCreationUser)).append("\n");
    sb.append("    facModificationDate: ").append(toIndentedString(facModificationDate)).append("\n");
    sb.append("    facModificationUser: ").append(toIndentedString(facModificationUser)).append("\n");
    sb.append("    subSectorType: ").append(toIndentedString(subSectorType)).append("\n");
    sb.append("    sentypeColpath: ").append(toIndentedString(sentypeColpath)).append("\n");
    sb.append("    sentypeSenpath: ").append(toIndentedString(sentypeSenpath)).append("\n");
    sb.append("    debtBelowPercent: ").append(toIndentedString(debtBelowPercent)).append("\n");
    sb.append("    ccfPercent: ").append(toIndentedString(ccfPercent)).append("\n");
    sb.append("    ead: ").append(toIndentedString(ead)).append("\n");
    sb.append("    outstanding: ").append(toIndentedString(outstanding)).append("\n");
    sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
    sb.append("    baseLGD: ").append(toIndentedString(baseLGD)).append("\n");
    sb.append("    senpathGuarId: ").append(toIndentedString(senpathGuarId)).append("\n");
    sb.append("    colpathGuarId: ").append(toIndentedString(colpathGuarId)).append("\n");
    sb.append("    colpathColId: ").append(toIndentedString(colpathColId)).append("\n");
    sb.append("    overrideFRR: ").append(toIndentedString(overrideFRR)).append("\n");
    sb.append("    guarCovPercent: ").append(toIndentedString(guarCovPercent)).append("\n");
    sb.append("    finaLGD: ").append(toIndentedString(finaLGD)).append("\n");
    sb.append("    totalAssets: ").append(toIndentedString(totalAssets)).append("\n");
    sb.append("    totalLiability: ").append(toIndentedString(totalLiability)).append("\n");
    sb.append("    totalSeniorLiability: ").append(toIndentedString(totalSeniorLiability)).append("\n");
    sb.append("    assetCoverageRatio: ").append(toIndentedString(assetCoverageRatio)).append("\n");
    sb.append("    adjustedBaseLGD: ").append(toIndentedString(adjustedBaseLGD)).append("\n");
    sb.append("    FRR: ").append(toIndentedString(FRR)).append("\n");
    sb.append("    initialPacBaseLGD: ").append(toIndentedString(initialPacBaseLGD)).append("\n");
    sb.append("    overrideJustification: ").append(toIndentedString(overrideJustification)).append("\n");
    sb.append("    companyFinalPDRating: ").append(toIndentedString(companyFinalPDRating)).append("\n");
    sb.append("    pdToUpdate: ").append(toIndentedString(pdToUpdate)).append("\n");
    sb.append("    finalGrade: ").append(toIndentedString(finalGrade)).append("\n");
    sb.append("    finalGradePct: ").append(toIndentedString(finalGradePct)).append("\n");
    sb.append("    finalGradeOverride: ").append(toIndentedString(finalGradeOverride)).append("\n");
    sb.append("    opusId: ").append(toIndentedString(opusId)).append("\n");
    sb.append("    loanNumber: ").append(toIndentedString(loanNumber)).append("\n");
    sb.append("    opusAmount: ").append(toIndentedString(opusAmount)).append("\n");
    sb.append("    noPathProjectId: ").append(toIndentedString(noPathProjectId)).append("\n");
    sb.append("    impairedLoan: ").append(toIndentedString(impairedLoan)).append("\n");
    sb.append("    specificLoss: ").append(toIndentedString(specificLoss)).append("\n");
    sb.append("    lastApprovedLGD: ").append(toIndentedString(lastApprovedLGD)).append("\n");
    sb.append("    approvedDateTime: ").append(toIndentedString(approvedDateTime)).append("\n");
    sb.append("    lastApprover: ").append(toIndentedString(lastApprover)).append("\n");
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

