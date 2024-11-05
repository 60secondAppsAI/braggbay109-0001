package com.braggbay109.dao;

import java.util.List;

import com.braggbay109.dao.GenericDAO;
import com.braggbay109.domain.Purchase;





public interface PurchaseDAO extends GenericDAO<Purchase, Integer> {
  
	List<Purchase> findAll();
	






}


