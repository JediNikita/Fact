package org.iadb.iic.apps.factcuid.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Project
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-10-05T06:03:11.204Z[GMT]")
@Component

public class Project   {
  @JsonProperty("projId")
  private Integer projId = null;

  @JsonProperty("companyId")
  private String companyId = null;

  @JsonProperty("projName")
  private String projName = null;

  @JsonProperty("projNumber")
  private String projNumber = null;

  @JsonProperty("projOperationNumber")
  private String projOperationNumber = null;

  @JsonProperty("projOpusOtherCompCount")
  private Integer projOpusOtherCompCount = null;

  @JsonProperty("projOpusSector")
  private String projOpusSector = null;

  @JsonProperty("projOpusSection")
  private String projOpusSection = null;

  @JsonProperty("projTeamLeader")
  private String projTeamLeader = null;

  public Project projId(Integer projId) {
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

  public Project companyId(String companyId) {
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

  public Project projName(String projName) {
    this.projName = projName;
    return this;
  }

  /**
   * Get projName
   * @return projName
  **/
  @ApiModelProperty(value = "")
  
    public String getProjName() {
    return projName;
  }

  public void setProjName(String projName) {
    this.projName = projName;
  }

  public Project projNumber(String projNumber) {
    this.projNumber = projNumber;
    return this;
  }

  /**
   * Get projNumber
   * @return projNumber
  **/
  @ApiModelProperty(value = "")
  
    public String getProjNumber() {
    return projNumber;
  }

  public void setProjNumber(String projNumber) {
    this.projNumber = projNumber;
  }

  public Project projOperationNumber(String projOperationNumber) {
    this.projOperationNumber = projOperationNumber;
    return this;
  }

  /**
   * Get projOperationNumber
   * @return projOperationNumber
  **/
  @ApiModelProperty(value = "")
  
    public String getProjOperationNumber() {
    return projOperationNumber;
  }

  public void setProjOperationNumber(String projOperationNumber) {
    this.projOperationNumber = projOperationNumber;
  }

  public Project projOpusOtherCompCount(Integer projOpusOtherCompCount) {
    this.projOpusOtherCompCount = projOpusOtherCompCount;
    return this;
  }

  /**
   * Get projOpusOtherCompCount
   * @return projOpusOtherCompCount
  **/
  @ApiModelProperty(value = "")
  
    public Integer getProjOpusOtherCompCount() {
    return projOpusOtherCompCount;
  }

  public void setProjOpusOtherCompCount(Integer projOpusOtherCompCount) {
    this.projOpusOtherCompCount = projOpusOtherCompCount;
  }

  public Project projOpusSector(String projOpusSector) {
    this.projOpusSector = projOpusSector;
    return this;
  }

  /**
   * Get projOpusSector
   * @return projOpusSector
  **/
  @ApiModelProperty(value = "")
  
    public String getProjOpusSector() {
    return projOpusSector;
  }

  public void setProjOpusSector(String projOpusSector) {
    this.projOpusSector = projOpusSector;
  }

  public Project projOpusSection(String projOpusSection) {
    this.projOpusSection = projOpusSection;
    return this;
  }

  /**
   * Get projOpusSection
   * @return projOpusSection
  **/
  @ApiModelProperty(value = "")
  
    public String getProjOpusSection() {
    return projOpusSection;
  }

  public void setProjOpusSection(String projOpusSection) {
    this.projOpusSection = projOpusSection;
  }

  public Project projTeamLeader(String projTeamLeader) {
    this.projTeamLeader = projTeamLeader;
    return this;
  }

  /**
   * Get projTeamLeader
   * @return projTeamLeader
  **/
  @ApiModelProperty(value = "")
  
    public String getProjTeamLeader() {
    return projTeamLeader;
  }

  public void setProjTeamLeader(String projTeamLeader) {
    this.projTeamLeader = projTeamLeader;
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
    return Objects.equals(this.projId, project.projId) &&
        Objects.equals(this.companyId, project.companyId) &&
        Objects.equals(this.projName, project.projName) &&
        Objects.equals(this.projNumber, project.projNumber) &&
        Objects.equals(this.projOperationNumber, project.projOperationNumber) &&
        Objects.equals(this.projOpusOtherCompCount, project.projOpusOtherCompCount) &&
        Objects.equals(this.projOpusSector, project.projOpusSector) &&
        Objects.equals(this.projOpusSection, project.projOpusSection) &&
        Objects.equals(this.projTeamLeader, project.projTeamLeader);
  }

  @Override
  public int hashCode() {
    return Objects.hash(projId, companyId, projName, projNumber, projOperationNumber, projOpusOtherCompCount, projOpusSector, projOpusSection, projTeamLeader);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Project {\n");
    
    sb.append("    projId: ").append(toIndentedString(projId)).append("\n");
    sb.append("    companyId: ").append(toIndentedString(companyId)).append("\n");
    sb.append("    projName: ").append(toIndentedString(projName)).append("\n");
    sb.append("    projNumber: ").append(toIndentedString(projNumber)).append("\n");
    sb.append("    projOperationNumber: ").append(toIndentedString(projOperationNumber)).append("\n");
    sb.append("    projOpusOtherCompCount: ").append(toIndentedString(projOpusOtherCompCount)).append("\n");
    sb.append("    projOpusSector: ").append(toIndentedString(projOpusSector)).append("\n");
    sb.append("    projOpusSection: ").append(toIndentedString(projOpusSection)).append("\n");
    sb.append("    projTeamLeader: ").append(toIndentedString(projTeamLeader)).append("\n");
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
