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

@Tag("36")
class Record_3035 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3035: FirstName is Michelle")
	void FirstNameOfRecord3035() {
		assertEquals("Michelle", customers.get(3034).getFirstName());
	}

	@Test
	@DisplayName("Record 3035: LastName is Dace")
	void LastNameOfRecord3035() {
		assertEquals("Dace", customers.get(3034).getLastName());
	}

	@Test
	@DisplayName("Record 3035: Company is Monroeville Municipality Of")
	void CompanyOfRecord3035() {
		assertEquals("Monroeville Municipality Of", customers.get(3034).getCompany());
	}

	@Test
	@DisplayName("Record 3035: Address is 2011 8th St")
	void AddressOfRecord3035() {
		assertEquals("2011 8th St", customers.get(3034).getAddress());
	}

	@Test
	@DisplayName("Record 3035: City is Harvey")
	void CityOfRecord3035() {
		assertEquals("Harvey", customers.get(3034).getCity());
	}

	@Test
	@DisplayName("Record 3035: County is Jefferson")
	void CountyOfRecord3035() {
		assertEquals("Jefferson", customers.get(3034).getCounty());
	}

	@Test
	@DisplayName("Record 3035: State is LA")
	void StateOfRecord3035() {
		assertEquals("LA", customers.get(3034).getState());
	}

	@Test
	@DisplayName("Record 3035: ZIP is 70058")
	void ZIPOfRecord3035() {
		assertEquals("70058", customers.get(3034).getZIP());
	}

	@Test
	@DisplayName("Record 3035: Phone is 504-361-6827")
	void PhoneOfRecord3035() {
		assertEquals("504-361-6827", customers.get(3034).getPhone());
	}

	@Test
	@DisplayName("Record 3035: Fax is 504-361-3928")
	void FaxOfRecord3035() {
		assertEquals("504-361-3928", customers.get(3034).getFax());
	}

	@Test
	@DisplayName("Record 3035: Email is michelle@dace.com")
	void EmailOfRecord3035() {
		assertEquals("michelle@dace.com", customers.get(3034).getEmail());
	}

	@Test
	@DisplayName("Record 3035: Web is http://www.michelledace.com")
	void WebOfRecord3035() {
		assertEquals("http://www.michelledace.com", customers.get(3034).getWeb());
	}
}
