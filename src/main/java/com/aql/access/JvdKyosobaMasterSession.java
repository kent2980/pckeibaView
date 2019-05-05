package com.aql.access;

import java.io.IOException;
import java.io.Reader;
import java.io.Serializable;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.pckeiba.entity.JvdKyosobaMasterExample;
import com.pckeiba.entity.JvdKyosobaMasterMapper;

public class JvdKyosobaMasterSession implements Serializable,AutoCloseable {

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	final private JvdKyosobaMasterMapper mapper;
	final private JvdKyosobaMasterExample example;
	final private Reader r;
	final private SqlSession session;

	public JvdKyosobaMasterSession() throws IOException {
		r = Resources.getResourceAsReader("pckeiba-mybatis-config.xml");
		SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(r);
		session = factory.openSession();
		mapper = session .getMapper(JvdKyosobaMasterMapper.class);
		example = new JvdKyosobaMasterExample();
	}

	@Override
	public void close() throws Exception {
		r.close();
		session.close();
	}

	public JvdKyosobaMasterExample getExample() {
		return example;
	}

	public JvdKyosobaMasterMapper getMapper() {
		return mapper;
	}

	public Reader getR() {
		return r;
	}

	public SqlSession getSession() {
		return session;
	}

}
