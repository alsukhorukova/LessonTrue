package server;

import com.sun.net.httpserver.HttpContext;
import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;
import com.sun.net.httpserver.HttpServer;
import javaSimple.HelpedMethods;

import java.io.IOException;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.util.ArrayList;

public class Server {

    public static void main(String[] args) {

    //    int portNum = 4446;

        int portNum = Integer.parseInt(System.getProperty("ServerPort"));

        HttpServer server = null;

        try {
            server = HttpServer.create();
            server.bind(new InetSocketAddress(portNum), 0);
        } catch (IOException e) {
            e.printStackTrace();
        }

        HttpContext context = server.createContext("/", new Server.EchoHandler());

        HttpContext context2 = server.createContext("/help", new Server.EchoHandler2());

        /**
         * ДЗ 3
         */

        HttpContext context3 = server.createContext("/interesting", new Server.EchoHandler3());

        HttpContext context4 = server.createContext("/count", new Server.EchoHandler4());


        server.setExecutor(null);
        server.start();
    }

    static class EchoHandler implements HttpHandler {

        @Override
        public void handle(HttpExchange exchange) throws IOException {

            StringBuilder builder = new StringBuilder();

            ArrayList<String> headers = new ArrayList<>();
            exchange.getRequestHeaders().values().forEach(o -> System.out.println("header=" + o));

            for (String a : headers) {
                if (a.contains("Hello")) {
                    builder.append("Hello to, my Friend");
                }
            }

            builder.append("GOGOGOGO");
            byte[] bytes = builder.toString().getBytes();
            exchange.sendResponseHeaders(200, bytes.length);

            OutputStream os = exchange.getResponseBody();
            os.write(bytes);
            os.close();
            exchange.close();

        }
    }

    static class EchoHandler2 implements HttpHandler {

        @Override
        public void handle(HttpExchange exchange) throws IOException {

            StringBuilder builder = new StringBuilder();

            ArrayList<String> headers = new ArrayList<>();
            exchange.getRequestHeaders().values().forEach(o -> System.out.println("header=" + o));

            for (String a : headers) {
                if (a.contains("Hello")) {
                    builder.append("Hello to, my Friend");
                }
            }

            builder.append("HELP ME");
            byte[] bytes = builder.toString().getBytes();
            exchange.sendResponseHeaders(200, bytes.length);

            OutputStream os = exchange.getResponseBody();
            os.write(bytes);
            os.close();
            exchange.close();
        }

    }

    /**
     * ДЗ 3
     */

    static class EchoHandler3 implements HttpHandler {

        @Override
        public void handle(HttpExchange exchange) throws IOException {

            StringBuilder builder = new StringBuilder();

            ArrayList<String> headers = new ArrayList<>();
            exchange.getRequestHeaders().values().forEach(s -> headers.add(s.toString()));
            exchange.getRequestHeaders().values().forEach(o -> System.out.println("header=" + o));

            for (String a : headers) {
                if (a.contains("Hello")) {
                    builder.append("Hello to, my Friend");
                    builder.append("\n");
                }
            }

            builder.append("Something Interesting");
            byte[] bytes = builder.toString().getBytes();
            exchange.sendResponseHeaders(200, bytes.length);

            OutputStream os = exchange.getResponseBody();
            os.write(bytes);
            os.close();
            exchange.close();
        }

    }

    static class EchoHandler4 implements HttpHandler {

        @Override
        public void handle(HttpExchange exchange) throws IOException {

            StringBuilder builder = new StringBuilder();

            ArrayList<String> headers = new ArrayList<>();
            exchange.getRequestHeaders().values().forEach(o -> System.out.println("header=" + o));
            exchange.getRequestHeaders().values().forEach(o -> headers.add(o.toString()));


            if (headers.contains("[none]")) {
                builder.append("Prostaya arifmetika:");
                builder.append("\n");
            }

            int num = 3;
            int x = 123456;
            int y = 29991;
            builder.append("Sum " + num + " and " + num + " = " + HelpedMethods.sum(num, num));
            builder.append("\n");
            builder.append(x + " minus " + y + " = " + HelpedMethods.dif(x, y));
            byte[] bytes = builder.toString().getBytes();
            exchange.sendResponseHeaders(200, bytes.length);

            OutputStream os = exchange.getResponseBody();
            os.write(bytes);
            os.close();
            exchange.close();
        }

    }


}
