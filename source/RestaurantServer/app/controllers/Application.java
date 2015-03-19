package controllers;

import modelku.Customer;
import play.*;
import play.mvc.*;
import views.html.*;
import play.db.jpa.*;

public class Application extends Controller {

	@Transactional
    public static Result index() {
    	Customer c = new Customer();
    	c.setName("asdfasf wibisana");
    	
    	JPA.em().persist(c);
    	
        return ok(index.render("Your new application is ready."));
    }

}
