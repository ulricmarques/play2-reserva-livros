
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
object main extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[String,Html,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(title: String)(content: Html):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.32*/("""

"""),format.raw/*3.1*/("""<!DOCTYPE html>

<html>
    <head>
        <title>"""),_display_(/*7.17*/title),format.raw/*7.22*/("""</title>
        <link href=""""),_display_(/*8.22*/routes/*8.28*/.Assets.at("bootstrap/css/bootstrap.min.css")),format.raw/*8.73*/("""" rel="stylesheet" media="screen">
        <link rel="stylesheet" media="screen" href=""""),_display_(/*9.54*/routes/*9.60*/.Assets.at("stylesheets/main.css")),format.raw/*9.94*/("""">
        <link rel="shortcut icon" type="image/png" href=""""),_display_(/*10.59*/routes/*10.65*/.Assets.at("images/favicon.png")),format.raw/*10.97*/("""">
        <script src=""""),_display_(/*11.23*/routes/*11.29*/.Assets.at("javascripts/jquery-1.9.0.min.js")),format.raw/*11.74*/("""" type="text/javascript"></script>
    </head>
    <body>

        """),_display_(/*15.10*/if(flash.containsKey("sucesso"))/*15.42*/ {_display_(Seq[Any](format.raw/*15.44*/("""
         """),format.raw/*16.10*/("""<div class="alert alert-success">
          """),_display_(/*17.12*/flash/*17.17*/.get("sucesso")),format.raw/*17.32*/("""
         """),format.raw/*18.10*/("""</div>
        """)))}),format.raw/*19.10*/("""

       """),_display_(/*21.9*/if(flash.containsKey("erro"))/*21.38*/ {_display_(Seq[Any](format.raw/*21.40*/("""
         """),format.raw/*22.10*/("""<div class="alert alert-danger">
          """),_display_(/*23.12*/flash/*23.17*/.get("erro")),format.raw/*23.29*/("""
         """),format.raw/*24.10*/("""</div>
        """)))}),format.raw/*25.10*/("""

        """),_display_(/*27.10*/content),format.raw/*27.17*/("""
    """),format.raw/*28.5*/("""</body>
</html>
"""))}
  }

  def render(title:String,content:Html): play.twirl.api.HtmlFormat.Appendable = apply(title)(content)

  def f:((String) => (Html) => play.twirl.api.HtmlFormat.Appendable) = (title) => (content) => apply(title)(content)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Mon Apr 20 02:43:27 GMT-03:00 2015
                  SOURCE: C:/Users/Ulric/Desktop/play2-casadocodigo-master/app/views/main.scala.html
                  HASH: 675920f12ce75d3bcd8896f92f42fe53cf5311ed
                  MATRIX: 727->1|845->31|873->33|950->84|975->89|1031->119|1045->125|1110->170|1224->258|1238->264|1292->298|1380->359|1395->365|1448->397|1500->422|1515->428|1581->473|1676->541|1717->573|1757->575|1795->585|1867->630|1881->635|1917->650|1955->660|2002->676|2038->686|2076->715|2116->717|2154->727|2225->771|2239->776|2272->788|2310->798|2357->814|2395->825|2423->832|2455->837
                  LINES: 26->1|29->1|31->3|35->7|35->7|36->8|36->8|36->8|37->9|37->9|37->9|38->10|38->10|38->10|39->11|39->11|39->11|43->15|43->15|43->15|44->16|45->17|45->17|45->17|46->18|47->19|49->21|49->21|49->21|50->22|51->23|51->23|51->23|52->24|53->25|55->27|55->27|56->28
                  -- GENERATED --
              */
          