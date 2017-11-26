package controllers;

import static play.data.Form.form;

import java.util.List;

import models.Reserva;
import play.data.Form;
import play.mvc.Controller;
import play.mvc.Result;

import play.data.validation.ValidationError;
import scala.Option;
import securesocial.core.BasicProfile;
import securesocial.core.java.SecureSocial;
import securesocial.core.java.SecuredAction;
import securesocial.core.java.UserAwareAction;
import service.DemoUser;

public class ReservaCRUD extends Controller {

	private static final Form<Reserva> reservaForm = Form.form(Reserva.class);

	//@UserAwareAction
	public static Result lista() {

		List<Reserva> reservas = Reserva.find.orderBy("user").findList();

		DemoUser us = (DemoUser) ctx().args.get(SecureSocial.USER_KEY);

		String userName = "guest";

		if (us != null) {
			BasicProfile main = us.main;

			if (main != null) {
				Option<String> optUserName = main.fullName();
				userName = optUserName.get();
			}

		}
		
		return ok(views.html.reserva.render(reservas,userName));

	}

	//@SecuredAction
	public static Result remover(Long id) {
		try {
			Reserva.find.ref(id).delete();
			flash("sucesso","Usuário removido com sucesso");
		} catch (Exception e) {
			flash("erro",play.i18n.Messages.get("global.erro"));
		}
		return lista();
	}

	//@SecuredAction
	public static Result novoReserva() {

		return ok(views.html.novoReserva.render(reservaForm));

	}

	public static Result detalhar(Long id) {
		Form<Reserva> dirForm = form(Reserva.class).fill(Reserva.find.byId(id));
		return ok(views.html.alterarReserva.render(id,dirForm));
	}

	//@SecuredAction
	public static Result alterar(Long id) {
		form(Reserva.class).fill(Reserva.find.byId(id));

		Form<Reserva> alterarForm = form(Reserva.class).bindFromRequest();
		if (alterarForm.hasErrors()) { return badRequest(views.html.alterarReserva.render(id,alterarForm)); }
		alterarForm.get().update(id);
		flash("sucesso","Usuário " + alterarForm.get().user + " alterado com sucesso");

		return redirect(routes.ReservaCRUD.lista());

	}

	//@SecuredAction
	public static Result gravar() {
		Form<Reserva> form = reservaForm.bindFromRequest();
		if (form.hasErrors()) {
			flash("erro","Foram identificados problemas no cadastro");
			return badRequest(views.html.novoReserva.render(reservaForm));
			
		}
		
		
		
		Reserva reserva = form.get();
		reserva.save();
		// ou form.get().save();
		flash("sucesso","Registro gravado com sucesso");

		return redirect(routes.ReservaCRUD.lista());

	}

}