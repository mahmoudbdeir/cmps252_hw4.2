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

@Tag("11")
class Record_3271 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3271: FirstName is Melba")
	void FirstNameOfRecord3271() {
		assertEquals("Melba", customers.get(3270).getFirstName());
	}

	@Test
	@DisplayName("Record 3271: LastName is Isla")
	void LastNameOfRecord3271() {
		assertEquals("Isla", customers.get(3270).getLastName());
	}

	@Test
	@DisplayName("Record 3271: Company is Adrian, Shaun B Esq")
	void CompanyOfRecord3271() {
		assertEquals("Adrian, Shaun B Esq", customers.get(3270).getCompany());
	}

	@Test
	@DisplayName("Record 3271: Address is 4032 Dove Rd")
	void AddressOfRecord3271() {
		assertEquals("4032 Dove Rd", customers.get(3270).getAddress());
	}

	@Test
	@DisplayName("Record 3271: City is Port Huron")
	void CityOfRecord3271() {
		assertEquals("Port Huron", customers.get(3270).getCity());
	}

	@Test
	@DisplayName("Record 3271: County is Saint Clair")
	void CountyOfRecord3271() {
		assertEquals("Saint Clair", customers.get(3270).getCounty());
	}

	@Test
	@DisplayName("Record 3271: State is MI")
	void StateOfRecord3271() {
		assertEquals("MI", customers.get(3270).getState());
	}

	@Test
	@DisplayName("Record 3271: ZIP is 48060")
	void ZIPOfRecord3271() {
		assertEquals("48060", customers.get(3270).getZIP());
	}

	@Test
	@DisplayName("Record 3271: Phone is 810-364-9165")
	void PhoneOfRecord3271() {
		assertEquals("810-364-9165", customers.get(3270).getPhone());
	}

	@Test
	@DisplayName("Record 3271: Fax is 810-364-6794")
	void FaxOfRecord3271() {
		assertEquals("810-364-6794", customers.get(3270).getFax());
	}

	@Test
	@DisplayName("Record 3271: Email is melba@isla.com")
	void EmailOfRecord3271() {
		assertEquals("melba@isla.com", customers.get(3270).getEmail());
	}

	@Test
	@DisplayName("Record 3271: Web is http://www.melbaisla.com")
	void WebOfRecord3271() {
		assertEquals("http://www.melbaisla.com", customers.get(3270).getWeb());
	}
}
