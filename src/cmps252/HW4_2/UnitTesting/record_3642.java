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

@Tag("12")
class Record_3642 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3642: FirstName is Lucille")
	void FirstNameOfRecord3642() {
		assertEquals("Lucille", customers.get(3641).getFirstName());
	}

	@Test
	@DisplayName("Record 3642: LastName is Wolak")
	void LastNameOfRecord3642() {
		assertEquals("Wolak", customers.get(3641).getLastName());
	}

	@Test
	@DisplayName("Record 3642: Company is Cliffdale Mfg Co")
	void CompanyOfRecord3642() {
		assertEquals("Cliffdale Mfg Co", customers.get(3641).getCompany());
	}

	@Test
	@DisplayName("Record 3642: Address is 630 Ridge Rd W")
	void AddressOfRecord3642() {
		assertEquals("630 Ridge Rd W", customers.get(3641).getAddress());
	}

	@Test
	@DisplayName("Record 3642: City is Rochester")
	void CityOfRecord3642() {
		assertEquals("Rochester", customers.get(3641).getCity());
	}

	@Test
	@DisplayName("Record 3642: County is Monroe")
	void CountyOfRecord3642() {
		assertEquals("Monroe", customers.get(3641).getCounty());
	}

	@Test
	@DisplayName("Record 3642: State is NY")
	void StateOfRecord3642() {
		assertEquals("NY", customers.get(3641).getState());
	}

	@Test
	@DisplayName("Record 3642: ZIP is 14615")
	void ZIPOfRecord3642() {
		assertEquals("14615", customers.get(3641).getZIP());
	}

	@Test
	@DisplayName("Record 3642: Phone is 585-865-2902")
	void PhoneOfRecord3642() {
		assertEquals("585-865-2902", customers.get(3641).getPhone());
	}

	@Test
	@DisplayName("Record 3642: Fax is 585-865-6497")
	void FaxOfRecord3642() {
		assertEquals("585-865-6497", customers.get(3641).getFax());
	}

	@Test
	@DisplayName("Record 3642: Email is lucille@wolak.com")
	void EmailOfRecord3642() {
		assertEquals("lucille@wolak.com", customers.get(3641).getEmail());
	}

	@Test
	@DisplayName("Record 3642: Web is http://www.lucillewolak.com")
	void WebOfRecord3642() {
		assertEquals("http://www.lucillewolak.com", customers.get(3641).getWeb());
	}
}
