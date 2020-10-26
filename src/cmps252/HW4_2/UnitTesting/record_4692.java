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

@Tag("0")
class Record_4692 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4692: FirstName is Otha")
	void FirstNameOfRecord4692() {
		assertEquals("Otha", customers.get(4691).getFirstName());
	}

	@Test
	@DisplayName("Record 4692: LastName is Mennig")
	void LastNameOfRecord4692() {
		assertEquals("Mennig", customers.get(4691).getLastName());
	}

	@Test
	@DisplayName("Record 4692: Company is Vandivort, William Clayton Esq")
	void CompanyOfRecord4692() {
		assertEquals("Vandivort, William Clayton Esq", customers.get(4691).getCompany());
	}

	@Test
	@DisplayName("Record 4692: Address is 249 Irwin Ave")
	void AddressOfRecord4692() {
		assertEquals("249 Irwin Ave", customers.get(4691).getAddress());
	}

	@Test
	@DisplayName("Record 4692: City is Muskegon")
	void CityOfRecord4692() {
		assertEquals("Muskegon", customers.get(4691).getCity());
	}

	@Test
	@DisplayName("Record 4692: County is Muskegon")
	void CountyOfRecord4692() {
		assertEquals("Muskegon", customers.get(4691).getCounty());
	}

	@Test
	@DisplayName("Record 4692: State is MI")
	void StateOfRecord4692() {
		assertEquals("MI", customers.get(4691).getState());
	}

	@Test
	@DisplayName("Record 4692: ZIP is 49442")
	void ZIPOfRecord4692() {
		assertEquals("49442", customers.get(4691).getZIP());
	}

	@Test
	@DisplayName("Record 4692: Phone is 231-722-2131")
	void PhoneOfRecord4692() {
		assertEquals("231-722-2131", customers.get(4691).getPhone());
	}

	@Test
	@DisplayName("Record 4692: Fax is 231-722-8651")
	void FaxOfRecord4692() {
		assertEquals("231-722-8651", customers.get(4691).getFax());
	}

	@Test
	@DisplayName("Record 4692: Email is otha@mennig.com")
	void EmailOfRecord4692() {
		assertEquals("otha@mennig.com", customers.get(4691).getEmail());
	}

	@Test
	@DisplayName("Record 4692: Web is http://www.othamennig.com")
	void WebOfRecord4692() {
		assertEquals("http://www.othamennig.com", customers.get(4691).getWeb());
	}
}
