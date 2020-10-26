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

@Tag("22")
class Record_115 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 115: FirstName is Odessa")
	void FirstNameOfRecord115() {
		assertEquals("Odessa", customers.get(114).getFirstName());
	}

	@Test
	@DisplayName("Record 115: LastName is Yagecic")
	void LastNameOfRecord115() {
		assertEquals("Yagecic", customers.get(114).getLastName());
	}

	@Test
	@DisplayName("Record 115: Company is Stark, Susan E Esq")
	void CompanyOfRecord115() {
		assertEquals("Stark, Susan E Esq", customers.get(114).getCompany());
	}

	@Test
	@DisplayName("Record 115: Address is Hwy 27n N")
	void AddressOfRecord115() {
		assertEquals("Hwy 27n N", customers.get(114).getAddress());
	}

	@Test
	@DisplayName("Record 115: City is Trion")
	void CityOfRecord115() {
		assertEquals("Trion", customers.get(114).getCity());
	}

	@Test
	@DisplayName("Record 115: County is Chattooga")
	void CountyOfRecord115() {
		assertEquals("Chattooga", customers.get(114).getCounty());
	}

	@Test
	@DisplayName("Record 115: State is GA")
	void StateOfRecord115() {
		assertEquals("GA", customers.get(114).getState());
	}

	@Test
	@DisplayName("Record 115: ZIP is 30753")
	void ZIPOfRecord115() {
		assertEquals("30753", customers.get(114).getZIP());
	}

	@Test
	@DisplayName("Record 115: Phone is 706-734-1576")
	void PhoneOfRecord115() {
		assertEquals("706-734-1576", customers.get(114).getPhone());
	}

	@Test
	@DisplayName("Record 115: Fax is 706-734-6204")
	void FaxOfRecord115() {
		assertEquals("706-734-6204", customers.get(114).getFax());
	}

	@Test
	@DisplayName("Record 115: Email is odessa@yagecic.com")
	void EmailOfRecord115() {
		assertEquals("odessa@yagecic.com", customers.get(114).getEmail());
	}

	@Test
	@DisplayName("Record 115: Web is http://www.odessayagecic.com")
	void WebOfRecord115() {
		assertEquals("http://www.odessayagecic.com", customers.get(114).getWeb());
	}
}
