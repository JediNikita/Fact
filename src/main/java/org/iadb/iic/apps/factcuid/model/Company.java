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
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-10-03T11:06:16.982Z")




public class Company   {
	@JsonProperty("id")
	private Long id = null;

	@JsonProperty("idNumber")
	private Long idNumber = null;

	@JsonProperty("elementId")
	private Long elementId = null;

	@JsonProperty("userGroupId")
	private Long userGroupId = null;

	@JsonProperty("groupId")
	private Long groupId = null;

	@JsonProperty("name")
	private String name = null;

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

	@JsonProperty("type")
	private String type = null;

	@JsonProperty("companyModel")
	private String companyModel = null;

	@JsonProperty("bankScopeId")
	private Integer bankScopeId = null;

	@JsonProperty("spreadType")
	private String spreadType = null;

	@JsonProperty("analystUserId")
	private Integer analystUserId = null;

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


	@JsonProperty("sector")
	private String sector = null;

	@JsonProperty("workflowStatus")
	private Integer workflowStatus = null;

	@JsonProperty("statementKey")
	private String statementKey = null;

	@JsonProperty("financeSector")
	private String financeSector = null;

	@JsonProperty("financeSubSector")
	private String financeSubSector = null;

	@JsonProperty("lastPDRating")
	private BigDecimal lastPDRating = null;

	@JsonProperty("layoutFormat")
	private String layoutFormat = null;

	@JsonProperty("hasArchives")
	private Integer hasArchives = null;

	@JsonProperty("hasApprovedArchived")
	private Integer hasApprovedArchived = null;

	@JsonProperty("fileToImport")
	private String fileToImport = null;

	@JsonProperty("govtSupportType")
	private String govtSupportType = null;

	@JsonProperty("hasGovtSupport")
	private String hasGovtSupport = null;

	@JsonProperty("operationCountryISO")
	private Integer operationCountryISO = null;

	@JsonProperty("constructionCountryISO")
	private Integer constructionCountryISO = null;

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

	public Company idNumber(Long idNumber) {
		this.idNumber = idNumber;
		return this;
	}

	/**
	 * Get idNumber
	 * @return idNumber
	 **/
	@ApiModelProperty(value = "")


	public Long getIdNumber() {
		return idNumber;
	}

	public void setIdNumber(Long idNumber) {
		this.idNumber = idNumber;
	}

	public Company elementId(Long elementId) {
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

	public Company userGroupId(Long userGroupId) {
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

	public Company groupId(Long groupId) {
		this.groupId = groupId;
		return this;
	}

	/**
	 * Get groupId
	 * @return groupId
	 **/
	@ApiModelProperty(value = "")


	public Long getGroupId() {
		return groupId;
	}

	public void setGroupId(Long groupId) {
		this.groupId = groupId;
	}

	public Company name(String name) {
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

	public Company type(String type) {
		this.type = type;
		return this;
	}

	/**
	 * Get type
	 * @return type
	 **/
	@ApiModelProperty(value = "")


	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
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

	public Company bankScopeId(Integer bankScopeId) {
		this.bankScopeId = bankScopeId;
		return this;
	}

	/**
	 * Get bankScopeId
	 * @return bankScopeId
	 **/
	@ApiModelProperty(value = "")


	public Integer getBankScopeId() {
		return bankScopeId;
	}

	public void setBankScopeId(Integer bankScopeId) {
		this.bankScopeId = bankScopeId;
	}

	public Company spreadType(String spreadType) {
		this.spreadType = spreadType;
		return this;
	}

	/**
	 * Get spreadType
	 * @return spreadType
	 **/
	@ApiModelProperty(value = "")


	public String getSpreadType() {
		return spreadType;
	}

	public void setSpreadType(String spreadType) {
		this.spreadType = spreadType;
	}

	public Company analystUserId(Integer analystUserId) {
		this.analystUserId = analystUserId;
		return this;
	}

	/**
	 * Get analystUserId
	 * @return analystUserId
	 **/
	@ApiModelProperty(value = "")


	public Integer getAnalystUserId() {
		return analystUserId;
	}

	public void setAnalystUserId(Integer analystUserId) {
		this.analystUserId = analystUserId;
	}

	public Company creationDate(LocalDate creationDate) {
		this.creationDate = creationDate;
		return this;
	}

	/**
	 * date of creation
	 * @return creationDate
	 **/
	@ApiModelProperty(value = "date of creation")

	@Valid

	public LocalDate getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(LocalDate creationDate) {
		this.creationDate = creationDate;
	}

	public Company creationUser(Integer creationUser) {
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

	public Company modificationDate(LocalDate modificationDate) {
		this.modificationDate = modificationDate;
		return this;
	}

	/**
	 * date of modification
	 * @return modificationDate
	 **/
	@ApiModelProperty(value = "date of modification")

	@Valid

	public LocalDate getModificationDate() {
		return modificationDate;
	}

	public void setModificationDate(LocalDate modificationDate) {
		this.modificationDate = modificationDate;
	}

	public Company modificationUser(Integer modificationUser) {
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

	

	public Company sector(String sector) {
		this.sector = sector;
		return this;
	}

	/**
	 * Get sector
	 * @return sector
	 **/
	@ApiModelProperty(value = "")


	public String getSector() {
		return sector;
	}

	public void setSector(String sector) {
		this.sector = sector;
	}

	public Company workflowStatus(Integer workflowStatus) {
		this.workflowStatus = workflowStatus;
		return this;
	}

	/**
	 * Get workflowStatus
	 * @return workflowStatus
	 **/
	@ApiModelProperty(value = "")


	public Integer getWorkflowStatus() {
		return workflowStatus;
	}

	public void setWorkflowStatus(Integer workflowStatus) {
		this.workflowStatus = workflowStatus;
	}

	public Company statementKey(String statementKey) {
		this.statementKey = statementKey;
		return this;
	}

	/**
	 * Get statementKey
	 * @return statementKey
	 **/
	@ApiModelProperty(value = "")


	public String getStatementKey() {
		return statementKey;
	}

	public void setStatementKey(String statementKey) {
		this.statementKey = statementKey;
	}

	public Company financeSector(String financeSector) {
		this.financeSector = financeSector;
		return this;
	}

	/**
	 * Get financeSector
	 * @return financeSector
	 **/
	@ApiModelProperty(value = "")


	public String getFinanceSector() {
		return financeSector;
	}

	public void setFinanceSector(String financeSector) {
		this.financeSector = financeSector;
	}

	public Company financeSubSector(String financeSubSector) {
		this.financeSubSector = financeSubSector;
		return this;
	}

	/**
	 * Get financeSubSector
	 * @return financeSubSector
	 **/
	@ApiModelProperty(value = "")


	public String getFinanceSubSector() {
		return financeSubSector;
	}

	public void setFinanceSubSector(String financeSubSector) {
		this.financeSubSector = financeSubSector;
	}

	public Company lastPDRating(BigDecimal lastPDRating) {
		this.lastPDRating = lastPDRating;
		return this;
	}

	/**
	 * Get lastPDRating
	 * @return lastPDRating
	 **/
	@ApiModelProperty(value = "")

	@Valid

	public BigDecimal getLastPDRating() {
		return lastPDRating;
	}

	public void setLastPDRating(BigDecimal lastPDRating) {
		this.lastPDRating = lastPDRating;
	}

	public Company layoutFormat(String layoutFormat) {
		this.layoutFormat = layoutFormat;
		return this;
	}

	/**
	 * Get layoutFormat
	 * @return layoutFormat
	 **/
	@ApiModelProperty(value = "")


	public String getLayoutFormat() {
		return layoutFormat;
	}

	public void setLayoutFormat(String layoutFormat) {
		this.layoutFormat = layoutFormat;
	}

	public Company hasArchives(Integer hasArchives) {
		this.hasArchives = hasArchives;
		return this;
	}

	/**
	 * Get hasArchives
	 * @return hasArchives
	 **/
	@ApiModelProperty(value = "")


	public Integer getHasArchives() {
		return hasArchives;
	}

	public void setHasArchives(Integer hasArchives) {
		this.hasArchives = hasArchives;
	}

	public Company hasApprovedArchived(Integer hasApprovedArchived) {
		this.hasApprovedArchived = hasApprovedArchived;
		return this;
	}

	/**
	 * Get hasApprovedArchived
	 * @return hasApprovedArchived
	 **/
	@ApiModelProperty(value = "")


	public Integer getHasApprovedArchived() {
		return hasApprovedArchived;
	}

	public void setHasApprovedArchived(Integer hasApprovedArchived) {
		this.hasApprovedArchived = hasApprovedArchived;
	}

	public Company fileToImport(String fileToImport) {
		this.fileToImport = fileToImport;
		return this;
	}

	/**
	 * Get fileToImport
	 * @return fileToImport
	 **/
	@ApiModelProperty(value = "")


	public String getFileToImport() {
		return fileToImport;
	}

	public void setFileToImport(String fileToImport) {
		this.fileToImport = fileToImport;
	}

	public Company govtSupportType(String govtSupportType) {
		this.govtSupportType = govtSupportType;
		return this;
	}

	/**
	 * Get govtSupportType
	 * @return govtSupportType
	 **/
	@ApiModelProperty(value = "")


	public String getGovtSupportType() {
		return govtSupportType;
	}

	public void setGovtSupportType(String govtSupportType) {
		this.govtSupportType = govtSupportType;
	}

	public Company hasGovtSupport(String hasGovtSupport) {
		this.hasGovtSupport = hasGovtSupport;
		return this;
	}

	/**
	 * Get hasGovtSupport
	 * @return hasGovtSupport
	 **/
	@ApiModelProperty(value = "")


	public String getHasGovtSupport() {
		return hasGovtSupport;
	}

	public void setHasGovtSupport(String hasGovtSupport) {
		this.hasGovtSupport = hasGovtSupport;
	}

	public Company operationCountryISO(Integer operationCountryISO) {
		this.operationCountryISO = operationCountryISO;
		return this;
	}

	/**
	 * Get operationCountryISO
	 * @return operationCountryISO
	 **/
	@ApiModelProperty(value = "")


	public Integer getOperationCountryISO() {
		return operationCountryISO;
	}

	public void setOperationCountryISO(Integer operationCountryISO) {
		this.operationCountryISO = operationCountryISO;
	}

	public Company constructionCountryISO(Integer constructionCountryISO) {
		this.constructionCountryISO = constructionCountryISO;
		return this;
	}

	/**
	 * Get constructionCountryISO
	 * @return constructionCountryISO
	 **/
	@ApiModelProperty(value = "")


	public Integer getConstructionCountryISO() {
		return constructionCountryISO;
	}

	public void setConstructionCountryISO(Integer constructionCountryISO) {
		this.constructionCountryISO = constructionCountryISO;
	}




	public Integer getLockMask() {
		return lockMask;
	}

	public void setLockMask(Integer lockMask) {
		this.lockMask = lockMask;
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
				Objects.equals(this.idNumber, company.idNumber) &&
				Objects.equals(this.elementId, company.elementId) &&
				Objects.equals(this.userGroupId, company.userGroupId) &&
				Objects.equals(this.groupId, company.groupId) &&
				Objects.equals(this.name, company.name) &&
				Objects.equals(this.domicileCountryISO, company.domicileCountryISO) &&
				Objects.equals(this.portfolio, company.portfolio) &&
				Objects.equals(this.type, company.type) &&
				Objects.equals(this.companyModel, company.companyModel) &&
				Objects.equals(this.bankScopeId, company.bankScopeId) &&
				Objects.equals(this.spreadType, company.spreadType) &&
				Objects.equals(this.analystUserId, company.analystUserId) &&
				Objects.equals(this.creationDate, company.creationDate) &&
				Objects.equals(this.creationUser, company.creationUser) &&
				Objects.equals(this.modificationDate, company.modificationDate) &&
				Objects.equals(this.modificationUser, company.modificationUser) &&
				Objects.equals(this.lockMask, company.lockMask) &&
				Objects.equals(this.sector, company.sector) &&
				Objects.equals(this.workflowStatus, company.workflowStatus) &&
				Objects.equals(this.statementKey, company.statementKey) &&
				Objects.equals(this.financeSector, company.financeSector) &&
				Objects.equals(this.financeSubSector, company.financeSubSector) &&
				Objects.equals(this.lastPDRating, company.lastPDRating) &&
				Objects.equals(this.layoutFormat, company.layoutFormat) &&
				Objects.equals(this.hasArchives, company.hasArchives) &&
				Objects.equals(this.hasApprovedArchived, company.hasApprovedArchived) &&
				Objects.equals(this.fileToImport, company.fileToImport) &&
				Objects.equals(this.govtSupportType, company.govtSupportType) &&
				Objects.equals(this.hasGovtSupport, company.hasGovtSupport) &&
				Objects.equals(this.operationCountryISO, company.operationCountryISO) &&
				Objects.equals(this.constructionCountryISO, company.constructionCountryISO);
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, idNumber, elementId, userGroupId, groupId, name, domicileCountryISO, portfolio, type, companyModel, bankScopeId, spreadType, analystUserId, creationDate, creationUser, modificationDate, modificationUser, lockMask, sector, workflowStatus, statementKey, financeSector, financeSubSector, lastPDRating, layoutFormat, hasArchives, hasApprovedArchived, fileToImport, govtSupportType, hasGovtSupport, operationCountryISO, constructionCountryISO);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class Company {\n");

		sb.append("    id: ").append(toIndentedString(id)).append("\n");
		sb.append("    idNumber: ").append(toIndentedString(idNumber)).append("\n");
		sb.append("    elementId: ").append(toIndentedString(elementId)).append("\n");
		sb.append("    userGroupId: ").append(toIndentedString(userGroupId)).append("\n");
		sb.append("    groupId: ").append(toIndentedString(groupId)).append("\n");
		sb.append("    name: ").append(toIndentedString(name)).append("\n");
		sb.append("    domicileCountryISO: ").append(toIndentedString(domicileCountryISO)).append("\n");
		sb.append("    portfolio: ").append(toIndentedString(portfolio)).append("\n");
		sb.append("    type: ").append(toIndentedString(type)).append("\n");
		sb.append("    companyModel: ").append(toIndentedString(companyModel)).append("\n");
		sb.append("    bankScopeId: ").append(toIndentedString(bankScopeId)).append("\n");
		sb.append("    spreadType: ").append(toIndentedString(spreadType)).append("\n");
		sb.append("    analystUserId: ").append(toIndentedString(analystUserId)).append("\n");
		sb.append("    creationDate: ").append(toIndentedString(creationDate)).append("\n");
		sb.append("    creationUser: ").append(toIndentedString(creationUser)).append("\n");
		sb.append("    modificationDate: ").append(toIndentedString(modificationDate)).append("\n");
		sb.append("    modificationUser: ").append(toIndentedString(modificationUser)).append("\n");
		sb.append("    lockMask: ").append(toIndentedString(lockMask)).append("\n");
		sb.append("    sector: ").append(toIndentedString(sector)).append("\n");
		sb.append("    workflowStatus: ").append(toIndentedString(workflowStatus)).append("\n");
		sb.append("    statementKey: ").append(toIndentedString(statementKey)).append("\n");
		sb.append("    financeSector: ").append(toIndentedString(financeSector)).append("\n");
		sb.append("    financeSubSector: ").append(toIndentedString(financeSubSector)).append("\n");
		sb.append("    lastPDRating: ").append(toIndentedString(lastPDRating)).append("\n");
		sb.append("    layoutFormat: ").append(toIndentedString(layoutFormat)).append("\n");
		sb.append("    hasArchives: ").append(toIndentedString(hasArchives)).append("\n");
		sb.append("    hasApprovedArchived: ").append(toIndentedString(hasApprovedArchived)).append("\n");
		sb.append("    fileToImport: ").append(toIndentedString(fileToImport)).append("\n");
		sb.append("    govtSupportType: ").append(toIndentedString(govtSupportType)).append("\n");
		sb.append("    hasGovtSupport: ").append(toIndentedString(hasGovtSupport)).append("\n");
		sb.append("    operationCountryISO: ").append(toIndentedString(operationCountryISO)).append("\n");
		sb.append("    constructionCountryISO: ").append(toIndentedString(constructionCountryISO)).append("\n");
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

