package controllers

import play.api._
import play.api.mvc._
import views._
import play.api.data._
import play.api.data.Forms._

object Application extends Controller {

    val loginForm = new Form(
        tuple(
          "name" -> nonEmptyText,
          "password" -> nonEmptyText
        )
    )

    def index = Action {
        Ok(html.index(loginForm))
    }

}
