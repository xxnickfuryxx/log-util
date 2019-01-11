package br.com.autopass.exception.service;

import br.com.autopass.exception.model.Log;
import br.com.autopass.exception.utils.Utils;
import org.springframework.http.converter.json.GsonHttpMessageConverter;
import org.springframework.web.client.RestTemplate;

public class LogService {

    public void consumeService(Log log){
        RestTemplate template = new RestTemplate();
        template.getMessageConverters().add(new GsonHttpMessageConverter());
        template.postForEntity(
                Utils.getProperties().getProperty("autopass.log.service.url"), log, String.class);
    }

}
