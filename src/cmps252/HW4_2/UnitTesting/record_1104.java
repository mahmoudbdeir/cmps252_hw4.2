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

@Tag("34")
class Record_1104 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1104: FirstName is Reggie")
	void FirstNameOfRecord1104() {
		assertEquals("Reggie", customers.get(1103).getFirstName());
	}

	@Test
	@DisplayName("Record 1104: LastName is Wanat")
	void LastNameOfRecord1104() {
		assertEquals("Wanat", customers.get(1103).getLastName());
	}

	@Test
	@DisplayName("Record 1104: Company is El Molino Winery")
	void CompanyOfRecord1104() {
		assertEquals("El Molino Winery", customers.get(1103).getCompany());
	}

	@Test
	@DisplayName("Record 1104: Address is 2780 Walnut Ave")
	void AddressOfRecord1104() {
		assertEquals("2780 Walnut Ave", customers.get(1103).getAddress());
	}

	@Test
	@DisplayName("Record 1104: City is Long Beach")
	void CityOfRecord1104() {
		assertEquals("Long Beach", customers.get(1103).getCity());
	}

	@Test
	@DisplayName("Record 1104: County is Los Angeles")
	void CountyOfRecord1104() {
		assertEquals("Los Angeles", customers.get(1103).getCounty());
	}

	@Test
	@DisplayName("Record 1104: State is CA")
	void StateOfRecord1104() {
		assertEquals("CA", customers.get(1103).getState());
	}

	@Test
	@DisplayName("Record 1104: ZIP is 90806")
	void ZIPOfRecord1104() {
		assertEquals("90806", customers.get(1103).getZIP());
	}

	@Test
	@DisplayName("Record 1104: Phone is 562-490-7311")
	void PhoneOfRecord1104() {
		assertEquals("562-490-7311", customers.get(1103).getPhone());
	}

	@Test
	@DisplayName("Record 1104: Fax is 562-490-8811")
	void FaxOfRecord1104() {
		assertEquals("562-490-8811", customers.get(1103).getFax());
	}

	@Test
	@DisplayName("Record 1104: Email is reggie@wanat.com")
	void EmailOfRecord1104() {
		assertEquals("reggie@wanat.com", customers.get(1103).getEmail());
	}

	@Test
	@DisplayName("Record 1104: Web is http://www.reggiewanat.com")
	void WebOfRecord1104() {
		assertEquals("http://www.reggiewanat.com", customers.get(1103).getWeb());
	}
}
