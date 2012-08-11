package controllers

import play.api._
import play.api.mvc._
import play.api.data._
import play.api.data.Forms._
import views._
import models._

object Post extends Controller {

    val postForm = Form(
        "title" -> text
    )

    def create = Action {
        Ok(html.post.create(Posts.all(), postForm))
    }
}
