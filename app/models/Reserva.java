package models;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import javax.persistence.Entity;
import javax.persistence.Id;

import play.data.validation.Constraints;
import play.db.ebean.Model;

@Entity
public class Reserva extends Model {

	private static final long serialVersionUID = 1L;

	@Id
	public Long id;

	@Constraints.Required
	public String user;
	
	@Constraints.Required
	public String dataDevolucao;
	
	@Constraints.Required
	public String dataReserva;

	

	public static Model.Finder<Long,Reserva> find = new Model.Finder<Long,Reserva>(Long.class,Reserva.class);

	public static Map<String,String> options() {
		LinkedHashMap<String,String> options = new LinkedHashMap<String,String>();
		for (Reserva c : Reserva.find.orderBy("dataReserva").findList()) {
			options.put(c.id.toString(),c.dataReserva);
		}
		return options;
	}

	@Override
	public String toString() {
		return dataReserva;
	}
	public static boolean isOwner(Long task, String user) {
        return find.where()
            .eq("project.members.email", user)
            .eq("id", task)
            .findRowCount() > 0;
    }
	public static List<Reserva> findTodoInvolving(String user) {
	       return find.fetch("project")
	           .where()
	                .eq("done", false)
	                .eq("project.members.email", user)
	           .findList();
	    }

}