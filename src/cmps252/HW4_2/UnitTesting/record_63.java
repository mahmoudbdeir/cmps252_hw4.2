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

@Tag("35")
class Record_63 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 63: FirstName is Antione")
	void FirstNameOfRecord63() {
		assertEquals("Antione", customers.get(62).getFirstName());
	}

	@Test
	@DisplayName("Record 63: LastName is Hamyster")
	void LastNameOfRecord63() {
		assertEquals("Hamyster", customers.get(62).getLastName());
	}

	@Test
	@DisplayName("Record 63: Company is Hagelgans, James D Esq")
	void CompanyOfRecord63() {
		assertEquals("Hagelgans, James D Esq", customers.get(62).getCompany());
	}

	@Test
	@DisplayName("Record 63: Address is Tidland Rd")
	void AddressOfRecord63() {
		assertEquals("Tidland Rd", customers.get(62).getAddress());
	}

	@Test
	@DisplayName("Record 63: City is Oak Ridge")
	void CityOfRecord63() {
		assertEquals("Oak Ridge", customers.get(62).getCity());
	}

	@Test
	@DisplayName("Record 63: County is Passaic")
	void CountyOfRecord63() {
		assertEquals("Passaic", customers.get(62).getCounty());
	}

	@Test
	@DisplayName("Record 63: State is NJ")
	void StateOfRecord63() {
		assertEquals("NJ", customers.get(62).getState());
	}

	@Test
	@DisplayName("Record 63: ZIP is 7438")
	void ZIPOfRecord63() {
		assertEquals("7438", customers.get(62).getZIP());
	}

	@Test
	@DisplayName("Record 63: Phone is 973-208-3772")
	void PhoneOfRecord63() {
		assertEquals("973-208-3772", customers.get(62).getPhone());
	}

	@Test
	@DisplayName("Record 63: Fax is 973-208-0861")
	void FaxOfRecord63() {
		assertEquals("973-208-0861", customers.get(62).getFax());
	}

	@Test
	@DisplayName("Record 63: Email is antione@hamyster.com")
	void EmailOfRecord63() {
		assertEquals("antione@hamyster.com", customers.get(62).getEmail());
	}

	@Test
	@DisplayName("Record 63: Web is http://www.antionehamyster.com")
	void WebOfRecord63() {
		assertEquals("http://www.antionehamyster.com", customers.get(62).getWeb());
	}
}
