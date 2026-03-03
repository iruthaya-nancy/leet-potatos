class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        /**
        where one node unlocks multiple nodes then this is a Graph
        based problem
        and graphs uses recursion and not the iteration.
         */
         boolean[] visited = new boolean[rooms.size()]; // this is array
         dfs(rooms, visited,0); // here sending the first room 0 because it is always open and visited
         for(boolean v : visited){
            if(!v){
                return false;
            }
         }
        return true;
    }
         private void dfs(List<List<Integer>> rooms, boolean[] visited , int room){
                if(visited[room]){
                    return;
                }
                visited[room] = true;
                for(int k : rooms.get(room)){
                    dfs(rooms,visited,k);
                }
         }
    }
