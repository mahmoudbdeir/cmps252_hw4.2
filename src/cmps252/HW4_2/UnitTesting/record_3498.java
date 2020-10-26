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

@Tag("40")
class Record_3498 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3498: FirstName is Karrie")
	void FirstNameOfRecord3498() {
		assertEquals("Karrie", customers.get(3497).getFirstName());
	}

	@Test
	@DisplayName("Record 3498: LastName is Gompf")
	void LastNameOfRecord3498() {
		assertEquals("Gompf", customers.get(3497).getLastName());
	}

	@Test
	@DisplayName("Record 3498: Company is Nelson Wheel Co Inc")
	void CompanyOfRecord3498() {
		assertEquals("Nelson Wheel Co Inc", customers.get(3497).getCompany());
	}

	@Test
	@DisplayName("Record 3498: Address is 488 Madison Ave")
	void AddressOfRecord3498() {
		assertEquals("488 Madison Ave", customers.get(3497).getAddress());
	}

	@Test
	@DisplayName("Record 3498: City is New York")
	void CityOfRecord3498() {
		assertEquals("New York", customers.get(3497).getCity());
	}

	@Test
	@DisplayName("Record 3498: County is New York")
	void CountyOfRecord3498() {
		assertEquals("New York", customers.get(3497).getCounty());
	}

	@Test
	@DisplayName("Record 3498: State is NY")
	void StateOfRecord3498() {
		assertEquals("NY", customers.get(3497).getState());
	}

	@Test
	@DisplayName("Record 3498: ZIP is 10022")
	void ZIPOfRecord3498() {
		assertEquals("10022", customers.get(3497).getZIP());
	}

	@Test
	@DisplayName("Record 3498: Phone is 212-644-9881")
	void PhoneOfRecord3498() {
		assertEquals("212-644-9881", customers.get(3497).getPhone());
	}

	@Test
	@DisplayName("Record 3498: Fax is 212-644-1578")
	void FaxOfRecord3498() {
		assertEquals("212-644-1578", customers.get(3497).getFax());
	}

	@Test
	@DisplayName("Record 3498: Email is karrie@gompf.com")
	void EmailOfRecord3498() {
		assertEquals("karrie@gompf.com", customers.get(3497).getEmail());
	}

	@Test
	@DisplayName("Record 3498: Web is http://www.karriegompf.com")
	void WebOfRecord3498() {
		assertEquals("http://www.karriegompf.com", customers.get(3497).getWeb());
	}
}
