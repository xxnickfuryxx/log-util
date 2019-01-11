package br.com.autopass.exception;

import br.com.autopass.exception.enums.ComponentEnum;
import br.com.autopass.exception.enums.LevelEnum;
import br.com.autopass.logger.AutopassLogger;

public class Teste {

    private static final AutopassLogger LOGGER =
            AutopassLogger.getInstance(ComponentEnum.APPLICATION, "CCAT", Teste.class);

    public static void main(String args[]) throws AutopassException {

        LOGGER.debug("Iniciando o processo");

        try{
            LOGGER.debug("Variavel não instanciada");
            String a = null;
            
            if(a.equals("")){
                
            }
            
        }catch(AutopassRuntimeException e){
            LOGGER.critical("Erro "+e.getCause());
            e.laucher("Varivel vazia", ComponentEnum.APPLICATION, LevelEnum.CRITICAL, "Teste");
        }
    }
}
