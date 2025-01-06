package org.koreait.dl.services;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Profile;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Lazy
@Service
@Profile("dl")
public class TrainService {

    @Value("${python.run.path}")
    private String runPath;

    @Value("${python.script.path}")
    private String scriptPath;

    @Value("${dl.data.url}")
    private String dataUrl;

    @Scheduled(cron = "0 0 1 * * *")
    public void process() {
        try {
            ProcessBuilder builder = new ProcessBuilder(runPath, scriptPath + "train.py", dataUrl);

            Process process = builder.start();
            int exitCode = process.waitFor();

        } catch (Exception e) {e.printStackTrace();}
    }
}