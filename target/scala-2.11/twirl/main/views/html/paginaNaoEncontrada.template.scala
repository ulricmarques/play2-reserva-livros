
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
object paginaNaoEncontrada extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(url: String):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.15*/("""

"""),format.raw/*3.1*/("""<html>
<body>
 <h1>Oops, essa p&aacute;gina n&atilde;o existe...</h1>

 <p>"""),_display_(/*7.6*/url),format.raw/*7.9*/("""</p>

   <p> <a href="/">Top 100 filmes Cult</a></p>
</body>
</html>"""))}
  }

  def render(url:String): play.twirl.api.HtmlFormat.Appendable = apply(url)

  def f:((String) => play.twirl.api.HtmlFormat.Appendable) = (url) => apply(url)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Mon Apr 20 02:19:42 GMT-03:00 2015
                  SOURCE: C:/Users/Ulric/Desktop/play2-casadocodigo-master/app/views/paginaNaoEncontrada.scala.html
                  HASH: 996c5b521bc0a98784976614d9af4159224a685e
                  MATRIX: 737->1|838->14|866->16|967->92|989->95
                  LINES: 26->1|29->1|31->3|35->7|35->7
                  -- GENERATED --
              */
          