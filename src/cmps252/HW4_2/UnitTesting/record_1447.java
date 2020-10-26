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

@Tag("5")
class Record_1447 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1447: FirstName is Otto")
	void FirstNameOfRecord1447() {
		assertEquals("Otto", customers.get(1446).getFirstName());
	}

	@Test
	@DisplayName("Record 1447: LastName is Yazzi")
	void LastNameOfRecord1447() {
		assertEquals("Yazzi", customers.get(1446).getLastName());
	}

	@Test
	@DisplayName("Record 1447: Company is Ocli")
	void CompanyOfRecord1447() {
		assertEquals("Ocli", customers.get(1446).getCompany());
	}

	@Test
	@DisplayName("Record 1447: Address is 2671 El Camino Real")
	void AddressOfRecord1447() {
		assertEquals("2671 El Camino Real", customers.get(1446).getAddress());
	}

	@Test
	@DisplayName("Record 1447: City is Redwood City")
	void CityOfRecord1447() {
		assertEquals("Redwood City", customers.get(1446).getCity());
	}

	@Test
	@DisplayName("Record 1447: County is San Mateo")
	void CountyOfRecord1447() {
		assertEquals("San Mateo", customers.get(1446).getCounty());
	}

	@Test
	@DisplayName("Record 1447: State is CA")
	void StateOfRecord1447() {
		assertEquals("CA", customers.get(1446).getState());
	}

	@Test
	@DisplayName("Record 1447: ZIP is 94061")
	void ZIPOfRecord1447() {
		assertEquals("94061", customers.get(1446).getZIP());
	}

	@Test
	@DisplayName("Record 1447: Phone is 650-369-0897")
	void PhoneOfRecord1447() {
		assertEquals("650-369-0897", customers.get(1446).getPhone());
	}

	@Test
	@DisplayName("Record 1447: Fax is 650-369-3775")
	void FaxOfRecord1447() {
		assertEquals("650-369-3775", customers.get(1446).getFax());
	}

	@Test
	@DisplayName("Record 1447: Email is otto@yazzi.com")
	void EmailOfRecord1447() {
		assertEquals("otto@yazzi.com", customers.get(1446).getEmail());
	}

	@Test
	@DisplayName("Record 1447: Web is http://www.ottoyazzi.com")
	void WebOfRecord1447() {
		assertEquals("http://www.ottoyazzi.com", customers.get(1446).getWeb());
	}
}
