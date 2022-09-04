//2358. Maximum Number of Groups Entering a Competition
public class group {
        public int maximumGroups(int[] grades) {
            int g=1;
            while(true){
                int s=g*(g+1)/2;
                if(s>grades.length){
                    return g-1;
                }
                else if(s==grades.length){
                    return g;
                }
                g++;
            }
        }
    }
