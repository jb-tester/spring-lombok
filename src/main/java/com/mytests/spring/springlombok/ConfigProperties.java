package com.mytests.spring.springlombok;

import lombok.*;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.ConstructorBinding;

@Getter
@RequiredArgsConstructor
@ConfigurationProperties(prefix = "my.foo")
@ConstructorBinding
public class ConfigProperties {
    @NonNull
    private final String bar;
}