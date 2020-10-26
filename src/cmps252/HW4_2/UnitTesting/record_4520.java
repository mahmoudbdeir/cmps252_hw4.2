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

@Tag("5")
class Record_4520 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4520: FirstName is Susanne")
	void FirstNameOfRecord4520() {
		assertEquals("Susanne", customers.get(4519).getFirstName());
	}

	@Test
	@DisplayName("Record 4520: LastName is Bolio")
	void LastNameOfRecord4520() {
		assertEquals("Bolio", customers.get(4519).getLastName());
	}

	@Test
	@DisplayName("Record 4520: Company is Ficerai, Kenneth Esq")
	void CompanyOfRecord4520() {
		assertEquals("Ficerai, Kenneth Esq", customers.get(4519).getCompany());
	}

	@Test
	@DisplayName("Record 4520: Address is 1001 Bishop St")
	void AddressOfRecord4520() {
		assertEquals("1001 Bishop St", customers.get(4519).getAddress());
	}

	@Test
	@DisplayName("Record 4520: City is Honolulu")
	void CityOfRecord4520() {
		assertEquals("Honolulu", customers.get(4519).getCity());
	}

	@Test
	@DisplayName("Record 4520: County is Honolulu")
	void CountyOfRecord4520() {
		assertEquals("Honolulu", customers.get(4519).getCounty());
	}

	@Test
	@DisplayName("Record 4520: State is HI")
	void StateOfRecord4520() {
		assertEquals("HI", customers.get(4519).getState());
	}

	@Test
	@DisplayName("Record 4520: ZIP is 96813")
	void ZIPOfRecord4520() {
		assertEquals("96813", customers.get(4519).getZIP());
	}

	@Test
	@DisplayName("Record 4520: Phone is 808-524-2590")
	void PhoneOfRecord4520() {
		assertEquals("808-524-2590", customers.get(4519).getPhone());
	}

	@Test
	@DisplayName("Record 4520: Fax is 808-524-4258")
	void FaxOfRecord4520() {
		assertEquals("808-524-4258", customers.get(4519).getFax());
	}

	@Test
	@DisplayName("Record 4520: Email is susanne@bolio.com")
	void EmailOfRecord4520() {
		assertEquals("susanne@bolio.com", customers.get(4519).getEmail());
	}

	@Test
	@DisplayName("Record 4520: Web is http://www.susannebolio.com")
	void WebOfRecord4520() {
		assertEquals("http://www.susannebolio.com", customers.get(4519).getWeb());
	}
}
