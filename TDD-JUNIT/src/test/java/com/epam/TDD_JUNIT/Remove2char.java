package com.epam.TDD_JUNIT;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
class Remove2char {
	
	/* TODO list for remove the character of a at first 2 places
	 * 1.ABCD => BCD   remove 1st char
       2.AACD => CD    remove 2 char
       3.BACD => BCD   remove n char
       4. BBAA => BBAA empty char    
          AABAA => BAA

	 */
	Removefirst2chars check;
	
	@BeforeEach
	void startup() {
		check=new Removefirst2chars();
	}

	@Test
	void test1chars() {
			assertEquals("B",check.Removechar("AB"));		
		}
	@Test
	void test2chars() {
			assertEquals("B",check.Removechar("B"));
		}
		@Test
		void testnchars() {
			assertEquals("BBBC",check.Removechar("BABBC"));
		}
		@Test
		void testemptychars() {
			assertEquals("",check.Removechar(""));

	}

}
