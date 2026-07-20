class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> rows = new ArrayList<>();
        int[][] newPoints = new int[grid.length][grid[0].length];
        int v = 0;
        int w= 0;

                v = k/grid[0].length;
                w= k%grid[0].length;
        for ( int i =0; i<grid.length; i++){
            for (int j =0; j<grid[0].length; j++){

                System.out.println(i+"_"+j+"_"+((v+i+(j+w)/grid[0].length)%grid.length)+"_"+(j+w)%grid[0].length);
                 newPoints[(v+i+(j+w)/grid[0].length)%grid.length][(j+w)%grid[0].length]=grid[i][j];





            }
        }
    for (int i = 0; i < newPoints.length; i++) {
    List<Integer> row = new ArrayList<>();
    for (int num : newPoints[i]) {
        row.add(num);
    }
    ans.add(row);
}
        System.out.println(Arrays.deepToString(newPoints));
        return ans;
        
    }
}