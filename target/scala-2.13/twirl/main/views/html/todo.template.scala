
package views.html

import _root_.play.twirl.api.TwirlFeatureImports._
import _root_.play.twirl.api.TwirlHelperImports._
import _root_.play.twirl.api.Html
import _root_.play.twirl.api.JavaScript
import _root_.play.twirl.api.Txt
import _root_.play.twirl.api.Xml
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

object todo extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](_display_(/*1.2*/main("Hello")/*1.15*/ {_display_(Seq[Any](format.raw/*1.17*/("""
    """),format.raw/*2.5*/("""<section id="content">
        <div class="wrapper doc">
            <article>
                <h1>Todo List</h1>
                <ul class="todo-wrap">
                    <li class="todo-single">
                        <h3>Test todo</h3>
                        <div>
                            <input type="submit" value="Edit">
                            <input type="submit" value="Delete">
                        </div>
                    </li>
                </ul>
                <section>
                    <input type="text" placeholder="new todo" />
                    <button>Create New Todo</button>
                </section>
            </article>
        </div>
    </section>
""")))}))
      }
    }
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  SOURCE: app/views/todo.scala.html
                  HASH: d7ae3fcdaf002eeea613a0fbc7bacce2d2702b89
                  MATRIX: 810->1|831->14|870->16|901->21
                  LINES: 26->1|26->1|26->1|27->2
                  -- GENERATED --
              */
          