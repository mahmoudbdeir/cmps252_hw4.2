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

@Tag("37")
class Record_3443 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3443: FirstName is Luciano")
	void FirstNameOfRecord3443() {
		assertEquals("Luciano", customers.get(3442).getFirstName());
	}

	@Test
	@DisplayName("Record 3443: LastName is Ruark")
	void LastNameOfRecord3443() {
		assertEquals("Ruark", customers.get(3442).getLastName());
	}

	@Test
	@DisplayName("Record 3443: Company is Daily Courier")
	void CompanyOfRecord3443() {
		assertEquals("Daily Courier", customers.get(3442).getCompany());
	}

	@Test
	@DisplayName("Record 3443: Address is 70 S Orange Ave  #-101")
	void AddressOfRecord3443() {
		assertEquals("70 S Orange Ave  #-101", customers.get(3442).getAddress());
	}

	@Test
	@DisplayName("Record 3443: City is Livingston")
	void CityOfRecord3443() {
		assertEquals("Livingston", customers.get(3442).getCity());
	}

	@Test
	@DisplayName("Record 3443: County is Essex")
	void CountyOfRecord3443() {
		assertEquals("Essex", customers.get(3442).getCounty());
	}

	@Test
	@DisplayName("Record 3443: State is NJ")
	void StateOfRecord3443() {
		assertEquals("NJ", customers.get(3442).getState());
	}

	@Test
	@DisplayName("Record 3443: ZIP is 7039")
	void ZIPOfRecord3443() {
		assertEquals("7039", customers.get(3442).getZIP());
	}

	@Test
	@DisplayName("Record 3443: Phone is 973-994-6483")
	void PhoneOfRecord3443() {
		assertEquals("973-994-6483", customers.get(3442).getPhone());
	}

	@Test
	@DisplayName("Record 3443: Fax is 973-994-9028")
	void FaxOfRecord3443() {
		assertEquals("973-994-9028", customers.get(3442).getFax());
	}

	@Test
	@DisplayName("Record 3443: Email is luciano@ruark.com")
	void EmailOfRecord3443() {
		assertEquals("luciano@ruark.com", customers.get(3442).getEmail());
	}

	@Test
	@DisplayName("Record 3443: Web is http://www.lucianoruark.com")
	void WebOfRecord3443() {
		assertEquals("http://www.lucianoruark.com", customers.get(3442).getWeb());
	}
}
