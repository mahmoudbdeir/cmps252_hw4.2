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

@Tag("1")
class Record_4709 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4709: FirstName is Maryann")
	void FirstNameOfRecord4709() {
		assertEquals("Maryann", customers.get(4708).getFirstName());
	}

	@Test
	@DisplayName("Record 4709: LastName is Hogenson")
	void LastNameOfRecord4709() {
		assertEquals("Hogenson", customers.get(4708).getLastName());
	}

	@Test
	@DisplayName("Record 4709: Company is Snow Country")
	void CompanyOfRecord4709() {
		assertEquals("Snow Country", customers.get(4708).getCompany());
	}

	@Test
	@DisplayName("Record 4709: Address is 300 E 57th Ave  #-b")
	void AddressOfRecord4709() {
		assertEquals("300 E 57th Ave  #-b", customers.get(4708).getAddress());
	}

	@Test
	@DisplayName("Record 4709: City is Denver")
	void CityOfRecord4709() {
		assertEquals("Denver", customers.get(4708).getCity());
	}

	@Test
	@DisplayName("Record 4709: County is Denver")
	void CountyOfRecord4709() {
		assertEquals("Denver", customers.get(4708).getCounty());
	}

	@Test
	@DisplayName("Record 4709: State is CO")
	void StateOfRecord4709() {
		assertEquals("CO", customers.get(4708).getState());
	}

	@Test
	@DisplayName("Record 4709: ZIP is 80216")
	void ZIPOfRecord4709() {
		assertEquals("80216", customers.get(4708).getZIP());
	}

	@Test
	@DisplayName("Record 4709: Phone is 303-296-6200")
	void PhoneOfRecord4709() {
		assertEquals("303-296-6200", customers.get(4708).getPhone());
	}

	@Test
	@DisplayName("Record 4709: Fax is 303-296-8945")
	void FaxOfRecord4709() {
		assertEquals("303-296-8945", customers.get(4708).getFax());
	}

	@Test
	@DisplayName("Record 4709: Email is maryann@hogenson.com")
	void EmailOfRecord4709() {
		assertEquals("maryann@hogenson.com", customers.get(4708).getEmail());
	}

	@Test
	@DisplayName("Record 4709: Web is http://www.maryannhogenson.com")
	void WebOfRecord4709() {
		assertEquals("http://www.maryannhogenson.com", customers.get(4708).getWeb());
	}
}
