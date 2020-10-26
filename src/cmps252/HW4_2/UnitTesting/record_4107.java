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
class Record_4107 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4107: FirstName is Bryce")
	void FirstNameOfRecord4107() {
		assertEquals("Bryce", customers.get(4106).getFirstName());
	}

	@Test
	@DisplayName("Record 4107: LastName is Goldey")
	void LastNameOfRecord4107() {
		assertEquals("Goldey", customers.get(4106).getLastName());
	}

	@Test
	@DisplayName("Record 4107: Company is Anderson, James C Esq")
	void CompanyOfRecord4107() {
		assertEquals("Anderson, James C Esq", customers.get(4106).getCompany());
	}

	@Test
	@DisplayName("Record 4107: Address is 94 Railroad Ave")
	void AddressOfRecord4107() {
		assertEquals("94 Railroad Ave", customers.get(4106).getAddress());
	}

	@Test
	@DisplayName("Record 4107: City is Belford")
	void CityOfRecord4107() {
		assertEquals("Belford", customers.get(4106).getCity());
	}

	@Test
	@DisplayName("Record 4107: County is Monmouth")
	void CountyOfRecord4107() {
		assertEquals("Monmouth", customers.get(4106).getCounty());
	}

	@Test
	@DisplayName("Record 4107: State is NJ")
	void StateOfRecord4107() {
		assertEquals("NJ", customers.get(4106).getState());
	}

	@Test
	@DisplayName("Record 4107: ZIP is 7718")
	void ZIPOfRecord4107() {
		assertEquals("7718", customers.get(4106).getZIP());
	}

	@Test
	@DisplayName("Record 4107: Phone is 732-495-4708")
	void PhoneOfRecord4107() {
		assertEquals("732-495-4708", customers.get(4106).getPhone());
	}

	@Test
	@DisplayName("Record 4107: Fax is 732-495-3713")
	void FaxOfRecord4107() {
		assertEquals("732-495-3713", customers.get(4106).getFax());
	}

	@Test
	@DisplayName("Record 4107: Email is bryce@goldey.com")
	void EmailOfRecord4107() {
		assertEquals("bryce@goldey.com", customers.get(4106).getEmail());
	}

	@Test
	@DisplayName("Record 4107: Web is http://www.brycegoldey.com")
	void WebOfRecord4107() {
		assertEquals("http://www.brycegoldey.com", customers.get(4106).getWeb());
	}
}
