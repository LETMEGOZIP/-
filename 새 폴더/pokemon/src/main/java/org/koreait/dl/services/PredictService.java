package org.koreait.dl.services;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.io.BufferedReader;
import java.io.InputStream;
import java.util.List;
import java.util.stream.Collectors;

@Lazy
@Service
@Profile("dl")
public class PredictService {
    @Value("${python.run.path}")
    private String runPath;

    @Value("${python.script.path}")
    private String scriptPath;

    @Autowired
    private ObjectMapper om;

    public int[] predict(List<int[]> items){
        try{
            String data = om.writeValueAsString(items);

            ProcessBuilder builder = new ProcessBuilder(runPath, scriptPath + "predict.py", data);
            Process process = builder.start();
            InputStream in = process.getInputStream();

            BufferedReader reader = process.inputReader();
            reader.lines().collect(Collectors.joining());

            return om.readValue(in.readAllBytes(), int[].class);

        } catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }
}
