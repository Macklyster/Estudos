package listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

/**
 *
 * @author alex
 */
public class Conexao implements ServletContextListener {

    @Override
    public void contextInitialized(ServletContextEvent sce) {
        br.com.chiquitto.aula.jdbcescola.Conexao.setUrl(null);
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
    }

}
