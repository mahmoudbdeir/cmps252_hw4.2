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

@Tag("25")
class Record_3320 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3320: FirstName is Dallas")
	void FirstNameOfRecord3320() {
		assertEquals("Dallas", customers.get(3319).getFirstName());
	}

	@Test
	@DisplayName("Record 3320: LastName is Guinane")
	void LastNameOfRecord3320() {
		assertEquals("Guinane", customers.get(3319).getLastName());
	}

	@Test
	@DisplayName("Record 3320: Company is Isomedix Inc")
	void CompanyOfRecord3320() {
		assertEquals("Isomedix Inc", customers.get(3319).getCompany());
	}

	@Test
	@DisplayName("Record 3320: Address is 901 E Cary St")
	void AddressOfRecord3320() {
		assertEquals("901 E Cary St", customers.get(3319).getAddress());
	}

	@Test
	@DisplayName("Record 3320: City is Richmond")
	void CityOfRecord3320() {
		assertEquals("Richmond", customers.get(3319).getCity());
	}

	@Test
	@DisplayName("Record 3320: County is Richmond City")
	void CountyOfRecord3320() {
		assertEquals("Richmond City", customers.get(3319).getCounty());
	}

	@Test
	@DisplayName("Record 3320: State is VA")
	void StateOfRecord3320() {
		assertEquals("VA", customers.get(3319).getState());
	}

	@Test
	@DisplayName("Record 3320: ZIP is 23219")
	void ZIPOfRecord3320() {
		assertEquals("23219", customers.get(3319).getZIP());
	}

	@Test
	@DisplayName("Record 3320: Phone is 804-775-0774")
	void PhoneOfRecord3320() {
		assertEquals("804-775-0774", customers.get(3319).getPhone());
	}

	@Test
	@DisplayName("Record 3320: Fax is 804-775-2268")
	void FaxOfRecord3320() {
		assertEquals("804-775-2268", customers.get(3319).getFax());
	}

	@Test
	@DisplayName("Record 3320: Email is dallas@guinane.com")
	void EmailOfRecord3320() {
		assertEquals("dallas@guinane.com", customers.get(3319).getEmail());
	}

	@Test
	@DisplayName("Record 3320: Web is http://www.dallasguinane.com")
	void WebOfRecord3320() {
		assertEquals("http://www.dallasguinane.com", customers.get(3319).getWeb());
	}
}
