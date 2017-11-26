
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
object login extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[Form[Application.Login],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(form: Form[Application.Login]):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.33*/("""

"""),format.raw/*3.1*/("""<html>
    <head>
        <title>Login</title>
        <link rel="shortcut icon" type="image/png" href=""""),_display_(/*6.59*/routes/*6.65*/.Assets.at("images/favicon.png")),format.raw/*6.97*/("""">
        <link href=""""),_display_(/*7.22*/routes/*7.28*/.Assets.at("bootstrap/css/bootstrap.min.css")),format.raw/*7.73*/("""" rel="stylesheet" media="screen">
        <link rel="stylesheet" media="screen" href=""""),_display_(/*8.54*/routes/*8.60*/.Assets.at("stylesheets/main.css")),format.raw/*8.94*/("""">
    </head>
    <body>
    <li class="active"><a href=""""),_display_(/*11.34*/routes/*11.40*/.UserCRUD.novoUsuario()),format.raw/*11.63*/("""">Novo usuário</a></li>
        
        
        
        """),_display_(/*15.10*/helper/*15.16*/.form(routes.Application.authenticate)/*15.54*/ {_display_(Seq[Any](format.raw/*15.56*/("""
            
            """),format.raw/*17.13*/("""<h1>Login</h1>
            
            """),_display_(/*19.14*/if(form.hasGlobalErrors)/*19.38*/ {_display_(Seq[Any](format.raw/*19.40*/(""" 
                """),format.raw/*20.17*/("""<p class="error">
                    """),_display_(/*21.22*/form/*21.26*/.globalError.message),format.raw/*21.46*/("""
                """),format.raw/*22.17*/("""</p>
            """)))}),format.raw/*23.14*/("""
            
            """),_display_(/*25.14*/if(flash.contains("success"))/*25.43*/ {_display_(Seq[Any](format.raw/*25.45*/("""
                """),format.raw/*26.17*/("""<p class="success">
                    """),_display_(/*27.22*/flash/*27.27*/.get("success")),format.raw/*27.42*/("""
                """),format.raw/*28.17*/("""</p>
            """)))}),format.raw/*29.14*/("""
            
            """),format.raw/*31.13*/("""<p>
                <input type="email" name="email" placeholder="Email" value=""""),_display_(/*32.78*/form("email")/*32.91*/.value),format.raw/*32.97*/("""">
            </p>
            <p>
                <input type="password" name="password" placeholder="Senha">
            </p>
            <p>
                <button type="submit">Login</button>
            </p>
            
        """)))}),format.raw/*41.10*/("""
        
        """),format.raw/*43.9*/("""<p class="note">
            Try <em>guillaume@sample.com</em> with <em>secret</em> as password.
        </p>
            
    </body>
</html>
    


"""))}
  }

  def render(form:Form[Application.Login]): play.twirl.api.HtmlFormat.Appendable = apply(form)

  def f:((Form[Application.Login]) => play.twirl.api.HtmlFormat.Appendable) = (form) => apply(form)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Mon Apr 20 02:19:42 GMT-03:00 2015
                  SOURCE: C:/Users/Ulric/Desktop/play2-casadocodigo-master/app/views/login.scala.html
                  HASH: 58eee3252d932b72647590f5b0cb54daa67989d5
                  MATRIX: 740->1|859->32|889->36|1023->144|1037->150|1089->182|1140->207|1154->213|1219->258|1334->347|1348->353|1402->387|1491->449|1506->455|1550->478|1641->542|1656->548|1703->586|1743->588|1799->616|1869->659|1902->683|1942->685|1989->704|2056->744|2069->748|2110->768|2156->786|2206->805|2262->834|2300->863|2340->865|2386->883|2455->925|2469->930|2505->945|2551->963|2601->982|2657->1010|2766->1092|2788->1105|2815->1111|3092->1357|3139->1377
                  LINES: 26->1|29->1|31->3|34->6|34->6|34->6|35->7|35->7|35->7|36->8|36->8|36->8|39->11|39->11|39->11|43->15|43->15|43->15|43->15|45->17|47->19|47->19|47->19|48->20|49->21|49->21|49->21|50->22|51->23|53->25|53->25|53->25|54->26|55->27|55->27|55->27|56->28|57->29|59->31|60->32|60->32|60->32|69->41|71->43
                  -- GENERATED --
              */
          