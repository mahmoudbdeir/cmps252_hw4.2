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

@Tag("11")
class Record_1220 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1220: FirstName is Malik")
	void FirstNameOfRecord1220() {
		assertEquals("Malik", customers.get(1219).getFirstName());
	}

	@Test
	@DisplayName("Record 1220: LastName is Lovet")
	void LastNameOfRecord1220() {
		assertEquals("Lovet", customers.get(1219).getLastName());
	}

	@Test
	@DisplayName("Record 1220: Company is Diamond Vogel Paint Centers")
	void CompanyOfRecord1220() {
		assertEquals("Diamond Vogel Paint Centers", customers.get(1219).getCompany());
	}

	@Test
	@DisplayName("Record 1220: Address is 193 State St")
	void AddressOfRecord1220() {
		assertEquals("193 State St", customers.get(1219).getAddress());
	}

	@Test
	@DisplayName("Record 1220: City is Bangor")
	void CityOfRecord1220() {
		assertEquals("Bangor", customers.get(1219).getCity());
	}

	@Test
	@DisplayName("Record 1220: County is Penobscot")
	void CountyOfRecord1220() {
		assertEquals("Penobscot", customers.get(1219).getCounty());
	}

	@Test
	@DisplayName("Record 1220: State is ME")
	void StateOfRecord1220() {
		assertEquals("ME", customers.get(1219).getState());
	}

	@Test
	@DisplayName("Record 1220: ZIP is 4401")
	void ZIPOfRecord1220() {
		assertEquals("4401", customers.get(1219).getZIP());
	}

	@Test
	@DisplayName("Record 1220: Phone is 207-942-6015")
	void PhoneOfRecord1220() {
		assertEquals("207-942-6015", customers.get(1219).getPhone());
	}

	@Test
	@DisplayName("Record 1220: Fax is 207-942-6152")
	void FaxOfRecord1220() {
		assertEquals("207-942-6152", customers.get(1219).getFax());
	}

	@Test
	@DisplayName("Record 1220: Email is malik@lovet.com")
	void EmailOfRecord1220() {
		assertEquals("malik@lovet.com", customers.get(1219).getEmail());
	}

	@Test
	@DisplayName("Record 1220: Web is http://www.maliklovet.com")
	void WebOfRecord1220() {
		assertEquals("http://www.maliklovet.com", customers.get(1219).getWeb());
	}
}
