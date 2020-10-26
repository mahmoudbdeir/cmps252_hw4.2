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

@Tag("3")
class Record_1895 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1895: FirstName is Jefferson")
	void FirstNameOfRecord1895() {
		assertEquals("Jefferson", customers.get(1894).getFirstName());
	}

	@Test
	@DisplayName("Record 1895: LastName is Hepa")
	void LastNameOfRecord1895() {
		assertEquals("Hepa", customers.get(1894).getLastName());
	}

	@Test
	@DisplayName("Record 1895: Company is Tennplasco Inc")
	void CompanyOfRecord1895() {
		assertEquals("Tennplasco Inc", customers.get(1894).getCompany());
	}

	@Test
	@DisplayName("Record 1895: Address is 5477 Tate Rd")
	void AddressOfRecord1895() {
		assertEquals("5477 Tate Rd", customers.get(1894).getAddress());
	}

	@Test
	@DisplayName("Record 1895: City is Rockford")
	void CityOfRecord1895() {
		assertEquals("Rockford", customers.get(1894).getCity());
	}

	@Test
	@DisplayName("Record 1895: County is Winnebago")
	void CountyOfRecord1895() {
		assertEquals("Winnebago", customers.get(1894).getCounty());
	}

	@Test
	@DisplayName("Record 1895: State is IL")
	void StateOfRecord1895() {
		assertEquals("IL", customers.get(1894).getState());
	}

	@Test
	@DisplayName("Record 1895: ZIP is 61101")
	void ZIPOfRecord1895() {
		assertEquals("61101", customers.get(1894).getZIP());
	}

	@Test
	@DisplayName("Record 1895: Phone is 815-963-9940")
	void PhoneOfRecord1895() {
		assertEquals("815-963-9940", customers.get(1894).getPhone());
	}

	@Test
	@DisplayName("Record 1895: Fax is 815-963-9421")
	void FaxOfRecord1895() {
		assertEquals("815-963-9421", customers.get(1894).getFax());
	}

	@Test
	@DisplayName("Record 1895: Email is jefferson@hepa.com")
	void EmailOfRecord1895() {
		assertEquals("jefferson@hepa.com", customers.get(1894).getEmail());
	}

	@Test
	@DisplayName("Record 1895: Web is http://www.jeffersonhepa.com")
	void WebOfRecord1895() {
		assertEquals("http://www.jeffersonhepa.com", customers.get(1894).getWeb());
	}
}
