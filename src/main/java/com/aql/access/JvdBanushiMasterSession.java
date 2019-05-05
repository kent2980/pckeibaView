package com.aql.access;

import java.io.IOException;
import java.io.Reader;
import java.io.Serializable;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.pckeiba.entity.JvdBanushiMasterExample;
import com.pckeiba.entity.JvdBanushiMasterMapper;

public class JvdBanushiMasterSession implements Serializable,AutoCloseable {

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	final private JvdBanushiMasterMapper mapper;
	final private JvdBanushiMasterExample example;
	final private Reader r;
	final private SqlSession session;

	public JvdBanushiMasterSession() throws IOException {
		r = Resources.getResourceAsReader("pckeiba-mybatis-config.xml");
		SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(r);
		session = factory.openSession();
		mapper = session .getMapper(JvdBanushiMasterMapper.class);
		example = new JvdBanushiMasterExample();
	}

	@Override
	public void close() throws Exception {
		r.close();
		session.close();
	}

	public JvdBanushiMasterExample getExample() {
		return example;
	}

	public JvdBanushiMasterMapper getMapper() {
		return mapper;
	}

	public Reader getR() {
		return r;
	}

	public SqlSession getSession() {
		return session;
	}

}
