package controllers;

import models.Livro;
import models.Reserva;
import models.User;
import play.data.Form;
import play.mvc.*;
import views.html.index;
import static play.data.Form.form;
import play.data.*;

public class Application extends Controller {
	@Security.Authenticated(Secured.class)
	public static Result index() {
		return ok(index.render("Your new application is ready."));
	}
	

	public static Result sobre() {
		// ok("Sobre");
		return ok(views.html.sobre.render("Top 100 filmes Cult",play.core.PlayVersion.current()));
	}
	
public static class Login {
        
        public String email;
        public String password;
        
        public String validate() {
            if(User.authenticate(email, password) == null) {
                return "Invalid user or password";
            }
            return null;
        }
        
    }

    /**
     * Login page.
     */
    public static Result login() {
        return ok(
            views.html.login.render(form(Login.class))
        );
    }
    
    /**
     * Handle login form submission.
     */
    public static Result authenticate() {
        Form<Login> loginForm = form(Login.class).bindFromRequest();
        if(loginForm.hasErrors()) {
            return badRequest(views.html.login.render(loginForm));
        } else {
            session("email", loginForm.get().email);
            return ok(views.html.inicio.render()
            );
        }
    }

    /**
     * Logout and clean the session.
     */
    public static Result logout() {
        session().clear();
        flash("success", "You've been logged out");
        return redirect(
            routes.Application.login()
        );
    }

}
