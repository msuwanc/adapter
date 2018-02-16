package http

import models.http.responses.HttpResponse

trait HttpClient {
  def get(url: String, headers: Map[String, String]): HttpResponse
}