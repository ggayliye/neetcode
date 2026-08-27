class Solution {
    public String encode(List<String> strs) {
        if (strs.size() == 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < strs.size(); i++) {
            sb.append(strs.get(i).length() + "#" + strs.get(i));
        }
        return sb.toString();
    }

    public List<String> decode(String str) {
        var arr = new ArrayList<String>();

        int i = 0;
        while (i < str.length()) {
            int j = i + 1;
            while (str.charAt(j) != '#') {
                j++;
            }
            int len = Integer.parseInt(str.substring(i, j));

            arr.add(str.substring(j + 1, j + 1 + len));
            i = j + 1 + len;
        }
        return arr;
    }
}
