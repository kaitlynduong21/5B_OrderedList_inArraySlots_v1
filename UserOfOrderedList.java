/**
  test OrderedList
 */

public class UserOfOrderedList {
    public static OrderedList_inArraySlots orderedList =
      new OrderedList_inArraySlots();

    public static void main(String[] commandLine) {
        System.out.println( orderedList);
        System.out.println( System.lineSeparator());

        addOne( "populate an empty list"
               , 0
               ,"[0,]"
               );

        addOne( "add an element that belongs at the front"
               , -11
               ,"[-11,0,]"
               );

        addOne( "add an element that belongs at the back"
               , 5
               ,"[-11,0,5,]"
               );

        addOne( "add an element that belongs somewhere in the middle"
               , 2
               ,"[-11,0,2,5,]"
               );

        addOne( "add an element that is the same as another element"
               , 0
               ,"[-11,0,0,2,5,]"
               );

        getOne( "getting an element at index 0"
               , 0
               ,"-11"
               );

        getOne( "getting an element at index 2"
              , 2
              ,"0"
              );

        getOne( "getting the last element"
              , orderedList.size() - 1
              ,"5"
              );

        removeOne( "removing an element at the head"
                  , 0
                  ,"[0,0,2,5,]"
                  );

        removeOne( "removing an element at the end"
                  , orderedList.size() - 1
                  ,"[0,0,2,]"
                  );

        removeOne( "removing an element in the middle"
                  , 1
                  ,"[0,2,]"
                  );
    }


    /**
      run one test
     */
    private static void addOne( String description
                              , int value
                              , String expect
                              ) {
        System.out.println( description);
        orderedList.add( value);

        // check
        System.out.println(
            "result:   "
          + orderedList
          + " ...expecting "
          + expect
          + System.lineSeparator());
     }

     private static void getOne( String description
                               , int index
                               , String expect
                               ) {
         System.out.println( description);
         int val = orderedList.get( index);

         // check
         System.out.println(
             "result:   "
           + val
           + " ...expecting "
           + expect
           + System.lineSeparator());
      }

      private static void removeOne( String description
                                , int index
                                , String expect
                                ) {
          System.out.println( description);
          orderedList.remove( index);

          // check
          System.out.println(
              "result:   "
            + orderedList
            + " ...expecting "
            + expect
            + System.lineSeparator());
       }

}
