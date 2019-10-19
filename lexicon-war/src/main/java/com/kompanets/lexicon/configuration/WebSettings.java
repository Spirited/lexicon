package com.kompanets.lexicon.configuration;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource(value = "classpath:LexiconService/${environment}.properties", ignoreResourceNotFound = false)
public class WebSettings {

}
