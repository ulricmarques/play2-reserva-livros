
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
object reserva extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[List[Reserva],String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(reservas: List[Reserva])(reserva: String):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.44*/("""

"""),_display_(/*3.2*/main("Reservas")/*3.18*/ {_display_(Seq[Any](format.raw/*3.20*/("""

    """),format.raw/*5.5*/("""<div class="container">
    <div class="header">
        <ul class="nav nav-pills pull-right">
	      <li class="active"><a href=""""),_display_(/*8.37*/routes/*8.43*/.ReservaCRUD.novoReserva()),format.raw/*8.69*/("""">Nova reserva</a></li>
          <li class="active"><a href="/inicio">Home</a></li>
        </ul>
        <h2 class="text-muted">Bem-vindo! </h2>
        <h3 class="text-muted">Reservas </h3>
      </div>
     <table class="table table-striped table-bordered" id="example" cellpadding="0" cellspacing="0" border="0" width="100%">
	    <tfoot>
	      """),_display_(/*16.9*/for(reserva <- reservas) yield /*16.33*/ {_display_(Seq[Any](format.raw/*16.35*/("""
	        """),format.raw/*17.10*/("""<tr>
	            <th><a href=""""),_display_(/*18.28*/routes/*18.34*/.ReservaCRUD.detalhar(reserva.id)),format.raw/*18.67*/("""">"""),_display_(/*18.70*/reserva/*18.77*/.dataReserva),format.raw/*18.89*/("""</a></th>
	            
	        </tr>
	             """)))}),format.raw/*21.16*/("""
	    """),format.raw/*22.6*/("""</tfoot>
	   </table>
      </div>

""")))}),format.raw/*26.2*/("""
"""))}
  }

  def render(reservas:List[Reserva],reserva:String): play.twirl.api.HtmlFormat.Appendable = apply(reservas)(reserva)

  def f:((List[Reserva]) => (String) => play.twirl.api.HtmlFormat.Appendable) = (reservas) => (reserva) => apply(reservas)(reserva)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Mon Apr 20 02:19:42 GMT-03:00 2015
                  SOURCE: C:/Users/Ulric/Desktop/play2-casadocodigo-master/app/views/reserva.scala.html
                  HASH: 1a9e1547e9667a82f5dfc6dbb84f1c91b930a49d
                  MATRIX: 739->1|869->43|899->48|923->64|962->66|996->74|1156->208|1170->214|1216->240|1602->600|1642->624|1682->626|1721->637|1781->670|1796->676|1850->709|1880->712|1896->719|1929->731|2017->788|2051->795|2122->836
                  LINES: 26->1|29->1|31->3|31->3|31->3|33->5|36->8|36->8|36->8|44->16|44->16|44->16|45->17|46->18|46->18|46->18|46->18|46->18|46->18|49->21|50->22|54->26
                  -- GENERATED --
              */
          