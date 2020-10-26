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

@Tag("33")
class Record_1303 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1303: FirstName is Dorian")
	void FirstNameOfRecord1303() {
		assertEquals("Dorian", customers.get(1302).getFirstName());
	}

	@Test
	@DisplayName("Record 1303: LastName is Eglinton")
	void LastNameOfRecord1303() {
		assertEquals("Eglinton", customers.get(1302).getLastName());
	}

	@Test
	@DisplayName("Record 1303: Company is Air Products Weld Equip Co Inc")
	void CompanyOfRecord1303() {
		assertEquals("Air Products Weld Equip Co Inc", customers.get(1302).getCompany());
	}

	@Test
	@DisplayName("Record 1303: Address is 135 Porter St Ne")
	void AddressOfRecord1303() {
		assertEquals("135 Porter St Ne", customers.get(1302).getAddress());
	}

	@Test
	@DisplayName("Record 1303: City is Warren")
	void CityOfRecord1303() {
		assertEquals("Warren", customers.get(1302).getCity());
	}

	@Test
	@DisplayName("Record 1303: County is Trumbull")
	void CountyOfRecord1303() {
		assertEquals("Trumbull", customers.get(1302).getCounty());
	}

	@Test
	@DisplayName("Record 1303: State is OH")
	void StateOfRecord1303() {
		assertEquals("OH", customers.get(1302).getState());
	}

	@Test
	@DisplayName("Record 1303: ZIP is 44483")
	void ZIPOfRecord1303() {
		assertEquals("44483", customers.get(1302).getZIP());
	}

	@Test
	@DisplayName("Record 1303: Phone is 330-399-9338")
	void PhoneOfRecord1303() {
		assertEquals("330-399-9338", customers.get(1302).getPhone());
	}

	@Test
	@DisplayName("Record 1303: Fax is 330-399-9046")
	void FaxOfRecord1303() {
		assertEquals("330-399-9046", customers.get(1302).getFax());
	}

	@Test
	@DisplayName("Record 1303: Email is dorian@eglinton.com")
	void EmailOfRecord1303() {
		assertEquals("dorian@eglinton.com", customers.get(1302).getEmail());
	}

	@Test
	@DisplayName("Record 1303: Web is http://www.dorianeglinton.com")
	void WebOfRecord1303() {
		assertEquals("http://www.dorianeglinton.com", customers.get(1302).getWeb());
	}
}
