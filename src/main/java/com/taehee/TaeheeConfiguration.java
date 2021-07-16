package com.taehee;

import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties(TaeheeProperties.class)
public class TaeheeConfiguration {

	@Bean
	@ConditionalOnMissingBean
	public Taehee taehee(TaeheeProperties taeheeProperties) {
		Taehee taehee = new Taehee();
		taehee.setName(taeheeProperties.getName());
		taehee.setAge(taeheeProperties.getAge());
		return taehee;
	}

}
