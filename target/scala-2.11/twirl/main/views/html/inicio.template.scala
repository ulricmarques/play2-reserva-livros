
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
object inicio extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](_display_(/*1.2*/main("Biblioteca")/*1.20*/ {_display_(Seq[Any](format.raw/*1.22*/("""

"""),format.raw/*3.1*/("""<style>
body """),format.raw/*4.6*/("""{"""),format.raw/*4.7*/("""
  """),format.raw/*5.3*/("""padding-top: 50px;
"""),format.raw/*6.1*/("""}"""),format.raw/*6.2*/("""
"""),format.raw/*7.1*/(""".starter-template """),format.raw/*7.19*/("""{"""),format.raw/*7.20*/("""
  """),format.raw/*8.3*/("""padding: 40px 15px;
  text-align: center;
"""),format.raw/*10.1*/("""}"""),format.raw/*10.2*/("""

"""),format.raw/*12.1*/("""</style>
  <div class="navbar navbar-inverse navbar-fixed-top">
      <div class="container">
        <div class="navbar-header">
          <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse">
          </button>
          <a class="navbar-brand" href="/inicio">Biblioteca</a>
        </div>
        <div class="collapse navbar-collapse">
          <ul class="nav navbar-nav">
            <li><a href="/livro">Lista de livros</a></li>
            <li><a href="/livro/novo">Cadastrar livro</a></li>
            <li><a href="/sobre">Sobre o sistema</a></li>
            
            
          </ul>
          <ul class="nav nav-pills pull-right">	     
          <li class="active"><a href=""""),_display_(/*29.40*/routes/*29.46*/.Application.logout()),format.raw/*29.67*/("""">Sair</a></li>
        </ul>
        </div>
      </div>
    </div>
    <div class="container">
      <div class="starter-template">
        <h1>Reserva de Livros</h1>
      </div>
    </div>


""")))}),format.raw/*41.2*/("""
"""))}
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Mon Apr 20 15:36:13 GMT-03:00 2015
                  SOURCE: C:/Users/Ulric/Desktop/play2-casadocodigo-master/app/views/inicio.scala.html
                  HASH: 033320040c587feade8c595140ab7836f661b76f
                  MATRIX: 799->1|825->19|864->21|892->23|931->36|958->37|987->40|1032->59|1059->60|1086->61|1131->79|1159->80|1188->83|1257->125|1285->126|1314->128|2078->865|2093->871|2135->892|2361->1088
                  LINES: 29->1|29->1|29->1|31->3|32->4|32->4|33->5|34->6|34->6|35->7|35->7|35->7|36->8|38->10|38->10|40->12|57->29|57->29|57->29|69->41
                  -- GENERATED --
              */
          