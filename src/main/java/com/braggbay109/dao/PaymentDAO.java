package com.braggbay109.dao;

import java.util.List;

import com.braggbay109.dao.GenericDAO;
import com.braggbay109.domain.Payment;





public interface PaymentDAO extends GenericDAO<Payment, Integer> {
  
	List<Payment> findAll();
	






}


