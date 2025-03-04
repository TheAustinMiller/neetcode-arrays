public boolean containsDuplicate(int[] nums) {
        HashSet set = new HashSet();
        for (int i = 0; i < nums.length; i++) {
            set.add(nums[i]);
        }
        return set.size() != nums.length;
    }
