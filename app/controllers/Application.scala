package controllers

import play.api._
import play.api.mvc._
import play.api.data.Form
import play.api.data.Forms._

object Application extends Controller {
	
	case class LyricsQuery(keywords: String)
	
	def index = Action {
		
		val form = Form(mapping("q" -> nonEmptyText)(LyricsQuery.apply)(LyricsQuery.unapply))
		
		Ok(views.html.index(form))
	}
	
	def lyrics = Action {
		Ok
	}
	
}