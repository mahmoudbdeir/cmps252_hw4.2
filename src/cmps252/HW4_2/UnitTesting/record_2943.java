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

@Tag("26")
class Record_2943 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2943: FirstName is Elwood")
	void FirstNameOfRecord2943() {
		assertEquals("Elwood", customers.get(2942).getFirstName());
	}

	@Test
	@DisplayName("Record 2943: LastName is Cafferky")
	void LastNameOfRecord2943() {
		assertEquals("Cafferky", customers.get(2942).getLastName());
	}

	@Test
	@DisplayName("Record 2943: Company is Cast Inc")
	void CompanyOfRecord2943() {
		assertEquals("Cast Inc", customers.get(2942).getCompany());
	}

	@Test
	@DisplayName("Record 2943: Address is 2248 Spring Mountain Rd")
	void AddressOfRecord2943() {
		assertEquals("2248 Spring Mountain Rd", customers.get(2942).getAddress());
	}

	@Test
	@DisplayName("Record 2943: City is Las Vegas")
	void CityOfRecord2943() {
		assertEquals("Las Vegas", customers.get(2942).getCity());
	}

	@Test
	@DisplayName("Record 2943: County is Clark")
	void CountyOfRecord2943() {
		assertEquals("Clark", customers.get(2942).getCounty());
	}

	@Test
	@DisplayName("Record 2943: State is NV")
	void StateOfRecord2943() {
		assertEquals("NV", customers.get(2942).getState());
	}

	@Test
	@DisplayName("Record 2943: ZIP is 89109")
	void ZIPOfRecord2943() {
		assertEquals("89109", customers.get(2942).getZIP());
	}

	@Test
	@DisplayName("Record 2943: Phone is 702-791-5832")
	void PhoneOfRecord2943() {
		assertEquals("702-791-5832", customers.get(2942).getPhone());
	}

	@Test
	@DisplayName("Record 2943: Fax is 702-791-6105")
	void FaxOfRecord2943() {
		assertEquals("702-791-6105", customers.get(2942).getFax());
	}

	@Test
	@DisplayName("Record 2943: Email is elwood@cafferky.com")
	void EmailOfRecord2943() {
		assertEquals("elwood@cafferky.com", customers.get(2942).getEmail());
	}

	@Test
	@DisplayName("Record 2943: Web is http://www.elwoodcafferky.com")
	void WebOfRecord2943() {
		assertEquals("http://www.elwoodcafferky.com", customers.get(2942).getWeb());
	}
}
