About:

CLIENT <=> WEB SERVER <=> APP SERVER


BROWER => CLIENT => http://localhost:63342/SpringMVC_JFSD/ => http://127.0.0.1:63342/SpginMVC_JSFD => web.xml

Tomcat => WEB SERVER => http://127.0.0.1:63342/SpginMVC_JSFD => WEB.XML => <WELCOME FILE> INDEX.HTML </WELCOME_FILE> => FORM => REQUEST => APP SERVER => SPRING BOOT => SEND RESPONSE
=> CONTROLLER => API URLS => POM.XML => SPRING BOOT



LOGICS FOR YOUR APPLICATIONS

CLIENT SIDE LOGIC => BROWSER => THE LOGIC SHOULD RUN => A + B => SUM => JAVASCRIPT

SERVER SIDE LOGIC => SERVER => THE LOGIC SHOULD RUN => A + B => SUM => RELOAD

Client => Filter => by reviews => JSP => Reload => logic => response back in json or even html => client displays it
--------------------------

Server => 1GB Ram => Filter => 1000 Users => 1000 requests => 1000 logic gets executed
Client => Filter => 1 Request
Client => Filter => 1 Request
Client => Filter => 1 Request



REQUEST RESPONSE CYCLE

TOMCAT SERVER RUNS => Editor => Configuration

=> 1. CLIENT => BROWSER => http://localhost:8080
=> 2. http://localhost:8080  => reached to Tomcat => web.xml => <welcome>player.do</welcome> => http://localhost:8080/player.do
=> 3. HTTPServlet => doGet=> request, response => request.getRequestDispatcher().forward(request, response => welcome.jsp => the response displays the html

Image:
https://drive.google.com/file/d/1TCKaC8A6IU7o3etJ_DLaC6ai51x9EEQq/view?usp=sharing
