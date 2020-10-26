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

@Tag("7")
class Record_3402 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3402: FirstName is Jodie")
	void FirstNameOfRecord3402() {
		assertEquals("Jodie", customers.get(3401).getFirstName());
	}

	@Test
	@DisplayName("Record 3402: LastName is Jagoda")
	void LastNameOfRecord3402() {
		assertEquals("Jagoda", customers.get(3401).getLastName());
	}

	@Test
	@DisplayName("Record 3402: Company is A P I Pipe & Supply")
	void CompanyOfRecord3402() {
		assertEquals("A P I Pipe & Supply", customers.get(3401).getCompany());
	}

	@Test
	@DisplayName("Record 3402: Address is 724 Baring Blvd")
	void AddressOfRecord3402() {
		assertEquals("724 Baring Blvd", customers.get(3401).getAddress());
	}

	@Test
	@DisplayName("Record 3402: City is Sparks")
	void CityOfRecord3402() {
		assertEquals("Sparks", customers.get(3401).getCity());
	}

	@Test
	@DisplayName("Record 3402: County is Washoe")
	void CountyOfRecord3402() {
		assertEquals("Washoe", customers.get(3401).getCounty());
	}

	@Test
	@DisplayName("Record 3402: State is NV")
	void StateOfRecord3402() {
		assertEquals("NV", customers.get(3401).getState());
	}

	@Test
	@DisplayName("Record 3402: ZIP is 89434")
	void ZIPOfRecord3402() {
		assertEquals("89434", customers.get(3401).getZIP());
	}

	@Test
	@DisplayName("Record 3402: Phone is 775-358-0071")
	void PhoneOfRecord3402() {
		assertEquals("775-358-0071", customers.get(3401).getPhone());
	}

	@Test
	@DisplayName("Record 3402: Fax is 775-358-8112")
	void FaxOfRecord3402() {
		assertEquals("775-358-8112", customers.get(3401).getFax());
	}

	@Test
	@DisplayName("Record 3402: Email is jodie@jagoda.com")
	void EmailOfRecord3402() {
		assertEquals("jodie@jagoda.com", customers.get(3401).getEmail());
	}

	@Test
	@DisplayName("Record 3402: Web is http://www.jodiejagoda.com")
	void WebOfRecord3402() {
		assertEquals("http://www.jodiejagoda.com", customers.get(3401).getWeb());
	}
}
