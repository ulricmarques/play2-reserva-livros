package controllers;

import static play.data.Form.form;

import java.util.List;

import models.Usuario;
import play.data.Form;
import play.mvc.Controller;
import play.mvc.Result;
import scala.Option;
import securesocial.core.BasicProfile;
import securesocial.core.java.SecureSocial;
import securesocial.core.java.SecuredAction;
import securesocial.core.java.UserAwareAction;
import service.DemoUser;

public class UserCRUD extends Controller {

	private static final Form<Usuario> usuarioForm = Form.form(Usuario.class);

	//@UserAwareAction
	public static Result lista() {

		List<Usuario> usuarios = Usuario.find.orderBy("name").findList();

		DemoUser user = (DemoUser) ctx().args.get(SecureSocial.USER_KEY);

		String userName = "guest";

		if (user != null) {
			BasicProfile main = user.main;

			if (main != null) {
				Option<String> optUserName = main.fullName();
				userName = optUserName.get();
			}

		}
		
		return ok(views.html.usuario.render(usuarios,userName));

	}

	//@SecuredAction
	public static Result remover(Long id) {
		try {
			Usuario.find.ref(id).delete();
			flash("sucesso","Usuário removido com sucesso");
		} catch (Exception e) {
			flash("erro",play.i18n.Messages.get("global.erro"));
		}
		return lista();
	}

	//@SecuredAction
	public static Result novoUsuario() {

		return ok(views.html.novoUsuario.render(usuarioForm));

	}

	public static Result detalhar(Long id) {
		Form<Usuario> dirForm = form(Usuario.class).fill(Usuario.find.byId(id));
		return ok(views.html.alterarUsuario.render(id,dirForm));
	}

	//@SecuredAction
	public static Result alterar(Long id) {
		form(Usuario.class).fill(Usuario.find.byId(id));

		Form<Usuario> alterarForm = form(Usuario.class).bindFromRequest();
		if (alterarForm.hasErrors()) { return badRequest(views.html.alterarUsuario.render(id,alterarForm)); }
		alterarForm.get().update(id);
		flash("sucesso","Usuário " + alterarForm.get().name + " alterado com sucesso");

		return redirect(routes.UserCRUD.lista());

	}

	//@SecuredAction
	public static Result gravar() {
		Form<Usuario> form = usuarioForm.bindFromRequest();
		if (form.hasErrors()) {
			flash("erro","Foram identificados problemas no cadastro");
			return badRequest(views.html.novoUsuario.render(usuarioForm));
		}
		Usuario usuario = form.get();
		usuario.save();
		// ou form.get().save();
		flash("sucesso","Registro gravado com sucesso");

		return redirect(routes.UserCRUD.lista());

	}

}
