package http.wsclient

import http.HttpClient
import models.http.Url
import models.http.responses.{HttpResponse, WSResponse}

class WSClientAdapter(wsClient: WSClient) extends HttpClient {
  override def get(url: String, headers: Map[String, String]): HttpResponse = {
    val wsResponse: WSResponse = wsClient.get(Url(url), headers)

    HttpResponse(wsResponse.body, wsResponse.code)
  }
}