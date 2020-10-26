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

@Tag("1")
class Record_4571 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4571: FirstName is Yolanda")
	void FirstNameOfRecord4571() {
		assertEquals("Yolanda", customers.get(4570).getFirstName());
	}

	@Test
	@DisplayName("Record 4571: LastName is Dowdy")
	void LastNameOfRecord4571() {
		assertEquals("Dowdy", customers.get(4570).getLastName());
	}

	@Test
	@DisplayName("Record 4571: Company is Yannis, Rex A Md")
	void CompanyOfRecord4571() {
		assertEquals("Yannis, Rex A Md", customers.get(4570).getCompany());
	}

	@Test
	@DisplayName("Record 4571: Address is 209 S Nevada Ave")
	void AddressOfRecord4571() {
		assertEquals("209 S Nevada Ave", customers.get(4570).getAddress());
	}

	@Test
	@DisplayName("Record 4571: City is Colorado Springs")
	void CityOfRecord4571() {
		assertEquals("Colorado Springs", customers.get(4570).getCity());
	}

	@Test
	@DisplayName("Record 4571: County is El Paso")
	void CountyOfRecord4571() {
		assertEquals("El Paso", customers.get(4570).getCounty());
	}

	@Test
	@DisplayName("Record 4571: State is CO")
	void StateOfRecord4571() {
		assertEquals("CO", customers.get(4570).getState());
	}

	@Test
	@DisplayName("Record 4571: ZIP is 80903")
	void ZIPOfRecord4571() {
		assertEquals("80903", customers.get(4570).getZIP());
	}

	@Test
	@DisplayName("Record 4571: Phone is 719-473-0225")
	void PhoneOfRecord4571() {
		assertEquals("719-473-0225", customers.get(4570).getPhone());
	}

	@Test
	@DisplayName("Record 4571: Fax is 719-473-0202")
	void FaxOfRecord4571() {
		assertEquals("719-473-0202", customers.get(4570).getFax());
	}

	@Test
	@DisplayName("Record 4571: Email is yolanda@dowdy.com")
	void EmailOfRecord4571() {
		assertEquals("yolanda@dowdy.com", customers.get(4570).getEmail());
	}

	@Test
	@DisplayName("Record 4571: Web is http://www.yolandadowdy.com")
	void WebOfRecord4571() {
		assertEquals("http://www.yolandadowdy.com", customers.get(4570).getWeb());
	}
}
