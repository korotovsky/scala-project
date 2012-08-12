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

    def create = Action { implicit request =>
        if (request.method.eq("GET")) {
            Ok(html.post.create(postForm))
        } else {
            postForm.bindFromRequest.fold(
                errors => BadRequest(html.post.create(errors)),
                post => {
                    Posts.create(post.title, post.description)
                    Redirect(routes.Post.index)
                }
            )
        }
    }
  
    def index = Action {
        Ok(html.post.index(Posts.findAll()))
    }
}
