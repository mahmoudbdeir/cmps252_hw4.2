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
class Record_1183 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1183: FirstName is Fabian")
	void FirstNameOfRecord1183() {
		assertEquals("Fabian", customers.get(1182).getFirstName());
	}

	@Test
	@DisplayName("Record 1183: LastName is Pausch")
	void LastNameOfRecord1183() {
		assertEquals("Pausch", customers.get(1182).getLastName());
	}

	@Test
	@DisplayName("Record 1183: Company is Boise Area Chamber Of Commerce")
	void CompanyOfRecord1183() {
		assertEquals("Boise Area Chamber Of Commerce", customers.get(1182).getCompany());
	}

	@Test
	@DisplayName("Record 1183: Address is 140 Newman Springs Rd E")
	void AddressOfRecord1183() {
		assertEquals("140 Newman Springs Rd E", customers.get(1182).getAddress());
	}

	@Test
	@DisplayName("Record 1183: City is Red Bank")
	void CityOfRecord1183() {
		assertEquals("Red Bank", customers.get(1182).getCity());
	}

	@Test
	@DisplayName("Record 1183: County is Monmouth")
	void CountyOfRecord1183() {
		assertEquals("Monmouth", customers.get(1182).getCounty());
	}

	@Test
	@DisplayName("Record 1183: State is NJ")
	void StateOfRecord1183() {
		assertEquals("NJ", customers.get(1182).getState());
	}

	@Test
	@DisplayName("Record 1183: ZIP is 7701")
	void ZIPOfRecord1183() {
		assertEquals("7701", customers.get(1182).getZIP());
	}

	@Test
	@DisplayName("Record 1183: Phone is 732-571-5339")
	void PhoneOfRecord1183() {
		assertEquals("732-571-5339", customers.get(1182).getPhone());
	}

	@Test
	@DisplayName("Record 1183: Fax is 732-571-3156")
	void FaxOfRecord1183() {
		assertEquals("732-571-3156", customers.get(1182).getFax());
	}

	@Test
	@DisplayName("Record 1183: Email is fabian@pausch.com")
	void EmailOfRecord1183() {
		assertEquals("fabian@pausch.com", customers.get(1182).getEmail());
	}

	@Test
	@DisplayName("Record 1183: Web is http://www.fabianpausch.com")
	void WebOfRecord1183() {
		assertEquals("http://www.fabianpausch.com", customers.get(1182).getWeb());
	}
}
