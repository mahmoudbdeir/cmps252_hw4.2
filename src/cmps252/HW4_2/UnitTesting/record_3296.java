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

@Tag("46")
class Record_3296 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3296: FirstName is Tory")
	void FirstNameOfRecord3296() {
		assertEquals("Tory", customers.get(3295).getFirstName());
	}

	@Test
	@DisplayName("Record 3296: LastName is Heare")
	void LastNameOfRecord3296() {
		assertEquals("Heare", customers.get(3295).getLastName());
	}

	@Test
	@DisplayName("Record 3296: Company is John Spinelli Salvage Corp")
	void CompanyOfRecord3296() {
		assertEquals("John Spinelli Salvage Corp", customers.get(3295).getCompany());
	}

	@Test
	@DisplayName("Record 3296: Address is 455 1st Ave")
	void AddressOfRecord3296() {
		assertEquals("455 1st Ave", customers.get(3295).getAddress());
	}

	@Test
	@DisplayName("Record 3296: City is New York")
	void CityOfRecord3296() {
		assertEquals("New York", customers.get(3295).getCity());
	}

	@Test
	@DisplayName("Record 3296: County is New York")
	void CountyOfRecord3296() {
		assertEquals("New York", customers.get(3295).getCounty());
	}

	@Test
	@DisplayName("Record 3296: State is NY")
	void StateOfRecord3296() {
		assertEquals("NY", customers.get(3295).getState());
	}

	@Test
	@DisplayName("Record 3296: ZIP is 10016")
	void ZIPOfRecord3296() {
		assertEquals("10016", customers.get(3295).getZIP());
	}

	@Test
	@DisplayName("Record 3296: Phone is 212-725-6902")
	void PhoneOfRecord3296() {
		assertEquals("212-725-6902", customers.get(3295).getPhone());
	}

	@Test
	@DisplayName("Record 3296: Fax is 212-725-4032")
	void FaxOfRecord3296() {
		assertEquals("212-725-4032", customers.get(3295).getFax());
	}

	@Test
	@DisplayName("Record 3296: Email is tory@heare.com")
	void EmailOfRecord3296() {
		assertEquals("tory@heare.com", customers.get(3295).getEmail());
	}

	@Test
	@DisplayName("Record 3296: Web is http://www.toryheare.com")
	void WebOfRecord3296() {
		assertEquals("http://www.toryheare.com", customers.get(3295).getWeb());
	}
}
