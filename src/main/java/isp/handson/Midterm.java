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
        env.add(new Agent("lock") {
            public void task() throws Exception {

            }
        });

        env.connect("alice", "server");
        env.connect("alice", "lock");
        env.connect("server", "lock");
        env.start();
    }

    /**
     * Verifies the MAC tag.
     *
     * @param payload  the message
     * @param tag      the MAC tag
     * @param password the password form which MAC key is derived
     * @param salt     the salt used to strengthen the password
     * @return true iff. the verification succeeds, false otherwise
     */
    public static boolean verify(byte[] payload, byte[] tag, String password, byte[] salt) throws Exception {
        return false;
    }

    /**
     * Computes the MAC tag over the message.
     *
     * @param payload  the message
     * @param password the password form which MAC key is derived
     * @param salt     the salt used to strengthen the password
     * @return the computed tag
     */
    public static byte[] mac(byte[] payload, String password, byte[] salt) throws Exception {
        return null;
    }

    /**
     * Hashes the given payload multiple times.
     *
     * @param times   the number of times the value is hashed
     * @param payload the initial value to be hashed
     * @return the final hash value
     */
    public static byte[] hash(int times, byte[] payload) throws Exception {
        return null;
    }
}
