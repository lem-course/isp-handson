package isp.handson;

import fri.isp.Agent;
import fri.isp.Environment;
import fri.isp.Pair;

import java.security.Key;
import java.security.KeyFactory;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.interfaces.ECPublicKey;
import java.security.spec.X509EncodedKeySpec;

public class Midterm {
    public static Key createAESKey(PublicKey pk, PrivateKey sk) throws Exception {
        return null;
    }

    public static Pair<byte[], byte[]> encrypt(String message, Key key) throws Exception {
        return null;
    }

    public static String decrypt(byte[] ct, byte[] iv, Key key) throws Exception {
        return null;
    }

    public static Key createMACKey(Key aesKey) throws Exception {
        return null;
    }

    public static byte[] mac(PublicKey pk, byte[] ct, byte[] iv, Key key) throws Exception {
        return null;
    }

    public static boolean verifyMac(PublicKey pk, byte[] ct, byte[] iv, Key key, byte[] tag) throws Exception {
        return false;
    }

    public static void main(String[] args) throws Exception {
        final Environment env = new Environment();

        env.add(new Agent("alice") {
            @Override
            public void task() throws Exception {

            }
        });

        env.add(new Agent("bob") {
            @Override
            public void task() throws Exception {

            }
        });

        env.connect("alice", "bob");
        env.start();
    }

    /**
     * A useful utility function that converts bytes to an ECPublicKey instance.
     *
     * @param bytes to convert
     * @return ECPublicKey instance
     * @throws Exception if given bytes do not represent a valid key
     */
    private static ECPublicKey bytesToPK(byte[] bytes) throws Exception {
        return (ECPublicKey) KeyFactory.getInstance("EC").generatePublic(new X509EncodedKeySpec(bytes));
    }
}
