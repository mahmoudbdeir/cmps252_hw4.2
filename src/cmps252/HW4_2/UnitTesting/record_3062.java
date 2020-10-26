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

@Tag("37")
class Record_3062 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3062: FirstName is Cody")
	void FirstNameOfRecord3062() {
		assertEquals("Cody", customers.get(3061).getFirstName());
	}

	@Test
	@DisplayName("Record 3062: LastName is Schilmoeller")
	void LastNameOfRecord3062() {
		assertEquals("Schilmoeller", customers.get(3061).getLastName());
	}

	@Test
	@DisplayName("Record 3062: Company is Pugliese Enterprises")
	void CompanyOfRecord3062() {
		assertEquals("Pugliese Enterprises", customers.get(3061).getCompany());
	}

	@Test
	@DisplayName("Record 3062: Address is 701 E Burnside St  #-c")
	void AddressOfRecord3062() {
		assertEquals("701 E Burnside St  #-c", customers.get(3061).getAddress());
	}

	@Test
	@DisplayName("Record 3062: City is Portland")
	void CityOfRecord3062() {
		assertEquals("Portland", customers.get(3061).getCity());
	}

	@Test
	@DisplayName("Record 3062: County is Multnomah")
	void CountyOfRecord3062() {
		assertEquals("Multnomah", customers.get(3061).getCounty());
	}

	@Test
	@DisplayName("Record 3062: State is OR")
	void StateOfRecord3062() {
		assertEquals("OR", customers.get(3061).getState());
	}

	@Test
	@DisplayName("Record 3062: ZIP is 97214")
	void ZIPOfRecord3062() {
		assertEquals("97214", customers.get(3061).getZIP());
	}

	@Test
	@DisplayName("Record 3062: Phone is 503-230-0052")
	void PhoneOfRecord3062() {
		assertEquals("503-230-0052", customers.get(3061).getPhone());
	}

	@Test
	@DisplayName("Record 3062: Fax is 503-230-8191")
	void FaxOfRecord3062() {
		assertEquals("503-230-8191", customers.get(3061).getFax());
	}

	@Test
	@DisplayName("Record 3062: Email is cody@schilmoeller.com")
	void EmailOfRecord3062() {
		assertEquals("cody@schilmoeller.com", customers.get(3061).getEmail());
	}

	@Test
	@DisplayName("Record 3062: Web is http://www.codyschilmoeller.com")
	void WebOfRecord3062() {
		assertEquals("http://www.codyschilmoeller.com", customers.get(3061).getWeb());
	}
}
