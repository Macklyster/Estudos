package listeners;

import br.com.chiquitto.aula.jdbcescola.Conexao;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class ConexaoListener implements ServletContextListener {

    @Override
    public void contextInitialized(ServletContextEvent sce) {
        Conexao.setUrl("jdbc:sqlite:/home/alex/Server/Estudos/Faculdade/Framework de Desenvolvimento Web/Aula2009/jsf-jdbc-escola-1bim/data/escola.sqlite.db");
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
    }
    
}
