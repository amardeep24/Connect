/**
 * This project is created by Amardeep Bhowmick, to demostrate a 
 * a simple social networking application for both web and mobile devices.
 * Copyright ©2016. All rights reserved.
 */
package com.amardeep.connect.dao;

import java.io.Serializable;

/**
 * @author Amardeep Bhowmick
 *
 */
public interface BaseDao<T, PK extends Serializable> {
	public void save(T entity);
	
	public void delete(PK id);
	
	public void update(T entity);
	
	public T get(PK id);

}
