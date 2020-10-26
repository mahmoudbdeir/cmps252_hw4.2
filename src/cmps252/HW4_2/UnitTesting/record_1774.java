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

@Tag("8")
class Record_1774 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1774: FirstName is Tracie")
	void FirstNameOfRecord1774() {
		assertEquals("Tracie", customers.get(1773).getFirstName());
	}

	@Test
	@DisplayName("Record 1774: LastName is Handt")
	void LastNameOfRecord1774() {
		assertEquals("Handt", customers.get(1773).getLastName());
	}

	@Test
	@DisplayName("Record 1774: Company is Nowlin, James L Esq")
	void CompanyOfRecord1774() {
		assertEquals("Nowlin, James L Esq", customers.get(1773).getCompany());
	}

	@Test
	@DisplayName("Record 1774: Address is 1926 S Main St")
	void AddressOfRecord1774() {
		assertEquals("1926 S Main St", customers.get(1773).getAddress());
	}

	@Test
	@DisplayName("Record 1774: City is Santa Ana")
	void CityOfRecord1774() {
		assertEquals("Santa Ana", customers.get(1773).getCity());
	}

	@Test
	@DisplayName("Record 1774: County is Orange")
	void CountyOfRecord1774() {
		assertEquals("Orange", customers.get(1773).getCounty());
	}

	@Test
	@DisplayName("Record 1774: State is CA")
	void StateOfRecord1774() {
		assertEquals("CA", customers.get(1773).getState());
	}

	@Test
	@DisplayName("Record 1774: ZIP is 92707")
	void ZIPOfRecord1774() {
		assertEquals("92707", customers.get(1773).getZIP());
	}

	@Test
	@DisplayName("Record 1774: Phone is 714-556-0229")
	void PhoneOfRecord1774() {
		assertEquals("714-556-0229", customers.get(1773).getPhone());
	}

	@Test
	@DisplayName("Record 1774: Fax is 714-556-6142")
	void FaxOfRecord1774() {
		assertEquals("714-556-6142", customers.get(1773).getFax());
	}

	@Test
	@DisplayName("Record 1774: Email is tracie@handt.com")
	void EmailOfRecord1774() {
		assertEquals("tracie@handt.com", customers.get(1773).getEmail());
	}

	@Test
	@DisplayName("Record 1774: Web is http://www.traciehandt.com")
	void WebOfRecord1774() {
		assertEquals("http://www.traciehandt.com", customers.get(1773).getWeb());
	}
}
