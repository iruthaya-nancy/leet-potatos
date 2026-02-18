class Solution {
    public int[] asteroidCollision(int[] asteroids) {
         //use while loop for iteration->we dont know exact iteration
         List<Integer> asList = Arrays.stream(asteroids)
        .mapToObj(Integer::valueOf).collect(Collectors.toList());
          int i = 0;
        while (i < asList.size() - 1) {
            int current = asList.get(i);
            int next = asList.get(i + 1);

            if (current > 0 && next < 0) {
                if (Math.abs(current) == Math.abs(next)) {
                    asList.remove(i);
                    asList.remove(i);
                    if (i > 0) {
                        i--;
                    }
                } else if (Math.abs(current) > Math.abs(next)) {
                    asList.remove(i + 1);
                } else {
                    asList.remove(i);
                    if (i > 0) {
                        i--;
                    }
                }
            } else {
                i++;
            }
        }
         return asList.stream().mapToInt(Integer::intValue).toArray();
    }
}