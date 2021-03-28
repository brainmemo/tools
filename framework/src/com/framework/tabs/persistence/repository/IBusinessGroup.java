package com.framework.tabs.persistence.repository;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.framework.tabs.persistence.model.BusinessGroups;

public interface IBusinessGroup extends PagingAndSortingRepository<BusinessGroups, Long> {

}
