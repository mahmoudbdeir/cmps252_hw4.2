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

@Tag("36")
class Record_913 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 913: FirstName is Manual")
	void FirstNameOfRecord913() {
		assertEquals("Manual", customers.get(912).getFirstName());
	}

	@Test
	@DisplayName("Record 913: LastName is Stonebraker")
	void LastNameOfRecord913() {
		assertEquals("Stonebraker", customers.get(912).getLastName());
	}

	@Test
	@DisplayName("Record 913: Company is Fitsgerald, Thomas L Esq")
	void CompanyOfRecord913() {
		assertEquals("Fitsgerald, Thomas L Esq", customers.get(912).getCompany());
	}

	@Test
	@DisplayName("Record 913: Address is 4057 G St")
	void AddressOfRecord913() {
		assertEquals("4057 G St", customers.get(912).getAddress());
	}

	@Test
	@DisplayName("Record 913: City is Philadelphia")
	void CityOfRecord913() {
		assertEquals("Philadelphia", customers.get(912).getCity());
	}

	@Test
	@DisplayName("Record 913: County is Philadelphia")
	void CountyOfRecord913() {
		assertEquals("Philadelphia", customers.get(912).getCounty());
	}

	@Test
	@DisplayName("Record 913: State is PA")
	void StateOfRecord913() {
		assertEquals("PA", customers.get(912).getState());
	}

	@Test
	@DisplayName("Record 913: ZIP is 19124")
	void ZIPOfRecord913() {
		assertEquals("19124", customers.get(912).getZIP());
	}

	@Test
	@DisplayName("Record 913: Phone is 215-739-5202")
	void PhoneOfRecord913() {
		assertEquals("215-739-5202", customers.get(912).getPhone());
	}

	@Test
	@DisplayName("Record 913: Fax is 215-739-5779")
	void FaxOfRecord913() {
		assertEquals("215-739-5779", customers.get(912).getFax());
	}

	@Test
	@DisplayName("Record 913: Email is manual@stonebraker.com")
	void EmailOfRecord913() {
		assertEquals("manual@stonebraker.com", customers.get(912).getEmail());
	}

	@Test
	@DisplayName("Record 913: Web is http://www.manualstonebraker.com")
	void WebOfRecord913() {
		assertEquals("http://www.manualstonebraker.com", customers.get(912).getWeb());
	}
}
