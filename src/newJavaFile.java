class Matrix {

 public int rows = 0;
 public int columns = 0;
 public float [][] m;


 Matrix(int in_rows, int in_columns, float val){
 rows=in_rows;
 columns=in_columns;
 m = new float [rows][columns];
 for (int i = 0; i < rows; i++ ) {
 for (int j = 0; j < columns; j++ ) {
 m[i][j] = val;
 }//end for j
 }//end for i
 }//constructor



 public Matrix (float [][] in_data) {
 rows = in_data.length;
 columns = in_data[0].length;
 for (int i = 0; i < rows; i++) {
 if (in_data[i].length != columns) {
throw new IllegalArgumentException("All rows mustave the same length.");
 }
 }
 m = in_data;
 }//constructor



 public int getRows(){
 return (rows);
 }//


 public int getColumns() {
 return (columns);
 }


 public float getElement(int i, int j){
 return(m[i][j]);
 }


 public void setElement(int i, int j, float value){
 m[i][j] = value;
 }


 public Matrix mult(Matrix b){
 float sum = 0;
 int i,j,k;
 if (rows != b.columns) {
 throw new IllegalArgumentException("Matrices are not onformable.");
 }
 Matrix result = new Matrix(b.rows,columns,0);
 for (i=0; i < b.rows; i++) {
 for (j=0; j < columns; j++){
 sum = 0;
 for (k=0; k<rows; k++){
 sum = sum + b.getElement(i,k)*m[k][j];
 }//end for k
 result.m[i][j]=sum;
 }//end for i
 }//end for j
 return result;
 }//end mult



 public void transform(Matrix b) {
 float sum = 0;
 int i,j,k;
 if (rows != b.columns) {
 throw new IllegalArgumentException("Matrices are not conformable.");
 }
 float [][] result = new float[b.rows][columns];
 for (i=0; i < b.rows; i++) {
 for (j=0; j < columns; j++){
 sum = 0;
 for (k=0; k<rows; k++){
 sum = sum + b.getElement(i,k)*m[k][j];
 }//end for k
 result[i][j]=sum;
 }//end for i
 }//end for j
 m=result;
 }

 public String toString(){
 String result = new String("[");
 for (int i = 0; i < rows; i++ ) {
 result += "(";
 for (int j = 0; j < columns; j++ ) {
 result += m[i][j];
 if (j != (columns-1)) {
 result += ", ";
 }//end if
 }//end for j
 result += ")\r";
 }//end for i
 result += "]";
 return(result);
 }// toString

}//end of class Matrix