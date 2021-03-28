package com.framework.tabs.persistence.repository;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.framework.tabs.persistence.model.MenuTemplate;

public interface IMenuTemplate extends PagingAndSortingRepository<MenuTemplate, Long> {

}
