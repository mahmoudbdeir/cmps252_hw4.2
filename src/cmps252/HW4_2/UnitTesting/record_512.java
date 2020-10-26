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

@Tag("49")
class Record_512 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 512: FirstName is Evelyn")
	void FirstNameOfRecord512() {
		assertEquals("Evelyn", customers.get(511).getFirstName());
	}

	@Test
	@DisplayName("Record 512: LastName is Verderosa")
	void LastNameOfRecord512() {
		assertEquals("Verderosa", customers.get(511).getLastName());
	}

	@Test
	@DisplayName("Record 512: Company is Norstan Communications")
	void CompanyOfRecord512() {
		assertEquals("Norstan Communications", customers.get(511).getCompany());
	}

	@Test
	@DisplayName("Record 512: Address is 4321 Kilmer St")
	void AddressOfRecord512() {
		assertEquals("4321 Kilmer St", customers.get(511).getAddress());
	}

	@Test
	@DisplayName("Record 512: City is Golden")
	void CityOfRecord512() {
		assertEquals("Golden", customers.get(511).getCity());
	}

	@Test
	@DisplayName("Record 512: County is Jefferson")
	void CountyOfRecord512() {
		assertEquals("Jefferson", customers.get(511).getCounty());
	}

	@Test
	@DisplayName("Record 512: State is CO")
	void StateOfRecord512() {
		assertEquals("CO", customers.get(511).getState());
	}

	@Test
	@DisplayName("Record 512: ZIP is 80403")
	void ZIPOfRecord512() {
		assertEquals("80403", customers.get(511).getZIP());
	}

	@Test
	@DisplayName("Record 512: Phone is 303-279-0449")
	void PhoneOfRecord512() {
		assertEquals("303-279-0449", customers.get(511).getPhone());
	}

	@Test
	@DisplayName("Record 512: Fax is 303-279-0147")
	void FaxOfRecord512() {
		assertEquals("303-279-0147", customers.get(511).getFax());
	}

	@Test
	@DisplayName("Record 512: Email is evelyn@verderosa.com")
	void EmailOfRecord512() {
		assertEquals("evelyn@verderosa.com", customers.get(511).getEmail());
	}

	@Test
	@DisplayName("Record 512: Web is http://www.evelynverderosa.com")
	void WebOfRecord512() {
		assertEquals("http://www.evelynverderosa.com", customers.get(511).getWeb());
	}
}
