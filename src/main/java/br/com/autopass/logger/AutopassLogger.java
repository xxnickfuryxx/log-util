package br.com.autopass.logger;

import br.com.autopass.exception.enums.ComponentEnum;
import br.com.autopass.exception.enums.LevelEnum;
import br.com.autopass.exception.model.Log;
import br.com.autopass.exception.service.LogService;

import java.util.logging.Level;
import java.util.logging.Logger;

public class AutopassLogger {

    private LevelEnum level;
    private ComponentEnum component;
    private String context;
    private LogService logService;
    private Logger logGeneric;

    public static AutopassLogger getInstance(ComponentEnum component,
                                        String context, Class classes){

        AutopassLogger logger = new AutopassLogger();
        logger.component = component;
        logger.context = context;
        logger.logGeneric = Logger.getLogger(classes.getName());
        logger.logService = new LogService();

        return logger;
    }

    public void critical(String message){
        this.level = LevelEnum.CRITICAL;
        logGeneric.setLevel(Level.SEVERE);
        logGeneric.severe(message);
        sendLog(message);
    }

    public void error(String message){
        this.level = LevelEnum.ERROR;
        logGeneric.setLevel(Level.SEVERE);
        logGeneric.severe(message);
        sendLog(message);
    }

    public void warn(String message){
        this.level = LevelEnum.WARN;
        logGeneric.setLevel(Level.WARNING);
        logGeneric.warning(message);
        sendLog(message);
    }

    public void info(String message){
        this.level = LevelEnum.INFO;
        logGeneric.setLevel(Level.INFO);
        logGeneric.info(message);
        sendLog(message);
    }

    public void debug(String message){
        this.level = LevelEnum.DEBUG;
        logGeneric.setLevel(Level.FINEST);
        logGeneric.finest(message);
        sendLog(message);
    }

    private void sendLog(String message){
        logService.consumeService(new Log(component.getType(),
                                            component.getDescription(),
                                            level.getType(),
                                            level.getDescription(),
                                            context,
                                            message));
    }
}
