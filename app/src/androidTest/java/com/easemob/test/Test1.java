package com.easemob.test;

import android.support.test.runner.AndroidJUnit4;
import android.test.suitebuilder.annotation.SmallTest;
import android.util.Log;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;

/**
 * Created by wei on 2016/8/2.
 */
@RunWith(AndroidJUnit4.class)
@SmallTest
public class Test1 {
  @Test
  public void test(){
    int x = 0;
    for (int i = 0; i < 2; i++){
      x += i;
    }
    Assert.assertEquals(x,1);
    //Assert.assertEquals(x,2);

  }

  @BeforeClass
  public static void classBefore(){
    Log.d("aa", "before class");
  }

  @Test
  public void test2(){
    Log.d("aa", "exe test2()");
    Assert.assertEquals(4, 3+2);
  }

  @Test
  public void test3(){
    Assert.assertFalse(4 == 2);
  }

}
