package http.akka

import models.http.Header
import models.http.responses.AkkaHttpResponse

class AkkaHttpClient {
  def sendGet(url: String, header: Header): AkkaHttpResponse = AkkaHttpResponse("Akka http response body", 200)
}