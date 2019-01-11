package br.com.autopass.exception;

import br.com.autopass.exception.enums.ComponentEnum;
import br.com.autopass.exception.enums.LevelEnum;
import br.com.autopass.exception.model.Log;
import br.com.autopass.exception.service.LogService;

public class AutopassException extends Exception{

    public AutopassException(String msg,
                             ComponentEnum component,
                             LevelEnum level,
                             String context){
        super(msg);
        LogService logService = new LogService();
        logService.consumeService(new Log(component.getType(),
                                            component.getDescription(),
                                            level.getType(),
                                            level.getDescription(),
                                            context,
                                            msg));
    }

    public void laucher(String msg,
                             ComponentEnum component,
                             LevelEnum level,
                             String context){

        printStackTrace();
        LogService logService = new LogService();
        logService.consumeService(new Log(component.getType(),
                                            component.getDescription(),
                                            level.getType(),
                                            level.getDescription(),
                                            context,
                                            msg));
    }

}
