package controllers;

import play.mvc.Controller;
import play.mvc.Result;
import scala.Option;
import securesocial.core.BasicProfile;
import securesocial.core.java.SecureSocial;
import service.DemoUser;
import models.User;

public class Inicio extends Controller {

	public static Result index() {

		DemoUser user = (DemoUser) ctx().args.get(SecureSocial.USER_KEY);

		String userName = "guest";

		if (user != null) {
			BasicProfile main = user.main;

			if (main != null) {
				Option<String> optUserName = main.fullName();
				userName = optUserName.get();
			}

		}
		return ok(views.html.inicio.render());

	}
}
