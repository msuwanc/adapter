package http.wsclient

import models.http.Url
import models.http.responses.WSResponse

class WSClient {
  def get(url: Url, headers: Map[String, String]): WSResponse = WSResponse("WSClient response body", 200)
}