package com.common.mis.master.app.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Bank {

	private String uuid;
	private String code;
	private String bankName;
	private boolean isActive;
	private String createdBy;
	private long createdDate;
	private String lastModifiedBy;
	private long lastModifiedDate;

}
