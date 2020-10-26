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

@Tag("47")
class Record_4129 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4129: FirstName is Meagan")
	void FirstNameOfRecord4129() {
		assertEquals("Meagan", customers.get(4128).getFirstName());
	}

	@Test
	@DisplayName("Record 4129: LastName is Madrueno")
	void LastNameOfRecord4129() {
		assertEquals("Madrueno", customers.get(4128).getLastName());
	}

	@Test
	@DisplayName("Record 4129: Company is Robbins, Robert D Esq")
	void CompanyOfRecord4129() {
		assertEquals("Robbins, Robert D Esq", customers.get(4128).getCompany());
	}

	@Test
	@DisplayName("Record 4129: Address is 1325 Austin Ave")
	void AddressOfRecord4129() {
		assertEquals("1325 Austin Ave", customers.get(4128).getAddress());
	}

	@Test
	@DisplayName("Record 4129: City is Waco")
	void CityOfRecord4129() {
		assertEquals("Waco", customers.get(4128).getCity());
	}

	@Test
	@DisplayName("Record 4129: County is McLennan")
	void CountyOfRecord4129() {
		assertEquals("McLennan", customers.get(4128).getCounty());
	}

	@Test
	@DisplayName("Record 4129: State is TX")
	void StateOfRecord4129() {
		assertEquals("TX", customers.get(4128).getState());
	}

	@Test
	@DisplayName("Record 4129: ZIP is 76701")
	void ZIPOfRecord4129() {
		assertEquals("76701", customers.get(4128).getZIP());
	}

	@Test
	@DisplayName("Record 4129: Phone is 254-752-4219")
	void PhoneOfRecord4129() {
		assertEquals("254-752-4219", customers.get(4128).getPhone());
	}

	@Test
	@DisplayName("Record 4129: Fax is 254-752-4471")
	void FaxOfRecord4129() {
		assertEquals("254-752-4471", customers.get(4128).getFax());
	}

	@Test
	@DisplayName("Record 4129: Email is meagan@madrueno.com")
	void EmailOfRecord4129() {
		assertEquals("meagan@madrueno.com", customers.get(4128).getEmail());
	}

	@Test
	@DisplayName("Record 4129: Web is http://www.meaganmadrueno.com")
	void WebOfRecord4129() {
		assertEquals("http://www.meaganmadrueno.com", customers.get(4128).getWeb());
	}
}
