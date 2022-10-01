class Twitter {
    Map<Integer, List<Pair<Integer, Integer>>> tweets;
    Map<Integer, Set<Integer>> followed;
    int c;

    public Twitter() {
        tweets = new HashMap<>();
        followed = new HashMap<>();
        c = 0;
    }
    
    public void postTweet(int userId, int tweetId) {
        if(!tweets.containsKey(userId)) tweets.put(userId, new ArrayList<>());
        tweets.get(userId).add(new Pair<>(c++, tweetId));
    }
    
    public List<Integer> getNewsFeed(int userId) {
        PriorityQueue<Pair<Integer, Integer>> q = new PriorityQueue<>((a,b)->b.getKey()-a.getKey());
        for(Pair<Integer, Integer> tweet : tweets.getOrDefault(userId, new ArrayList<>())) 
            q.offer(tweet);
        Set<Integer> followees = followed.getOrDefault(userId, new HashSet<>());
        for(int user : followees){
            for(Pair<Integer, Integer> tweet : tweets.getOrDefault(user, new ArrayList<>())) 
                q.offer(tweet);
        }
        int count = 0;
        List<Integer> tweetList = new ArrayList<>();
        while(!q.isEmpty() && count < 10){
            tweetList.add(q.poll().getValue());
            count++;
        }
        return tweetList;
    }
    
    public void follow(int followerId, int followeeId) {
        if(!followed.containsKey(followerId)) followed.put(followerId, new HashSet<>());
        followed.get(followerId).add(followeeId);
    }
    
    public void unfollow(int followerId, int followeeId) {
        if(followed.containsKey(followerId)) followed.get(followerId).remove(followeeId);
    }
}
   
/**
 * Your Twitter object will be instantiated and called as such:
 * Twitter obj = new Twitter();
 * obj.postTweet(userId,tweetId);
 * List<Integer> param_2 = obj.getNewsFeed(userId);
 * obj.follow(followerId,followeeId);
 * obj.unfollow(followerId,followeeId);
 */