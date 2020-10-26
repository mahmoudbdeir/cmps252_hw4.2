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
class Record_1708 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1708: FirstName is Kellie")
	void FirstNameOfRecord1708() {
		assertEquals("Kellie", customers.get(1707).getFirstName());
	}

	@Test
	@DisplayName("Record 1708: LastName is Tebeau")
	void LastNameOfRecord1708() {
		assertEquals("Tebeau", customers.get(1707).getLastName());
	}

	@Test
	@DisplayName("Record 1708: Company is Hempts Furniture")
	void CompanyOfRecord1708() {
		assertEquals("Hempts Furniture", customers.get(1707).getCompany());
	}

	@Test
	@DisplayName("Record 1708: Address is 1705 Hwy 71 N")
	void AddressOfRecord1708() {
		assertEquals("1705 Hwy 71 N", customers.get(1707).getAddress());
	}

	@Test
	@DisplayName("Record 1708: City is Springdale")
	void CityOfRecord1708() {
		assertEquals("Springdale", customers.get(1707).getCity());
	}

	@Test
	@DisplayName("Record 1708: County is Washington")
	void CountyOfRecord1708() {
		assertEquals("Washington", customers.get(1707).getCounty());
	}

	@Test
	@DisplayName("Record 1708: State is AR")
	void StateOfRecord1708() {
		assertEquals("AR", customers.get(1707).getState());
	}

	@Test
	@DisplayName("Record 1708: ZIP is 72764")
	void ZIPOfRecord1708() {
		assertEquals("72764", customers.get(1707).getZIP());
	}

	@Test
	@DisplayName("Record 1708: Phone is 479-751-6759")
	void PhoneOfRecord1708() {
		assertEquals("479-751-6759", customers.get(1707).getPhone());
	}

	@Test
	@DisplayName("Record 1708: Fax is 479-751-4611")
	void FaxOfRecord1708() {
		assertEquals("479-751-4611", customers.get(1707).getFax());
	}

	@Test
	@DisplayName("Record 1708: Email is kellie@tebeau.com")
	void EmailOfRecord1708() {
		assertEquals("kellie@tebeau.com", customers.get(1707).getEmail());
	}

	@Test
	@DisplayName("Record 1708: Web is http://www.kellietebeau.com")
	void WebOfRecord1708() {
		assertEquals("http://www.kellietebeau.com", customers.get(1707).getWeb());
	}
}
