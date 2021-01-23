package practise;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import practise.Bird;
import practise.Color;
import practise.Wing;

class AnimalTest {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void birdTest() {
		Animal homosapiens = new Animal("Homo");
		
		Bird pepeye = new Bird();
		pepeye.setName("Philemon");
		pepeye.setWeight(3.0);
		pepeye.setColor(Color.BROWN);
		pepeye.setLeftWing(Wing.LEFT_SHORT_WING);
		pepeye.setRightWing(Wing.RIGHT_SHORT_WING);
		
		assertNotEquals(homosapiens, pepeye);
	}
	@Test
	void polymorphismTest() {
		Animal eyele = new Pigeon();
		//moveAnimal(eyele);
		//moveBird(eyele);  this method call refuses to take the parameter because the method has been tied to the bird class therefore a type animal cannot be passed an a parameter
		Pigeon anotherPigeon = new Pigeon();
		//moveAnimal(anotherPigeon);
		//moveBird(anotherPigeon);
		Pigeon myPigeon = new Pigeon();
		moveAnimal(myPigeon);
		
		Animal bingo = new Dog("Bingo");
		assertEquals("Bingo", bingo.getName());
		
		eyele.move();
		bingo.move();
	}
	public void moveAnimal(Animal anAnimal) {
		anAnimal.move();
	}
	public void moveBird(Bird abird) {
		abird.move();
	}
	
	@Test
	void animalMoveTest() {
		Animal[] animals = new  Animal[4];
		
		Pigeon myPigeon = new Pigeon("Eyele");
		animals[0] = myPigeon;
		
		Dog myDog = new Dog("Simba");
		animals[1] = myDog;
		
		Fish myFish = new Fish("Eja nla");
//		myFish.setName("Eja kika");
		animals[2] = myFish;
		
		Cat myCat = new Cat("Ologbo");
		animals[3] = myCat;
		
		for(Animal animal : animals) {
			animal.move();
		}
	}

}
