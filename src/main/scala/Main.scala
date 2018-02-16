import http._
import http.akka.{AkkaHttpClient, AkkaHttpClientAdapter}
import http.wsclient.{WSClient, WSClientAdapter}
import models.http.responses.HttpResponse

object Main extends App {
  val akkaHttpClient: HttpClient = new AkkaHttpClientAdapter(new AkkaHttpClient())

  val akkaResponse: HttpResponse = akkaHttpClient.get("Some url", Map("Some header key" -> "Some header value"))

  println(Console.GREEN + "First version of http client" + Console.RESET)
  println(Console.GREEN + akkaResponse + Console.RESET)

  val wsHttpClient: HttpClient = new WSClientAdapter(new WSClient())

  val wsResponse: HttpResponse = wsHttpClient.get("Some url", Map("Some header key" -> "Some header value"))

  println(Console.RED + "Later version of http client" + Console.RESET)
  println(Console.RED + wsResponse + Console.RESET)
}