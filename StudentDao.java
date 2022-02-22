package com.mondee;

import javax.annotation.PostConstruct;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Service
@Repository
public class StudentDao extends JdbcDaoSupport{

	@Autowired
	DataSource dataSource;

	@PostConstruct
	private void intialize() {
		setDataSource(dataSource);
	}

	public void insert(Student st) {
		getJdbcTemplate().execute("insert into student values("+st.getId()+","+st.getMarks()+",'"+st.getName()+"')");

	}
}