package com.svinfotech.datastructures;

/*
 *  We have a class like below , Need to find out sum of left and right variables.
 *  Class Test {
 *  		Object left; // Here left can be integer or again Test
 *  		Object right; // Here right can be integer or again Test
 *  }
 * 
 */

class DataStructLeftRightSum{

	Object left; // can be of type integer or Test type
	Object right; // can be of type integer or Test type

	DataStructLeftRightSum(Object left, Object right) {
	    this.left = left;
	    this.right = right;
	}

	public static void main(String args[]) {
	   //int total = sum(new Test(new Test(10,20),new Test(20,30)), new Test(10, 20));
		int total = sum(new DataStructLeftRightSum(new DataStructLeftRightSum(10,20),new DataStructLeftRightSum(20,30)), 10);
	    System.out.println(total);
	}

	public static int sum(Object left, Object right) {
		int total = 0;
	    if (left instanceof Integer && right instanceof Integer) {
	        total = total + (Integer)left + (Integer)right;
	    } else if (left instanceof Integer && right instanceof DataStructLeftRightSum) {
	        total = (Integer)left + sum(((DataStructLeftRightSum)right).left,((DataStructLeftRightSum)right).right);
	    } else if (left instanceof DataStructLeftRightSum && right instanceof Integer) {
	    		total = (Integer)right + sum(((DataStructLeftRightSum)left).left,((DataStructLeftRightSum)left).right);
	    } else if (left instanceof DataStructLeftRightSum && right instanceof DataStructLeftRightSum) {
	        total = sum(((DataStructLeftRightSum)left).left,((DataStructLeftRightSum)left).right) + sum(((DataStructLeftRightSum)right).left,((DataStructLeftRightSum)right).right);
	    }
	    return total;
	}

}