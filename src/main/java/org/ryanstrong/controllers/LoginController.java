//package org.ryanstrong.controllers;
//
//import org.ryanstrong.models.forms.LoginForm;
//import org.springframework.security.web.savedrequest.HttpSessionRequestCache;
//import org.springframework.security.web.savedrequest.RequestCache;
//import org.springframework.security.web.savedrequest.SavedRequest;
//import org.springframework.stereotype.Controller;
//import org.springframework.validation.BindingResult;
//import org.springframework.web.bind.annotation.ModelAttribute;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//
//import javax.servlet.ServletException;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//import java.io.IOException;
//
///**
// * Created by ryanstrong on 4/29/17.
// */
////public class LoginController {
////    public static void main(String []args){
////        Scanner input = new Scanner(System.in);
////    }
////}// TODO LOGIN AND OUT
//@Controller
//public class LoginController {
//    private RequestCache requestCache = new HttpSessionRequestCache();
//    @RequestMapping("/authenticate")// todo make this a html file
//    public String authenticate(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        boolean authenticate = request.authenticate(response);
//        return authenticate ? "index" : null;
//    }
//    @RequestMapping(value = "/login", method = RequestMethod.POST)
//    public String login(HttpServletRequest request, HttpServletResponse response, @ModelAttribute LoginForm loginForm,
//                        BindingResult result) throws ServletException {
//        try {
//            request.login(loginForm.getUsername(), loginForm.getPassword());
//            SavedRequest savedRequest = requestCache.getRequest(request, response);
//            if (savedRequest != null) {
//                return "redirect:" + savedRequest.getRedirectUrl();
//            } else {
//                return "redirect:/";
//            }
//
//        } catch (ServletException authenticationFailed) {
//            result.rejectValue(null, "authentication.failed");
//            return "login";
//        }
//    }
//
//    @RequestMapping(value = "/login", method = RequestMethod.GET)
//    public String login(@ModelAttribute LoginForm loginForm) {
// todo see if this works public String login(Model model)}
//model.addAttribute("login", new Login());
//        return "login";
//    }
//    @RequestMapping("/logout")
//    public String logout(HttpServletRequest request) throws ServletException {
//        request.logout();
//        return "redirect:/";
//    }
//}