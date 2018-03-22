package com.springinaction.config;

import org.springframework.context.annotation.Import;

@Import({CDConfig.class, CDPlayerConfig.class})
public class SoundSystemConfig {


}
