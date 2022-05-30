class Solution {
    public List<String> fizzBuzz(int n) {
        List<String> lists = new ArrayList<>();
        int Counter = 1;
        while(Counter <= n){
            if((Counter)%3 == 0 && (Counter)%5 == 0){
                lists.add("FizzBuzz");
            } else if ((Counter)%3 == 0) {
                lists.add("Fizz");
            } else if ((Counter)%5 == 0) {
                lists.add("Buzz");
            } else {
                lists.add(Integer.toString(Counter));
            }
            Counter++;
        }
        return lists;
        
    }
}
