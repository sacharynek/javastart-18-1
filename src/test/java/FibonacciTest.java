import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class FibonacciTest {

    @DataProvider
    public Object[][] getData() {
        return new Object[][]{{4_000_000, 4613732}, {10, 44}, {0, 0}, {-1, 0}};
    }

    @Test(dataProvider = "getData")
    public void testCalculateFibElements(int input, int output) {

        //Arrange
        //Act
        long calculatedValue = Fibonacci.calculateFibElements(input, 4_000_000);
        //Assert
        assertThat(calculatedValue).isEqualTo(output);
    }

}
