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

@Tag("13")
class Record_2225 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2225: FirstName is Pedro")
	void FirstNameOfRecord2225() {
		assertEquals("Pedro", customers.get(2224).getFirstName());
	}

	@Test
	@DisplayName("Record 2225: LastName is Gulbraa")
	void LastNameOfRecord2225() {
		assertEquals("Gulbraa", customers.get(2224).getLastName());
	}

	@Test
	@DisplayName("Record 2225: Company is Smiling, A Mark Esq")
	void CompanyOfRecord2225() {
		assertEquals("Smiling, A Mark Esq", customers.get(2224).getCompany());
	}

	@Test
	@DisplayName("Record 2225: Address is 74135 Church St")
	void AddressOfRecord2225() {
		assertEquals("74135 Church St", customers.get(2224).getAddress());
	}

	@Test
	@DisplayName("Record 2225: City is Armada")
	void CityOfRecord2225() {
		assertEquals("Armada", customers.get(2224).getCity());
	}

	@Test
	@DisplayName("Record 2225: County is Macomb")
	void CountyOfRecord2225() {
		assertEquals("Macomb", customers.get(2224).getCounty());
	}

	@Test
	@DisplayName("Record 2225: State is MI")
	void StateOfRecord2225() {
		assertEquals("MI", customers.get(2224).getState());
	}

	@Test
	@DisplayName("Record 2225: ZIP is 48005")
	void ZIPOfRecord2225() {
		assertEquals("48005", customers.get(2224).getZIP());
	}

	@Test
	@DisplayName("Record 2225: Phone is 586-784-9838")
	void PhoneOfRecord2225() {
		assertEquals("586-784-9838", customers.get(2224).getPhone());
	}

	@Test
	@DisplayName("Record 2225: Fax is 586-784-7889")
	void FaxOfRecord2225() {
		assertEquals("586-784-7889", customers.get(2224).getFax());
	}

	@Test
	@DisplayName("Record 2225: Email is pedro@gulbraa.com")
	void EmailOfRecord2225() {
		assertEquals("pedro@gulbraa.com", customers.get(2224).getEmail());
	}

	@Test
	@DisplayName("Record 2225: Web is http://www.pedrogulbraa.com")
	void WebOfRecord2225() {
		assertEquals("http://www.pedrogulbraa.com", customers.get(2224).getWeb());
	}
}
