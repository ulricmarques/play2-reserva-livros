package controllers;

import play.mvc.*;
import play.mvc.Http.*;

import models.*;

public class Secured extends Security.Authenticator {
    
    @Override
    public String getUsername(Context ctx) {
        return ctx.session().get("email");
    }
    
    @Override
    public Result onUnauthorized(Context ctx) {
        return redirect(routes.Application.login());
    }
    
    // Access rights
    
    public static boolean isMemberOf(Long livro) {
        return Livro.isMember(livro,
            Context.current().request().username()
        );
    }
    
    public static boolean isOwnerOf(Long reserva) {
        return Reserva.isOwner(
            reserva,
            Context.current().request().username()
        );
    }
   
    
}