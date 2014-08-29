package ru.itbasis.demo.java.self.child.woi;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ClassTest {
    public static final int BASE_PARAM  = 1;
    public static final int CHILD_PARAM = 2;

    @DataProvider(name = "data")
    public static Object[][] data() {

        final ChildClass item0 = new ChildClass().setBaseParam(BASE_PARAM);
        item0.setChildParam(CHILD_PARAM);

        final ChildClass item1 = new ChildClass().setChildParam(CHILD_PARAM).setBaseParam(BASE_PARAM);

        final ChildClass item2 = new ChildClass().setBaseParam(BASE_PARAM).setChildParam(CHILD_PARAM);

        return new Object[][]{{item0}, {item1}, {item2}};
    }

    @Test(dataProvider = "data")
    public void testChildClass(final ChildClass item) throws Exception {
        Assert.assertEquals(item.getBaseParam(), BASE_PARAM);
        Assert.assertEquals(item.getChildParam(), CHILD_PARAM);
    }

}