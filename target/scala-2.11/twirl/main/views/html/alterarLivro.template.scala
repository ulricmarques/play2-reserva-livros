
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
object alterarLivro extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[Long,Form[Livro],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(id: Long, livroForm: Form[Livro]):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {import helper._

Seq[Any](format.raw/*1.36*/("""

"""),format.raw/*4.1*/("""
"""),_display_(/*5.2*/main("Alterar livro")/*5.23*/ {_display_(Seq[Any](format.raw/*5.25*/("""

   """),format.raw/*7.4*/("""<div class="container">
    <div class="header">
        <ul class="nav nav-pills pull-right">
          <li class="active"><a href="/inicio">Home</a></li>
        </ul>
      </div>
      
   <div class="container">
    <div class="header">
        <ul class="nav nav-pills pull-right">
          <li class="active"><a href="/reserva/novo">Reservar</a></li>
        </ul>
      </div>

    <h1>Alterar livro</h1>

    """),_display_(/*23.6*/form(routes.LivroCRUD.alterar(id))/*23.40*/ {_display_(Seq[Any](format.raw/*23.42*/("""

     """),format.raw/*25.6*/("""<fieldset>"""),_display_(/*25.17*/inputText(livroForm("titulo"), '_label -> "Título")),format.raw/*25.68*/("""</fieldset>
     <fieldset>"""),_display_(/*26.17*/inputText(livroForm("autor"), '_label -> "Autor")),format.raw/*26.66*/("""</fieldset>
     <fieldset>"""),_display_(/*27.17*/inputText(livroForm("editora"), '_label -> "Editora")),format.raw/*27.70*/("""</fieldset>
     <fieldset>"""),_display_(/*28.17*/inputText(livroForm("ano"), '_label -> "Ano")),format.raw/*28.62*/("""</fieldset>
     <fieldset>"""),_display_(/*29.17*/inputText(livroForm("edicao"), '_label -> "Edição")),format.raw/*29.68*/("""</fieldset>
     <fieldset>"""),_display_(/*30.17*/inputText(livroForm("genero"), '_label -> "Gênero")),format.raw/*30.68*/("""</fieldset>

      <div class="control-group">
        <div class="actions">

            <input type="submit" value="Gravar" class="btn btn-primary">

            <a href=""""),_display_(/*37.23*/routes/*37.29*/.LivroCRUD.lista()),format.raw/*37.47*/("""" class="btn btn-primary ">Cancelar</a>

    """)))}),format.raw/*39.6*/("""

    """),_display_(/*41.6*/form(routes.LivroCRUD.remover(id))/*41.40*/ {_display_(Seq[Any](format.raw/*41.42*/("""
            """),format.raw/*42.13*/("""<input type="submit" value="Remover esse livro" class="btn danger">
    """)))}),format.raw/*43.6*/("""

        """),format.raw/*45.9*/("""</div>
      </div>

</div>

""")))}),format.raw/*50.2*/("""
"""))}
  }

  def render(id:Long,livroForm:Form[Livro]): play.twirl.api.HtmlFormat.Appendable = apply(id,livroForm)

  def f:((Long,Form[Livro]) => play.twirl.api.HtmlFormat.Appendable) = (id,livroForm) => apply(id,livroForm)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Mon Apr 20 02:19:41 GMT-03:00 2015
                  SOURCE: C:/Users/Ulric/Desktop/play2-casadocodigo-master/app/views/alterarLivro.scala.html
                  HASH: 418ceb1d6c65aa09fe6cab465e74e43235bce82f
                  MATRIX: 740->1|877->35|907->57|935->60|964->81|1003->83|1036->90|1498->526|1541->560|1581->562|1617->571|1655->582|1727->633|1783->662|1853->711|1909->740|1983->793|2039->822|2105->867|2161->896|2233->947|2289->976|2361->1027|2569->1208|2584->1214|2623->1232|2701->1280|2736->1289|2779->1323|2819->1325|2861->1339|2965->1413|3004->1425|3069->1460
                  LINES: 26->1|29->1|31->4|32->5|32->5|32->5|34->7|50->23|50->23|50->23|52->25|52->25|52->25|53->26|53->26|54->27|54->27|55->28|55->28|56->29|56->29|57->30|57->30|64->37|64->37|64->37|66->39|68->41|68->41|68->41|69->42|70->43|72->45|77->50
                  -- GENERATED --
              */
          