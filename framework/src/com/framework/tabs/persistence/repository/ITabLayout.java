package com.framework.tabs.persistence.repository;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.framework.tabs.persistence.model.TabLayout;

public interface ITabLayout extends PagingAndSortingRepository<TabLayout, Long> {

}
