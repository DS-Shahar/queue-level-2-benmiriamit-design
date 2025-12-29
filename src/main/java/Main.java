
public class Main {	
    public static void main(String[] args) {
         Queue<Integer> q = new Queue<>();
         q.insert(8);
         q.insert(4);
         q.insert(3);
         boolean b = isXinQueue(q , 1);
         System.out.println(b);
         System.out.println(q);
    }
    
     public static boolean isXinQueue(Queue<Integer> q, int x){
         
          while(!q.isEmpty()){
             int a = q.remove();
              if(a == x){
                  System.out.println(a);
                  return true;
              }
          }
          return false;
      }
      public static Queue<Integer> copy(Queue<Integer> q){
         Queue<Integer> q1 = new Queue<>();
         Queue<Integer> q2 = new Queue<>();
          while(!q.isEmpty()){
             int a = q.remove();
            q1.insert(a);
            q2.insert(a);  
      }
       while(!q1.isEmpty()){
             int a = q1.remove();
            q.insert(a);
        }
        return q2;
}
    public static double avrage(Queue<Integer> q){
         double sum = 0;
         double count = 0;
          while(!q.isEmpty()){
             int a = q.remove();
             sum += a;
             count ++;
          }
          return sum/count ;
      }
      public static int countDivisible(Queue<Integer> q, int x) {
    Queue<Integer> temp = new Queue<>();
    int count = 0;

    while (!q.isEmpty()) {
        int a = q.remove();
        if (a % x == 0) {
            count++;
        }
        temp.insert(a);
    }

    while (!temp.isEmpty()) {
        q.insert(temp.remove());
    }

    return count;
}
      public static boolean hasDuplicate(Queue<String> q) {
    Queue<String> temp = new Queue<>();

    while (!q.isEmpty()) {
        String current = q.remove();  ת
        temp.insert(current); 

        
        if (isIn(q, current)) {
                true:
            while (!q.isEmpty()) {
                temp.insert(q.remove());
            }
            while (!temp.isEmpty()) {
                q.insert(temp.remove());
            }
            return true;
        }
    }

 
    while (!temp.isEmpty()) {
        q.insert(temp.remove());
    }

    return false;
}
    Queue<String> qs = new Queue<>();
        qs.insert("aa");
        qs.insert("bb");
        qs.insert("cc");
        qs.insert("bb");
        System.out.println("Has duplicate: " + hasDuplicate(qs));
}
      public static void removeDuplicatesKeepFirst(Queue<Integer> q) {
        Queue<Integer> unique = new Queue<>();

        while (!q.isEmpty()) {
            int x = q.remove();
            if (!isInInt(unique, x))
                unique.insert(x);
        }

        while (!unique.isEmpty())
            q.insert(unique.remove());
    }

    public static boolean isInInt(Queue<Integer> q, int x) {
        Queue<Integer> temp = new Queue<>();
        boolean found = false;

        while (!q.isEmpty()) {
            int v = q.remove();
            if (v == x)
                found = true;
            temp.insert(v);
        }

        while (!temp.isEmpty())
            q.insert(temp.remove());

        return found;
    }
    Queue<Integer> q3 = new Queue<>();
        q3.insert(5);
        q3.insert(1);
        q3.insert(5);
        q3.insert(2);
        q3.insert(1);
        removeDuplicatesKeepFirst(q3);
        System.out.println("After remove duplicates: " + q3);
        public static void sortQueueAscending(Queue<Integer> q) {
        Queue<Integer> temp = new Queue<>();
        Queue<Integer> sorted = new Queue<>();

        int n = 0;
        while (!q.isEmpty()) {
            temp.insert(q.remove());
            n++;
        }
        while (!temp.isEmpty())
            q.insert(temp.remove());

        for (int i = 0; i < n; i++) {
            int min = Integer.MAX_VALUE;

            while (!q.isEmpty()) {
                int x = q.remove();
                if (x < min)
                    min = x;
                temp.insert(x);
            }

            boolean taken = false;
            while (!temp.isEmpty()) {
                int x = temp.remove();
                if (!taken && x == min) {
                    sorted.insert(x);
                    taken = true;
                } else {
                    q.insert(x);
                }
            }
        }
         Queue<Integer> q4 = new Queue<>();
        q4.insert(7);
        q4.insert(2);
        q4.insert(9);
        q4.insert(1);
        sortQueueAscending(q4);
        System.out.println("Sorted queue: " + q4);
     public static Queue<Integer> mergeSorted(Queue<Integer> q1, Queue<Integer> q2) {
        Queue<Integer> res = new Queue<>();

        while (!q1.isEmpty() && !q2.isEmpty()) {
            int a = q1.remove();
            int b = q2.remove();

            if (a <= b) {
                res.insert(a);
                q2.insert(b);
            } else {
                res.insert(b);
                q1.insert(a);
            }
        }

        while (!q1.isEmpty())
            res.insert(q1.remove());
        while (!q2.isEmpty())
            res.insert(q2.remove());

        return res;
    }
      public static int sumOfLongestEvenRun(Queue<Integer> q) {
        Queue<Integer> temp = new Queue<>();

        int currLen = 0, currSum = 0;
        int bestLen = 0, bestSum = 0;

        while (!q.isEmpty()) {
            int x = q.remove();
            temp.insert(x);

            if (x % 2 == 0) {
                currLen++;
                currSum += x;
            } else {
                if (currLen > bestLen) {
                    bestLen = currLen;
                    bestSum = currSum;
                }
                currLen = 0;
                currSum = 0;
            }
        }

        if (currLen > bestLen) {
            bestLen = currLen;
            bestSum = currSum;
        }

        while (!temp.isEmpty())
            q.insert(temp.remove());

        return bestSum;
    {
      public static void main(String[] args) {

        // סעיף 2
        Queue<String> qs = new Queue<>();
        qs.insert("aa");
        qs.insert("bb");
        qs.insert("cc");
        qs.insert("bb");
        System.out.println("Has duplicate: " + hasDuplicate(qs));

        // סעיף 3
        Queue<Integer> q3 = new Queue<>();
        q3.insert(5);
        q3.insert(1);
        q3.insert(5);
        q3.insert(2);
        q3.insert(1);
        removeDuplicatesKeepFirst(q3);
        System.out.println("After remove duplicates: " + q3);

        // סעיף 4
        Queue<Integer> q4 = new Queue<>();
        q4.insert(7);
        q4.insert(2);
        q4.insert(9);
        q4.insert(1);
        sortQueueAscending(q4);
        System.out.println("Sorted queue: " + q4);

        // סעיף 5
        Queue<Integer> q5a = new Queue<>();
        q5a.insert(1);
        q5a.insert(3);
        q5a.insert(8);

        Queue<Integer> q5b = new Queue<>();
        q5b.insert(2);
        q5b.insert(4);
        q5b.insert(10);

        Queue<Integer> merged = mergeSorted(q5a, q5b);
        System.out.println("Merged: " + merged);

        // סעיף 6
        Queue<Integer> q6 = new Queue<>();
        q6.insert(1);
        q6.insert(4);
        q6.insert(6);
        q6.insert(9);
        q6.insert(2);
        q6.insert(8);
        q6.insert(10);
        q6.insert(3);   
