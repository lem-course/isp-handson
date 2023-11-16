package isp.handson;

import fri.isp.Agent;
import fri.isp.Environment;

public class Midterm {
    public static void main(String[] args) throws Exception {
        Environment env = new Environment();

        env.add(new Agent("alice") {
            public void task() throws Exception {

            }
        });
        env.add(new Agent("server") {
            public void task() throws Exception {

            }
        });

        env.connect("alice", "server");
        env.start();
    }
}
