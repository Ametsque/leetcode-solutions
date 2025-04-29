// Last updated: 29/04/2025, 19:15:44
class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        List<List<Integer>> answer = new ArrayList<>();

        HashMap<Integer,Integer> hashMap1 = new HashMap<Integer,Integer>();
        for (int num : nums1){
            hashMap1.put(num, 1);
        }

        List<Integer> answer1 = new ArrayList<>();
        List<Integer> answer2 = new ArrayList<>();

        for (int num : nums2){
            if (!hashMap1.containsKey(num)){
                answer2.add(num);
                hashMap1.put(num, -1);
            } else {
                hashMap1.put(num,-1);
            }
        }

        for (Map.Entry<Integer,Integer> entry : hashMap1.entrySet()){
            if (entry.getValue() != -1){
                answer1.add(entry.getKey());
            }
        }

        answer.add(answer1);
        answer.add(answer2);
        return answer;
    }
}