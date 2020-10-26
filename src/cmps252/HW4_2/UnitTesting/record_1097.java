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

@Tag("41")
class Record_1097 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1097: FirstName is Lisa")
	void FirstNameOfRecord1097() {
		assertEquals("Lisa", customers.get(1096).getFirstName());
	}

	@Test
	@DisplayName("Record 1097: LastName is Glasier")
	void LastNameOfRecord1097() {
		assertEquals("Glasier", customers.get(1096).getLastName());
	}

	@Test
	@DisplayName("Record 1097: Company is H C Colvard Jr Atty Ofc")
	void CompanyOfRecord1097() {
		assertEquals("H C Colvard Jr Atty Ofc", customers.get(1096).getCompany());
	}

	@Test
	@DisplayName("Record 1097: Address is 5453 24th St")
	void AddressOfRecord1097() {
		assertEquals("5453 24th St", customers.get(1096).getAddress());
	}

	@Test
	@DisplayName("Record 1097: City is Riverside")
	void CityOfRecord1097() {
		assertEquals("Riverside", customers.get(1096).getCity());
	}

	@Test
	@DisplayName("Record 1097: County is Riverside")
	void CountyOfRecord1097() {
		assertEquals("Riverside", customers.get(1096).getCounty());
	}

	@Test
	@DisplayName("Record 1097: State is CA")
	void StateOfRecord1097() {
		assertEquals("CA", customers.get(1096).getState());
	}

	@Test
	@DisplayName("Record 1097: ZIP is 92509")
	void ZIPOfRecord1097() {
		assertEquals("92509", customers.get(1096).getZIP());
	}

	@Test
	@DisplayName("Record 1097: Phone is 951-784-2540")
	void PhoneOfRecord1097() {
		assertEquals("951-784-2540", customers.get(1096).getPhone());
	}

	@Test
	@DisplayName("Record 1097: Fax is 951-784-2817")
	void FaxOfRecord1097() {
		assertEquals("951-784-2817", customers.get(1096).getFax());
	}

	@Test
	@DisplayName("Record 1097: Email is lisa@glasier.com")
	void EmailOfRecord1097() {
		assertEquals("lisa@glasier.com", customers.get(1096).getEmail());
	}

	@Test
	@DisplayName("Record 1097: Web is http://www.lisaglasier.com")
	void WebOfRecord1097() {
		assertEquals("http://www.lisaglasier.com", customers.get(1096).getWeb());
	}
}
