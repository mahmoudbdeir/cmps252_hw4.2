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

@Tag("2")
class Record_2303 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2303: FirstName is Armando")
	void FirstNameOfRecord2303() {
		assertEquals("Armando", customers.get(2302).getFirstName());
	}

	@Test
	@DisplayName("Record 2303: LastName is Zahri")
	void LastNameOfRecord2303() {
		assertEquals("Zahri", customers.get(2302).getLastName());
	}

	@Test
	@DisplayName("Record 2303: Company is Siladie, Dawn K Esq")
	void CompanyOfRecord2303() {
		assertEquals("Siladie, Dawn K Esq", customers.get(2302).getCompany());
	}

	@Test
	@DisplayName("Record 2303: Address is 25 Wilbur Ave")
	void AddressOfRecord2303() {
		assertEquals("25 Wilbur Ave", customers.get(2302).getAddress());
	}

	@Test
	@DisplayName("Record 2303: City is Yuba City")
	void CityOfRecord2303() {
		assertEquals("Yuba City", customers.get(2302).getCity());
	}

	@Test
	@DisplayName("Record 2303: County is Sutter")
	void CountyOfRecord2303() {
		assertEquals("Sutter", customers.get(2302).getCounty());
	}

	@Test
	@DisplayName("Record 2303: State is CA")
	void StateOfRecord2303() {
		assertEquals("CA", customers.get(2302).getState());
	}

	@Test
	@DisplayName("Record 2303: ZIP is 95991")
	void ZIPOfRecord2303() {
		assertEquals("95991", customers.get(2302).getZIP());
	}

	@Test
	@DisplayName("Record 2303: Phone is 530-755-7406")
	void PhoneOfRecord2303() {
		assertEquals("530-755-7406", customers.get(2302).getPhone());
	}

	@Test
	@DisplayName("Record 2303: Fax is 530-755-9869")
	void FaxOfRecord2303() {
		assertEquals("530-755-9869", customers.get(2302).getFax());
	}

	@Test
	@DisplayName("Record 2303: Email is armando@zahri.com")
	void EmailOfRecord2303() {
		assertEquals("armando@zahri.com", customers.get(2302).getEmail());
	}

	@Test
	@DisplayName("Record 2303: Web is http://www.armandozahri.com")
	void WebOfRecord2303() {
		assertEquals("http://www.armandozahri.com", customers.get(2302).getWeb());
	}
}
