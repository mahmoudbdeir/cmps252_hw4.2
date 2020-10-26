package cmps252.HW4_2.UnitTesting;

import static org.junit.jupiter.api.Assertions.*;
import java.io.FileNotFoundException;
import java.util.List;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import cmps252.HW4_2.Customer;
import cmps252.HW4_2.FileParser;

@Tag("18")
class Record_2738 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2738: FirstName is Malik")
	void FirstNameOfRecord2738() {
		assertEquals("Malik", customers.get(2737).getFirstName());
	}

	@Test
	@DisplayName("Record 2738: LastName is Dirth")
	void LastNameOfRecord2738() {
		assertEquals("Dirth", customers.get(2737).getLastName());
	}

	@Test
	@DisplayName("Record 2738: Company is Oster & Wegener")
	void CompanyOfRecord2738() {
		assertEquals("Oster & Wegener", customers.get(2737).getCompany());
	}

	@Test
	@DisplayName("Record 2738: Address is 52 State Route 35 S")
	void AddressOfRecord2738() {
		assertEquals("52 State Route 35 S", customers.get(2737).getAddress());
	}

	@Test
	@DisplayName("Record 2738: City is Eatontown")
	void CityOfRecord2738() {
		assertEquals("Eatontown", customers.get(2737).getCity());
	}

	@Test
	@DisplayName("Record 2738: County is Monmouth")
	void CountyOfRecord2738() {
		assertEquals("Monmouth", customers.get(2737).getCounty());
	}

	@Test
	@DisplayName("Record 2738: State is NJ")
	void StateOfRecord2738() {
		assertEquals("NJ", customers.get(2737).getState());
	}

	@Test
	@DisplayName("Record 2738: ZIP is 7724")
	void ZIPOfRecord2738() {
		assertEquals("7724", customers.get(2737).getZIP());
	}

	@Test
	@DisplayName("Record 2738: Phone is 732-542-5843")
	void PhoneOfRecord2738() {
		assertEquals("732-542-5843", customers.get(2737).getPhone());
	}

	@Test
	@DisplayName("Record 2738: Fax is 732-542-2038")
	void FaxOfRecord2738() {
		assertEquals("732-542-2038", customers.get(2737).getFax());
	}

	@Test
	@DisplayName("Record 2738: Email is malik@dirth.com")
	void EmailOfRecord2738() {
		assertEquals("malik@dirth.com", customers.get(2737).getEmail());
	}

	@Test
	@DisplayName("Record 2738: Web is http://www.malikdirth.com")
	void WebOfRecord2738() {
		assertEquals("http://www.malikdirth.com", customers.get(2737).getWeb());
	}
}
