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

@Tag("0")
class Record_3278 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3278: FirstName is Michael")
	void FirstNameOfRecord3278() {
		assertEquals("Michael", customers.get(3277).getFirstName());
	}

	@Test
	@DisplayName("Record 3278: LastName is Maselli")
	void LastNameOfRecord3278() {
		assertEquals("Maselli", customers.get(3277).getLastName());
	}

	@Test
	@DisplayName("Record 3278: Company is Scotstone Inc")
	void CompanyOfRecord3278() {
		assertEquals("Scotstone Inc", customers.get(3277).getCompany());
	}

	@Test
	@DisplayName("Record 3278: Address is S Hwy 202 & Main St")
	void AddressOfRecord3278() {
		assertEquals("S Hwy 202 & Main St", customers.get(3277).getAddress());
	}

	@Test
	@DisplayName("Record 3278: City is Flemington")
	void CityOfRecord3278() {
		assertEquals("Flemington", customers.get(3277).getCity());
	}

	@Test
	@DisplayName("Record 3278: County is Hunterdon")
	void CountyOfRecord3278() {
		assertEquals("Hunterdon", customers.get(3277).getCounty());
	}

	@Test
	@DisplayName("Record 3278: State is NJ")
	void StateOfRecord3278() {
		assertEquals("NJ", customers.get(3277).getState());
	}

	@Test
	@DisplayName("Record 3278: ZIP is 8822")
	void ZIPOfRecord3278() {
		assertEquals("8822", customers.get(3277).getZIP());
	}

	@Test
	@DisplayName("Record 3278: Phone is 908-782-1322")
	void PhoneOfRecord3278() {
		assertEquals("908-782-1322", customers.get(3277).getPhone());
	}

	@Test
	@DisplayName("Record 3278: Fax is 908-782-5992")
	void FaxOfRecord3278() {
		assertEquals("908-782-5992", customers.get(3277).getFax());
	}

	@Test
	@DisplayName("Record 3278: Email is michael@maselli.com")
	void EmailOfRecord3278() {
		assertEquals("michael@maselli.com", customers.get(3277).getEmail());
	}

	@Test
	@DisplayName("Record 3278: Web is http://www.michaelmaselli.com")
	void WebOfRecord3278() {
		assertEquals("http://www.michaelmaselli.com", customers.get(3277).getWeb());
	}
}
