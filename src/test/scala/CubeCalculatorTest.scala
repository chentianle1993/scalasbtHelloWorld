import org.scalatest.{BeforeAndAfterEach, FunSuite}

class CubeCalculatorTest extends FunSuite with BeforeAndAfterEach {

  override def beforeEach() {

  }

  override def afterEach() {

  }

  test("testCube") {
    assert(CubeCalculator.cube(3) === 27)

  }

  test("testCube2") {
    assert(CubeCalculator.cube(0) === 0)

  }

}
