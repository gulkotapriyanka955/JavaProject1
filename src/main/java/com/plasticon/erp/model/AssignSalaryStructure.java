package com.plasticon.erp.model;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name="assign_salary_structure")
public class AssignSalaryStructure {
	@Id
 private int assignSalaryId;
	private String selectStaff;
	private String salaryTemplates;
	private String remarks;
	private Date monthEffectiveFrom;

	
	
 
}
