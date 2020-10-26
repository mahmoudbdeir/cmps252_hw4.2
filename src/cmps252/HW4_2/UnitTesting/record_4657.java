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
class Record_4657 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4657: FirstName is Bryan")
	void FirstNameOfRecord4657() {
		assertEquals("Bryan", customers.get(4656).getFirstName());
	}

	@Test
	@DisplayName("Record 4657: LastName is Steurer")
	void LastNameOfRecord4657() {
		assertEquals("Steurer", customers.get(4656).getLastName());
	}

	@Test
	@DisplayName("Record 4657: Company is Novato Office Supply")
	void CompanyOfRecord4657() {
		assertEquals("Novato Office Supply", customers.get(4656).getCompany());
	}

	@Test
	@DisplayName("Record 4657: Address is 1222 S Gilbert Ct")
	void AddressOfRecord4657() {
		assertEquals("1222 S Gilbert Ct", customers.get(4656).getAddress());
	}

	@Test
	@DisplayName("Record 4657: City is Iowa City")
	void CityOfRecord4657() {
		assertEquals("Iowa City", customers.get(4656).getCity());
	}

	@Test
	@DisplayName("Record 4657: County is Johnson")
	void CountyOfRecord4657() {
		assertEquals("Johnson", customers.get(4656).getCounty());
	}

	@Test
	@DisplayName("Record 4657: State is IA")
	void StateOfRecord4657() {
		assertEquals("IA", customers.get(4656).getState());
	}

	@Test
	@DisplayName("Record 4657: ZIP is 52240")
	void ZIPOfRecord4657() {
		assertEquals("52240", customers.get(4656).getZIP());
	}

	@Test
	@DisplayName("Record 4657: Phone is 319-351-3985")
	void PhoneOfRecord4657() {
		assertEquals("319-351-3985", customers.get(4656).getPhone());
	}

	@Test
	@DisplayName("Record 4657: Fax is 319-351-7943")
	void FaxOfRecord4657() {
		assertEquals("319-351-7943", customers.get(4656).getFax());
	}

	@Test
	@DisplayName("Record 4657: Email is bryan@steurer.com")
	void EmailOfRecord4657() {
		assertEquals("bryan@steurer.com", customers.get(4656).getEmail());
	}

	@Test
	@DisplayName("Record 4657: Web is http://www.bryansteurer.com")
	void WebOfRecord4657() {
		assertEquals("http://www.bryansteurer.com", customers.get(4656).getWeb());
	}
}
