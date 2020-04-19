package com.awm.heenaelectronicsrest.service;

public interface IBaseService<T> {
	public abstract void update(T t);

	public abstract void create(T t);

	public abstract void delete(String id);
}
