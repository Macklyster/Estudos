/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mb;

import br.com.chiquitto.aula.jdbcescola.dao.AlunoDao;
import br.com.chiquitto.aula.jdbcescola.vo.Aluno;
import java.util.List;
import javax.faces.bean.ManagedBean;

/**
 *
 * @author alex
 */
@ManagedBean
public class AlunoMb {
    private List<Aluno> alunos;

    public List<Aluno> getAlunos() {
        if(alunos == null){
            AlunoDao dao = new AlunoDao();
            alunos = dao.getAll();
        }
        return alunos;
    }
    
    public void apagar(Aluno alunos){
        AlunoDao dao = new AlunoDao();
        
        dao.apagar(alunos);
        
        alunos = null;
    }
}
