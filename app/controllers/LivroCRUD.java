package controllers;

import static play.data.Form.form;

import java.util.List;

import models.Livro;
import play.data.Form;
import play.mvc.Controller;
import play.mvc.Result;
import scala.Option;
import securesocial.core.BasicProfile;
import securesocial.core.java.SecureSocial;
import securesocial.core.java.SecuredAction;
import securesocial.core.java.UserAwareAction;
import service.DemoUser;

public class LivroCRUD extends Controller {

	private static final Form<Livro> livroForm = Form.form(Livro.class);

	//@UserAwareAction
	public static Result lista() {

		List<Livro> livros = Livro.find.orderBy("titulo").findList();

		DemoUser user = (DemoUser) ctx().args.get(SecureSocial.USER_KEY);

		String userName = "guest";

		if (user != null) {
			BasicProfile main = user.main;

			if (main != null) {
				Option<String> optUserName = main.fullName();
				userName = optUserName.get();
			}

		}
		
		return ok(views.html.livro.render(livros,userName));

	}

	//@SecuredAction
	public static Result remover(Long id) {
		try {
			Livro.find.ref(id).delete();
			flash("sucesso","Usuário removido com sucesso");
		} catch (Exception e) {
			flash("erro",play.i18n.Messages.get("global.erro"));
		}
		return lista();
	}

	//@SecuredAction
	public static Result novoLivro() {

		return ok(views.html.novoLivro.render(livroForm));

	}

	public static Result detalhar(Long id) {
		Form<Livro> dirForm = form(Livro.class).fill(Livro.find.byId(id));
		return ok(views.html.alterarLivro.render(id,dirForm));
	}

	//@SecuredAction
	public static Result alterar(Long id) {
		form(Livro.class).fill(Livro.find.byId(id));

		Form<Livro> alterarForm = form(Livro.class).bindFromRequest();
		if (alterarForm.hasErrors()) { return badRequest(views.html.alterarLivro.render(id,alterarForm)); }
		alterarForm.get().update(id);
		flash("sucesso","Usuário " + alterarForm.get().titulo + " alterado com sucesso");

		return redirect(routes.LivroCRUD.lista());

	}

	//@SecuredAction
	public static Result gravar() {
		Form<Livro> form = livroForm.bindFromRequest();
		if (form.hasErrors()) {
			flash("erro","Foram identificados problemas no cadastro");
			return badRequest(views.html.novoLivro.render(livroForm));
		}
		Livro livro = form.get();
		livro.save();
		// ou form.get().save();
		flash("sucesso","Registro gravado com sucesso");

		return redirect(routes.LivroCRUD.lista());

	}

}