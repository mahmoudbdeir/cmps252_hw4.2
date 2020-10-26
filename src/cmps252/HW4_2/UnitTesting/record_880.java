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

@Tag("34")
class Record_880 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 880: FirstName is Clinton")
	void FirstNameOfRecord880() {
		assertEquals("Clinton", customers.get(879).getFirstName());
	}

	@Test
	@DisplayName("Record 880: LastName is Bergh")
	void LastNameOfRecord880() {
		assertEquals("Bergh", customers.get(879).getLastName());
	}

	@Test
	@DisplayName("Record 880: Company is Bradach Law Offices")
	void CompanyOfRecord880() {
		assertEquals("Bradach Law Offices", customers.get(879).getCompany());
	}

	@Test
	@DisplayName("Record 880: Address is 617 Butler St")
	void AddressOfRecord880() {
		assertEquals("617 Butler St", customers.get(879).getAddress());
	}

	@Test
	@DisplayName("Record 880: City is Pittsburgh")
	void CityOfRecord880() {
		assertEquals("Pittsburgh", customers.get(879).getCity());
	}

	@Test
	@DisplayName("Record 880: County is Allegheny")
	void CountyOfRecord880() {
		assertEquals("Allegheny", customers.get(879).getCounty());
	}

	@Test
	@DisplayName("Record 880: State is PA")
	void StateOfRecord880() {
		assertEquals("PA", customers.get(879).getState());
	}

	@Test
	@DisplayName("Record 880: ZIP is 15223")
	void ZIPOfRecord880() {
		assertEquals("15223", customers.get(879).getZIP());
	}

	@Test
	@DisplayName("Record 880: Phone is 412-781-3294")
	void PhoneOfRecord880() {
		assertEquals("412-781-3294", customers.get(879).getPhone());
	}

	@Test
	@DisplayName("Record 880: Fax is 412-781-7223")
	void FaxOfRecord880() {
		assertEquals("412-781-7223", customers.get(879).getFax());
	}

	@Test
	@DisplayName("Record 880: Email is clinton@bergh.com")
	void EmailOfRecord880() {
		assertEquals("clinton@bergh.com", customers.get(879).getEmail());
	}

	@Test
	@DisplayName("Record 880: Web is http://www.clintonbergh.com")
	void WebOfRecord880() {
		assertEquals("http://www.clintonbergh.com", customers.get(879).getWeb());
	}
}
