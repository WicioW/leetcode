package stack;

/**
 * Design a stack that supports push, pop, top, and retrieving the minimum element in constant time.
 *
 * Implement the MinStack class:
 *
 * MinStack() initializes the stack object.
 * void push(int val) pushes the element val onto the stack.
 * void pop() removes the element on the top of the stack.
 * int top() gets the top element of the stack.
 * int getMin() retrieves the minimum element in the stack.
 * You must implement a solution with O(1) time complexity for each function.
 *
 *
 *
 * Example 1:
 *
 * Input
 * ["MinStack","push","push","push","getMin","pop","top","getMin"]
 * [[],[-2],[0],[-3],[],[],[],[]]
 *
 * Output
 * [null,null,null,null,-3,null,0,-2]
 *
 * Explanation
 * MinStack minStack = new MinStack();
 * minStack.push(-2);
 * minStack.push(0);
 * minStack.push(-3);
 * minStack.getMin(); // return -3
 * minStack.pop();
 * minStack.top();    // return 0
 * minStack.getMin(); // return -2
 *
 *
 * Constraints:
 *
 * -231 <= val <= 231 - 1
 * Methods pop, top and getMin operations will always be called on non-empty stacks.
 * At most 3 * 104 calls will be made to push, pop, top, and getMin.
 */


import java.util.Stack;

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */
public class MinStack {

    private Stack<Integer> stack = new Stack<>();
    private Stack<Integer> minValuePositionStack = new Stack<>();
    private int minValue = Integer.MAX_VALUE;

    // u  u u  u o
    // 3 -1 0 -3 n
    // 0  1 1  4 1


    public MinStack() {
        System.out.println("created");
    }

    public void push(int val) {
        System.out.println("push:" + val);
        stack.push(val);

        if(val <= minValue){
            minValue=val;
            int valPosition =stack.indexOf(val);
            minValuePositionStack.push(valPosition);
        }else{
            Integer minValuePeek = minValuePositionStack.peek();
            minValuePositionStack.push(minValuePeek);
        }
    }

    public void pop() {
        System.out.println("pop");


        stack.pop();
        minValuePositionStack.pop();

        if(stack.isEmpty()){
            minValue=Integer.MAX_VALUE;
        }else{
            minValue=stack.elementAt(minValuePositionStack.peek());
        }
    }

    public int top() {
        int result =  stack.peek();
        System.out.println("top:"+ result);
        return result;
    }

    public int getMin() {
        Integer minValuePeek = minValuePositionStack.peek();
        int result= stack.elementAt(minValuePeek);
        System.out.println("getmin:"+result);
        return result;
    }


    public static void main(String[] args) {
        MinStack minStack = new MinStack();
        minStack.push(395);
        minStack.getMin();
        minStack.top();
        minStack.getMin();
        minStack.push(276);
        minStack.push(29);
        minStack.getMin();
        minStack.push(-482);
        minStack.getMin(); //-482
        minStack.pop();
        minStack.push(-108);
        minStack.push(-251);
        minStack.getMin(); //-251
        minStack.push(-439);
        minStack.top(); //-439
        minStack.push(370);
        minStack.pop();
        minStack.pop();
        minStack.getMin();
        minStack.pop();
        minStack.getMin();
        minStack.getMin();
        minStack.pop();
        minStack.getMin();
        minStack.push(-158);
        minStack.push(82);
        minStack.pop();
        minStack.push(-176);
        minStack.getMin();
        minStack.getMin();
        minStack.push(-90);
        minStack.getMin();
        minStack.getMin();
        minStack.push(411);
        minStack.getMin();
        minStack.getMin();
        minStack.getMin();
        minStack.push(-494);
        minStack.getMin();
        minStack.pop();
        minStack.top();
        minStack.push(155);
        minStack.top();
        minStack.push(-370);
        minStack.getMin();
        minStack.getMin();
        minStack.push(273);
        minStack.pop();
        minStack.getMin();
        minStack.getMin();
        minStack.pop();
        minStack.pop();
        minStack.getMin();
        minStack.push(173);
        minStack.getMin();
        minStack.getMin();
        minStack.push(0);
        minStack.getMin();
        minStack.top();
        minStack.getMin();
        minStack.push(-266);
        minStack.getMin();
        minStack.push(-359);
        minStack.top();
        minStack.getMin();
        minStack.push(189);
        minStack.getMin();
        minStack.top();
        minStack.getMin();
        minStack.push(375);
        minStack.getMin();
        minStack.getMin();
        minStack.push(-188);
        minStack.pop();
        minStack.push(-275);
        minStack.push(-223);
        minStack.getMin();
        minStack.push(294);
        minStack.push(380);
        minStack.push(-42);
        minStack.top();
        minStack.getMin();
        minStack.push(33);
        minStack.getMin();
        minStack.push(457);
        minStack.push(422);
        minStack.push(-352);
        minStack.getMin();
        minStack.push(326);
        minStack.push(-378);
        minStack.push(231);
        minStack.pop();
        minStack.push(416);
        minStack.getMin();
        minStack.top();
        minStack.getMin();
        minStack.getMin();
        minStack.push(277);
        minStack.top();
        minStack.push(472);
        minStack.push(205);
        minStack.top();
        minStack.push(-443);
        minStack.getMin();
        minStack.push(-5);
        minStack.top();
        minStack.getMin();
        minStack.getMin();
        minStack.getMin();
        minStack.getMin();
        minStack.getMin();
        minStack.push(-312);
        minStack.getMin();
        minStack.push(-249);
        minStack.push(-209);
        minStack.getMin();
        minStack.getMin();
        minStack.getMin();
        minStack.top();
        minStack.getMin();
        minStack.push(196);
        minStack.pop();
        minStack.getMin();
        minStack.getMin();
        minStack.push(-347);
        minStack.getMin();
        minStack.getMin();
        minStack.getMin();
        minStack.getMin();
        minStack.push(400);
        minStack.top();
        minStack.top();
        minStack.push(269);
        minStack.push(434);
        minStack.push(-213);
        minStack.top();
        minStack.top();
        minStack.push(-58);
        minStack.getMin();
        minStack.push(-353);
        minStack.push(-426);
        minStack.push(-335);
        minStack.getMin();
        minStack.getMin();
        minStack.push(-188);
        minStack.push(-388);
        minStack.push(369);
        minStack.push(319);
        minStack.getMin();
        minStack.getMin();
        minStack.getMin();
        minStack.push(121);
        minStack.top();
        minStack.pop();
        minStack.getMin();
        minStack.push(155);
        minStack.top();
        minStack.pop();
        minStack.push(155);
        minStack.getMin();
        minStack.pop();
        minStack.getMin();
        minStack.pop();
        minStack.getMin();
        minStack.push(495);
        minStack.top();
        minStack.push(-53);
        minStack.getMin();
        minStack.getMin();
        minStack.top();
        minStack.pop();
        minStack.top();
        minStack.getMin();
        minStack.getMin();
        minStack.push(465);
        minStack.push(162);
        minStack.push(-334);
        minStack.pop();
        minStack.push(282);
        minStack.getMin();
        minStack.getMin();
        minStack.push(432);
        minStack.push(-418);
        minStack.push(195);
        minStack.top();
        minStack.getMin();
        minStack.top();
        minStack.getMin();
        minStack.getMin();
        minStack.top();
        minStack.top();
        minStack.pop();
        minStack.pop();
        minStack.getMin();
        minStack.getMin();
        minStack.push(374);
        minStack.getMin();
        minStack.push(202);
        minStack.getMin();
        minStack.push(181);
        minStack.push(173);
        minStack.push(-323);
        minStack.getMin();
        minStack.pop();
        minStack.pop();
        minStack.push(-430);
        minStack.pop();
        minStack.top();
        minStack.push(346);
        minStack.top();
        minStack.top();
        minStack.pop();
        minStack.top();
        minStack.push(244);
        minStack.push(-467);
        minStack.top();
        minStack.top();
        minStack.getMin();
        minStack.getMin();
        minStack.getMin();
        minStack.push(279);
        minStack.getMin();
        minStack.getMin();
        minStack.push(-30);
        minStack.getMin();
        minStack.pop();
        minStack.top();
        minStack.push(264);
        minStack.push(-217);
        minStack.push(-418);
        minStack.push(12);
        minStack.push(-439);
        minStack.getMin();
        minStack.getMin();
        minStack.push(7);
        minStack.getMin();
        minStack.getMin();
        minStack.getMin();
        minStack.push(-189);
        minStack.getMin();
        minStack.getMin();
        minStack.getMin();
        minStack.top();
        minStack.getMin();
        minStack.getMin();
        minStack.push(303);
        minStack.top();
        minStack.getMin();
        minStack.push(-297);
        minStack.getMin();
        minStack.push(-21);
        minStack.getMin();
        minStack.getMin();
        minStack.getMin();
        minStack.push(461);
        minStack.pop();
        minStack.push(-303);
        minStack.pop();
        minStack.push(-338);
        minStack.top();
        minStack.getMin();
        minStack.getMin();
        minStack.push(-42);
        minStack.getMin();
        minStack.getMin();
        minStack.getMin();
        minStack.push(85);
        minStack.push(132);
        minStack.push(57);
        minStack.getMin();
        minStack.push(-17);
        minStack.top();
        minStack.push(-10);
        minStack.getMin();
        minStack.push(-500);
        minStack.top();
        minStack.getMin();
        minStack.getMin();
        minStack.getMin();
        minStack.pop();
        minStack.getMin();
        minStack.top();
        minStack.getMin();
        minStack.push(-7);
        minStack.getMin();
        minStack.getMin();
        minStack.getMin();
        minStack.getMin();
        minStack.getMin();
        minStack.pop();
        minStack.getMin();
        minStack.getMin();
        minStack.push(346);
        minStack.getMin();
        minStack.pop();
        minStack.push(16);
        minStack.top();
        minStack.push(472);
        minStack.push(-211);
        minStack.getMin();
        minStack.pop();
        minStack.pop();
        minStack.push(-381);
        minStack.pop();
        minStack.getMin();
        minStack.push(214);
        minStack.push(169);
        minStack.getMin();
        minStack.getMin();
        minStack.pop();
        minStack.pop();
        minStack.pop();
        minStack.push(33);
        minStack.pop();
        minStack.push(115);
        minStack.push(-346);
        minStack.push(-309);
        minStack.push(130);
        minStack.getMin();
        minStack.top();
        minStack.getMin();
        minStack.getMin();
        minStack.getMin();
        minStack.top();
        minStack.push(335);
        minStack.getMin();
        minStack.push(-92);
        minStack.push(-16);
        minStack.getMin();
        minStack.pop();
        minStack.getMin();
        minStack.push(-470);
        minStack.pop();
        minStack.pop();
        minStack.push(250);
        minStack.push(327);
        minStack.push(144);
        minStack.pop();
        minStack.getMin();
        minStack.getMin();
        minStack.pop();
        minStack.push(359);
        minStack.push(138);
        minStack.getMin();
        minStack.top();
        minStack.getMin();
        minStack.pop();
        minStack.push(272);
        minStack.push(-241);
        minStack.push(-362);
        minStack.getMin();
        minStack.getMin();
        minStack.push(-83);
        minStack.push(195);
        minStack.push(-208);
        minStack.getMin();
        minStack.pop();
        minStack.getMin();
        minStack.push(-500);
        minStack.push(5);
        minStack.getMin();
        minStack.getMin();
        minStack.getMin();
        minStack.push(284);
        minStack.getMin();
        minStack.getMin();
        minStack.getMin();
        minStack.getMin();
        minStack.getMin();
        minStack.getMin();
        minStack.push(477);
        minStack.getMin();
        minStack.pop();
        minStack.getMin();
        minStack.getMin();
        minStack.push(30);
        minStack.pop();
        minStack.pop();
        minStack.pop();
        minStack.push(-269);
        minStack.top();
        minStack.push(-413);
        minStack.push(-323);
        minStack.getMin();
        minStack.getMin();
        minStack.getMin();
        minStack.getMin();
        minStack.getMin();
        minStack.push(217);
        minStack.push(-408);
        minStack.top();
        minStack.push(-353);
        minStack.top();
        minStack.push(-142);
        minStack.top();
        minStack.pop();
        minStack.push(-321);
        minStack.getMin();
        minStack.push(-33);
        minStack.push(382);
        minStack.getMin();
        minStack.getMin();
        minStack.getMin();
        minStack.getMin();
        minStack.pop();
        minStack.getMin();
        minStack.push(298);
        minStack.top();
        minStack.pop();
        minStack.push(495);
        minStack.getMin();
        minStack.push(195);
        minStack.push(-147);
        minStack.push(-85);
        minStack.push(195);
        minStack.pop();
        minStack.getMin();
        minStack.push(154);
        minStack.push(-311);
        minStack.top();
        minStack.getMin();
        minStack.getMin();
        minStack.top();
        minStack.getMin();
        minStack.getMin();
        minStack.push(-390);
        minStack.getMin();
        minStack.push(323);
        minStack.getMin();
        minStack.top();
        minStack.getMin();
        minStack.getMin();
        minStack.push(338);
        minStack.push(263);
        minStack.getMin();
        minStack.push(160);
        minStack.push(148);
        minStack.push(142);
        minStack.push(427);
        minStack.getMin();
        minStack.getMin();
        minStack.pop();
        minStack.push(-153);
        minStack.top();
        minStack.push(-384);
        minStack.pop();
        minStack.getMin();
        minStack.push(159);
        minStack.push(419);
        minStack.getMin();
        minStack.getMin();
        minStack.push(-385);
        minStack.getMin();
        minStack.push(461);
        minStack.push(-346);
        minStack.getMin();
        minStack.getMin();
        minStack.getMin();
        minStack.top();
        minStack.getMin();
        minStack.getMin();
        minStack.push(343);
        minStack.top();
        minStack.push(-269);
        minStack.top();
        minStack.pop();
        minStack.push(-401);
        minStack.push(81);
        minStack.getMin();
        minStack.push(130);
        minStack.pop();
        minStack.pop();
        minStack.push(-428);
        minStack.getMin();
        minStack.push(454);
        minStack.getMin();
        minStack.getMin();
        minStack.getMin();
        minStack.top();
        minStack.top();
        minStack.pop();
        minStack.pop();
        minStack.pop();
        minStack.getMin();
        minStack.push(59);
        minStack.top();
        minStack.push(143);
        minStack.getMin();
        minStack.getMin();
        minStack.getMin();
        minStack.push(-154);
        minStack.getMin();
        minStack.top();
        minStack.getMin();
        minStack.push(114);
        minStack.push(-346);
        minStack.getMin();
        minStack.pop();
        minStack.getMin();
    }

    //generating test case code
    public static void main4(String[] args) {
        //TEST CASE
        String[] array = {"MinStack","push","getMin","top","getMin","push","push","getMin","push","getMin","pop","push","push","getMin","push","top","push","pop","pop","getMin","pop","getMin","getMin","pop","getMin","push","push","pop","push","getMin","getMin","push","getMin","getMin","push","getMin","getMin","getMin","push","getMin","pop","top","push","top","push","getMin","getMin","push","pop","getMin","getMin","pop","pop","getMin","push","getMin","getMin","push","getMin","top","getMin","push","getMin","push","top","getMin","push","getMin","top","getMin","push","getMin","getMin","push","pop","push","push","getMin","push","push","push","top","getMin","push","getMin","push","push","push","getMin","push","push","push","pop","push","getMin","top","getMin","getMin","push","top","push","push","top","push","getMin","push","top","getMin","getMin","getMin","getMin","getMin","push","getMin","push","push","getMin","getMin","getMin","top","getMin","push","pop","getMin","getMin","push","getMin","getMin","getMin","getMin","push","top","top","push","push","push","top","top","push","getMin","push","push","push","getMin","getMin","push","push","push","push","getMin","getMin","getMin","push","top","pop","getMin","push","top","pop","push","getMin","pop","getMin","pop","getMin","push","top","push","getMin","getMin","top","pop","top","getMin","getMin","push","push","push","pop","push","getMin","getMin","push","push","push","top","getMin","top","getMin","getMin","top","top","pop","pop","getMin","getMin","push","getMin","push","getMin","push","push","push","getMin","pop","pop","push","pop","top","push","top","top","pop","top","push","push","top","top","getMin","getMin","getMin","push","getMin","getMin","push","getMin","pop","top","push","push","push","push","push","getMin","getMin","push","getMin","getMin","getMin","push","getMin","getMin","getMin","top","getMin","getMin","push","top","getMin","push","getMin","push","getMin","getMin","getMin","push","pop","push","pop","push","top","getMin","getMin","push","getMin","getMin","getMin","push","push","push","getMin","push","top","push","getMin","push","top","getMin","getMin","getMin","pop","getMin","top","getMin","push","getMin","getMin","getMin","getMin","getMin","pop","getMin","getMin","push","getMin","pop","push","top","push","push","getMin","pop","pop","push","pop","getMin","push","push","getMin","getMin","pop","pop","pop","push","pop","push","push","push","push","getMin","top","getMin","getMin","getMin","top","push","getMin","push","push","getMin","pop","getMin","push","pop","pop","push","push","push","pop","getMin","getMin","pop","push","push","getMin","top","getMin","pop","push","push","push","getMin","getMin","push","push","push","getMin","pop","getMin","push","push","getMin","getMin","getMin","push","getMin","getMin","getMin","getMin","getMin","getMin","push","getMin","pop","getMin","getMin","push","pop","pop","pop","push","top","push","push","getMin","getMin","getMin","getMin","getMin","push","push","top","push","top","push","top","pop","push","getMin","push","push","getMin","getMin","getMin","getMin","pop","getMin","push","top","pop","push","getMin","push","push","push","push","pop","getMin","push","push","top","getMin","getMin","top","getMin","getMin","push","getMin","push","getMin","top","getMin","getMin","push","push","getMin","push","push","push","push","getMin","getMin","pop","push","top","push","pop","getMin","push","push","getMin","getMin","push","getMin","push","push","getMin","getMin","getMin","top","getMin","getMin","push","top","push","top","pop","push","push","getMin","push","pop","pop","push","getMin","push","getMin","getMin","getMin","top","top","pop","pop","pop","getMin","push","top","push","getMin","getMin","getMin","push","getMin","top","getMin","push","push","getMin","pop","getMin"};
        Integer[] array2 = {null,395,null,null,null,276,29,null,-482,null,null,-108,-251,null,-439,null,370,null,null,null,null,null,null,null,null,-158,82,null,-176,null,null,-90,null,null,411,null,null,null,-494,null,null,null,155,null,-370,null,null,273,null,null,null,null,null,null,173,null,null,0,null,null,null,-266,null,-359,null,null,189,null,null,null,375,null,null,-188,null,-275,-223,null,294,380,-42,null,null,33,null,457,422,-352,null,326,-378,231,null,416,null,null,null,null,277,null,472,205,null,-443,null,-5,null,null,null,null,null,null,-312,null,-249,-209,null,null,null,null,null,196,null,null,null,-347,null,null,null,null,400,null,null,269,434,-213,null,null,-58,null,-353,-426,-335,null,null,-188,-388,369,319,null,null,null,121,null,null,null,155,null,null,155,null,null,null,null,null,495,null,-53,null,null,null,null,null,null,null,465,162,-334,null,282,null,null,432,-418,195,null,null,null,null,null,null,null,null,null,null,null,374,null,202,null,181,173,-323,null,null,null,-430,null,null,346,null,null,null,null,244,-467,null,null,null,null,null,279,null,null,-30,null,null,null,264,-217,-418,12,-439,null,null,7,null,null,null,-189,null,null,null,null,null,null,303,null,null,-297,null,-21,null,null,null,461,null,-303,null,-338,null,null,null,-42,null,null,null,85,132,57,null,-17,null,-10,null,-500,null,null,null,null,null,null,null,null,-7,null,null,null,null,null,null,null,null,346,null,null,16,null,472,-211,null,null,null,-381,null,null,214,169,null,null,null,null,null,33,null,115,-346,-309,130,null,null,null,null,null,null,335,null,-92,-16,null,null,null,-470,null,null,250,327,144,null,null,null,null,359,138,null,null,null,null,272,-241,-362,null,null,-83,195,-208,null,null,null,-500,5,null,null,null,284,null,null,null,null,null,null,477,null,null,null,null,30,null,null,null,-269,null,-413,-323,null,null,null,null,null,217,-408,null,-353,null,-142,null,null,-321,null,-33,382,null,null,null,null,null,null,298,null,null,495,null,195,-147,-85,195,null,null,154,-311,null,null,null,null,null,null,-390,null,323,null,null,null,null,338,263,null,160,148,142,427,null,null,null,-153,null,-384,null,null,159,419,null,null,-385,null,461,-346,null,null,null,null,null,null,343,null,-269,null,null,-401,81,null,130,null,null,-428,null,454,null,null,null,null,null,null,null,null,null,59,null,143,null,null,null,-154,null,null,null,114,-346,null,null,null};


        for (int i = 0; i < array.length; i++) {

            String s = array[i];
            if(s.equals("MinStack")){
                System.out.println("MinStack minStack = new MinStack();");
            }

            if(s.equals("push")){
                System.out.println("minStack.push(" + array2[i] + ");");
            }

            if(s.equals("getMin")){
                System.out.println("minStack.getMin();");
            }

            if(s.equals("top")){
                System.out.println("minStack.top();");
            }
            if(s.equals("pop")){
                System.out.println("minStack.pop();");
            }

        }



    }

    public static void main3(String[] args) {
        MinStack minStack = new MinStack();
        minStack.push(2147483646);
        minStack.push(2147483646);
        minStack.push(2147483647);
        minStack.top();
        minStack.pop();
        minStack.getMin();
        minStack.pop();
        minStack.getMin();
        minStack.pop();
        minStack.push(2147483647);
        minStack.top();
        minStack.getMin();
        minStack.push(-2147483648);
        minStack.top();
        minStack.getMin();
        minStack.pop();
        minStack.getMin();
    }


    public static void main2(String[] args) {
        MinStack minStack = new MinStack();
        minStack.push(-2);
        minStack.push(0);
        minStack.push(-3);
        System.out.println(minStack.getMin()); // return -3
        minStack.pop();
        System.out.println(minStack.top());    // return 0
        System.out.println(minStack.getMin()); // return -2
    }
}
