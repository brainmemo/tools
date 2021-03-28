package com.framework.tabs.persistence.model;
import java.util.Date;
import java.util.UUID;
import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import lombok.Data;
@MappedSuperclass
@Data
public abstract class GenericColumns {

	@Column(length=500,nullable = false)
	private String createdByUser;
	@Column(length=500, nullable = false)
	private String updatedByUser;
	@Temporal(TemporalType.TIMESTAMP)
	@Column(nullable = false)
	private Date createdDate;
	@Temporal(TemporalType.TIMESTAMP)
	@Column(nullable = false)
	private Date updatedDate;
	@Column(length = 2, nullable = false)
	private String is_deleted;
	@Column(nullable = false, columnDefinition = "BINARY (16)")
	private UUID guid = UUID.randomUUID();
}
