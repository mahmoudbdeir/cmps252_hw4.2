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

@Tag("44")
class Record_3986 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3986: FirstName is Winnie")
	void FirstNameOfRecord3986() {
		assertEquals("Winnie", customers.get(3985).getFirstName());
	}

	@Test
	@DisplayName("Record 3986: LastName is Sandhoff")
	void LastNameOfRecord3986() {
		assertEquals("Sandhoff", customers.get(3985).getLastName());
	}

	@Test
	@DisplayName("Record 3986: Company is Linscott, Wendy T Esq")
	void CompanyOfRecord3986() {
		assertEquals("Linscott, Wendy T Esq", customers.get(3985).getCompany());
	}

	@Test
	@DisplayName("Record 3986: Address is 1102 W Yakima Ave")
	void AddressOfRecord3986() {
		assertEquals("1102 W Yakima Ave", customers.get(3985).getAddress());
	}

	@Test
	@DisplayName("Record 3986: City is Yakima")
	void CityOfRecord3986() {
		assertEquals("Yakima", customers.get(3985).getCity());
	}

	@Test
	@DisplayName("Record 3986: County is Yakima")
	void CountyOfRecord3986() {
		assertEquals("Yakima", customers.get(3985).getCounty());
	}

	@Test
	@DisplayName("Record 3986: State is WA")
	void StateOfRecord3986() {
		assertEquals("WA", customers.get(3985).getState());
	}

	@Test
	@DisplayName("Record 3986: ZIP is 98902")
	void ZIPOfRecord3986() {
		assertEquals("98902", customers.get(3985).getZIP());
	}

	@Test
	@DisplayName("Record 3986: Phone is 509-457-9909")
	void PhoneOfRecord3986() {
		assertEquals("509-457-9909", customers.get(3985).getPhone());
	}

	@Test
	@DisplayName("Record 3986: Fax is 509-457-2113")
	void FaxOfRecord3986() {
		assertEquals("509-457-2113", customers.get(3985).getFax());
	}

	@Test
	@DisplayName("Record 3986: Email is winnie@sandhoff.com")
	void EmailOfRecord3986() {
		assertEquals("winnie@sandhoff.com", customers.get(3985).getEmail());
	}

	@Test
	@DisplayName("Record 3986: Web is http://www.winniesandhoff.com")
	void WebOfRecord3986() {
		assertEquals("http://www.winniesandhoff.com", customers.get(3985).getWeb());
	}
}
