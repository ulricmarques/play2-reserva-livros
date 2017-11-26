
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
object usuario extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[List[Usuario],String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(usuarios: List[Usuario])(usuario: String):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.44*/("""

"""),_display_(/*3.2*/main("Usuários")/*3.18*/ {_display_(Seq[Any](format.raw/*3.20*/("""

    """),format.raw/*5.5*/("""<div class="container">
    <div class="header">
        <ul class="nav nav-pills pull-right">
	      <li class="active"><a href=""""),_display_(/*8.37*/routes/*8.43*/.UserCRUD.novoUsuario()),format.raw/*8.66*/("""">Novo usuário</a></li>
          <li class="active"><a href="/inicio">Home</a></li>
        </ul>
        <h2 class="text-muted">Bem-vindo! </h2>
        <h3 class="text-muted">Usuários </h3>
      </div>
     <table class="table table-striped table-bordered" id="example" cellpadding="0" cellspacing="0" border="0" width="100%">
	    <tfoot>
	      """),_display_(/*16.9*/for(usuario <- usuarios) yield /*16.33*/ {_display_(Seq[Any](format.raw/*16.35*/("""
	        """),format.raw/*17.10*/("""<tr>
	            <th><a href=""""),_display_(/*18.28*/routes/*18.34*/.UserCRUD.detalhar(usuario.id)),format.raw/*18.64*/("""">"""),_display_(/*18.67*/usuario/*18.74*/.name),format.raw/*18.79*/("""</a></th>
	            
	        </tr>
	             """)))}),format.raw/*21.16*/("""
	    """),format.raw/*22.6*/("""</tfoot>
	   </table>
      </div>

""")))}),format.raw/*26.2*/("""
"""))}
  }

  def render(usuarios:List[Usuario],usuario:String): play.twirl.api.HtmlFormat.Appendable = apply(usuarios)(usuario)

  def f:((List[Usuario]) => (String) => play.twirl.api.HtmlFormat.Appendable) = (usuarios) => (usuario) => apply(usuarios)(usuario)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Mon Apr 20 02:19:42 GMT-03:00 2015
                  SOURCE: C:/Users/Ulric/Desktop/play2-casadocodigo-master/app/views/usuario.scala.html
                  HASH: 738978779309d2f64b577c0f4aa0fa6031e73e73
                  MATRIX: 739->1|869->43|897->46|921->62|960->64|992->70|1149->201|1163->207|1206->230|1584->582|1624->606|1664->608|1702->618|1761->650|1776->656|1827->686|1857->689|1873->696|1899->701|1984->755|2017->761|2084->798
                  LINES: 26->1|29->1|31->3|31->3|31->3|33->5|36->8|36->8|36->8|44->16|44->16|44->16|45->17|46->18|46->18|46->18|46->18|46->18|46->18|49->21|50->22|54->26
                  -- GENERATED --
              */
          