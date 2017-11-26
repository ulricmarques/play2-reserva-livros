
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
object alterarReserva extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[Long,Form[Reserva],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(id: Long, reservaForm: Form[Reserva]):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {import helper._

Seq[Any](format.raw/*1.40*/("""

"""),format.raw/*4.1*/("""
"""),_display_(/*5.2*/main("Alterar reserva")/*5.25*/ {_display_(Seq[Any](format.raw/*5.27*/("""

   """),format.raw/*7.4*/("""<div class="container">
    <div class="header">
        <ul class="nav nav-pills pull-right">
          <li class="active"><a href="/inicio">Home</a></li>
        </ul>
      </div>
      
   <div class="container">
    <div class="header">
        <ul class="nav nav-pills pull-right">
          <li class="active"><a href="/">Reservar</a></li>
        </ul>
      </div>

    <h1>Alterar reserva</h1>

    """),_display_(/*23.6*/form(routes.ReservaCRUD.alterar(id))/*23.42*/ {_display_(Seq[Any](format.raw/*23.44*/("""

     """),format.raw/*25.6*/("""<fieldset>"""),_display_(/*25.17*/inputText(reservaForm("user"), '_label -> "Usuário")),format.raw/*25.69*/("""</fieldset>
     <fieldset>"""),_display_(/*26.17*/inputText(reservaForm("dataReserva"), '_label -> "Data de Reserva")),format.raw/*26.84*/("""</fieldset>
     <fieldset>"""),_display_(/*27.17*/inputText(reservaForm("datadevolucao"), '_label -> "Data de Devolução")),format.raw/*27.88*/("""</fieldset>
     
      <div class="control-group">
        <div class="actions">

            <input type="submit" value="Gravar" class="btn btn-primary">

            <a href=""""),_display_(/*34.23*/routes/*34.29*/.ReservaCRUD.lista()),format.raw/*34.49*/("""" class="btn btn-primary ">Cancelar</a>

    """)))}),format.raw/*36.6*/("""

    """),_display_(/*38.6*/form(routes.ReservaCRUD.remover(id))/*38.42*/ {_display_(Seq[Any](format.raw/*38.44*/("""
            """),format.raw/*39.13*/("""<input type="submit" value="Remover esse reserva" class="btn danger">
    """)))}),format.raw/*40.6*/("""

        """),format.raw/*42.9*/("""</div>
      </div>

</div>

""")))}),format.raw/*47.2*/("""
"""))}
  }

  def render(id:Long,reservaForm:Form[Reserva]): play.twirl.api.HtmlFormat.Appendable = apply(id,reservaForm)

  def f:((Long,Form[Reserva]) => play.twirl.api.HtmlFormat.Appendable) = (id,reservaForm) => apply(id,reservaForm)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Mon Apr 20 02:19:42 GMT-03:00 2015
                  SOURCE: C:/Users/Ulric/Desktop/play2-casadocodigo-master/app/views/alterarReserva.scala.html
                  HASH: 398358bb776fb610ff6e43857a90468aac2ec020
                  MATRIX: 744->1|885->39|915->61|943->64|974->87|1013->89|1046->96|1498->522|1543->558|1583->560|1619->569|1657->580|1730->632|1786->661|1874->728|1930->757|2022->828|2235->1014|2250->1020|2291->1040|2369->1088|2404->1097|2449->1133|2489->1135|2531->1149|2637->1225|2676->1237|2741->1272
                  LINES: 26->1|29->1|31->4|32->5|32->5|32->5|34->7|50->23|50->23|50->23|52->25|52->25|52->25|53->26|53->26|54->27|54->27|61->34|61->34|61->34|63->36|65->38|65->38|65->38|66->39|67->40|69->42|74->47
                  -- GENERATED --
              */
          