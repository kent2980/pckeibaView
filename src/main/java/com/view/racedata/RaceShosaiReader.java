package com.view.racedata;

import java.io.IOException;
import java.io.Reader;
import java.io.Serializable;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.example.entity.ViewRaceShosaiExample;
import com.example.entity.ViewRaceShosaiMapper;

public class RaceShosaiReader implements Serializable,AutoCloseable {

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	final private ViewRaceShosaiMapper mapper;
	final private ViewRaceShosaiExample example;
	final private Reader r;
	final private SqlSession session;

	public RaceShosaiReader() throws IOException {
		r = Resources.getResourceAsReader("mybatis-config.xml");
		SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(r);
		session = factory.openSession();
		mapper = session .getMapper(ViewRaceShosaiMapper.class);
		example = new ViewRaceShosaiExample();
	}

	@Override
	public void close() throws Exception {
		r.close();
		session.close();
	}

	public ViewRaceShosaiExample getExample() {
		return example;
	}

	public ViewRaceShosaiMapper getMapper() {
		return mapper;
	}

	public Reader getR() {
		return r;
	}

	public SqlSession getSession() {
		return session;
	}

}
