package dev.emrx.di.profiles;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile(value = {"dev", "default"})
public class DevEnvironment implements EnvironmentService {

    @Override
    public String getEnvironment() {
        return "dev";
    }
}
