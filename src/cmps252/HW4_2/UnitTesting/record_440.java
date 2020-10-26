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

@Tag("10")
class Record_440 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 440: FirstName is Pilar")
	void FirstNameOfRecord440() {
		assertEquals("Pilar", customers.get(439).getFirstName());
	}

	@Test
	@DisplayName("Record 440: LastName is Gotsche")
	void LastNameOfRecord440() {
		assertEquals("Gotsche", customers.get(439).getLastName());
	}

	@Test
	@DisplayName("Record 440: Company is Haverhill Contracting Co Inc")
	void CompanyOfRecord440() {
		assertEquals("Haverhill Contracting Co Inc", customers.get(439).getCompany());
	}

	@Test
	@DisplayName("Record 440: Address is 15 U P S Dr")
	void AddressOfRecord440() {
		assertEquals("15 U P S Dr", customers.get(439).getAddress());
	}

	@Test
	@DisplayName("Record 440: City is Secaucus")
	void CityOfRecord440() {
		assertEquals("Secaucus", customers.get(439).getCity());
	}

	@Test
	@DisplayName("Record 440: County is Hudson")
	void CountyOfRecord440() {
		assertEquals("Hudson", customers.get(439).getCounty());
	}

	@Test
	@DisplayName("Record 440: State is NJ")
	void StateOfRecord440() {
		assertEquals("NJ", customers.get(439).getState());
	}

	@Test
	@DisplayName("Record 440: ZIP is 7094")
	void ZIPOfRecord440() {
		assertEquals("7094", customers.get(439).getZIP());
	}

	@Test
	@DisplayName("Record 440: Phone is 201-865-5899")
	void PhoneOfRecord440() {
		assertEquals("201-865-5899", customers.get(439).getPhone());
	}

	@Test
	@DisplayName("Record 440: Fax is 201-865-7461")
	void FaxOfRecord440() {
		assertEquals("201-865-7461", customers.get(439).getFax());
	}

	@Test
	@DisplayName("Record 440: Email is pilar@gotsche.com")
	void EmailOfRecord440() {
		assertEquals("pilar@gotsche.com", customers.get(439).getEmail());
	}

	@Test
	@DisplayName("Record 440: Web is http://www.pilargotsche.com")
	void WebOfRecord440() {
		assertEquals("http://www.pilargotsche.com", customers.get(439).getWeb());
	}
}
