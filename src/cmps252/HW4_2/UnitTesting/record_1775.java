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
class Record_1775 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1775: FirstName is Madge")
	void FirstNameOfRecord1775() {
		assertEquals("Madge", customers.get(1774).getFirstName());
	}

	@Test
	@DisplayName("Record 1775: LastName is Kwack")
	void LastNameOfRecord1775() {
		assertEquals("Kwack", customers.get(1774).getLastName());
	}

	@Test
	@DisplayName("Record 1775: Company is Irco")
	void CompanyOfRecord1775() {
		assertEquals("Irco", customers.get(1774).getCompany());
	}

	@Test
	@DisplayName("Record 1775: Address is 309 1st Ave")
	void AddressOfRecord1775() {
		assertEquals("309 1st Ave", customers.get(1774).getAddress());
	}

	@Test
	@DisplayName("Record 1775: City is Laurel")
	void CityOfRecord1775() {
		assertEquals("Laurel", customers.get(1774).getCity());
	}

	@Test
	@DisplayName("Record 1775: County is Yellowstone")
	void CountyOfRecord1775() {
		assertEquals("Yellowstone", customers.get(1774).getCounty());
	}

	@Test
	@DisplayName("Record 1775: State is MT")
	void StateOfRecord1775() {
		assertEquals("MT", customers.get(1774).getState());
	}

	@Test
	@DisplayName("Record 1775: ZIP is 59044")
	void ZIPOfRecord1775() {
		assertEquals("59044", customers.get(1774).getZIP());
	}

	@Test
	@DisplayName("Record 1775: Phone is 406-628-5060")
	void PhoneOfRecord1775() {
		assertEquals("406-628-5060", customers.get(1774).getPhone());
	}

	@Test
	@DisplayName("Record 1775: Fax is 406-628-0965")
	void FaxOfRecord1775() {
		assertEquals("406-628-0965", customers.get(1774).getFax());
	}

	@Test
	@DisplayName("Record 1775: Email is madge@kwack.com")
	void EmailOfRecord1775() {
		assertEquals("madge@kwack.com", customers.get(1774).getEmail());
	}

	@Test
	@DisplayName("Record 1775: Web is http://www.madgekwack.com")
	void WebOfRecord1775() {
		assertEquals("http://www.madgekwack.com", customers.get(1774).getWeb());
	}
}
