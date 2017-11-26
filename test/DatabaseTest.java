import static org.fest.assertions.Assertions.assertThat;

import java.io.File;

import models.Usuario;
import models.Usuario;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import play.Configuration;
import play.test.Helpers;

import com.typesafe.config.Config;
import com.typesafe.config.ConfigFactory;

public class DatabaseTest {

	private static Configuration additionalConfigurations;

	public static play.test.FakeApplication app;

	@BeforeClass
	public static void startApp() {

		Config additionalConfig = ConfigFactory.parseFile(new File("conf/testes.conf"));
		additionalConfigurations = new Configuration(additionalConfig);
		System.out.println(additionalConfigurations.asMap());

		app = Helpers.fakeApplication(additionalConfigurations.asMap());

		Helpers.start(app);
	}

	@AfterClass
	public static void stopApp() {
		Helpers.stop(app);
	}

	@Test
	public void testaDiretor() {

		Usuario diretor = new Usuario();
		diretor.nome = "Fernando Meireles";
		diretor.save();

		assertThat(diretor.id).isNotNull();

	}

	@Test
	public void testaUsuario() {

		Usuario usuario = Usuario.find.byId(32l);
		assertThat("A Clockwork Orange").isEqualTo(usuario.nome);

	}

}
