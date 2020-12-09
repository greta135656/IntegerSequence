import java.util.NoSuchElementException;
public class ArraySequence implements IntegerSequence{
  private int currentIndex;
  private int []data;

  /*Construct the sequence by copying values from the other array into the data array*/
  public ArraySequence(int [] other){
  
  data = new int[other.length];
  for (int i = 0; i < data.length; i ++){
  data [i] = other[i];
  } }


public ArraySequence(IntegerSequence otherseq){

data = new int[otherseq.length()];
otherseq.reset();
int i = 0;
while(otherseq.hasNext()){
data[i] = otherseq.next();
i++;
}
otherseq.reset();
currentIndex=0;
}

  
public void reset(){
currentIndex = 0;
}

public int length(){ 
return Math.abs(data.length);}

public boolean hasNext(){ 
  if (currentIndex < data.length)
  return true;
  return false; }

  public int next() {   
  if (!hasNext())
   {throw new  NoSuchElementException("error");}
   {
return data[currentIndex++];}}}
