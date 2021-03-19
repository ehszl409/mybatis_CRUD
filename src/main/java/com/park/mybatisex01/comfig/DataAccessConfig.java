package com.park.mybatisex01.comfig;

import java.io.IOException;

import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;

@Configuration
public class DataAccessConfig {

	
	// 목적 : sqlSession 객체를 만들어야 한다.
	// sqlSession = 연결과 인증이 완료 되었다.
	// 이유 : 객체로 CRUD가 가능하다.
	@Bean
	public SqlSessionFactory sqlSessionFactory(DataSource dataSource) throws Exception {
		// SqlSessionFactory의 역할 : 인터페이스 함수로 sqlSession을 만들기 쉽게 해준다.
		// 1. DataSource 등록
		// 2. XML파일 연결
		
		//0. 객체 만들어 주기
		SqlSessionFactoryBean sessionFactoryBean = new SqlSessionFactoryBean();
		
		//1. 데이터 소스 넣어주기
		sessionFactoryBean.setDataSource(dataSource);
		
		//2. 위치를 잡아주기
		sessionFactoryBean.setMapperLocations(
				new PathMatchingResourcePatternResolver().getResources("mapper/*.xml"));
		
		//3. 리턴
		return sessionFactoryBean.getObject();
	}
	
	// sqlSession 만들기
	// 1. sqlSession은 인터페이스여서 직접만들면 버겁기때문에 SqlSessionTemplate을 만들어 준다.
	// @Bean의 역할 리턴타입을 IoC에 등록해주는 것.
	@Bean
	public SqlSessionTemplate sqlSession(SqlSessionFactory sqlSessionFactory) {
		return new SqlSessionTemplate(sqlSessionFactory);
		
	}
}
