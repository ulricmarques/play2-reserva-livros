package models;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import javax.persistence.Entity;
import javax.persistence.Id;

import play.data.validation.Constraints;
import play.db.ebean.Model;

@Entity
public class Livro extends Model {

	private static final long serialVersionUID = 1L;

	@Id
	public Long id;

	@Constraints.Required
	public String titulo;
	
	@Constraints.Required
	public String autor;
	public String editora;
	public String ano;
	public String edicao;
	public String genero;
	
	

	public static Model.Finder<Long,Livro> find = new Model.Finder<Long,Livro>(Long.class,Livro.class);

	public static Map<String,String> options() {
		LinkedHashMap<String,String> options = new LinkedHashMap<String,String>();
		for (Livro c : Livro.find.orderBy("titulo").findList()) {
			options.put(c.id.toString(),c.titulo);
		}
		return options;
	}

	@Override
	public String toString() {
		return titulo;
	}
	public static boolean isMember(Long project, String user) {
        return find.where()
            .eq("members.email", user)
            .eq("id", project)
            .findRowCount() > 0;
    } 
	public static List<Livro> findInvolving(String user) {
        return find.where()
            .eq("members.email", user)
            .findList();
    }

}