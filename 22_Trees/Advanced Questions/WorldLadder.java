import java.util.*;
import java.util.Queue;

class WordLadder{
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        if(!wordList.contains(endWord)){
            return 0;
        }

        Set<String> visited = new HashSet<>();
        Queue<String> q = new LinkedList<>();
        q.offer(beginWord);
        int length = 0;

        while(!q.isEmpty()){
            int size = q.size();
            length++;

            for(int i=0; i<size; i++){
                String Current = q.poll();

                for(int j=0; j<Current.length(); j++){
                    char[] chars = Current.toCharArray();

                    for(char c='a'; c<='z'; c++){
                        chars[j] = c;
                        String newWord = new String(chars);

                        if(newWord.equals(endWord)){
                            return length + 1;
                        }

                        if(wordList.contains(newWord) && !visited.contains(newWord)){
                            visited.add(newWord);
                            q.offer(newWord);
                        }
                    }
                }
            }
        }
        return 0;
    }
}