package com.aql.access;

import java.io.IOException;
import java.io.Reader;
import java.io.Serializable;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.pckeiba.entity.JvdRaceShosaiExample;
import com.pckeiba.entity.JvdRaceShosaiMapper;

public class JvdRaceShosaiSession implements Serializable,AutoCloseable {

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	final private JvdRaceShosaiMapper mapper;
	final private JvdRaceShosaiExample example;
	final private Reader r;
	final private SqlSession session;

	public JvdRaceShosaiSession() throws IOException {
		r = Resources.getResourceAsReader("pckeiba-mybatis-config.xml");
		SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(r);
		session = factory.openSession();
		mapper = session .getMapper(JvdRaceShosaiMapper.class);
		example = new JvdRaceShosaiExample();
	}

	@Override
	public void close() throws Exception {
		r.close();
		session.close();
	}

	public JvdRaceShosaiExample getExample() {
		return example;
	}

	public JvdRaceShosaiMapper getMapper() {
		return mapper;
	}

	public Reader getR() {
		return r;
	}

	public SqlSession getSession() {
		return session;
	}

}
