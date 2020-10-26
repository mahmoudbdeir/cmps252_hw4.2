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
class Record_569 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 569: FirstName is Nita")
	void FirstNameOfRecord569() {
		assertEquals("Nita", customers.get(568).getFirstName());
	}

	@Test
	@DisplayName("Record 569: LastName is Urbanek")
	void LastNameOfRecord569() {
		assertEquals("Urbanek", customers.get(568).getLastName());
	}

	@Test
	@DisplayName("Record 569: Company is Linehan, Daniel J Md")
	void CompanyOfRecord569() {
		assertEquals("Linehan, Daniel J Md", customers.get(568).getCompany());
	}

	@Test
	@DisplayName("Record 569: Address is 2506 Park Ave")
	void AddressOfRecord569() {
		assertEquals("2506 Park Ave", customers.get(568).getAddress());
	}

	@Test
	@DisplayName("Record 569: City is Chico")
	void CityOfRecord569() {
		assertEquals("Chico", customers.get(568).getCity());
	}

	@Test
	@DisplayName("Record 569: County is Butte")
	void CountyOfRecord569() {
		assertEquals("Butte", customers.get(568).getCounty());
	}

	@Test
	@DisplayName("Record 569: State is CA")
	void StateOfRecord569() {
		assertEquals("CA", customers.get(568).getState());
	}

	@Test
	@DisplayName("Record 569: ZIP is 95928")
	void ZIPOfRecord569() {
		assertEquals("95928", customers.get(568).getZIP());
	}

	@Test
	@DisplayName("Record 569: Phone is 530-894-2884")
	void PhoneOfRecord569() {
		assertEquals("530-894-2884", customers.get(568).getPhone());
	}

	@Test
	@DisplayName("Record 569: Fax is 530-894-4773")
	void FaxOfRecord569() {
		assertEquals("530-894-4773", customers.get(568).getFax());
	}

	@Test
	@DisplayName("Record 569: Email is nita@urbanek.com")
	void EmailOfRecord569() {
		assertEquals("nita@urbanek.com", customers.get(568).getEmail());
	}

	@Test
	@DisplayName("Record 569: Web is http://www.nitaurbanek.com")
	void WebOfRecord569() {
		assertEquals("http://www.nitaurbanek.com", customers.get(568).getWeb());
	}
}
