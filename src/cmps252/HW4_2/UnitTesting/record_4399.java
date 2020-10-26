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

@Tag("14")
class Record_4399 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4399: FirstName is Greg")
	void FirstNameOfRecord4399() {
		assertEquals("Greg", customers.get(4398).getFirstName());
	}

	@Test
	@DisplayName("Record 4399: LastName is Pearman")
	void LastNameOfRecord4399() {
		assertEquals("Pearman", customers.get(4398).getLastName());
	}

	@Test
	@DisplayName("Record 4399: Company is Todd Annell Communications")
	void CompanyOfRecord4399() {
		assertEquals("Todd Annell Communications", customers.get(4398).getCompany());
	}

	@Test
	@DisplayName("Record 4399: Address is 2650 S Grand Ave")
	void AddressOfRecord4399() {
		assertEquals("2650 S Grand Ave", customers.get(4398).getAddress());
	}

	@Test
	@DisplayName("Record 4399: City is Santa Ana")
	void CityOfRecord4399() {
		assertEquals("Santa Ana", customers.get(4398).getCity());
	}

	@Test
	@DisplayName("Record 4399: County is Orange")
	void CountyOfRecord4399() {
		assertEquals("Orange", customers.get(4398).getCounty());
	}

	@Test
	@DisplayName("Record 4399: State is CA")
	void StateOfRecord4399() {
		assertEquals("CA", customers.get(4398).getState());
	}

	@Test
	@DisplayName("Record 4399: ZIP is 92705")
	void ZIPOfRecord4399() {
		assertEquals("92705", customers.get(4398).getZIP());
	}

	@Test
	@DisplayName("Record 4399: Phone is 714-662-7913")
	void PhoneOfRecord4399() {
		assertEquals("714-662-7913", customers.get(4398).getPhone());
	}

	@Test
	@DisplayName("Record 4399: Fax is 714-662-7076")
	void FaxOfRecord4399() {
		assertEquals("714-662-7076", customers.get(4398).getFax());
	}

	@Test
	@DisplayName("Record 4399: Email is Greg@pearman.com")
	void EmailOfRecord4399() {
		assertEquals("Greg@pearman.com", customers.get(4398).getEmail());
	}

	@Test
	@DisplayName("Record 4399: Web is http://www.Gregpearman.com")
	void WebOfRecord4399() {
		assertEquals("http://www.Gregpearman.com", customers.get(4398).getWeb());
	}
}
