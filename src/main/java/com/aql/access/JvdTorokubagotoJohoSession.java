package com.aql.access;

import java.io.IOException;
import java.io.Reader;
import java.io.Serializable;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.pckeiba.entity.JvdTorokubagotoJohoExample;
import com.pckeiba.entity.JvdTorokubagotoJohoMapper;

public class JvdTorokubagotoJohoSession implements Serializable,AutoCloseable {

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	final private JvdTorokubagotoJohoMapper mapper;
	final private JvdTorokubagotoJohoExample example;
	final private Reader r;
	final private SqlSession session;

	public JvdTorokubagotoJohoSession() throws IOException {
		r = Resources.getResourceAsReader("pckeiba-mybatis-config.xml");
		SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(r);
		session = factory.openSession();
		mapper = session .getMapper(JvdTorokubagotoJohoMapper.class);
		example = new JvdTorokubagotoJohoExample();
	}

	@Override
	public void close() throws Exception {
		r.close();
		session.close();
	}

	public JvdTorokubagotoJohoExample getExample() {
		return example;
	}

	public JvdTorokubagotoJohoMapper getMapper() {
		return mapper;
	}

	public Reader getR() {
		return r;
	}

	public SqlSession getSession() {
		return session;
	}

}
