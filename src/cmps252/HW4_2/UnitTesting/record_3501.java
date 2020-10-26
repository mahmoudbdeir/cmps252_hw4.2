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

@Tag("48")
class Record_3501 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3501: FirstName is Polly")
	void FirstNameOfRecord3501() {
		assertEquals("Polly", customers.get(3500).getFirstName());
	}

	@Test
	@DisplayName("Record 3501: LastName is Ezzo")
	void LastNameOfRecord3501() {
		assertEquals("Ezzo", customers.get(3500).getLastName());
	}

	@Test
	@DisplayName("Record 3501: Company is Prudential Securities Inc")
	void CompanyOfRecord3501() {
		assertEquals("Prudential Securities Inc", customers.get(3500).getCompany());
	}

	@Test
	@DisplayName("Record 3501: Address is Fontana Blvd")
	void AddressOfRecord3501() {
		assertEquals("Fontana Blvd", customers.get(3500).getAddress());
	}

	@Test
	@DisplayName("Record 3501: City is Fontana")
	void CityOfRecord3501() {
		assertEquals("Fontana", customers.get(3500).getCity());
	}

	@Test
	@DisplayName("Record 3501: County is Walworth")
	void CountyOfRecord3501() {
		assertEquals("Walworth", customers.get(3500).getCounty());
	}

	@Test
	@DisplayName("Record 3501: State is WI")
	void StateOfRecord3501() {
		assertEquals("WI", customers.get(3500).getState());
	}

	@Test
	@DisplayName("Record 3501: ZIP is 53125")
	void ZIPOfRecord3501() {
		assertEquals("53125", customers.get(3500).getZIP());
	}

	@Test
	@DisplayName("Record 3501: Phone is 262-275-0027")
	void PhoneOfRecord3501() {
		assertEquals("262-275-0027", customers.get(3500).getPhone());
	}

	@Test
	@DisplayName("Record 3501: Fax is 262-275-7307")
	void FaxOfRecord3501() {
		assertEquals("262-275-7307", customers.get(3500).getFax());
	}

	@Test
	@DisplayName("Record 3501: Email is polly@ezzo.com")
	void EmailOfRecord3501() {
		assertEquals("polly@ezzo.com", customers.get(3500).getEmail());
	}

	@Test
	@DisplayName("Record 3501: Web is http://www.pollyezzo.com")
	void WebOfRecord3501() {
		assertEquals("http://www.pollyezzo.com", customers.get(3500).getWeb());
	}
}
