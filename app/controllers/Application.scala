package controllers

import play.api.mvc._
import views._

object Application extends Controller {

    def index = Action {
        Ok(html.index.index())
    }

    def feedback = TODO

}