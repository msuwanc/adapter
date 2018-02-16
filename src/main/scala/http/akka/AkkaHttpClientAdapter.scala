package http.akka

import http.HttpClient
import models.http.Header
import models.http.responses.{AkkaHttpResponse, HttpResponse}

class AkkaHttpClientAdapter(akkaHttpClient: AkkaHttpClient) extends HttpClient {
  override def get(url: String, headers: Map[String, String]): HttpResponse = {
    val akkaHttpResponse: AkkaHttpResponse = akkaHttpClient.sendGet(url, Header(headers))

    HttpResponse(akkaHttpResponse.body, akkaHttpResponse.code)
  }
}