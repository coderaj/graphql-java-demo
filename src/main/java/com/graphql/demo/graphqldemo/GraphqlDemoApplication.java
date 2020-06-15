package com.graphql.demo.graphqldemo;

import com.graphql.demo.resolvers.Query;
import com.graphql.demo.service.PersonRepository;
import graphql.schema.GraphQLSchema;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@SpringBootApplication
public class GraphqlDemoApplication {
	public static void main(String[] args) {
		SpringApplication.run(GraphqlDemoApplication.class, args);
	}

	@Configuration
	static class ApplicationSecurity extends WebSecurityConfigurerAdapter {

		@Override
		public void configure(WebSecurity web) {
			web
					.ignoring()
					.antMatchers("/**");
		}
	}

	@Bean
	GraphQLSchema schema(){
		PersonRepository personRepository = new PersonRepository();

		return GraphQLSchema.newSchema()
				.query()
				.build()
	}
}
