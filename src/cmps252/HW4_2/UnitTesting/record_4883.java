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

@Tag("9")
class Record_4883 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4883: FirstName is Patsy")
	void FirstNameOfRecord4883() {
		assertEquals("Patsy", customers.get(4882).getFirstName());
	}

	@Test
	@DisplayName("Record 4883: LastName is Votaw")
	void LastNameOfRecord4883() {
		assertEquals("Votaw", customers.get(4882).getLastName());
	}

	@Test
	@DisplayName("Record 4883: Company is Cablesystem")
	void CompanyOfRecord4883() {
		assertEquals("Cablesystem", customers.get(4882).getCompany());
	}

	@Test
	@DisplayName("Record 4883: Address is 12755 9th Miile")
	void AddressOfRecord4883() {
		assertEquals("12755 9th Miile", customers.get(4882).getAddress());
	}

	@Test
	@DisplayName("Record 4883: City is Warren")
	void CityOfRecord4883() {
		assertEquals("Warren", customers.get(4882).getCity());
	}

	@Test
	@DisplayName("Record 4883: County is Macomb")
	void CountyOfRecord4883() {
		assertEquals("Macomb", customers.get(4882).getCounty());
	}

	@Test
	@DisplayName("Record 4883: State is MI")
	void StateOfRecord4883() {
		assertEquals("MI", customers.get(4882).getState());
	}

	@Test
	@DisplayName("Record 4883: ZIP is 48089")
	void ZIPOfRecord4883() {
		assertEquals("48089", customers.get(4882).getZIP());
	}

	@Test
	@DisplayName("Record 4883: Phone is 586-755-7448")
	void PhoneOfRecord4883() {
		assertEquals("586-755-7448", customers.get(4882).getPhone());
	}

	@Test
	@DisplayName("Record 4883: Fax is 586-755-0208")
	void FaxOfRecord4883() {
		assertEquals("586-755-0208", customers.get(4882).getFax());
	}

	@Test
	@DisplayName("Record 4883: Email is patsy@votaw.com")
	void EmailOfRecord4883() {
		assertEquals("patsy@votaw.com", customers.get(4882).getEmail());
	}

	@Test
	@DisplayName("Record 4883: Web is http://www.patsyvotaw.com")
	void WebOfRecord4883() {
		assertEquals("http://www.patsyvotaw.com", customers.get(4882).getWeb());
	}
}
