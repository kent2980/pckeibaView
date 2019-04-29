package com.aql.access;

import java.io.IOException;
import java.io.Reader;
import java.io.Serializable;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.example.entity.UmaDataViewExample;
import com.example.entity.UmaDataViewMapper;

public class UmaDataViewSession implements Serializable,AutoCloseable {

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	final private UmaDataViewMapper mapper;
	final private UmaDataViewExample example;
	final private Reader r;
	final private SqlSession session;

	public UmaDataViewSession() throws IOException {
		r = Resources.getResourceAsReader("pckeibalink-mybatis-config.xml");
		SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(r);
		session = factory.openSession();
		mapper = session .getMapper(UmaDataViewMapper.class);
		example = new UmaDataViewExample();
	}

	@Override
	public void close() throws Exception {
		r.close();
		session.close();
	}

	public UmaDataViewExample getExample() {
		return example;
	}

	public UmaDataViewMapper getMapper() {
		return mapper;
	}

	public Reader getR() {
		return r;
	}

	public SqlSession getSession() {
		return session;
	}

}
