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

@Tag("38")
class Record_994 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 994: FirstName is Leora")
	void FirstNameOfRecord994() {
		assertEquals("Leora", customers.get(993).getFirstName());
	}

	@Test
	@DisplayName("Record 994: LastName is Peskind")
	void LastNameOfRecord994() {
		assertEquals("Peskind", customers.get(993).getLastName());
	}

	@Test
	@DisplayName("Record 994: Company is Total Results Inc")
	void CompanyOfRecord994() {
		assertEquals("Total Results Inc", customers.get(993).getCompany());
	}

	@Test
	@DisplayName("Record 994: Address is 105 S Walnut St")
	void AddressOfRecord994() {
		assertEquals("105 S Walnut St", customers.get(993).getAddress());
	}

	@Test
	@DisplayName("Record 994: City is Harrison")
	void CityOfRecord994() {
		assertEquals("Harrison", customers.get(993).getCity());
	}

	@Test
	@DisplayName("Record 994: County is Hamilton")
	void CountyOfRecord994() {
		assertEquals("Hamilton", customers.get(993).getCounty());
	}

	@Test
	@DisplayName("Record 994: State is OH")
	void StateOfRecord994() {
		assertEquals("OH", customers.get(993).getState());
	}

	@Test
	@DisplayName("Record 994: ZIP is 45030")
	void ZIPOfRecord994() {
		assertEquals("45030", customers.get(993).getZIP());
	}

	@Test
	@DisplayName("Record 994: Phone is 513-367-7687")
	void PhoneOfRecord994() {
		assertEquals("513-367-7687", customers.get(993).getPhone());
	}

	@Test
	@DisplayName("Record 994: Fax is 513-367-2964")
	void FaxOfRecord994() {
		assertEquals("513-367-2964", customers.get(993).getFax());
	}

	@Test
	@DisplayName("Record 994: Email is leora@peskind.com")
	void EmailOfRecord994() {
		assertEquals("leora@peskind.com", customers.get(993).getEmail());
	}

	@Test
	@DisplayName("Record 994: Web is http://www.leorapeskind.com")
	void WebOfRecord994() {
		assertEquals("http://www.leorapeskind.com", customers.get(993).getWeb());
	}
}
