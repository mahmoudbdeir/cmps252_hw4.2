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

@Tag("15")
class Record_3096 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3096: FirstName is Roman")
	void FirstNameOfRecord3096() {
		assertEquals("Roman", customers.get(3095).getFirstName());
	}

	@Test
	@DisplayName("Record 3096: LastName is Chevres")
	void LastNameOfRecord3096() {
		assertEquals("Chevres", customers.get(3095).getLastName());
	}

	@Test
	@DisplayName("Record 3096: Company is Quaker Chemical Co Inc")
	void CompanyOfRecord3096() {
		assertEquals("Quaker Chemical Co Inc", customers.get(3095).getCompany());
	}

	@Test
	@DisplayName("Record 3096: Address is 127 Ark Rd")
	void AddressOfRecord3096() {
		assertEquals("127 Ark Rd", customers.get(3095).getAddress());
	}

	@Test
	@DisplayName("Record 3096: City is Mount Laurel")
	void CityOfRecord3096() {
		assertEquals("Mount Laurel", customers.get(3095).getCity());
	}

	@Test
	@DisplayName("Record 3096: County is Burlington")
	void CountyOfRecord3096() {
		assertEquals("Burlington", customers.get(3095).getCounty());
	}

	@Test
	@DisplayName("Record 3096: State is NJ")
	void StateOfRecord3096() {
		assertEquals("NJ", customers.get(3095).getState());
	}

	@Test
	@DisplayName("Record 3096: ZIP is 8054")
	void ZIPOfRecord3096() {
		assertEquals("8054", customers.get(3095).getZIP());
	}

	@Test
	@DisplayName("Record 3096: Phone is 856-778-3788")
	void PhoneOfRecord3096() {
		assertEquals("856-778-3788", customers.get(3095).getPhone());
	}

	@Test
	@DisplayName("Record 3096: Fax is 856-778-1808")
	void FaxOfRecord3096() {
		assertEquals("856-778-1808", customers.get(3095).getFax());
	}

	@Test
	@DisplayName("Record 3096: Email is roman@chevres.com")
	void EmailOfRecord3096() {
		assertEquals("roman@chevres.com", customers.get(3095).getEmail());
	}

	@Test
	@DisplayName("Record 3096: Web is http://www.romanchevres.com")
	void WebOfRecord3096() {
		assertEquals("http://www.romanchevres.com", customers.get(3095).getWeb());
	}
}
