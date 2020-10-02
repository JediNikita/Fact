package org.iadb.iic.apps.factcuid.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import org.threeten.bp.LocalDate;
import org.springframework.validation.annotation.Validated;

import javax.persistence.Entity;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Facility
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-09-30T14:04:31.664Z")



@Entity
public class Facility   {
  @JsonProperty("id")
  private Long id = null;

  @JsonProperty("projectId")
  private Long projectId = null;

  @JsonProperty("facLoanNumber")
  private String facLoanNumber = null;

  @JsonProperty("facNumber")
  private String facNumber = null;

  @JsonProperty("facOpusAmount")
  private BigDecimal facOpusAmount = null;

  @JsonProperty("facDescription")
  private String facDescription = null;

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

  @JsonProperty("pdToUpdate")
  private Integer pdToUpdate = null;

  @JsonProperty("impairedLoan")
  private String impairedLoan = null;

  @JsonProperty("lgdPerc")
  private Integer lgdPerc = null;

  @JsonProperty("expirationDate")
  private LocalDate expirationDate = null;

  @JsonProperty("approvedDateTime")
  private LocalDate approvedDateTime = null;

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

  public Facility projectId(Long projectId) {
    this.projectId = projectId;
    return this;
  }

  /**
   * Get projectId
   * @return projectId
  **/
  @ApiModelProperty(value = "")


  public Long getProjectId() {
    return projectId;
  }

  public void setProjectId(Long projectId) {
    this.projectId = projectId;
  }

  public Facility facLoanNumber(String facLoanNumber) {
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

  public Facility facNumber(String facNumber) {
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

  public Facility facOpusAmount(BigDecimal facOpusAmount) {
    this.facOpusAmount = facOpusAmount;
    return this;
  }

  /**
   * Get facOpusAmount
   * @return facOpusAmount
  **/
  @ApiModelProperty(value = "")

  @Valid

  public BigDecimal getFacOpusAmount() {
    return facOpusAmount;
  }

  public void setFacOpusAmount(BigDecimal facOpusAmount) {
    this.facOpusAmount = facOpusAmount;
  }

  public Facility facDescription(String facDescription) {
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

  public Facility pdToUpdate(Integer pdToUpdate) {
    this.pdToUpdate = pdToUpdate;
    return this;
  }

  /**
   * set to constant 1
   * @return pdToUpdate
  **/
  @ApiModelProperty(value = "set to constant 1")


  public Integer getPdToUpdate() {
    return pdToUpdate;
  }

  public void setPdToUpdate(Integer pdToUpdate) {
    this.pdToUpdate = pdToUpdate;
  }

  public Facility impairedLoan(String impairedLoan) {
    this.impairedLoan = impairedLoan;
    return this;
  }

  /**
   * set to constant VLD_PROJECT_IMPAIRED_LOAN_R1
   * @return impairedLoan
  **/
  @ApiModelProperty(value = "set to constant VLD_PROJECT_IMPAIRED_LOAN_R1")


  public String getImpairedLoan() {
    return impairedLoan;
  }

  public void setImpairedLoan(String impairedLoan) {
    this.impairedLoan = impairedLoan;
  }

  public Facility lgdPerc(Integer lgdPerc) {
    this.lgdPerc = lgdPerc;
    return this;
  }

  /**
   * lgd value assigned in fact
   * @return lgdPerc
  **/
  @ApiModelProperty(value = "lgd value assigned in fact")


  public Integer getLgdPerc() {
    return lgdPerc;
  }

  public void setLgdPerc(Integer lgdPerc) {
    this.lgdPerc = lgdPerc;
  }

  public Facility expirationDate(LocalDate expirationDate) {
    this.expirationDate = expirationDate;
    return this;
  }

  /**
   * lgd expiration date
   * @return expirationDate
  **/
  @ApiModelProperty(value = "lgd expiration date")

  @Valid

  public LocalDate getExpirationDate() {
    return expirationDate;
  }

  public void setExpirationDate(LocalDate expirationDate) {
    this.expirationDate = expirationDate;
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
        Objects.equals(this.projectId, facility.projectId) &&
        Objects.equals(this.facLoanNumber, facility.facLoanNumber) &&
        Objects.equals(this.facNumber, facility.facNumber) &&
        Objects.equals(this.facOpusAmount, facility.facOpusAmount) &&
        Objects.equals(this.facDescription, facility.facDescription) &&
        Objects.equals(this.facLockMask, facility.facLockMask) &&
        Objects.equals(this.facCreationDate, facility.facCreationDate) &&
        Objects.equals(this.facCreationUser, facility.facCreationUser) &&
        Objects.equals(this.facModificationDate, facility.facModificationDate) &&
        Objects.equals(this.facModificationUser, facility.facModificationUser) &&
        Objects.equals(this.pdToUpdate, facility.pdToUpdate) &&
        Objects.equals(this.impairedLoan, facility.impairedLoan) &&
        Objects.equals(this.lgdPerc, facility.lgdPerc) &&
        Objects.equals(this.expirationDate, facility.expirationDate) &&
        Objects.equals(this.approvedDateTime, facility.approvedDateTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, projectId, facLoanNumber, facNumber, facOpusAmount, facDescription, facLockMask, facCreationDate, facCreationUser, facModificationDate, facModificationUser, pdToUpdate, impairedLoan, lgdPerc, expirationDate, approvedDateTime);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Facility {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
    sb.append("    facLoanNumber: ").append(toIndentedString(facLoanNumber)).append("\n");
    sb.append("    facNumber: ").append(toIndentedString(facNumber)).append("\n");
    sb.append("    facOpusAmount: ").append(toIndentedString(facOpusAmount)).append("\n");
    sb.append("    facDescription: ").append(toIndentedString(facDescription)).append("\n");
    sb.append("    facLockMask: ").append(toIndentedString(facLockMask)).append("\n");
    sb.append("    facCreationDate: ").append(toIndentedString(facCreationDate)).append("\n");
    sb.append("    facCreationUser: ").append(toIndentedString(facCreationUser)).append("\n");
    sb.append("    facModificationDate: ").append(toIndentedString(facModificationDate)).append("\n");
    sb.append("    facModificationUser: ").append(toIndentedString(facModificationUser)).append("\n");
    sb.append("    pdToUpdate: ").append(toIndentedString(pdToUpdate)).append("\n");
    sb.append("    impairedLoan: ").append(toIndentedString(impairedLoan)).append("\n");
    sb.append("    lgdPerc: ").append(toIndentedString(lgdPerc)).append("\n");
    sb.append("    expirationDate: ").append(toIndentedString(expirationDate)).append("\n");
    sb.append("    approvedDateTime: ").append(toIndentedString(approvedDateTime)).append("\n");
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

