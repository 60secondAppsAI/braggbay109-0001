package com.braggbay109.dao;

import java.util.List;

import com.braggbay109.dao.GenericDAO;
import com.braggbay109.domain.Item;





public interface ItemDAO extends GenericDAO<Item, Integer> {
  
	List<Item> findAll();
	






}


