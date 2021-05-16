
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

object main extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[String,Html,play.twirl.api.HtmlFormat.Appendable] {

  /*
 * This template is called from the `index` template. This template
 * handles the rendering of the page header and body tags. It takes
 * two arguments, a `String` for the title of the page and an `Html`
 * object to insert into the body of the page.
 */
  def apply/*7.2*/(title: String)(content: Html):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*7.32*/("""

"""),format.raw/*9.1*/("""<!DOCTYPE html>
<html lang="en">

<head>
    <title>"""),_display_(/*13.13*/title),format.raw/*13.18*/("""</title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" media="screen" href='"""),_display_(/*15.50*/routes/*15.56*/.Assets.versioned("stylesheets/main.css")),format.raw/*15.97*/("""'>
    <link rel="stylesheet" media="screen" href='"""),_display_(/*16.50*/routes/*16.56*/.Assets.versioned("stylesheets/prism.css")),format.raw/*16.98*/("""'>
    <link rel="stylesheet" media="screen" href='"""),_display_(/*17.50*/routes/*17.56*/.Assets.versioned("stylesheets/todo.css")),format.raw/*17.97*/("""'>
    <link rel="shortcut icon" type="image/png" href='"""),_display_(/*18.55*/routes/*18.61*/.Assets.versioned("images/favicon.png")),format.raw/*18.100*/("""'>
    <script src='"""),_display_(/*19.19*/routes/*19.25*/.Assets.versioned("javascripts/hello.js")),format.raw/*19.66*/("""' type="text/javascript"></script>
    <script src='"""),_display_(/*20.19*/routes/*20.25*/.Assets.versioned("javascripts/prism.js")),format.raw/*20.66*/("""' type="text/javascript"></script>
</head>

<body>
    <section id="top">
        <div class="wrapper">
            <img class="resize" src="assets/images/play_icon_reverse.svg" alt="logo" />
            <h1>Taesu Kim's ToDo List</h1>
        </div>
    </section>
    """),_display_(/*30.6*/content),format.raw/*30.13*/("""
"""),format.raw/*31.1*/("""</body>

</html>"""))
      }
    }
  }

  def render(title:String,content:Html): play.twirl.api.HtmlFormat.Appendable = apply(title)(content)

  def f:((String) => (Html) => play.twirl.api.HtmlFormat.Appendable) = (title) => (content) => apply(title)(content)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  SOURCE: app/views/main.scala.html
                  HASH: 8f46623c8b44e07e867eb018a7f7481d6a977c8b
                  MATRIX: 992->266|1117->296|1147->300|1231->357|1257->362|1419->497|1434->503|1496->544|1576->597|1591->603|1654->645|1734->698|1749->704|1811->745|1896->803|1911->809|1972->848|2021->870|2036->876|2098->917|2179->971|2194->977|2256->1018|2562->1298|2590->1305|2619->1307
                  LINES: 26->7|31->7|33->9|37->13|37->13|39->15|39->15|39->15|40->16|40->16|40->16|41->17|41->17|41->17|42->18|42->18|42->18|43->19|43->19|43->19|44->20|44->20|44->20|54->30|54->30|55->31
                  -- GENERATED --
              */
          