public interface OrderedList{

  //return the number of elements in the list
  int size();

  //adds the given value to the correct location in the list
  void add(int value);

  //return the value of the element at the given index
  int get(int index);

  //removes the element at the given index
  //returns the value of the removed element
  int remove(int index);

}
