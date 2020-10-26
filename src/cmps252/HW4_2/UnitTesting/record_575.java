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
class Record_575 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 575: FirstName is Long")
	void FirstNameOfRecord575() {
		assertEquals("Long", customers.get(574).getFirstName());
	}

	@Test
	@DisplayName("Record 575: LastName is Papai")
	void LastNameOfRecord575() {
		assertEquals("Papai", customers.get(574).getLastName());
	}

	@Test
	@DisplayName("Record 575: Company is Noakes Rooney & Assocs Rlty")
	void CompanyOfRecord575() {
		assertEquals("Noakes Rooney & Assocs Rlty", customers.get(574).getCompany());
	}

	@Test
	@DisplayName("Record 575: Address is 11212 Wright Rd")
	void AddressOfRecord575() {
		assertEquals("11212 Wright Rd", customers.get(574).getAddress());
	}

	@Test
	@DisplayName("Record 575: City is Lynwood")
	void CityOfRecord575() {
		assertEquals("Lynwood", customers.get(574).getCity());
	}

	@Test
	@DisplayName("Record 575: County is Los Angeles")
	void CountyOfRecord575() {
		assertEquals("Los Angeles", customers.get(574).getCounty());
	}

	@Test
	@DisplayName("Record 575: State is CA")
	void StateOfRecord575() {
		assertEquals("CA", customers.get(574).getState());
	}

	@Test
	@DisplayName("Record 575: ZIP is 90262")
	void ZIPOfRecord575() {
		assertEquals("90262", customers.get(574).getZIP());
	}

	@Test
	@DisplayName("Record 575: Phone is 310-604-0138")
	void PhoneOfRecord575() {
		assertEquals("310-604-0138", customers.get(574).getPhone());
	}

	@Test
	@DisplayName("Record 575: Fax is 310-604-9589")
	void FaxOfRecord575() {
		assertEquals("310-604-9589", customers.get(574).getFax());
	}

	@Test
	@DisplayName("Record 575: Email is long@papai.com")
	void EmailOfRecord575() {
		assertEquals("long@papai.com", customers.get(574).getEmail());
	}

	@Test
	@DisplayName("Record 575: Web is http://www.longpapai.com")
	void WebOfRecord575() {
		assertEquals("http://www.longpapai.com", customers.get(574).getWeb());
	}
}
