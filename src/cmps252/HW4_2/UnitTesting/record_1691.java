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
class Record_1691 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1691: FirstName is Effie")
	void FirstNameOfRecord1691() {
		assertEquals("Effie", customers.get(1690).getFirstName());
	}

	@Test
	@DisplayName("Record 1691: LastName is Givens")
	void LastNameOfRecord1691() {
		assertEquals("Givens", customers.get(1690).getLastName());
	}

	@Test
	@DisplayName("Record 1691: Company is Abc Plastics")
	void CompanyOfRecord1691() {
		assertEquals("Abc Plastics", customers.get(1690).getCompany());
	}

	@Test
	@DisplayName("Record 1691: Address is 2202 Redmond Rd")
	void AddressOfRecord1691() {
		assertEquals("2202 Redmond Rd", customers.get(1690).getAddress());
	}

	@Test
	@DisplayName("Record 1691: City is Jacksonville")
	void CityOfRecord1691() {
		assertEquals("Jacksonville", customers.get(1690).getCity());
	}

	@Test
	@DisplayName("Record 1691: County is Pulaski")
	void CountyOfRecord1691() {
		assertEquals("Pulaski", customers.get(1690).getCounty());
	}

	@Test
	@DisplayName("Record 1691: State is AR")
	void StateOfRecord1691() {
		assertEquals("AR", customers.get(1690).getState());
	}

	@Test
	@DisplayName("Record 1691: ZIP is 72076")
	void ZIPOfRecord1691() {
		assertEquals("72076", customers.get(1690).getZIP());
	}

	@Test
	@DisplayName("Record 1691: Phone is 501-982-9898")
	void PhoneOfRecord1691() {
		assertEquals("501-982-9898", customers.get(1690).getPhone());
	}

	@Test
	@DisplayName("Record 1691: Fax is 501-982-9107")
	void FaxOfRecord1691() {
		assertEquals("501-982-9107", customers.get(1690).getFax());
	}

	@Test
	@DisplayName("Record 1691: Email is effie@givens.com")
	void EmailOfRecord1691() {
		assertEquals("effie@givens.com", customers.get(1690).getEmail());
	}

	@Test
	@DisplayName("Record 1691: Web is http://www.effiegivens.com")
	void WebOfRecord1691() {
		assertEquals("http://www.effiegivens.com", customers.get(1690).getWeb());
	}
}
