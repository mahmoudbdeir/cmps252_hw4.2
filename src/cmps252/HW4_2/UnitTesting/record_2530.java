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

@Tag("21")
class Record_2530 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2530: FirstName is Eduardo")
	void FirstNameOfRecord2530() {
		assertEquals("Eduardo", customers.get(2529).getFirstName());
	}

	@Test
	@DisplayName("Record 2530: LastName is Levyllee")
	void LastNameOfRecord2530() {
		assertEquals("Levyllee", customers.get(2529).getLastName());
	}

	@Test
	@DisplayName("Record 2530: Company is Spewak, Steven B Esq")
	void CompanyOfRecord2530() {
		assertEquals("Spewak, Steven B Esq", customers.get(2529).getCompany());
	}

	@Test
	@DisplayName("Record 2530: Address is 13961 Hall Rd")
	void AddressOfRecord2530() {
		assertEquals("13961 Hall Rd", customers.get(2529).getAddress());
	}

	@Test
	@DisplayName("Record 2530: City is Utica")
	void CityOfRecord2530() {
		assertEquals("Utica", customers.get(2529).getCity());
	}

	@Test
	@DisplayName("Record 2530: County is Macomb")
	void CountyOfRecord2530() {
		assertEquals("Macomb", customers.get(2529).getCounty());
	}

	@Test
	@DisplayName("Record 2530: State is MI")
	void StateOfRecord2530() {
		assertEquals("MI", customers.get(2529).getState());
	}

	@Test
	@DisplayName("Record 2530: ZIP is 48315")
	void ZIPOfRecord2530() {
		assertEquals("48315", customers.get(2529).getZIP());
	}

	@Test
	@DisplayName("Record 2530: Phone is 586-247-6242")
	void PhoneOfRecord2530() {
		assertEquals("586-247-6242", customers.get(2529).getPhone());
	}

	@Test
	@DisplayName("Record 2530: Fax is 586-247-5071")
	void FaxOfRecord2530() {
		assertEquals("586-247-5071", customers.get(2529).getFax());
	}

	@Test
	@DisplayName("Record 2530: Email is eduardo@levyllee.com")
	void EmailOfRecord2530() {
		assertEquals("eduardo@levyllee.com", customers.get(2529).getEmail());
	}

	@Test
	@DisplayName("Record 2530: Web is http://www.eduardolevyllee.com")
	void WebOfRecord2530() {
		assertEquals("http://www.eduardolevyllee.com", customers.get(2529).getWeb());
	}
}
