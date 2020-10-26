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
class Record_3694 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3694: FirstName is Cristobal")
	void FirstNameOfRecord3694() {
		assertEquals("Cristobal", customers.get(3693).getFirstName());
	}

	@Test
	@DisplayName("Record 3694: LastName is Maltais")
	void LastNameOfRecord3694() {
		assertEquals("Maltais", customers.get(3693).getLastName());
	}

	@Test
	@DisplayName("Record 3694: Company is Peterson Park Lot Striping Inc")
	void CompanyOfRecord3694() {
		assertEquals("Peterson Park Lot Striping Inc", customers.get(3693).getCompany());
	}

	@Test
	@DisplayName("Record 3694: Address is 310 W Chicago Ave")
	void AddressOfRecord3694() {
		assertEquals("310 W Chicago Ave", customers.get(3693).getAddress());
	}

	@Test
	@DisplayName("Record 3694: City is Chicago")
	void CityOfRecord3694() {
		assertEquals("Chicago", customers.get(3693).getCity());
	}

	@Test
	@DisplayName("Record 3694: County is Cook")
	void CountyOfRecord3694() {
		assertEquals("Cook", customers.get(3693).getCounty());
	}

	@Test
	@DisplayName("Record 3694: State is IL")
	void StateOfRecord3694() {
		assertEquals("IL", customers.get(3693).getState());
	}

	@Test
	@DisplayName("Record 3694: ZIP is 60610")
	void ZIPOfRecord3694() {
		assertEquals("60610", customers.get(3693).getZIP());
	}

	@Test
	@DisplayName("Record 3694: Phone is 312-649-2406")
	void PhoneOfRecord3694() {
		assertEquals("312-649-2406", customers.get(3693).getPhone());
	}

	@Test
	@DisplayName("Record 3694: Fax is 312-649-0941")
	void FaxOfRecord3694() {
		assertEquals("312-649-0941", customers.get(3693).getFax());
	}

	@Test
	@DisplayName("Record 3694: Email is cristobal@maltais.com")
	void EmailOfRecord3694() {
		assertEquals("cristobal@maltais.com", customers.get(3693).getEmail());
	}

	@Test
	@DisplayName("Record 3694: Web is http://www.cristobalmaltais.com")
	void WebOfRecord3694() {
		assertEquals("http://www.cristobalmaltais.com", customers.get(3693).getWeb());
	}
}
