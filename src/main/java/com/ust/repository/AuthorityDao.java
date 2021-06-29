package com.ust.repository;
import com.ust.model.Authorities;

public interface AuthorityDao {
	
	Authorities findByAuthorityName(String authority);

}