import org.junit.Test;
import static junit.framework.Assert.assertEquals;
public class Week4Test {
    @Test
    public void testMax2Int1(){
        assertEquals(5, Week4.max2Int(5,4));
    }

    @Test
    public void testMax2Int2(){
        assertEquals(1, Week4.max2Int(-99,1));
    }

    @Test
    public void testMax2Int3(){
        assertEquals(-9, Week4.max2Int(-9,-11));
    }

    @Test
    public void testMax2Int4(){
        assertEquals(2424242, Week4.max2Int(-2424242,2424242));
    }

    @Test
    public void testMax2Int5(){
        assertEquals(88, Week4.max2Int(88,0));
    }

    @Test
    public void testMinArray1(){
        assertEquals(1, Week4.minArray(new int[]{ 1,2,3,4,5,6,7,8,9,10 }));
    }

    @Test
    public void testMinArray2(){
        assertEquals(1, Week4.minArray(new int[]{ 1}));
    }

    @Test
    public void testMinArray3(){
        assertEquals(-9, Week4.minArray(new int[]{ 6,8,22,-9,6 }));
    }

    @Test
    public void testMinArray4(){
        assertEquals(5, Week4.minArray(new int[]{ 5,8,9,5,5 }));
    }

    @Test
    public void testMinArray5(){
        assertEquals(8, Week4.minArray(new int[]{ 8,9,10 }));
    }

    @Test
    public void testCalculateBMI1(){
        assertEquals("Béo phì", Week4.calculateBMI(80,1.7));
    }

    @Test
    public void testCalculateBMI2(){
        assertEquals("Thừa cân", Week4.calculateBMI(70,1.7));
    }

    @Test
    public void testCalculateBMI3(){
        assertEquals("Bình thường", Week4.calculateBMI(60,1.7));
    }

    @Test
    public void testCalculateBMI4(){
        assertEquals("Thiếu cân", Week4.calculateBMI(50,1.7));
    }

    @Test
    public void testCalculateBMI5(){
        assertEquals("Bình thường", Week4.calculateBMI(80,2));
    }
}

