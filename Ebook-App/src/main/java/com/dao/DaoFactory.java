package com.dao;

import java.sql.Connection;

public class DaoFactory {
	public static final DaoFactory INSTANCE = new DaoFactory();

	public Connection connection;

	public BookDao bookDao = new BookDaoImpl();
	public UserDao userDao = new UserDaoImpl();

	private DaoFactory() {
	}

	public BookDao getBookDao() {
		return bookDao.setConnection(connection);
	}

	public UserDao getUserDao() {
		return userDao.setConnection(connection);
	}

	public DaoFactory setConnection(Connection connection) {
		this.connection = connection;
		return this;
	}
}