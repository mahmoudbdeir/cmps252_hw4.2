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

@Tag("28")
class Record_832 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 832: FirstName is Bernice")
	void FirstNameOfRecord832() {
		assertEquals("Bernice", customers.get(831).getFirstName());
	}

	@Test
	@DisplayName("Record 832: LastName is Kippes")
	void LastNameOfRecord832() {
		assertEquals("Kippes", customers.get(831).getLastName());
	}

	@Test
	@DisplayName("Record 832: Company is Entek Scientfc Corp")
	void CompanyOfRecord832() {
		assertEquals("Entek Scientfc Corp", customers.get(831).getCompany());
	}

	@Test
	@DisplayName("Record 832: Address is 5730 College St")
	void AddressOfRecord832() {
		assertEquals("5730 College St", customers.get(831).getAddress());
	}

	@Test
	@DisplayName("Record 832: City is Beaumont")
	void CityOfRecord832() {
		assertEquals("Beaumont", customers.get(831).getCity());
	}

	@Test
	@DisplayName("Record 832: County is Jefferson")
	void CountyOfRecord832() {
		assertEquals("Jefferson", customers.get(831).getCounty());
	}

	@Test
	@DisplayName("Record 832: State is TX")
	void StateOfRecord832() {
		assertEquals("TX", customers.get(831).getState());
	}

	@Test
	@DisplayName("Record 832: ZIP is 77707")
	void ZIPOfRecord832() {
		assertEquals("77707", customers.get(831).getZIP());
	}

	@Test
	@DisplayName("Record 832: Phone is 409-866-8988")
	void PhoneOfRecord832() {
		assertEquals("409-866-8988", customers.get(831).getPhone());
	}

	@Test
	@DisplayName("Record 832: Fax is 409-866-4064")
	void FaxOfRecord832() {
		assertEquals("409-866-4064", customers.get(831).getFax());
	}

	@Test
	@DisplayName("Record 832: Email is bernice@kippes.com")
	void EmailOfRecord832() {
		assertEquals("bernice@kippes.com", customers.get(831).getEmail());
	}

	@Test
	@DisplayName("Record 832: Web is http://www.bernicekippes.com")
	void WebOfRecord832() {
		assertEquals("http://www.bernicekippes.com", customers.get(831).getWeb());
	}
}
