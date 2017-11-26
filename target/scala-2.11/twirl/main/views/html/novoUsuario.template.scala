
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
object novoUsuario extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[Form[Usuario],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(usuarioForm : Form[Usuario]):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.31*/("""

"""),_display_(/*3.2*/main("Novo usuário")/*3.22*/ {_display_(Seq[Any](format.raw/*3.24*/("""

   """),format.raw/*5.4*/("""<div class="container">
    <div class="header">
        <ul class="nav nav-pills pull-right">
          <li class="active"><a href="/inicio">Home</a></li>
        </ul>
      </div>
      <div>
      """),_display_(/*12.8*/helper/*12.14*/.form(action=routes.UserCRUD.gravar())/*12.52*/ {_display_(Seq[Any](format.raw/*12.54*/("""
      """),format.raw/*13.7*/("""<form class="form-horizontal">
		<fieldset>

		<legend>Novo usuário</legend>

		<div class="control-group">
		  <div class="controls">
		    """),_display_(/*20.8*/helper/*20.14*/.inputText(usuarioForm("email"))),format.raw/*20.46*/("""
		    """),format.raw/*21.7*/("""<p class="help-block">Informe o email</p>
		  </div>
		</div>
		
		<div class="control-group">
		  <div class="controls">
		    """),_display_(/*27.8*/helper/*27.14*/.inputText(usuarioForm("name"))),format.raw/*27.45*/("""
		    """),format.raw/*28.7*/("""<p class="help-block">Informe o nome de usuário</p>
		  </div>
		</div>
		
		<div class="control-group">
		  <div class="controls">
		    """),_display_(/*34.8*/helper/*34.14*/.inputText(usuarioForm("password"))),format.raw/*34.49*/("""
		    """),format.raw/*35.7*/("""<p class="help-block">Informe a senha</p>
		  </div>
		</div>
		""")))}),format.raw/*38.4*/("""

		"""),format.raw/*40.3*/("""<div class="control-group">
		  <label class="control-label" for="singlebutton"></label>
		  <div class="controls">
		    <button id="singlebutton" name="singlebutton" class="btn btn-primary">Gravar</button>
		  </div>
		</div>

      </div>
""")))}),format.raw/*48.2*/("""
"""))}
  }

  def render(usuarioForm:Form[Usuario]): play.twirl.api.HtmlFormat.Appendable = apply(usuarioForm)

  def f:((Form[Usuario]) => play.twirl.api.HtmlFormat.Appendable) = (usuarioForm) => apply(usuarioForm)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Mon Apr 20 02:19:42 GMT-03:00 2015
                  SOURCE: C:/Users/Ulric/Desktop/play2-casadocodigo-master/app/views/novoUsuario.scala.html
                  HASH: f3cc3b4d39e0c72e68d0cc80a5580c96095b8c85
                  MATRIX: 736->1|853->30|881->33|909->53|948->55|979->60|1207->262|1222->268|1269->306|1309->308|1343->315|1511->457|1526->463|1579->495|1613->502|1768->631|1783->637|1835->668|1869->675|2034->814|2049->820|2105->855|2139->862|2234->927|2265->931|2538->1174
                  LINES: 26->1|29->1|31->3|31->3|31->3|33->5|40->12|40->12|40->12|40->12|41->13|48->20|48->20|48->20|49->21|55->27|55->27|55->27|56->28|62->34|62->34|62->34|63->35|66->38|68->40|76->48
                  -- GENERATED --
              */
          