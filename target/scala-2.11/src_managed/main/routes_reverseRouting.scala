// @SOURCE:C:/Users/Ulric/Desktop/play2-casadocodigo-master/conf/routes
// @HASH:fb9218a80a1137d098045d9f8dce3d69c62381a4
// @DATE:Mon Apr 20 02:19:37 GMT-03:00 2015

import Routes.{prefix => _prefix, defaultPrefix => _defaultPrefix}
import play.core._
import play.core.Router._
import play.core.Router.HandlerInvokerFactory._
import play.core.j._

import play.api.mvc._
import _root_.controllers.Assets.Asset
import _root_.play.libs.F

import Router.queryString


// @LINE:43
// @LINE:35
// @LINE:34
// @LINE:33
// @LINE:32
// @LINE:31
// @LINE:30
// @LINE:27
// @LINE:26
// @LINE:25
// @LINE:24
// @LINE:23
// @LINE:22
// @LINE:20
// @LINE:19
// @LINE:18
// @LINE:17
// @LINE:16
// @LINE:15
// @LINE:13
// @LINE:12
// @LINE:11
// @LINE:9
// @LINE:8
// @LINE:7
// @LINE:6
package controllers {

// @LINE:43
class ReverseAssets {


// @LINE:43
def at(file:String): Call = {
   implicit val _rrc = new ReverseRouteContext(Map(("path", "/public")))
   Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[PathBindable[String]].unbind("file", file))
}
                        

}
                          

// @LINE:6
class ReverseInicio {


// @LINE:6
def index(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "inicio")
}
                        

}
                          

// @LINE:27
// @LINE:26
// @LINE:25
// @LINE:24
// @LINE:23
// @LINE:22
class ReverseLivroCRUD {


// @LINE:25
def alterar(id:Long): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "livro/" + implicitly[PathBindable[Long]].unbind("id", id))
}
                        

// @LINE:26
def gravar(): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "livro/")
}
                        

// @LINE:23
def novoLivro(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "livro/novo")
}
                        

// @LINE:27
def remover(id:Long): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "livro/" + implicitly[PathBindable[Long]].unbind("id", id) + "/remover")
}
                        

// @LINE:22
def lista(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "livro")
}
                        

// @LINE:24
def detalhar(id:Long): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "livro/" + implicitly[PathBindable[Long]].unbind("id", id))
}
                        

}
                          

// @LINE:13
// @LINE:12
// @LINE:11
// @LINE:9
// @LINE:8
// @LINE:7
class ReverseApplication {


// @LINE:13
def logout(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "logout")
}
                        

// @LINE:8
def sobre(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "sobre")
}
                        

// @LINE:12
def authenticate(): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "login")
}
                        

// @LINE:9
def index(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "play")
}
                        

// @LINE:11
// @LINE:7
def login(): Call = {
   () match {
// @LINE:7
case ()  =>
  import ReverseRouteContext.empty
  Call("GET", _prefix)
                                         
   }
}
                                                

}
                          

// @LINE:35
// @LINE:34
// @LINE:33
// @LINE:32
// @LINE:31
// @LINE:30
class ReverseUserCRUD {


// @LINE:33
def alterar(id:Long): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "usuario/" + implicitly[PathBindable[Long]].unbind("id", id))
}
                        

// @LINE:34
def gravar(): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "usuario/")
}
                        

// @LINE:35
def remover(id:Long): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "usuario/" + implicitly[PathBindable[Long]].unbind("id", id) + "/remover")
}
                        

// @LINE:30
def lista(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "usuario")
}
                        

// @LINE:31
def novoUsuario(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "usuario/novo")
}
                        

// @LINE:32
def detalhar(id:Long): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "usuario/" + implicitly[PathBindable[Long]].unbind("id", id))
}
                        

}
                          

// @LINE:20
// @LINE:19
// @LINE:18
// @LINE:17
// @LINE:16
// @LINE:15
class ReverseReservaCRUD {


// @LINE:18
def alterar(id:Long): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "reserva/" + implicitly[PathBindable[Long]].unbind("id", id))
}
                        

// @LINE:19
def gravar(): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "reserva/")
}
                        

// @LINE:20
def remover(id:Long): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "reserva/" + implicitly[PathBindable[Long]].unbind("id", id) + "/remover")
}
                        

// @LINE:16
def novoReserva(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "reserva/novo")
}
                        

// @LINE:15
def lista(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "reserva")
}
                        

// @LINE:17
def detalhar(id:Long): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "reserva/" + implicitly[PathBindable[Long]].unbind("id", id))
}
                        

}
                          
}
                  


// @LINE:43
// @LINE:35
// @LINE:34
// @LINE:33
// @LINE:32
// @LINE:31
// @LINE:30
// @LINE:27
// @LINE:26
// @LINE:25
// @LINE:24
// @LINE:23
// @LINE:22
// @LINE:20
// @LINE:19
// @LINE:18
// @LINE:17
// @LINE:16
// @LINE:15
// @LINE:13
// @LINE:12
// @LINE:11
// @LINE:9
// @LINE:8
// @LINE:7
// @LINE:6
package controllers.javascript {
import ReverseRouteContext.empty

// @LINE:43
class ReverseAssets {


// @LINE:43
def at : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Assets.at",
   """
      function(file) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("file", file)})
      }
   """
)
                        

}
              

// @LINE:6
class ReverseInicio {


// @LINE:6
def index : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Inicio.index",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "inicio"})
      }
   """
)
                        

}
              

// @LINE:27
// @LINE:26
// @LINE:25
// @LINE:24
// @LINE:23
// @LINE:22
class ReverseLivroCRUD {


// @LINE:25
def alterar : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.LivroCRUD.alterar",
   """
      function(id) {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "livro/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        

// @LINE:26
def gravar : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.LivroCRUD.gravar",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "livro/"})
      }
   """
)
                        

// @LINE:23
def novoLivro : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.LivroCRUD.novoLivro",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "livro/novo"})
      }
   """
)
                        

// @LINE:27
def remover : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.LivroCRUD.remover",
   """
      function(id) {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "livro/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id) + "/remover"})
      }
   """
)
                        

// @LINE:22
def lista : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.LivroCRUD.lista",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "livro"})
      }
   """
)
                        

// @LINE:24
def detalhar : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.LivroCRUD.detalhar",
   """
      function(id) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "livro/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        

}
              

// @LINE:13
// @LINE:12
// @LINE:11
// @LINE:9
// @LINE:8
// @LINE:7
class ReverseApplication {


// @LINE:13
def logout : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.logout",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "logout"})
      }
   """
)
                        

// @LINE:8
def sobre : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.sobre",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "sobre"})
      }
   """
)
                        

// @LINE:12
def authenticate : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.authenticate",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "login"})
      }
   """
)
                        

// @LINE:9
def index : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.index",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "play"})
      }
   """
)
                        

// @LINE:11
// @LINE:7
def login : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.login",
   """
      function() {
      if (true) {
      return _wA({method:"GET", url:"""" + _prefix + """"})
      }
      if (true) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "login"})
      }
      }
   """
)
                        

}
              

// @LINE:35
// @LINE:34
// @LINE:33
// @LINE:32
// @LINE:31
// @LINE:30
class ReverseUserCRUD {


// @LINE:33
def alterar : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.UserCRUD.alterar",
   """
      function(id) {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "usuario/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        

// @LINE:34
def gravar : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.UserCRUD.gravar",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "usuario/"})
      }
   """
)
                        

// @LINE:35
def remover : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.UserCRUD.remover",
   """
      function(id) {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "usuario/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id) + "/remover"})
      }
   """
)
                        

// @LINE:30
def lista : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.UserCRUD.lista",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "usuario"})
      }
   """
)
                        

// @LINE:31
def novoUsuario : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.UserCRUD.novoUsuario",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "usuario/novo"})
      }
   """
)
                        

// @LINE:32
def detalhar : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.UserCRUD.detalhar",
   """
      function(id) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "usuario/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        

}
              

// @LINE:20
// @LINE:19
// @LINE:18
// @LINE:17
// @LINE:16
// @LINE:15
class ReverseReservaCRUD {


// @LINE:18
def alterar : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ReservaCRUD.alterar",
   """
      function(id) {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "reserva/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        

// @LINE:19
def gravar : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ReservaCRUD.gravar",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "reserva/"})
      }
   """
)
                        

// @LINE:20
def remover : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ReservaCRUD.remover",
   """
      function(id) {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "reserva/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id) + "/remover"})
      }
   """
)
                        

// @LINE:16
def novoReserva : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ReservaCRUD.novoReserva",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "reserva/novo"})
      }
   """
)
                        

// @LINE:15
def lista : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ReservaCRUD.lista",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "reserva"})
      }
   """
)
                        

// @LINE:17
def detalhar : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ReservaCRUD.detalhar",
   """
      function(id) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "reserva/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        

}
              
}
        


// @LINE:43
// @LINE:35
// @LINE:34
// @LINE:33
// @LINE:32
// @LINE:31
// @LINE:30
// @LINE:27
// @LINE:26
// @LINE:25
// @LINE:24
// @LINE:23
// @LINE:22
// @LINE:20
// @LINE:19
// @LINE:18
// @LINE:17
// @LINE:16
// @LINE:15
// @LINE:13
// @LINE:12
// @LINE:11
// @LINE:9
// @LINE:8
// @LINE:7
// @LINE:6
package controllers.ref {


// @LINE:43
class ReverseAssets {


// @LINE:43
def at(path:String, file:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Assets.at(path, file), HandlerDef(this.getClass.getClassLoader, "", "controllers.Assets", "at", Seq(classOf[String], classOf[String]), "GET", """ Map static resources from the /public folder to the /assets URL path""", _prefix + """assets/$file<.+>""")
)
                      

}
                          

// @LINE:6
class ReverseInicio {


// @LINE:6
def index(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Inicio.index(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Inicio", "index", Seq(), "GET", """ Home page
 GET     /                               controllers.Application.index()
GET     /                                    controllers.Inicio.index()""", _prefix + """inicio""")
)
                      

}
                          

// @LINE:27
// @LINE:26
// @LINE:25
// @LINE:24
// @LINE:23
// @LINE:22
class ReverseLivroCRUD {


// @LINE:25
def alterar(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.LivroCRUD.alterar(id), HandlerDef(this.getClass.getClassLoader, "", "controllers.LivroCRUD", "alterar", Seq(classOf[Long]), "POST", """""", _prefix + """livro/$id<[^/]+>""")
)
                      

// @LINE:26
def gravar(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.LivroCRUD.gravar(), HandlerDef(this.getClass.getClassLoader, "", "controllers.LivroCRUD", "gravar", Seq(), "POST", """""", _prefix + """livro/""")
)
                      

// @LINE:23
def novoLivro(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.LivroCRUD.novoLivro(), HandlerDef(this.getClass.getClassLoader, "", "controllers.LivroCRUD", "novoLivro", Seq(), "GET", """""", _prefix + """livro/novo""")
)
                      

// @LINE:27
def remover(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.LivroCRUD.remover(id), HandlerDef(this.getClass.getClassLoader, "", "controllers.LivroCRUD", "remover", Seq(classOf[Long]), "POST", """""", _prefix + """livro/$id<[^/]+>/remover""")
)
                      

// @LINE:22
def lista(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.LivroCRUD.lista(), HandlerDef(this.getClass.getClassLoader, "", "controllers.LivroCRUD", "lista", Seq(), "GET", """""", _prefix + """livro""")
)
                      

// @LINE:24
def detalhar(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.LivroCRUD.detalhar(id), HandlerDef(this.getClass.getClassLoader, "", "controllers.LivroCRUD", "detalhar", Seq(classOf[Long]), "GET", """""", _prefix + """livro/$id<[^/]+>""")
)
                      

}
                          

// @LINE:13
// @LINE:12
// @LINE:11
// @LINE:9
// @LINE:8
// @LINE:7
class ReverseApplication {


// @LINE:13
def logout(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.logout(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "logout", Seq(), "GET", """""", _prefix + """logout""")
)
                      

// @LINE:8
def sobre(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.sobre(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "sobre", Seq(), "GET", """""", _prefix + """sobre""")
)
                      

// @LINE:12
def authenticate(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.authenticate(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "authenticate", Seq(), "POST", """""", _prefix + """login""")
)
                      

// @LINE:9
def index(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.index(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "index", Seq(), "GET", """""", _prefix + """play""")
)
                      

// @LINE:7
def login(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.login(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "login", Seq(), "GET", """""", _prefix + """""")
)
                      

}
                          

// @LINE:35
// @LINE:34
// @LINE:33
// @LINE:32
// @LINE:31
// @LINE:30
class ReverseUserCRUD {


// @LINE:33
def alterar(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.UserCRUD.alterar(id), HandlerDef(this.getClass.getClassLoader, "", "controllers.UserCRUD", "alterar", Seq(classOf[Long]), "POST", """""", _prefix + """usuario/$id<[^/]+>""")
)
                      

// @LINE:34
def gravar(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.UserCRUD.gravar(), HandlerDef(this.getClass.getClassLoader, "", "controllers.UserCRUD", "gravar", Seq(), "POST", """""", _prefix + """usuario/""")
)
                      

// @LINE:35
def remover(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.UserCRUD.remover(id), HandlerDef(this.getClass.getClassLoader, "", "controllers.UserCRUD", "remover", Seq(classOf[Long]), "POST", """""", _prefix + """usuario/$id<[^/]+>/remover""")
)
                      

// @LINE:30
def lista(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.UserCRUD.lista(), HandlerDef(this.getClass.getClassLoader, "", "controllers.UserCRUD", "lista", Seq(), "GET", """""", _prefix + """usuario""")
)
                      

// @LINE:31
def novoUsuario(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.UserCRUD.novoUsuario(), HandlerDef(this.getClass.getClassLoader, "", "controllers.UserCRUD", "novoUsuario", Seq(), "GET", """""", _prefix + """usuario/novo""")
)
                      

// @LINE:32
def detalhar(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.UserCRUD.detalhar(id), HandlerDef(this.getClass.getClassLoader, "", "controllers.UserCRUD", "detalhar", Seq(classOf[Long]), "GET", """""", _prefix + """usuario/$id<[^/]+>""")
)
                      

}
                          

// @LINE:20
// @LINE:19
// @LINE:18
// @LINE:17
// @LINE:16
// @LINE:15
class ReverseReservaCRUD {


// @LINE:18
def alterar(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.ReservaCRUD.alterar(id), HandlerDef(this.getClass.getClassLoader, "", "controllers.ReservaCRUD", "alterar", Seq(classOf[Long]), "POST", """""", _prefix + """reserva/$id<[^/]+>""")
)
                      

// @LINE:19
def gravar(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.ReservaCRUD.gravar(), HandlerDef(this.getClass.getClassLoader, "", "controllers.ReservaCRUD", "gravar", Seq(), "POST", """""", _prefix + """reserva/""")
)
                      

// @LINE:20
def remover(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.ReservaCRUD.remover(id), HandlerDef(this.getClass.getClassLoader, "", "controllers.ReservaCRUD", "remover", Seq(classOf[Long]), "POST", """""", _prefix + """reserva/$id<[^/]+>/remover""")
)
                      

// @LINE:16
def novoReserva(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.ReservaCRUD.novoReserva(), HandlerDef(this.getClass.getClassLoader, "", "controllers.ReservaCRUD", "novoReserva", Seq(), "GET", """""", _prefix + """reserva/novo""")
)
                      

// @LINE:15
def lista(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.ReservaCRUD.lista(), HandlerDef(this.getClass.getClassLoader, "", "controllers.ReservaCRUD", "lista", Seq(), "GET", """""", _prefix + """reserva""")
)
                      

// @LINE:17
def detalhar(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.ReservaCRUD.detalhar(id), HandlerDef(this.getClass.getClassLoader, "", "controllers.ReservaCRUD", "detalhar", Seq(classOf[Long]), "GET", """""", _prefix + """reserva/$id<[^/]+>""")
)
                      

}
                          
}
        
    