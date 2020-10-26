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

@Tag("44")
class Record_1690 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1690: FirstName is Allan")
	void FirstNameOfRecord1690() {
		assertEquals("Allan", customers.get(1689).getFirstName());
	}

	@Test
	@DisplayName("Record 1690: LastName is Stygman")
	void LastNameOfRecord1690() {
		assertEquals("Stygman", customers.get(1689).getLastName());
	}

	@Test
	@DisplayName("Record 1690: Company is Elliott Lodging Ltd")
	void CompanyOfRecord1690() {
		assertEquals("Elliott Lodging Ltd", customers.get(1689).getCompany());
	}

	@Test
	@DisplayName("Record 1690: Address is 74 Kurts Rd")
	void AddressOfRecord1690() {
		assertEquals("74 Kurts Rd", customers.get(1689).getAddress());
	}

	@Test
	@DisplayName("Record 1690: City is Denver")
	void CityOfRecord1690() {
		assertEquals("Denver", customers.get(1689).getCity());
	}

	@Test
	@DisplayName("Record 1690: County is Lancaster")
	void CountyOfRecord1690() {
		assertEquals("Lancaster", customers.get(1689).getCounty());
	}

	@Test
	@DisplayName("Record 1690: State is PA")
	void StateOfRecord1690() {
		assertEquals("PA", customers.get(1689).getState());
	}

	@Test
	@DisplayName("Record 1690: ZIP is 17517")
	void ZIPOfRecord1690() {
		assertEquals("17517", customers.get(1689).getZIP());
	}

	@Test
	@DisplayName("Record 1690: Phone is 717-267-8943")
	void PhoneOfRecord1690() {
		assertEquals("717-267-8943", customers.get(1689).getPhone());
	}

	@Test
	@DisplayName("Record 1690: Fax is 717-267-8974")
	void FaxOfRecord1690() {
		assertEquals("717-267-8974", customers.get(1689).getFax());
	}

	@Test
	@DisplayName("Record 1690: Email is allan@stygman.com")
	void EmailOfRecord1690() {
		assertEquals("allan@stygman.com", customers.get(1689).getEmail());
	}

	@Test
	@DisplayName("Record 1690: Web is http://www.allanstygman.com")
	void WebOfRecord1690() {
		assertEquals("http://www.allanstygman.com", customers.get(1689).getWeb());
	}
}
