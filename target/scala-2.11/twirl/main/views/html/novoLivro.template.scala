
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._

import play.api.templates.PlayMagic._
import models._
import controllers._
import java.lang._
import java.util._
import scala.collection.JavaConversions._
import scala.collection.JavaConverters._
import play.api.i18n._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.data._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._
import views.html._

/**/
object novoLivro extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[Form[Livro],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(livroForm : Form[Livro]):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.27*/("""

"""),_display_(/*3.2*/main("Novo livro")/*3.20*/ {_display_(Seq[Any](format.raw/*3.22*/("""

   """),format.raw/*5.4*/("""<div class="container">
    <div class="header">
        <ul class="nav nav-pills pull-right">
          <li class="active"><a href="/inicio">Home</a></li>
        </ul>
      </div>
      <div>
      """),_display_(/*12.8*/helper/*12.14*/.form(action=routes.LivroCRUD.gravar())/*12.53*/ {_display_(Seq[Any](format.raw/*12.55*/("""
      """),format.raw/*13.7*/("""<form class="form-horizontal">
		<fieldset>

		<legend>Novo livro</legend>

		<div class="control-group">
		  <div class="controls">
		    """),_display_(/*20.8*/helper/*20.14*/.inputText(livroForm("titulo"))),format.raw/*20.45*/("""
		    """),format.raw/*21.7*/("""<p class="help-block">Informe o título</p>
		  </div>
		</div>
		
		
		<div class="control-group">
		  <div class="controls">
		    """),_display_(/*28.8*/helper/*28.14*/.inputText(livroForm("autor"))),format.raw/*28.44*/("""
		    """),format.raw/*29.7*/("""<p class="help-block">Informe o autor</p>
		  </div>
		</div>
		
		<div class="control-group">
		  <div class="controls">
		    """),_display_(/*35.8*/helper/*35.14*/.inputText(livroForm("editora"))),format.raw/*35.46*/("""
		    """),format.raw/*36.7*/("""<p class="help-block">Informe a editora</p>
		  </div>
		</div>
		
		<div class="control-group">
		  <div class="controls">
		    """),_display_(/*42.8*/helper/*42.14*/.inputText(livroForm("ano"))),format.raw/*42.42*/("""
		    """),format.raw/*43.7*/("""<p class="help-block">Informe o ano</p>
		  </div>
		</div>
		
		<div class="control-group">
		  <div class="controls">
		    """),_display_(/*49.8*/helper/*49.14*/.inputText(livroForm("edicao"))),format.raw/*49.45*/("""
		    """),format.raw/*50.7*/("""<p class="help-block">Informe a edição</p>
		  </div>
		</div>
		<div class="control-group">
		  <div class="controls">
		    """),_display_(/*55.8*/helper/*55.14*/.inputText(livroForm("genero"))),format.raw/*55.45*/("""
		    """),format.raw/*56.7*/("""<p class="help-block">Informe o genero</p>
		  </div>
		</div>
		""")))}),format.raw/*59.4*/("""

		"""),format.raw/*61.3*/("""<div class="control-group">
		  <label class="control-label" for="singlebutton"></label>
		  <div class="controls">
		    <button id="singlebutton" name="singlebutton" class="btn btn-primary">Gravar</button>
		  </div>
		</div>

      </div>
""")))}),format.raw/*69.2*/("""
"""))}
  }

  def render(livroForm:Form[Livro]): play.twirl.api.HtmlFormat.Appendable = apply(livroForm)

  def f:((Form[Livro]) => play.twirl.api.HtmlFormat.Appendable) = (livroForm) => apply(livroForm)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Mon Apr 20 02:19:42 GMT-03:00 2015
                  SOURCE: C:/Users/Ulric/Desktop/play2-casadocodigo-master/app/views/novoLivro.scala.html
                  HASH: e8d2a279efb71d02cfeb13fd8f82b224196e7a04
                  MATRIX: 732->1|845->26|875->31|901->49|940->51|973->58|1208->267|1223->273|1271->312|1311->314|1346->322|1519->469|1534->475|1586->506|1621->514|1787->654|1802->660|1853->690|1888->698|2049->833|2064->839|2117->871|2152->879|2315->1016|2330->1022|2379->1050|2414->1058|2573->1191|2588->1197|2640->1228|2675->1236|2833->1368|2848->1374|2900->1405|2935->1413|3034->1482|3067->1488|3348->1739
                  LINES: 26->1|29->1|31->3|31->3|31->3|33->5|40->12|40->12|40->12|40->12|41->13|48->20|48->20|48->20|49->21|56->28|56->28|56->28|57->29|63->35|63->35|63->35|64->36|70->42|70->42|70->42|71->43|77->49|77->49|77->49|78->50|83->55|83->55|83->55|84->56|87->59|89->61|97->69
                  -- GENERATED --
              */
          