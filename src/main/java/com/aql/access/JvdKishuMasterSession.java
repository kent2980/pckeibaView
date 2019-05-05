package com.aql.access;

import java.io.IOException;
import java.io.Reader;
import java.io.Serializable;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.pckeiba.entity.JvdKishuMasterExample;
import com.pckeiba.entity.JvdKishuMasterMapper;

public class JvdKishuMasterSession implements Serializable,AutoCloseable {

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	final private JvdKishuMasterMapper mapper;
	final private JvdKishuMasterExample example;
	final private Reader r;
	final private SqlSession session;

	public JvdKishuMasterSession() throws IOException {
		r = Resources.getResourceAsReader("pckeiba-mybatis-config.xml");
		SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(r);
		session = factory.openSession();
		mapper = session .getMapper(JvdKishuMasterMapper.class);
		example = new JvdKishuMasterExample();
	}

	@Override
	public void close() throws Exception {
		r.close();
		session.close();
	}

	public JvdKishuMasterExample getExample() {
		return example;
	}

	public JvdKishuMasterMapper getMapper() {
		return mapper;
	}

	public Reader getR() {
		return r;
	}

	public SqlSession getSession() {
		return session;
	}

}
