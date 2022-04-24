
class Transformation3d extends Matrix{

 Transformation3d(){
 super(4,4,0);
 m[0][0]=1;
 m[1][1]=1;
 m[2][2]=1;
 m[3][3]=1;
 }//constructor


 Transformation3d(int in_rows, int in_columns, float val){
 super(in_rows,in_columns,val);
 }//constructor

 Transformation3d(float[][] inData){
 super(inData);
 }//constructor


 public Object clone() {
 Transformation3d myClone = new Transformation3d(m);
 return myClone;
 }//clone


 public void translate(float x, float y, float z) {
 m[0][3]=x;
 m[1][3]=y;
 m[2][3]=z;
 }//translate


 public void scale(float sx, float sy, float sz){
 m[0][0]=sx;
 m[1][1]=sy;
 m[2][2]=sz;
 }//scale


 public void rotatex(float angle) {
 m[1][1] = (float)Math.cos(angle);
 m[2][1] = -(float)Math.sin(angle);
 m[1][2] = (float)Math.sin(angle);
 m[2][2] = (float)Math.cos(angle);
 }//rotate

 public void rotatey(float angle) {
 m[0][0] = (float)Math.cos(angle);
 m[0][2] = (float)Math.sin(angle);
 m[2][0] = -(float)Math.sin(angle);
 m[2][2] = (float)Math.cos(angle);
 }//rotate

 public void rotatez(float angle) {
 m[0][0] = (float)Math.cos(angle);
 m[1][0] = -(float)Math.sin(angle);
 m[0][1] = (float)Math.sin(angle);
 m[1][1] = (float)Math.cos(angle);
 }//rotate

 public void perspective(float viewingDistance) {
 m[2][2]=0;
 m[3][2]=1/viewingDistance;
 }//perspective

 public void isometric() {
 m[2][2]=0;
 m[0][0]=(float)Math.sin(Math.toRadians(60));
 m[0][1]=-(float)Math.cos(Math.toRadians(60));
 m[2][0]=-(float)Math.sin(Math.toRadians(60));
 m[2][1]=-(float)Math.cos(Math.toRadians(60));
  }//isometric
 
 public Transformation3d mult (Transformation3d b){
 float sum = 0;
 int i,j,k;
 if (rows != b.columns) {
 throw new IllegalArgumentException("Matrices are notconformable.");
 }
 Transformation3d result = new
Transformation3d(b.rows,columns,0);
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
 }//mult
 }//end class Transformation3d