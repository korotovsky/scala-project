package models

case class Posts(
    id: Long,
    title: String
)

object Posts {
    def all(): List[Posts] = Nil

    def create(title: String) {}

    def delete(id: Long) {}
}
