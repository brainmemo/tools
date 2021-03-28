package com.framework.tabs.persistence.repository;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.framework.tabs.persistence.model.Pages;

public interface IPages extends PagingAndSortingRepository<Pages, Long> {

}
