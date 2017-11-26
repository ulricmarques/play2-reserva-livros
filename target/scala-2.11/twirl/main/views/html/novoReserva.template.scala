
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
object novoReserva extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[Form[Reserva],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(reservaForm : Form[Reserva]):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.31*/("""

"""),_display_(/*3.2*/main("Reservar livro")/*3.24*/ {_display_(Seq[Any](format.raw/*3.26*/("""

   """),format.raw/*5.4*/("""<div class="container">
    <div class="header">
        <ul class="nav nav-pills pull-right">
          <li class="active"><a href="/inicio">Home</a></li>
        </ul>
      </div>
      <div>
      """),_display_(/*12.8*/helper/*12.14*/.form(action=routes.ReservaCRUD.gravar())/*12.55*/ {_display_(Seq[Any](format.raw/*12.57*/("""
      """),format.raw/*13.7*/("""<form class="form-horizontal">
		<fieldset>

		<legend>Nova reserva</legend>

		
		<div class="control-group">
		  <div class="controls">
		    """),_display_(/*21.8*/helper/*21.14*/.inputText(reservaForm("user"))),format.raw/*21.45*/("""
		    """),format.raw/*22.7*/("""<p class="help-block">Informe o usuário</p>
		  </div>
		</div>
		
		<div class="control-group">
		  <div class="controls">
		    """),_display_(/*28.8*/helper/*28.14*/.inputText(reservaForm("dataReserva"))),format.raw/*28.52*/("""
		    """),format.raw/*29.7*/("""<p class="help-block">Informe a data de reserva</p>
		  </div>
		</div>
		
		<div class="control-group">
		  <div class="controls">
		    """),_display_(/*35.8*/helper/*35.14*/.inputText(reservaForm("dataDevolucao"))),format.raw/*35.54*/("""
		    """),format.raw/*36.7*/("""<p class="help-block">Informe a data de devolução</p>
		  </div>
		</div>
		
		
		""")))}),format.raw/*41.4*/("""

		"""),format.raw/*43.3*/("""<div class="control-group">
		  <label class="control-label" for="singlebutton"></label>
		  <div class="controls">
		    <button id="singlebutton" name="singlebutton" class="btn btn-primary">Gravar</button>
		  </div>
		</div>

      </div>
""")))}))}
  }

  def render(reservaForm:Form[Reserva]): play.twirl.api.HtmlFormat.Appendable = apply(reservaForm)

  def f:((Form[Reserva]) => play.twirl.api.HtmlFormat.Appendable) = (reservaForm) => apply(reservaForm)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Mon Apr 20 02:19:42 GMT-03:00 2015
                  SOURCE: C:/Users/Ulric/Desktop/play2-casadocodigo-master/app/views/novoReserva.scala.html
                  HASH: 3903adff70a44d1af5f5468d81df51621b17b62f
                  MATRIX: 736->1|853->30|883->35|913->57|952->59|985->66|1220->275|1235->281|1285->322|1325->324|1360->332|1539->485|1554->491|1606->522|1641->530|1804->667|1819->673|1878->711|1913->719|2084->864|2099->870|2160->910|2195->918|2313->1006|2346->1012
                  LINES: 26->1|29->1|31->3|31->3|31->3|33->5|40->12|40->12|40->12|40->12|41->13|49->21|49->21|49->21|50->22|56->28|56->28|56->28|57->29|63->35|63->35|63->35|64->36|69->41|71->43
                  -- GENERATED --
              */
          