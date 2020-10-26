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

@Tag("46")
class Record_2719 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2719: FirstName is Brenton")
	void FirstNameOfRecord2719() {
		assertEquals("Brenton", customers.get(2718).getFirstName());
	}

	@Test
	@DisplayName("Record 2719: LastName is Trohanov")
	void LastNameOfRecord2719() {
		assertEquals("Trohanov", customers.get(2718).getLastName());
	}

	@Test
	@DisplayName("Record 2719: Company is Rust Armenis & Schwarts Pro")
	void CompanyOfRecord2719() {
		assertEquals("Rust Armenis & Schwarts Pro", customers.get(2718).getCompany());
	}

	@Test
	@DisplayName("Record 2719: Address is 12950 W Little York Rd")
	void AddressOfRecord2719() {
		assertEquals("12950 W Little York Rd", customers.get(2718).getAddress());
	}

	@Test
	@DisplayName("Record 2719: City is Houston")
	void CityOfRecord2719() {
		assertEquals("Houston", customers.get(2718).getCity());
	}

	@Test
	@DisplayName("Record 2719: County is Harris")
	void CountyOfRecord2719() {
		assertEquals("Harris", customers.get(2718).getCounty());
	}

	@Test
	@DisplayName("Record 2719: State is TX")
	void StateOfRecord2719() {
		assertEquals("TX", customers.get(2718).getState());
	}

	@Test
	@DisplayName("Record 2719: ZIP is 77041")
	void ZIPOfRecord2719() {
		assertEquals("77041", customers.get(2718).getZIP());
	}

	@Test
	@DisplayName("Record 2719: Phone is 713-937-8665")
	void PhoneOfRecord2719() {
		assertEquals("713-937-8665", customers.get(2718).getPhone());
	}

	@Test
	@DisplayName("Record 2719: Fax is 713-937-7883")
	void FaxOfRecord2719() {
		assertEquals("713-937-7883", customers.get(2718).getFax());
	}

	@Test
	@DisplayName("Record 2719: Email is brenton@trohanov.com")
	void EmailOfRecord2719() {
		assertEquals("brenton@trohanov.com", customers.get(2718).getEmail());
	}

	@Test
	@DisplayName("Record 2719: Web is http://www.brentontrohanov.com")
	void WebOfRecord2719() {
		assertEquals("http://www.brentontrohanov.com", customers.get(2718).getWeb());
	}
}
