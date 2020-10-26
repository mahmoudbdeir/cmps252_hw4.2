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

@Tag("45")
class Record_3836 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3836: FirstName is Desmond")
	void FirstNameOfRecord3836() {
		assertEquals("Desmond", customers.get(3835).getFirstName());
	}

	@Test
	@DisplayName("Record 3836: LastName is Schiffert")
	void LastNameOfRecord3836() {
		assertEquals("Schiffert", customers.get(3835).getLastName());
	}

	@Test
	@DisplayName("Record 3836: Company is Kopple, Robert C Esq")
	void CompanyOfRecord3836() {
		assertEquals("Kopple, Robert C Esq", customers.get(3835).getCompany());
	}

	@Test
	@DisplayName("Record 3836: Address is 10455 Torre Ave")
	void AddressOfRecord3836() {
		assertEquals("10455 Torre Ave", customers.get(3835).getAddress());
	}

	@Test
	@DisplayName("Record 3836: City is Cupertino")
	void CityOfRecord3836() {
		assertEquals("Cupertino", customers.get(3835).getCity());
	}

	@Test
	@DisplayName("Record 3836: County is Santa Clara")
	void CountyOfRecord3836() {
		assertEquals("Santa Clara", customers.get(3835).getCounty());
	}

	@Test
	@DisplayName("Record 3836: State is CA")
	void StateOfRecord3836() {
		assertEquals("CA", customers.get(3835).getState());
	}

	@Test
	@DisplayName("Record 3836: ZIP is 95014")
	void ZIPOfRecord3836() {
		assertEquals("95014", customers.get(3835).getZIP());
	}

	@Test
	@DisplayName("Record 3836: Phone is 408-996-3630")
	void PhoneOfRecord3836() {
		assertEquals("408-996-3630", customers.get(3835).getPhone());
	}

	@Test
	@DisplayName("Record 3836: Fax is 408-996-3902")
	void FaxOfRecord3836() {
		assertEquals("408-996-3902", customers.get(3835).getFax());
	}

	@Test
	@DisplayName("Record 3836: Email is desmond@schiffert.com")
	void EmailOfRecord3836() {
		assertEquals("desmond@schiffert.com", customers.get(3835).getEmail());
	}

	@Test
	@DisplayName("Record 3836: Web is http://www.desmondschiffert.com")
	void WebOfRecord3836() {
		assertEquals("http://www.desmondschiffert.com", customers.get(3835).getWeb());
	}
}
