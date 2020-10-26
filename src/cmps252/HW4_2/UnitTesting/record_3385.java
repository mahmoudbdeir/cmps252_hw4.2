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

@Tag("48")
class Record_3385 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3385: FirstName is Annabelle")
	void FirstNameOfRecord3385() {
		assertEquals("Annabelle", customers.get(3384).getFirstName());
	}

	@Test
	@DisplayName("Record 3385: LastName is Schellenger")
	void LastNameOfRecord3385() {
		assertEquals("Schellenger", customers.get(3384).getLastName());
	}

	@Test
	@DisplayName("Record 3385: Company is Brew, Eugene J Jr")
	void CompanyOfRecord3385() {
		assertEquals("Brew, Eugene J Jr", customers.get(3384).getCompany());
	}

	@Test
	@DisplayName("Record 3385: Address is 51 School St")
	void AddressOfRecord3385() {
		assertEquals("51 School St", customers.get(3384).getAddress());
	}

	@Test
	@DisplayName("Record 3385: City is Pembroke")
	void CityOfRecord3385() {
		assertEquals("Pembroke", customers.get(3384).getCity());
	}

	@Test
	@DisplayName("Record 3385: County is Plymouth")
	void CountyOfRecord3385() {
		assertEquals("Plymouth", customers.get(3384).getCounty());
	}

	@Test
	@DisplayName("Record 3385: State is MA")
	void StateOfRecord3385() {
		assertEquals("MA", customers.get(3384).getState());
	}

	@Test
	@DisplayName("Record 3385: ZIP is 2359")
	void ZIPOfRecord3385() {
		assertEquals("2359", customers.get(3384).getZIP());
	}

	@Test
	@DisplayName("Record 3385: Phone is 781-294-5456")
	void PhoneOfRecord3385() {
		assertEquals("781-294-5456", customers.get(3384).getPhone());
	}

	@Test
	@DisplayName("Record 3385: Fax is 781-294-6292")
	void FaxOfRecord3385() {
		assertEquals("781-294-6292", customers.get(3384).getFax());
	}

	@Test
	@DisplayName("Record 3385: Email is annabelle@schellenger.com")
	void EmailOfRecord3385() {
		assertEquals("annabelle@schellenger.com", customers.get(3384).getEmail());
	}

	@Test
	@DisplayName("Record 3385: Web is http://www.annabelleschellenger.com")
	void WebOfRecord3385() {
		assertEquals("http://www.annabelleschellenger.com", customers.get(3384).getWeb());
	}
}
