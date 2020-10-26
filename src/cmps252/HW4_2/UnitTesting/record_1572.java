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

@Tag("46")
class Record_1572 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1572: FirstName is Brice")
	void FirstNameOfRecord1572() {
		assertEquals("Brice", customers.get(1571).getFirstName());
	}

	@Test
	@DisplayName("Record 1572: LastName is Whitting")
	void LastNameOfRecord1572() {
		assertEquals("Whitting", customers.get(1571).getLastName());
	}

	@Test
	@DisplayName("Record 1572: Company is Mitnik, Kyth R Esq")
	void CompanyOfRecord1572() {
		assertEquals("Mitnik, Kyth R Esq", customers.get(1571).getCompany());
	}

	@Test
	@DisplayName("Record 1572: Address is 110 S Story Rd")
	void AddressOfRecord1572() {
		assertEquals("110 S Story Rd", customers.get(1571).getAddress());
	}

	@Test
	@DisplayName("Record 1572: City is Irving")
	void CityOfRecord1572() {
		assertEquals("Irving", customers.get(1571).getCity());
	}

	@Test
	@DisplayName("Record 1572: County is Dallas")
	void CountyOfRecord1572() {
		assertEquals("Dallas", customers.get(1571).getCounty());
	}

	@Test
	@DisplayName("Record 1572: State is TX")
	void StateOfRecord1572() {
		assertEquals("TX", customers.get(1571).getState());
	}

	@Test
	@DisplayName("Record 1572: ZIP is 75060")
	void ZIPOfRecord1572() {
		assertEquals("75060", customers.get(1571).getZIP());
	}

	@Test
	@DisplayName("Record 1572: Phone is 972-254-2222")
	void PhoneOfRecord1572() {
		assertEquals("972-254-2222", customers.get(1571).getPhone());
	}

	@Test
	@DisplayName("Record 1572: Fax is 972-254-0014")
	void FaxOfRecord1572() {
		assertEquals("972-254-0014", customers.get(1571).getFax());
	}

	@Test
	@DisplayName("Record 1572: Email is brice@whitting.com")
	void EmailOfRecord1572() {
		assertEquals("brice@whitting.com", customers.get(1571).getEmail());
	}

	@Test
	@DisplayName("Record 1572: Web is http://www.bricewhitting.com")
	void WebOfRecord1572() {
		assertEquals("http://www.bricewhitting.com", customers.get(1571).getWeb());
	}
}
