
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
object livro extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[List[Livro],String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(livros: List[Livro])(livro: String):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.38*/("""

"""),_display_(/*3.2*/main("Livros")/*3.16*/ {_display_(Seq[Any](format.raw/*3.18*/("""

    """),format.raw/*5.5*/("""<div class="container">
    <div class="header">
        <ul class="nav nav-pills pull-right">
	      <li class="active"><a href=""""),_display_(/*8.37*/routes/*8.43*/.LivroCRUD.novoLivro()),format.raw/*8.65*/("""">Novo livro</a></li>
          <li class="active"><a href="/inicio">Home</a></li>
        </ul>
        <h2 class="text-muted">Bem-vindo! </h2>
        <h3 class="text-muted">Livros </h3>
      </div>
     <table class="table table-striped table-bordered" id="example" cellpadding="0" cellspacing="0" border="0" width="100%">
	    <tfoot>
	      """),_display_(/*16.9*/for(livro <- livros) yield /*16.29*/ {_display_(Seq[Any](format.raw/*16.31*/("""
	        """),format.raw/*17.10*/("""<tr>
	            <th><a href=""""),_display_(/*18.28*/routes/*18.34*/.LivroCRUD.detalhar(livro.id)),format.raw/*18.63*/("""">"""),_display_(/*18.66*/livro/*18.71*/.titulo),format.raw/*18.78*/("""</a></th>
	            
	        </tr>
	             """)))}),format.raw/*21.16*/("""
	    """),format.raw/*22.6*/("""</tfoot>
	   </table>
      </div>

""")))}),format.raw/*26.2*/("""
"""))}
  }

  def render(livros:List[Livro],livro:String): play.twirl.api.HtmlFormat.Appendable = apply(livros)(livro)

  def f:((List[Livro]) => (String) => play.twirl.api.HtmlFormat.Appendable) = (livros) => (livro) => apply(livros)(livro)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Mon Apr 20 02:19:42 GMT-03:00 2015
                  SOURCE: C:/Users/Ulric/Desktop/play2-casadocodigo-master/app/views/livro.scala.html
                  HASH: a7bba7f1025d72b55b7fbb82d0d83783288aa48e
                  MATRIX: 735->1|859->37|889->42|911->56|950->58|984->66|1144->200|1158->206|1200->228|1582->584|1618->604|1658->606|1697->617|1757->650|1772->656|1822->685|1852->688|1866->693|1894->700|1982->757|2016->764|2087->805
                  LINES: 26->1|29->1|31->3|31->3|31->3|33->5|36->8|36->8|36->8|44->16|44->16|44->16|45->17|46->18|46->18|46->18|46->18|46->18|46->18|49->21|50->22|54->26
                  -- GENERATED --
              */
          