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

@Tag("1")
class Record_3276 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3276: FirstName is Mamie")
	void FirstNameOfRecord3276() {
		assertEquals("Mamie", customers.get(3275).getFirstName());
	}

	@Test
	@DisplayName("Record 3276: LastName is Plimpton")
	void LastNameOfRecord3276() {
		assertEquals("Plimpton", customers.get(3275).getLastName());
	}

	@Test
	@DisplayName("Record 3276: Company is Helpline")
	void CompanyOfRecord3276() {
		assertEquals("Helpline", customers.get(3275).getCompany());
	}

	@Test
	@DisplayName("Record 3276: Address is 75 S Bridge St")
	void AddressOfRecord3276() {
		assertEquals("75 S Bridge St", customers.get(3275).getAddress());
	}

	@Test
	@DisplayName("Record 3276: City is Somerville")
	void CityOfRecord3276() {
		assertEquals("Somerville", customers.get(3275).getCity());
	}

	@Test
	@DisplayName("Record 3276: County is Somerset")
	void CountyOfRecord3276() {
		assertEquals("Somerset", customers.get(3275).getCounty());
	}

	@Test
	@DisplayName("Record 3276: State is NJ")
	void StateOfRecord3276() {
		assertEquals("NJ", customers.get(3275).getState());
	}

	@Test
	@DisplayName("Record 3276: ZIP is 8876")
	void ZIPOfRecord3276() {
		assertEquals("8876", customers.get(3275).getZIP());
	}

	@Test
	@DisplayName("Record 3276: Phone is 908-707-5037")
	void PhoneOfRecord3276() {
		assertEquals("908-707-5037", customers.get(3275).getPhone());
	}

	@Test
	@DisplayName("Record 3276: Fax is 908-707-6666")
	void FaxOfRecord3276() {
		assertEquals("908-707-6666", customers.get(3275).getFax());
	}

	@Test
	@DisplayName("Record 3276: Email is mamie@plimpton.com")
	void EmailOfRecord3276() {
		assertEquals("mamie@plimpton.com", customers.get(3275).getEmail());
	}

	@Test
	@DisplayName("Record 3276: Web is http://www.mamieplimpton.com")
	void WebOfRecord3276() {
		assertEquals("http://www.mamieplimpton.com", customers.get(3275).getWeb());
	}
}
