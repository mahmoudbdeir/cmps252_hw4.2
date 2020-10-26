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

@Tag("41")
class Record_1618 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1618: FirstName is Jeannette")
	void FirstNameOfRecord1618() {
		assertEquals("Jeannette", customers.get(1617).getFirstName());
	}

	@Test
	@DisplayName("Record 1618: LastName is Golick")
	void LastNameOfRecord1618() {
		assertEquals("Golick", customers.get(1617).getLastName());
	}

	@Test
	@DisplayName("Record 1618: Company is Gator Jungle")
	void CompanyOfRecord1618() {
		assertEquals("Gator Jungle", customers.get(1617).getCompany());
	}

	@Test
	@DisplayName("Record 1618: Address is 635 W Main St")
	void AddressOfRecord1618() {
		assertEquals("635 W Main St", customers.get(1617).getAddress());
	}

	@Test
	@DisplayName("Record 1618: City is Peoria")
	void CityOfRecord1618() {
		assertEquals("Peoria", customers.get(1617).getCity());
	}

	@Test
	@DisplayName("Record 1618: County is Peoria")
	void CountyOfRecord1618() {
		assertEquals("Peoria", customers.get(1617).getCounty());
	}

	@Test
	@DisplayName("Record 1618: State is IL")
	void StateOfRecord1618() {
		assertEquals("IL", customers.get(1617).getState());
	}

	@Test
	@DisplayName("Record 1618: ZIP is 61606")
	void ZIPOfRecord1618() {
		assertEquals("61606", customers.get(1617).getZIP());
	}

	@Test
	@DisplayName("Record 1618: Phone is 309-676-4427")
	void PhoneOfRecord1618() {
		assertEquals("309-676-4427", customers.get(1617).getPhone());
	}

	@Test
	@DisplayName("Record 1618: Fax is 309-676-9316")
	void FaxOfRecord1618() {
		assertEquals("309-676-9316", customers.get(1617).getFax());
	}

	@Test
	@DisplayName("Record 1618: Email is jeannette@golick.com")
	void EmailOfRecord1618() {
		assertEquals("jeannette@golick.com", customers.get(1617).getEmail());
	}

	@Test
	@DisplayName("Record 1618: Web is http://www.jeannettegolick.com")
	void WebOfRecord1618() {
		assertEquals("http://www.jeannettegolick.com", customers.get(1617).getWeb());
	}
}
