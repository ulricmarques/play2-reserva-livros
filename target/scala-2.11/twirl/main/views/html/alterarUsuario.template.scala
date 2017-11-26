
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
object alterarUsuario extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[Long,Form[Usuario],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(id: Long, usuarioForm: Form[Usuario]):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {import helper._

Seq[Any](format.raw/*1.40*/("""

"""),format.raw/*4.1*/("""
"""),_display_(/*5.2*/main("Alterar usuário")/*5.25*/ {_display_(Seq[Any](format.raw/*5.27*/("""

   """),format.raw/*7.4*/("""<div class="container">
    <div class="header">
        <ul class="nav nav-pills pull-right">
          <li class="active"><a href="/inicio">Home</a></li>
        </ul>
      </div>

    <h1>Alterar usuário</h1>

    """),_display_(/*16.6*/form(routes.UserCRUD.alterar(id))/*16.39*/ {_display_(Seq[Any](format.raw/*16.41*/("""

     """),format.raw/*18.6*/("""<fieldset>"""),_display_(/*18.17*/inputText(usuarioForm("nome"), '_label -> "Login")),format.raw/*18.67*/("""</fieldset>
     <fieldset>"""),_display_(/*19.17*/inputPassword(usuarioForm("senha"), '_label -> "Senha")),format.raw/*19.72*/("""</fieldset>

      <div class="control-group">
        <div class="actions">

            <input type="submit" value="Gravar" class="btn btn-primary">

            <a href=""""),_display_(/*26.23*/routes/*26.29*/.UserCRUD.lista()),format.raw/*26.46*/("""" class="btn btn-primary ">Cancelar</a>

    """)))}),format.raw/*28.6*/("""

    """),_display_(/*30.6*/form(routes.UserCRUD.remover(id))/*30.39*/ {_display_(Seq[Any](format.raw/*30.41*/("""
            """),format.raw/*31.13*/("""<input type="submit" value="Remover esse usuário" class="btn danger">
    """)))}),format.raw/*32.6*/("""

        """),format.raw/*34.9*/("""</div>
      </div>

</div>

""")))}),format.raw/*39.2*/("""
"""))}
  }

  def render(id:Long,usuarioForm:Form[Usuario]): play.twirl.api.HtmlFormat.Appendable = apply(id,usuarioForm)

  def f:((Long,Form[Usuario]) => play.twirl.api.HtmlFormat.Appendable) = (id,usuarioForm) => apply(id,usuarioForm)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Mon Apr 20 02:19:42 GMT-03:00 2015
                  SOURCE: C:/Users/Ulric/Desktop/play2-casadocodigo-master/app/views/alterarUsuario.scala.html
                  HASH: d25ba87aeffa6984a6c6a7888606da88b4ab9403
                  MATRIX: 744->1|885->39|913->58|940->60|971->83|1010->85|1041->90|1286->309|1328->342|1368->344|1402->351|1440->362|1511->412|1566->440|1642->495|1843->669|1858->675|1896->692|1972->738|2005->745|2047->778|2087->780|2128->793|2233->868|2270->878|2330->908
                  LINES: 26->1|29->1|31->4|32->5|32->5|32->5|34->7|43->16|43->16|43->16|45->18|45->18|45->18|46->19|46->19|53->26|53->26|53->26|55->28|57->30|57->30|57->30|58->31|59->32|61->34|66->39
                  -- GENERATED --
              */
          