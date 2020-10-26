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

@Tag("4")
class Record_2502 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2502: FirstName is Nathaniel")
	void FirstNameOfRecord2502() {
		assertEquals("Nathaniel", customers.get(2501).getFirstName());
	}

	@Test
	@DisplayName("Record 2502: LastName is Goodall")
	void LastNameOfRecord2502() {
		assertEquals("Goodall", customers.get(2501).getLastName());
	}

	@Test
	@DisplayName("Record 2502: Company is California Journal")
	void CompanyOfRecord2502() {
		assertEquals("California Journal", customers.get(2501).getCompany());
	}

	@Test
	@DisplayName("Record 2502: Address is 592 Hammond St")
	void AddressOfRecord2502() {
		assertEquals("592 Hammond St", customers.get(2501).getAddress());
	}

	@Test
	@DisplayName("Record 2502: City is Bangor")
	void CityOfRecord2502() {
		assertEquals("Bangor", customers.get(2501).getCity());
	}

	@Test
	@DisplayName("Record 2502: County is Penobscot")
	void CountyOfRecord2502() {
		assertEquals("Penobscot", customers.get(2501).getCounty());
	}

	@Test
	@DisplayName("Record 2502: State is ME")
	void StateOfRecord2502() {
		assertEquals("ME", customers.get(2501).getState());
	}

	@Test
	@DisplayName("Record 2502: ZIP is 4401")
	void ZIPOfRecord2502() {
		assertEquals("4401", customers.get(2501).getZIP());
	}

	@Test
	@DisplayName("Record 2502: Phone is 207-947-7090")
	void PhoneOfRecord2502() {
		assertEquals("207-947-7090", customers.get(2501).getPhone());
	}

	@Test
	@DisplayName("Record 2502: Fax is 207-947-2086")
	void FaxOfRecord2502() {
		assertEquals("207-947-2086", customers.get(2501).getFax());
	}

	@Test
	@DisplayName("Record 2502: Email is nathaniel@goodall.com")
	void EmailOfRecord2502() {
		assertEquals("nathaniel@goodall.com", customers.get(2501).getEmail());
	}

	@Test
	@DisplayName("Record 2502: Web is http://www.nathanielgoodall.com")
	void WebOfRecord2502() {
		assertEquals("http://www.nathanielgoodall.com", customers.get(2501).getWeb());
	}
}
