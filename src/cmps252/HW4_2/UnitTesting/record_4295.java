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

@Tag("23")
class Record_4295 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4295: FirstName is Mayme")
	void FirstNameOfRecord4295() {
		assertEquals("Mayme", customers.get(4294).getFirstName());
	}

	@Test
	@DisplayName("Record 4295: LastName is Bump")
	void LastNameOfRecord4295() {
		assertEquals("Bump", customers.get(4294).getLastName());
	}

	@Test
	@DisplayName("Record 4295: Company is Jones, Paul T Esq")
	void CompanyOfRecord4295() {
		assertEquals("Jones, Paul T Esq", customers.get(4294).getCompany());
	}

	@Test
	@DisplayName("Record 4295: Address is 5231 Hohman Ave")
	void AddressOfRecord4295() {
		assertEquals("5231 Hohman Ave", customers.get(4294).getAddress());
	}

	@Test
	@DisplayName("Record 4295: City is Hammond")
	void CityOfRecord4295() {
		assertEquals("Hammond", customers.get(4294).getCity());
	}

	@Test
	@DisplayName("Record 4295: County is Lake")
	void CountyOfRecord4295() {
		assertEquals("Lake", customers.get(4294).getCounty());
	}

	@Test
	@DisplayName("Record 4295: State is IN")
	void StateOfRecord4295() {
		assertEquals("IN", customers.get(4294).getState());
	}

	@Test
	@DisplayName("Record 4295: ZIP is 46320")
	void ZIPOfRecord4295() {
		assertEquals("46320", customers.get(4294).getZIP());
	}

	@Test
	@DisplayName("Record 4295: Phone is 219-937-4196")
	void PhoneOfRecord4295() {
		assertEquals("219-937-4196", customers.get(4294).getPhone());
	}

	@Test
	@DisplayName("Record 4295: Fax is 219-937-6563")
	void FaxOfRecord4295() {
		assertEquals("219-937-6563", customers.get(4294).getFax());
	}

	@Test
	@DisplayName("Record 4295: Email is mayme@bump.com")
	void EmailOfRecord4295() {
		assertEquals("mayme@bump.com", customers.get(4294).getEmail());
	}

	@Test
	@DisplayName("Record 4295: Web is http://www.maymebump.com")
	void WebOfRecord4295() {
		assertEquals("http://www.maymebump.com", customers.get(4294).getWeb());
	}
}
