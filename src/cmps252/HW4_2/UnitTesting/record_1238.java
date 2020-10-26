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

@Tag("42")
class Record_1238 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1238: FirstName is Lyla")
	void FirstNameOfRecord1238() {
		assertEquals("Lyla", customers.get(1237).getFirstName());
	}

	@Test
	@DisplayName("Record 1238: LastName is Pinon")
	void LastNameOfRecord1238() {
		assertEquals("Pinon", customers.get(1237).getLastName());
	}

	@Test
	@DisplayName("Record 1238: Company is Gemini Communications")
	void CompanyOfRecord1238() {
		assertEquals("Gemini Communications", customers.get(1237).getCompany());
	}

	@Test
	@DisplayName("Record 1238: Address is 40 Bushnell Rd")
	void AddressOfRecord1238() {
		assertEquals("40 Bushnell Rd", customers.get(1237).getAddress());
	}

	@Test
	@DisplayName("Record 1238: City is Old Bridge")
	void CityOfRecord1238() {
		assertEquals("Old Bridge", customers.get(1237).getCity());
	}

	@Test
	@DisplayName("Record 1238: County is Middlesex")
	void CountyOfRecord1238() {
		assertEquals("Middlesex", customers.get(1237).getCounty());
	}

	@Test
	@DisplayName("Record 1238: State is NJ")
	void StateOfRecord1238() {
		assertEquals("NJ", customers.get(1237).getState());
	}

	@Test
	@DisplayName("Record 1238: ZIP is 8857")
	void ZIPOfRecord1238() {
		assertEquals("8857", customers.get(1237).getZIP());
	}

	@Test
	@DisplayName("Record 1238: Phone is 732-679-7039")
	void PhoneOfRecord1238() {
		assertEquals("732-679-7039", customers.get(1237).getPhone());
	}

	@Test
	@DisplayName("Record 1238: Fax is 732-679-4751")
	void FaxOfRecord1238() {
		assertEquals("732-679-4751", customers.get(1237).getFax());
	}

	@Test
	@DisplayName("Record 1238: Email is lyla@pinon.com")
	void EmailOfRecord1238() {
		assertEquals("lyla@pinon.com", customers.get(1237).getEmail());
	}

	@Test
	@DisplayName("Record 1238: Web is http://www.lylapinon.com")
	void WebOfRecord1238() {
		assertEquals("http://www.lylapinon.com", customers.get(1237).getWeb());
	}
}
