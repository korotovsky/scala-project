package controllers

import play.api._
import play.api.mvc._
import play.api.data._
import play.api.data.Forms._
import views._
import models._
import anorm.{NotAssigned, Pk}

object Post extends Controller {

    val postForm: Form[Posts] = Form(
        mapping(
            "id" -> ignored(NotAssigned: Pk[Long]),
            "title" -> text,
            "description" -> text
        )(Posts.apply)(Posts.unapply)
    )

    def create = Action {
        Ok(html.post.create(postForm))
    }

    def index = Action {
        Ok(html.post.index(Posts.all()))
    }
}
