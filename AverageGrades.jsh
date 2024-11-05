int[] average_grades(int grades[][], int weights[]) {  
        int numStudents = grades.length;  
        int numComponents = weights.length;  
        int[] averages = new int[numStudents];  
          
        for (int i = 0; i < numStudents; i++) {  
                int total = 0;  
                for (int j = 0; j < numComponents; j++) {  
                        total += grades[i][j] * weights[j];  
                }  
                averages[i] = total / 100; 
        }  
          
        return averages;  
}
int[][] studentGrades = {{51, 83, 28}, {0, 38, 95}};
int[] componentWeights = {30, 40, 30};
int[] results = average_grades(studentGrades, componentWeights);
System.out.println(Arrays.toString(results));