package com.aql.access;

import java.io.IOException;
import java.io.Reader;
import java.io.Serializable;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.pckeiba.entity.JvdTokubetsuTorokubaExample;
import com.pckeiba.entity.JvdTokubetsuTorokubaMapper;

public class JvdTokubetsuTorokubaSession implements Serializable,AutoCloseable {

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	final private JvdTokubetsuTorokubaMapper mapper;
	final private JvdTokubetsuTorokubaExample example;
	final private Reader r;
	final private SqlSession session;

	public JvdTokubetsuTorokubaSession() throws IOException {
		r = Resources.getResourceAsReader("pckeiba-mybatis-config.xml");
		SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(r);
		session = factory.openSession();
		mapper = session .getMapper(JvdTokubetsuTorokubaMapper.class);
		example = new JvdTokubetsuTorokubaExample();
	}

	@Override
	public void close() throws Exception {
		r.close();
		session.close();
	}

	public JvdTokubetsuTorokubaExample getExample() {
		return example;
	}

	public JvdTokubetsuTorokubaMapper getMapper() {
		return mapper;
	}

	public Reader getR() {
		return r;
	}

	public SqlSession getSession() {
		return session;
	}

}
