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

@Tag("30")
class Record_795 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 795: FirstName is Joel")
	void FirstNameOfRecord795() {
		assertEquals("Joel", customers.get(794).getFirstName());
	}

	@Test
	@DisplayName("Record 795: LastName is Mccullen")
	void LastNameOfRecord795() {
		assertEquals("Mccullen", customers.get(794).getLastName());
	}

	@Test
	@DisplayName("Record 795: Company is Ace Hardware Ok Lumber")
	void CompanyOfRecord795() {
		assertEquals("Ace Hardware Ok Lumber", customers.get(794).getCompany());
	}

	@Test
	@DisplayName("Record 795: Address is 8143 Richmond Hwy  #-205")
	void AddressOfRecord795() {
		assertEquals("8143 Richmond Hwy  #-205", customers.get(794).getAddress());
	}

	@Test
	@DisplayName("Record 795: City is Alexandria")
	void CityOfRecord795() {
		assertEquals("Alexandria", customers.get(794).getCity());
	}

	@Test
	@DisplayName("Record 795: County is Fairfax")
	void CountyOfRecord795() {
		assertEquals("Fairfax", customers.get(794).getCounty());
	}

	@Test
	@DisplayName("Record 795: State is VA")
	void StateOfRecord795() {
		assertEquals("VA", customers.get(794).getState());
	}

	@Test
	@DisplayName("Record 795: ZIP is 22309")
	void ZIPOfRecord795() {
		assertEquals("22309", customers.get(794).getZIP());
	}

	@Test
	@DisplayName("Record 795: Phone is 703-780-3292")
	void PhoneOfRecord795() {
		assertEquals("703-780-3292", customers.get(794).getPhone());
	}

	@Test
	@DisplayName("Record 795: Fax is 703-780-0669")
	void FaxOfRecord795() {
		assertEquals("703-780-0669", customers.get(794).getFax());
	}

	@Test
	@DisplayName("Record 795: Email is joel@mccullen.com")
	void EmailOfRecord795() {
		assertEquals("joel@mccullen.com", customers.get(794).getEmail());
	}

	@Test
	@DisplayName("Record 795: Web is http://www.joelmccullen.com")
	void WebOfRecord795() {
		assertEquals("http://www.joelmccullen.com", customers.get(794).getWeb());
	}
}
