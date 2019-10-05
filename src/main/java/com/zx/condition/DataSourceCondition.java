package com.zx.condition;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.env.Environment;
import org.springframework.core.type.AnnotatedTypeMetadata;

public class DataSourceCondition implements Condition {
    @Override
    public boolean matches(ConditionContext conditionContext, AnnotatedTypeMetadata annotatedTypeMetadata) {
        Environment env = conditionContext.getEnvironment();
        return env.containsProperty("jdbc.database.driver")
                && env.containsProperty("jdbc.database.url")
                && env.containsProperty("jdbc.database.username")
                && env.containsProperty("jdbc.database.password");
    }
}
