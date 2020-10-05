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
 * Company
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-10-05T06:03:11.204Z[GMT]")
@Component

public class Company   {
  @JsonProperty("companyId")
  private String companyId = null;

  @JsonProperty("companyIdNumber")
  private String companyIdNumber = null;

  @JsonProperty("companyName")
  private String companyName = null;

  @JsonProperty("companyDomicileCountryIso")
  private String companyDomicileCountryIso = null;

  public Company companyId(String companyId) {
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

  public Company companyIdNumber(String companyIdNumber) {
    this.companyIdNumber = companyIdNumber;
    return this;
  }

  /**
   * Get companyIdNumber
   * @return companyIdNumber
  **/
  @ApiModelProperty(value = "")
  
    public String getCompanyIdNumber() {
    return companyIdNumber;
  }

  public void setCompanyIdNumber(String companyIdNumber) {
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

  public Company companyDomicileCountryIso(String companyDomicileCountryIso) {
    this.companyDomicileCountryIso = companyDomicileCountryIso;
    return this;
  }

  /**
   * Get companyDomicileCountryIso
   * @return companyDomicileCountryIso
  **/
  @ApiModelProperty(value = "")
  
    public String getCompanyDomicileCountryIso() {
    return companyDomicileCountryIso;
  }

  public void setCompanyDomicileCountryIso(String companyDomicileCountryIso) {
    this.companyDomicileCountryIso = companyDomicileCountryIso;
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
    return Objects.equals(this.companyId, company.companyId) &&
        Objects.equals(this.companyIdNumber, company.companyIdNumber) &&
        Objects.equals(this.companyName, company.companyName) &&
        Objects.equals(this.companyDomicileCountryIso, company.companyDomicileCountryIso);
  }

  @Override
  public int hashCode() {
    return Objects.hash(companyId, companyIdNumber, companyName, companyDomicileCountryIso);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Company {\n");
    
    sb.append("    companyId: ").append(toIndentedString(companyId)).append("\n");
    sb.append("    companyIdNumber: ").append(toIndentedString(companyIdNumber)).append("\n");
    sb.append("    companyName: ").append(toIndentedString(companyName)).append("\n");
    sb.append("    companyDomicileCountryIso: ").append(toIndentedString(companyDomicileCountryIso)).append("\n");
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
