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

@Tag("39")
class Record_3589 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3589: FirstName is Rhett")
	void FirstNameOfRecord3589() {
		assertEquals("Rhett", customers.get(3588).getFirstName());
	}

	@Test
	@DisplayName("Record 3589: LastName is Hegre")
	void LastNameOfRecord3589() {
		assertEquals("Hegre", customers.get(3588).getLastName());
	}

	@Test
	@DisplayName("Record 3589: Company is Custom Signs Today")
	void CompanyOfRecord3589() {
		assertEquals("Custom Signs Today", customers.get(3588).getCompany());
	}

	@Test
	@DisplayName("Record 3589: Address is 124 S Saint Joseph St")
	void AddressOfRecord3589() {
		assertEquals("124 S Saint Joseph St", customers.get(3588).getAddress());
	}

	@Test
	@DisplayName("Record 3589: City is Colon")
	void CityOfRecord3589() {
		assertEquals("Colon", customers.get(3588).getCity());
	}

	@Test
	@DisplayName("Record 3589: County is Saint Joseph")
	void CountyOfRecord3589() {
		assertEquals("Saint Joseph", customers.get(3588).getCounty());
	}

	@Test
	@DisplayName("Record 3589: State is MI")
	void StateOfRecord3589() {
		assertEquals("MI", customers.get(3588).getState());
	}

	@Test
	@DisplayName("Record 3589: ZIP is 49040")
	void ZIPOfRecord3589() {
		assertEquals("49040", customers.get(3588).getZIP());
	}

	@Test
	@DisplayName("Record 3589: Phone is 269-432-9953")
	void PhoneOfRecord3589() {
		assertEquals("269-432-9953", customers.get(3588).getPhone());
	}

	@Test
	@DisplayName("Record 3589: Fax is 269-432-4642")
	void FaxOfRecord3589() {
		assertEquals("269-432-4642", customers.get(3588).getFax());
	}

	@Test
	@DisplayName("Record 3589: Email is rhett@hegre.com")
	void EmailOfRecord3589() {
		assertEquals("rhett@hegre.com", customers.get(3588).getEmail());
	}

	@Test
	@DisplayName("Record 3589: Web is http://www.rhetthegre.com")
	void WebOfRecord3589() {
		assertEquals("http://www.rhetthegre.com", customers.get(3588).getWeb());
	}
}
