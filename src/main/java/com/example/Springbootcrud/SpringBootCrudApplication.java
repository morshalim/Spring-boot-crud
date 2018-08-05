package com.example.Springbootcrud;

import javax.sql.DataSource;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseBuilder;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseType;

@SpringBootApplication
public class SpringBootCrudApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootCrudApplication.class, args);
	}
	
	@Bean
	public DataSource getDataSource() {
		
		/*return DataSourceBuilder
				.create()
				.username("root")
				.password("saikiran")
				.driverClassName("com.mysql.jdbc.Driver")
				.url("jdbc:mysql://192.168.43.217:3306/saikiran")
				.build();*/
		
		EmbeddedDatabaseBuilder edb=new EmbeddedDatabaseBuilder();
		edb.setType(EmbeddedDatabaseType.H2);
		return edb.build(); 
	}
}
