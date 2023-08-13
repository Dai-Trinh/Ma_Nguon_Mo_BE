package com.example.manguonmo_be.service;


import com.example.manguonmo_be.model.AttributesCommon;

public interface MappingCustomEntity<E extends AttributesCommon> {
	public E convert(Object[] data);
}
