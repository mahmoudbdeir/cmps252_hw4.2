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

@Tag("12")
class Record_1473 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1473: FirstName is Jillian")
	void FirstNameOfRecord1473() {
		assertEquals("Jillian", customers.get(1472).getFirstName());
	}

	@Test
	@DisplayName("Record 1473: LastName is Talas")
	void LastNameOfRecord1473() {
		assertEquals("Talas", customers.get(1472).getLastName());
	}

	@Test
	@DisplayName("Record 1473: Company is Apple Knoll Printers")
	void CompanyOfRecord1473() {
		assertEquals("Apple Knoll Printers", customers.get(1472).getCompany());
	}

	@Test
	@DisplayName("Record 1473: Address is 2757 Ernest St")
	void AddressOfRecord1473() {
		assertEquals("2757 Ernest St", customers.get(1472).getAddress());
	}

	@Test
	@DisplayName("Record 1473: City is Jacksonville")
	void CityOfRecord1473() {
		assertEquals("Jacksonville", customers.get(1472).getCity());
	}

	@Test
	@DisplayName("Record 1473: County is Duval")
	void CountyOfRecord1473() {
		assertEquals("Duval", customers.get(1472).getCounty());
	}

	@Test
	@DisplayName("Record 1473: State is FL")
	void StateOfRecord1473() {
		assertEquals("FL", customers.get(1472).getState());
	}

	@Test
	@DisplayName("Record 1473: ZIP is 32205")
	void ZIPOfRecord1473() {
		assertEquals("32205", customers.get(1472).getZIP());
	}

	@Test
	@DisplayName("Record 1473: Phone is 904-384-3266")
	void PhoneOfRecord1473() {
		assertEquals("904-384-3266", customers.get(1472).getPhone());
	}

	@Test
	@DisplayName("Record 1473: Fax is 904-384-6263")
	void FaxOfRecord1473() {
		assertEquals("904-384-6263", customers.get(1472).getFax());
	}

	@Test
	@DisplayName("Record 1473: Email is jillian@talas.com")
	void EmailOfRecord1473() {
		assertEquals("jillian@talas.com", customers.get(1472).getEmail());
	}

	@Test
	@DisplayName("Record 1473: Web is http://www.jilliantalas.com")
	void WebOfRecord1473() {
		assertEquals("http://www.jilliantalas.com", customers.get(1472).getWeb());
	}
}
