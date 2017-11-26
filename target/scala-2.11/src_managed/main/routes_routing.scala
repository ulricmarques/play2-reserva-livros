// @SOURCE:C:/Users/Ulric/Desktop/play2-casadocodigo-master/conf/routes
// @HASH:fb9218a80a1137d098045d9f8dce3d69c62381a4
// @DATE:Mon Apr 20 02:19:37 GMT-03:00 2015


import play.core._
import play.core.Router._
import play.core.Router.HandlerInvokerFactory._
import play.core.j._

import play.api.mvc._
import _root_.controllers.Assets.Asset
import _root_.play.libs.F

import Router.queryString

object Routes extends Router.Routes {

import ReverseRouteContext.empty

private var _prefix = "/"

def setPrefix(prefix: String) {
  _prefix = prefix
  List[(String,Routes)](("auth",securesocial.Routes)).foreach {
    case (p, router) => router.setPrefix(prefix + (if(prefix.endsWith("/")) "" else "/") + p)
  }
}

def prefix = _prefix

lazy val defaultPrefix = { if(Routes.prefix.endsWith("/")) "" else "/" }


// @LINE:6
private[this] lazy val controllers_Inicio_index0_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("inicio"))))
private[this] lazy val controllers_Inicio_index0_invoker = createInvoker(
controllers.Inicio.index(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Inicio", "index", Nil,"GET", """ Home page
 GET     /                               controllers.Application.index()
GET     /                                    controllers.Inicio.index()""", Routes.prefix + """inicio"""))
        

// @LINE:7
private[this] lazy val controllers_Application_login1_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix))))
private[this] lazy val controllers_Application_login1_invoker = createInvoker(
controllers.Application.login(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "login", Nil,"GET", """""", Routes.prefix + """"""))
        

// @LINE:8
private[this] lazy val controllers_Application_sobre2_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("sobre"))))
private[this] lazy val controllers_Application_sobre2_invoker = createInvoker(
controllers.Application.sobre(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "sobre", Nil,"GET", """""", Routes.prefix + """sobre"""))
        

// @LINE:9
private[this] lazy val controllers_Application_index3_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("play"))))
private[this] lazy val controllers_Application_index3_invoker = createInvoker(
controllers.Application.index(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "index", Nil,"GET", """""", Routes.prefix + """play"""))
        

// @LINE:11
private[this] lazy val controllers_Application_login4_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("login"))))
private[this] lazy val controllers_Application_login4_invoker = createInvoker(
controllers.Application.login(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "login", Nil,"GET", """""", Routes.prefix + """login"""))
        

// @LINE:12
private[this] lazy val controllers_Application_authenticate5_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("login"))))
private[this] lazy val controllers_Application_authenticate5_invoker = createInvoker(
controllers.Application.authenticate(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "authenticate", Nil,"POST", """""", Routes.prefix + """login"""))
        

// @LINE:13
private[this] lazy val controllers_Application_logout6_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("logout"))))
private[this] lazy val controllers_Application_logout6_invoker = createInvoker(
controllers.Application.logout(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "logout", Nil,"GET", """""", Routes.prefix + """logout"""))
        

// @LINE:15
private[this] lazy val controllers_ReservaCRUD_lista7_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("reserva"))))
private[this] lazy val controllers_ReservaCRUD_lista7_invoker = createInvoker(
controllers.ReservaCRUD.lista(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.ReservaCRUD", "lista", Nil,"GET", """""", Routes.prefix + """reserva"""))
        

// @LINE:16
private[this] lazy val controllers_ReservaCRUD_novoReserva8_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("reserva/novo"))))
private[this] lazy val controllers_ReservaCRUD_novoReserva8_invoker = createInvoker(
controllers.ReservaCRUD.novoReserva(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.ReservaCRUD", "novoReserva", Nil,"GET", """""", Routes.prefix + """reserva/novo"""))
        

// @LINE:17
private[this] lazy val controllers_ReservaCRUD_detalhar9_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("reserva/"),DynamicPart("id", """[^/]+""",true))))
private[this] lazy val controllers_ReservaCRUD_detalhar9_invoker = createInvoker(
controllers.ReservaCRUD.detalhar(fakeValue[Long]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.ReservaCRUD", "detalhar", Seq(classOf[Long]),"GET", """""", Routes.prefix + """reserva/$id<[^/]+>"""))
        

// @LINE:18
private[this] lazy val controllers_ReservaCRUD_alterar10_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("reserva/"),DynamicPart("id", """[^/]+""",true))))
private[this] lazy val controllers_ReservaCRUD_alterar10_invoker = createInvoker(
controllers.ReservaCRUD.alterar(fakeValue[Long]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.ReservaCRUD", "alterar", Seq(classOf[Long]),"POST", """""", Routes.prefix + """reserva/$id<[^/]+>"""))
        

// @LINE:19
private[this] lazy val controllers_ReservaCRUD_gravar11_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("reserva/"))))
private[this] lazy val controllers_ReservaCRUD_gravar11_invoker = createInvoker(
controllers.ReservaCRUD.gravar(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.ReservaCRUD", "gravar", Nil,"POST", """""", Routes.prefix + """reserva/"""))
        

// @LINE:20
private[this] lazy val controllers_ReservaCRUD_remover12_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("reserva/"),DynamicPart("id", """[^/]+""",true),StaticPart("/remover"))))
private[this] lazy val controllers_ReservaCRUD_remover12_invoker = createInvoker(
controllers.ReservaCRUD.remover(fakeValue[Long]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.ReservaCRUD", "remover", Seq(classOf[Long]),"POST", """""", Routes.prefix + """reserva/$id<[^/]+>/remover"""))
        

// @LINE:22
private[this] lazy val controllers_LivroCRUD_lista13_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("livro"))))
private[this] lazy val controllers_LivroCRUD_lista13_invoker = createInvoker(
controllers.LivroCRUD.lista(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.LivroCRUD", "lista", Nil,"GET", """""", Routes.prefix + """livro"""))
        

// @LINE:23
private[this] lazy val controllers_LivroCRUD_novoLivro14_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("livro/novo"))))
private[this] lazy val controllers_LivroCRUD_novoLivro14_invoker = createInvoker(
controllers.LivroCRUD.novoLivro(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.LivroCRUD", "novoLivro", Nil,"GET", """""", Routes.prefix + """livro/novo"""))
        

// @LINE:24
private[this] lazy val controllers_LivroCRUD_detalhar15_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("livro/"),DynamicPart("id", """[^/]+""",true))))
private[this] lazy val controllers_LivroCRUD_detalhar15_invoker = createInvoker(
controllers.LivroCRUD.detalhar(fakeValue[Long]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.LivroCRUD", "detalhar", Seq(classOf[Long]),"GET", """""", Routes.prefix + """livro/$id<[^/]+>"""))
        

// @LINE:25
private[this] lazy val controllers_LivroCRUD_alterar16_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("livro/"),DynamicPart("id", """[^/]+""",true))))
private[this] lazy val controllers_LivroCRUD_alterar16_invoker = createInvoker(
controllers.LivroCRUD.alterar(fakeValue[Long]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.LivroCRUD", "alterar", Seq(classOf[Long]),"POST", """""", Routes.prefix + """livro/$id<[^/]+>"""))
        

// @LINE:26
private[this] lazy val controllers_LivroCRUD_gravar17_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("livro/"))))
private[this] lazy val controllers_LivroCRUD_gravar17_invoker = createInvoker(
controllers.LivroCRUD.gravar(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.LivroCRUD", "gravar", Nil,"POST", """""", Routes.prefix + """livro/"""))
        

// @LINE:27
private[this] lazy val controllers_LivroCRUD_remover18_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("livro/"),DynamicPart("id", """[^/]+""",true),StaticPart("/remover"))))
private[this] lazy val controllers_LivroCRUD_remover18_invoker = createInvoker(
controllers.LivroCRUD.remover(fakeValue[Long]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.LivroCRUD", "remover", Seq(classOf[Long]),"POST", """""", Routes.prefix + """livro/$id<[^/]+>/remover"""))
        

// @LINE:30
private[this] lazy val controllers_UserCRUD_lista19_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("usuario"))))
private[this] lazy val controllers_UserCRUD_lista19_invoker = createInvoker(
controllers.UserCRUD.lista(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.UserCRUD", "lista", Nil,"GET", """""", Routes.prefix + """usuario"""))
        

// @LINE:31
private[this] lazy val controllers_UserCRUD_novoUsuario20_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("usuario/novo"))))
private[this] lazy val controllers_UserCRUD_novoUsuario20_invoker = createInvoker(
controllers.UserCRUD.novoUsuario(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.UserCRUD", "novoUsuario", Nil,"GET", """""", Routes.prefix + """usuario/novo"""))
        

// @LINE:32
private[this] lazy val controllers_UserCRUD_detalhar21_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("usuario/"),DynamicPart("id", """[^/]+""",true))))
private[this] lazy val controllers_UserCRUD_detalhar21_invoker = createInvoker(
controllers.UserCRUD.detalhar(fakeValue[Long]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.UserCRUD", "detalhar", Seq(classOf[Long]),"GET", """""", Routes.prefix + """usuario/$id<[^/]+>"""))
        

// @LINE:33
private[this] lazy val controllers_UserCRUD_alterar22_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("usuario/"),DynamicPart("id", """[^/]+""",true))))
private[this] lazy val controllers_UserCRUD_alterar22_invoker = createInvoker(
controllers.UserCRUD.alterar(fakeValue[Long]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.UserCRUD", "alterar", Seq(classOf[Long]),"POST", """""", Routes.prefix + """usuario/$id<[^/]+>"""))
        

// @LINE:34
private[this] lazy val controllers_UserCRUD_gravar23_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("usuario/"))))
private[this] lazy val controllers_UserCRUD_gravar23_invoker = createInvoker(
controllers.UserCRUD.gravar(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.UserCRUD", "gravar", Nil,"POST", """""", Routes.prefix + """usuario/"""))
        

// @LINE:35
private[this] lazy val controllers_UserCRUD_remover24_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("usuario/"),DynamicPart("id", """[^/]+""",true),StaticPart("/remover"))))
private[this] lazy val controllers_UserCRUD_remover24_invoker = createInvoker(
controllers.UserCRUD.remover(fakeValue[Long]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.UserCRUD", "remover", Seq(classOf[Long]),"POST", """""", Routes.prefix + """usuario/$id<[^/]+>/remover"""))
        

// @LINE:43
private[this] lazy val controllers_Assets_at25_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("assets/"),DynamicPart("file", """.+""",false))))
private[this] lazy val controllers_Assets_at25_invoker = createInvoker(
controllers.Assets.at(fakeValue[String], fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Assets", "at", Seq(classOf[String], classOf[String]),"GET", """ Map static resources from the /public folder to the /assets URL path""", Routes.prefix + """assets/$file<.+>"""))
        

// @LINE:47
lazy val securesocial_Routes26 = Include(securesocial.Routes)
        
def documentation = List(("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """inicio""","""controllers.Inicio.index()"""),("""GET""", prefix,"""controllers.Application.login()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """sobre""","""controllers.Application.sobre()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """play""","""controllers.Application.index()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """login""","""controllers.Application.login()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """login""","""controllers.Application.authenticate()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """logout""","""controllers.Application.logout()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """reserva""","""controllers.ReservaCRUD.lista()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """reserva/novo""","""controllers.ReservaCRUD.novoReserva()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """reserva/$id<[^/]+>""","""controllers.ReservaCRUD.detalhar(id:Long)"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """reserva/$id<[^/]+>""","""controllers.ReservaCRUD.alterar(id:Long)"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """reserva/""","""controllers.ReservaCRUD.gravar()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """reserva/$id<[^/]+>/remover""","""controllers.ReservaCRUD.remover(id:Long)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """livro""","""controllers.LivroCRUD.lista()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """livro/novo""","""controllers.LivroCRUD.novoLivro()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """livro/$id<[^/]+>""","""controllers.LivroCRUD.detalhar(id:Long)"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """livro/$id<[^/]+>""","""controllers.LivroCRUD.alterar(id:Long)"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """livro/""","""controllers.LivroCRUD.gravar()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """livro/$id<[^/]+>/remover""","""controllers.LivroCRUD.remover(id:Long)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """usuario""","""controllers.UserCRUD.lista()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """usuario/novo""","""controllers.UserCRUD.novoUsuario()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """usuario/$id<[^/]+>""","""controllers.UserCRUD.detalhar(id:Long)"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """usuario/$id<[^/]+>""","""controllers.UserCRUD.alterar(id:Long)"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """usuario/""","""controllers.UserCRUD.gravar()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """usuario/$id<[^/]+>/remover""","""controllers.UserCRUD.remover(id:Long)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """assets/$file<.+>""","""controllers.Assets.at(path:String = "/public", file:String)"""),securesocial.Routes.documentation).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
  case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
  case l => s ++ l.asInstanceOf[List[(String,String,String)]]
}}
      

def routes:PartialFunction[RequestHeader,Handler] = {

// @LINE:6
case controllers_Inicio_index0_route(params) => {
   call { 
        controllers_Inicio_index0_invoker.call(controllers.Inicio.index())
   }
}
        

// @LINE:7
case controllers_Application_login1_route(params) => {
   call { 
        controllers_Application_login1_invoker.call(controllers.Application.login())
   }
}
        

// @LINE:8
case controllers_Application_sobre2_route(params) => {
   call { 
        controllers_Application_sobre2_invoker.call(controllers.Application.sobre())
   }
}
        

// @LINE:9
case controllers_Application_index3_route(params) => {
   call { 
        controllers_Application_index3_invoker.call(controllers.Application.index())
   }
}
        

// @LINE:11
case controllers_Application_login4_route(params) => {
   call { 
        controllers_Application_login4_invoker.call(controllers.Application.login())
   }
}
        

// @LINE:12
case controllers_Application_authenticate5_route(params) => {
   call { 
        controllers_Application_authenticate5_invoker.call(controllers.Application.authenticate())
   }
}
        

// @LINE:13
case controllers_Application_logout6_route(params) => {
   call { 
        controllers_Application_logout6_invoker.call(controllers.Application.logout())
   }
}
        

// @LINE:15
case controllers_ReservaCRUD_lista7_route(params) => {
   call { 
        controllers_ReservaCRUD_lista7_invoker.call(controllers.ReservaCRUD.lista())
   }
}
        

// @LINE:16
case controllers_ReservaCRUD_novoReserva8_route(params) => {
   call { 
        controllers_ReservaCRUD_novoReserva8_invoker.call(controllers.ReservaCRUD.novoReserva())
   }
}
        

// @LINE:17
case controllers_ReservaCRUD_detalhar9_route(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_ReservaCRUD_detalhar9_invoker.call(controllers.ReservaCRUD.detalhar(id))
   }
}
        

// @LINE:18
case controllers_ReservaCRUD_alterar10_route(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_ReservaCRUD_alterar10_invoker.call(controllers.ReservaCRUD.alterar(id))
   }
}
        

// @LINE:19
case controllers_ReservaCRUD_gravar11_route(params) => {
   call { 
        controllers_ReservaCRUD_gravar11_invoker.call(controllers.ReservaCRUD.gravar())
   }
}
        

// @LINE:20
case controllers_ReservaCRUD_remover12_route(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_ReservaCRUD_remover12_invoker.call(controllers.ReservaCRUD.remover(id))
   }
}
        

// @LINE:22
case controllers_LivroCRUD_lista13_route(params) => {
   call { 
        controllers_LivroCRUD_lista13_invoker.call(controllers.LivroCRUD.lista())
   }
}
        

// @LINE:23
case controllers_LivroCRUD_novoLivro14_route(params) => {
   call { 
        controllers_LivroCRUD_novoLivro14_invoker.call(controllers.LivroCRUD.novoLivro())
   }
}
        

// @LINE:24
case controllers_LivroCRUD_detalhar15_route(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_LivroCRUD_detalhar15_invoker.call(controllers.LivroCRUD.detalhar(id))
   }
}
        

// @LINE:25
case controllers_LivroCRUD_alterar16_route(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_LivroCRUD_alterar16_invoker.call(controllers.LivroCRUD.alterar(id))
   }
}
        

// @LINE:26
case controllers_LivroCRUD_gravar17_route(params) => {
   call { 
        controllers_LivroCRUD_gravar17_invoker.call(controllers.LivroCRUD.gravar())
   }
}
        

// @LINE:27
case controllers_LivroCRUD_remover18_route(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_LivroCRUD_remover18_invoker.call(controllers.LivroCRUD.remover(id))
   }
}
        

// @LINE:30
case controllers_UserCRUD_lista19_route(params) => {
   call { 
        controllers_UserCRUD_lista19_invoker.call(controllers.UserCRUD.lista())
   }
}
        

// @LINE:31
case controllers_UserCRUD_novoUsuario20_route(params) => {
   call { 
        controllers_UserCRUD_novoUsuario20_invoker.call(controllers.UserCRUD.novoUsuario())
   }
}
        

// @LINE:32
case controllers_UserCRUD_detalhar21_route(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_UserCRUD_detalhar21_invoker.call(controllers.UserCRUD.detalhar(id))
   }
}
        

// @LINE:33
case controllers_UserCRUD_alterar22_route(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_UserCRUD_alterar22_invoker.call(controllers.UserCRUD.alterar(id))
   }
}
        

// @LINE:34
case controllers_UserCRUD_gravar23_route(params) => {
   call { 
        controllers_UserCRUD_gravar23_invoker.call(controllers.UserCRUD.gravar())
   }
}
        

// @LINE:35
case controllers_UserCRUD_remover24_route(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_UserCRUD_remover24_invoker.call(controllers.UserCRUD.remover(id))
   }
}
        

// @LINE:43
case controllers_Assets_at25_route(params) => {
   call(Param[String]("path", Right("/public")), params.fromPath[String]("file", None)) { (path, file) =>
        controllers_Assets_at25_invoker.call(controllers.Assets.at(path, file))
   }
}
        

// @LINE:47
case securesocial_Routes26(handler) => handler
        
}

}
     