package com.aql.access;

import java.io.IOException;
import java.io.Reader;
import java.io.Serializable;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.pckeiba.entity.JvdChokyoshiMasterExample;
import com.pckeiba.entity.JvdChokyoshiMasterMapper;

public class JvdChokyoshiMasterSession implements Serializable,AutoCloseable {

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	final private JvdChokyoshiMasterMapper mapper;
	final private JvdChokyoshiMasterExample example;
	final private Reader r;
	final private SqlSession session;

	public JvdChokyoshiMasterSession() throws IOException {
		r = Resources.getResourceAsReader("pckeiba-mybatis-config.xml");
		SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(r);
		session = factory.openSession();
		mapper = session .getMapper(JvdChokyoshiMasterMapper.class);
		example = new JvdChokyoshiMasterExample();
	}

	@Override
	public void close() throws Exception {
		r.close();
		session.close();
	}

	public JvdChokyoshiMasterExample getExample() {
		return example;
	}

	public JvdChokyoshiMasterMapper getMapper() {
		return mapper;
	}

	public Reader getR() {
		return r;
	}

	public SqlSession getSession() {
		return session;
	}

}
