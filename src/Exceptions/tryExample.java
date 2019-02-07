package Exceptions;

import org.junit.Test;

import junit.framework.Assert;

public class tryExample {

	@Test
	public void test1() {
		try {
			Assert.fail("my failure");
		} catch (Error e) {
			// TODO: handle exception
			System.out.println(e);
		}

	}

	public static void main(String[] args) {
		tryWithThrowable();
	}

	public static void tryfinallyWithoutCatch() {
		try {
			System.out.println(1 / 0);
		} finally {
			// : handle finally clause
			System.out.println("finally");
		}
	}

	public static void tryWithThrowable() {
		try {
			System.out.println("tryWithThrowable");

//			try {
//				System.out.print(1 / 0);
//			} catch (Exception e) {
//				// TODO: handle exception
//				throw e;
//			}
			// justanotherfunction();
		} catch (Throwable t) {
			System.out.println(t);
		} finally {
			// : handle finally clause
			System.out.println("finally");
		}
	}

	public static void justanotherfunction() {
		tryWithThrowable();
	}
}
