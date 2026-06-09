package com.pluralsight.sneakerdrops;

import com.pluralsight.sneakerdrops.service.DropService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class StartUpRunner implements CommandLineRunner {

    private final DropService dropService;
@Autowired
    public StartUpRunner(DropService dropService) {
        this.dropService = dropService;
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println(dropService.getStatus());
    }
}
