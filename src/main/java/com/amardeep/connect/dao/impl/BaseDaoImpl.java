/**
 * This project is created by Amardeep Bhowmick, to demostrate a 
 * a simple social networking application for both web and mobile devices.
 * Copyright ©2016. All rights reserved.
 */
package com.amardeep.connect.dao.impl;

import java.io.Serializable;

import com.amardeep.connect.dao.BaseDao;

/**
 * @author Amardeep Bhowmick
 * @param <T>
 *
 */
public abstract class BaseDaoImpl<T, PK extends Serializable> implements
		BaseDao<T, PK> {

	public void save(T entity) {

	}

	public void delete(PK id) {

	}

	public void update(T entity) {

	}

	public T get(PK id) {
		return null;
	}

}
