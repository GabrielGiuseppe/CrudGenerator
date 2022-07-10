package com.questgames.crud.generator.configuration;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EntityScan("com.questgames.crud.generator")
@EnableJpaRepositories("com.questgames.crud.generator")
@EnableAsync
@EnableTransactionManagement
public class EntityConfiguration {
}
