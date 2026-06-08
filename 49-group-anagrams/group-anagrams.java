class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        TreeMap<int[], List<String>> map = new TreeMap<>((a, b) -> {
            for (int i = 0; i < 26; i++) {
                if (a[i] != b[i]) {
                    return Integer.compare(a[i], b[i]);
                }
            }
            return 0;
        });

        for (String str : strs) {

            int[] hash = new int[26];

            for (char c : str.toCharArray()) {
                hash[c - 'a']++;
            }

            if (map.containsKey(hash)) {
                map.get(hash).add(str);
            } else {
                List<String> list = new ArrayList<>();
                list.add(str);
                map.put(hash, list);
            }
        }

        return new ArrayList<>(map.values());
    }
}