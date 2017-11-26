package models;

import java.util.LinkedHashMap;
import java.util.Map;

import javax.persistence.Entity;
import javax.persistence.Id;

import play.data.format.Formats;
import play.data.validation.Constraints;
import play.db.ebean.Model;

@Entity
public class Usuario extends Model {

	private static final long serialVersionUID = 1L;

	@Id
	public Long id;
    
	@Constraints.Required
    @Formats.NonEmpty
    public String email;
    
    @Constraints.Required
    public String name;
    
    @Constraints.Required
    public String password;
	

	public static Model.Finder<Long,Usuario> find = new Model.Finder<Long,Usuario>(Long.class,Usuario.class);

	public static Map<String,String> options() {
		LinkedHashMap<String,String> options = new LinkedHashMap<String,String>();
		for (Usuario c : Usuario.find.orderBy("name").findList()) {
			options.put(c.id.toString(),c.name);
		}
		return options;
	}

	@Override
	public String toString() {
		return name;
	}

}
