
object NettyLauncher { // this is my entry object as specified in sbt project definition
  def main(args: Array[String]) {
    import play.core.server._
    import play.api.routing.sird._
    import play.api.mvc._

    val server = NettyServer.fromRouter() {
      case GET(p"/hello/$to") => Action {
        Results.Ok(s"Hello $to")
      }

      case GET(p"/") => Action {
        Results.Ok(s"HI THERE")
      }
    }
  }
}