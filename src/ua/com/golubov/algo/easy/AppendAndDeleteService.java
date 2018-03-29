package ua.com.golubov.algo.easy;

public class AppendAndDeleteService {

    public String appendAndDelete(String s, String t, int k) {
        if (s.equals(t))
            return "Yes";

        int simpleDiff = 0;

        if (s.length() != t.length()) {
            simpleDiff = Math.abs(s.length() - t.length());
            if (s.length() > t.length()) {
                s = s.substring(0, t.length());
            } else {
                t = t.substring(0, s.length());
            }
        }

        int similar = 0;

        for (int i = 1; i <= s.length(); i++) {
            if (t.startsWith(s.substring(0, i))) {
                similar = i;
            }
        }

        return ((s.length() - similar) * 2) + simpleDiff <= k ? "Yes" : "No";
    }


}
