
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
object sobre extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[String,String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(sistema: String)(versaoDoPlay : String):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.42*/("""

"""),format.raw/*3.1*/("""<!DOCTYPE html>
<html>
    <head>
        <title>"""),_display_(/*6.17*/sistema),format.raw/*6.24*/("""</title>
        <link href=""""),_display_(/*7.22*/routes/*7.28*/.Assets.at("bootstrap/css/bootstrap.min.css")),format.raw/*7.73*/("""" rel="stylesheet" media="screen">
        <link rel="stylesheet" media="screen" href=""""),_display_(/*8.54*/routes/*8.60*/.Assets.at("stylesheets/main.css")),format.raw/*8.94*/("""">
        <link rel="shortcut icon" type="image/png" href=""""),_display_(/*9.59*/routes/*9.65*/.Assets.at("images/favicon.png")),format.raw/*9.97*/("""">
        <script src=""""),_display_(/*10.23*/routes/*10.29*/.Assets.at("javascripts/jquery-1.9.0.min.js")),format.raw/*10.74*/("""" type="text/javascript"></script>
    </head>
    <body>
    <div class="container">
     <div class="header">
        <ul class="nav nav-pills pull-right">
          <li class="active"><a href="/inicio">Home</a></li>
        </ul>
        <h3 class="text-muted">"""),_display_(/*18.33*/sistema),format.raw/*18.40*/("""</h3>
      </div>
      <div class="jumbotron">
        <p><a class="btn btn-lg btn-success" href="#">powered by Play Framework """),_display_(/*21.82*/versaoDoPlay),format.raw/*21.94*/("""</a></p>
      </div>
     </div>
    </body>
</html>
"""))}
  }

  def render(sistema:String,versaoDoPlay:String): play.twirl.api.HtmlFormat.Appendable = apply(sistema)(versaoDoPlay)

  def f:((String) => (String) => play.twirl.api.HtmlFormat.Appendable) = (sistema) => (versaoDoPlay) => apply(sistema)(versaoDoPlay)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Mon Apr 20 02:19:42 GMT-03:00 2015
                  SOURCE: C:/Users/Ulric/Desktop/play2-casadocodigo-master/app/views/sobre.scala.html
                  HASH: 78161712e8d82a41c10e6afeb4c1a413836f0547
                  MATRIX: 730->1|858->41|886->43|962->93|989->100|1045->130|1059->136|1124->181|1238->269|1252->275|1306->309|1393->370|1407->376|1459->408|1511->433|1526->439|1592->484|1884->749|1912->756|2069->886|2102->898
                  LINES: 26->1|29->1|31->3|34->6|34->6|35->7|35->7|35->7|36->8|36->8|36->8|37->9|37->9|37->9|38->10|38->10|38->10|46->18|46->18|49->21|49->21
                  -- GENERATED --
              */
          