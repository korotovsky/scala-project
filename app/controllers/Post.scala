package controllers

import play.api.mvc._
import views._

object Post extends Controller {

    /*val postForm: Form[Post] = Form(
        mapping(
            "title" -> nonEmptyText,
            "description" -> nonEmptyText
        )(Post.apply)(Post.unapply)
    )*/

    def create = Action {
        Ok(post.create())
    }
}
