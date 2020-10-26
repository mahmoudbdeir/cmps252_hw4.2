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

@Tag("32")
class Record_577 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 577: FirstName is Noelle")
	void FirstNameOfRecord577() {
		assertEquals("Noelle", customers.get(576).getFirstName());
	}

	@Test
	@DisplayName("Record 577: LastName is Harell")
	void LastNameOfRecord577() {
		assertEquals("Harell", customers.get(576).getLastName());
	}

	@Test
	@DisplayName("Record 577: Company is Super 8 Motel")
	void CompanyOfRecord577() {
		assertEquals("Super 8 Motel", customers.get(576).getCompany());
	}

	@Test
	@DisplayName("Record 577: Address is 153 Main St")
	void AddressOfRecord577() {
		assertEquals("153 Main St", customers.get(576).getAddress());
	}

	@Test
	@DisplayName("Record 577: City is Stamford")
	void CityOfRecord577() {
		assertEquals("Stamford", customers.get(576).getCity());
	}

	@Test
	@DisplayName("Record 577: County is Fairfield")
	void CountyOfRecord577() {
		assertEquals("Fairfield", customers.get(576).getCounty());
	}

	@Test
	@DisplayName("Record 577: State is CT")
	void StateOfRecord577() {
		assertEquals("CT", customers.get(576).getState());
	}

	@Test
	@DisplayName("Record 577: ZIP is 6901")
	void ZIPOfRecord577() {
		assertEquals("6901", customers.get(576).getZIP());
	}

	@Test
	@DisplayName("Record 577: Phone is 203-327-0702")
	void PhoneOfRecord577() {
		assertEquals("203-327-0702", customers.get(576).getPhone());
	}

	@Test
	@DisplayName("Record 577: Fax is 203-327-7309")
	void FaxOfRecord577() {
		assertEquals("203-327-7309", customers.get(576).getFax());
	}

	@Test
	@DisplayName("Record 577: Email is noelle@harell.com")
	void EmailOfRecord577() {
		assertEquals("noelle@harell.com", customers.get(576).getEmail());
	}

	@Test
	@DisplayName("Record 577: Web is http://www.noelleharell.com")
	void WebOfRecord577() {
		assertEquals("http://www.noelleharell.com", customers.get(576).getWeb());
	}
}
