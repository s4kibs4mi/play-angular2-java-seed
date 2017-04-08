package controllers;

import play.mvc.Controller;
import play.mvc.Result;

/**
 * Created by s4kib on 4/8/17.
 */

public class HomeController extends Controller {
    public Result index() {
        return ok(views.html.index.render("Hello World"));
    }
}
