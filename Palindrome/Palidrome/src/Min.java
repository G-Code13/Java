public class Min {
    
    static int min(int target, int[] numbers){
        if(target == 0){
            return target;
        }
        if(target < 0){
            return -1;
        }
        int mini = -1;
        for(int number : numbers){
            int subTarget = target - number;
            int numTarget = min(subTarget, numbers);
            if(numTarget != -1){
                int n = numTarget + 1;
                if(n < mini || mini == -1){
                    mini = n;
                }
            }
        }
        return mini;
    }
    

    static boolean sum(int target, int[] numbers){
        if(target == 0){
            return true;
        }

        return false;
    }
}
