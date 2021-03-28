package com.framework.tabs.web.DTO;

import com.framework.tabs.persistence.model.GenericColumns;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class BusinessGroupsPojo extends GenericColumns {
	private Long groupID;
	private String groupName;
	private String groupDescription;
	private BusinessGroupsPojo groupParent;
	private boolean isGroup=false;
}
