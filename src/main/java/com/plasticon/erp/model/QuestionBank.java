package com.plasticon.erp.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name = "question_bank")
public class QuestionBank {
	
	@Id
	private int slno;
	private String Question;
	private String Marks;
	private String Hint;
	private String Solution_description;
	private String Status;

}
