const ans = [];
        let start = 0;
        for (let i = start; i < nums.length; i++) {
            let diff = target - nums[i];
            for (let j = i + 1; j < nums.length; j++) {
                if (nums[j] == diff) {
                    ans[0] = i;
                    ans[1] = j;
                }
            }
        }
        return ans;
