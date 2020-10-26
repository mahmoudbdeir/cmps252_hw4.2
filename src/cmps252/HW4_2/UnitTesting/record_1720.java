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

@Tag("32")
class Record_1720 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1720: FirstName is Zachery")
	void FirstNameOfRecord1720() {
		assertEquals("Zachery", customers.get(1719).getFirstName());
	}

	@Test
	@DisplayName("Record 1720: LastName is Remme")
	void LastNameOfRecord1720() {
		assertEquals("Remme", customers.get(1719).getLastName());
	}

	@Test
	@DisplayName("Record 1720: Company is Nickel Plate Ind Crdt Un")
	void CompanyOfRecord1720() {
		assertEquals("Nickel Plate Ind Crdt Un", customers.get(1719).getCompany());
	}

	@Test
	@DisplayName("Record 1720: Address is 1200 Us Highway 22")
	void AddressOfRecord1720() {
		assertEquals("1200 Us Highway 22", customers.get(1719).getAddress());
	}

	@Test
	@DisplayName("Record 1720: City is Bridgewater")
	void CityOfRecord1720() {
		assertEquals("Bridgewater", customers.get(1719).getCity());
	}

	@Test
	@DisplayName("Record 1720: County is Somerset")
	void CountyOfRecord1720() {
		assertEquals("Somerset", customers.get(1719).getCounty());
	}

	@Test
	@DisplayName("Record 1720: State is NJ")
	void StateOfRecord1720() {
		assertEquals("NJ", customers.get(1719).getState());
	}

	@Test
	@DisplayName("Record 1720: ZIP is 8807")
	void ZIPOfRecord1720() {
		assertEquals("8807", customers.get(1719).getZIP());
	}

	@Test
	@DisplayName("Record 1720: Phone is 908-253-6904")
	void PhoneOfRecord1720() {
		assertEquals("908-253-6904", customers.get(1719).getPhone());
	}

	@Test
	@DisplayName("Record 1720: Fax is 908-253-4507")
	void FaxOfRecord1720() {
		assertEquals("908-253-4507", customers.get(1719).getFax());
	}

	@Test
	@DisplayName("Record 1720: Email is zachery@remme.com")
	void EmailOfRecord1720() {
		assertEquals("zachery@remme.com", customers.get(1719).getEmail());
	}

	@Test
	@DisplayName("Record 1720: Web is http://www.zacheryremme.com")
	void WebOfRecord1720() {
		assertEquals("http://www.zacheryremme.com", customers.get(1719).getWeb());
	}
}
