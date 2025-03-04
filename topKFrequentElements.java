public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> count = new HashMap<>();

        for (int num : nums) {
            if (count.containsKey(num)) {
                count.put(num, count.get(num) + 1);
            } else {
                count.put(num, 1);
            }
        }

        List<int[]> arr = new ArrayList<>();
        
        for (Map.Entry<Integer, Integer> entry : count.entrySet()) {
            int[] pair = new int[2];
            pair[0] = entry.getValue();
            pair[1] = entry.getKey();
            arr.add(pair);
        }

        Collections.sort(arr, new Comparator<int[]>() {
            @Override
            public int compare(int[] a, int[] b) {
                return b[0] - a[0];
            }
        });

        int[] res = new int[k];
        for (int i = 0; i < k; i++) {
            res[i] = arr.get(i)[1];
        }

        return res;
    }
