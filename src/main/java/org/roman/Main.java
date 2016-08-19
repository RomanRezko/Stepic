package org.roman;




public class Main {
    public static void main(String[] args) throws Exception {
        Frontend frontend = new Frontend();
        Server server = new Server(8181);
        ServletContextHandler context = new ServletContextHandler(ServletContextHandler.SESSIONS);
        serxer.setHandler(context);
        context.addServlet(new ServletHolder(frontend),"/authform");
        server.start();
        server.join();
    }

}
