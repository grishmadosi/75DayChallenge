class Solution {
    public void setZeroes(int[][] matrix) {
        int flag = 0;
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0 ; j < matrix[0].length; j++){
                if(matrix[i][j] == 0){
                    if(flag == 0 && i == 0){
                        flag = 1;
                    }
                    if(flag == 1 && j == 0){
                        flag = 2;
                    }else if(flag == 0 && j == 0){
                        flag = 3;
                    }
                    matrix[0][j] = 0;
                    matrix[i][0] = 0;
                }
            }
        } 
       int j = 1;
        while(j < matrix[0].length){
           int i = 0;
           if(matrix[i][j] == 0){
             while(i < matrix.length){
                matrix[i][j] = 0;
                i++;
             }
           }
           j++;
        }

        int i = 1;
        while(i < matrix.length){
            j = 0;
            if(matrix[i][j] == 0){
                while(j < matrix[0].length){
                    matrix[i][j] = 0;
                    j++;
                }
            }
            i++;
        }

            i = 0;
            j = 0;
        if(flag == 1){
            while(j < matrix[0].length){
                matrix[i][j] = 0;
                j++;
            }
        }else if(flag == 3){
            while(i < matrix.length){
                matrix[i][j] = 0;
                i++;
            }
        }else if(flag == 2){
            while(j < matrix[0].length){
                matrix[i][j] = 0;
                j++;
            }
            i = 0;
            j= 0;
            while(i < matrix.length){
                matrix[i][j] = 0;
                i++;
            }
        }
        
    }
}