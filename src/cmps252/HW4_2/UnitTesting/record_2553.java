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

@Tag("16")
class Record_2553 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2553: FirstName is Marla")
	void FirstNameOfRecord2553() {
		assertEquals("Marla", customers.get(2552).getFirstName());
	}

	@Test
	@DisplayName("Record 2553: LastName is Makara")
	void LastNameOfRecord2553() {
		assertEquals("Makara", customers.get(2552).getLastName());
	}

	@Test
	@DisplayName("Record 2553: Company is Century 21 Jim Tate & Assocs")
	void CompanyOfRecord2553() {
		assertEquals("Century 21 Jim Tate & Assocs", customers.get(2552).getCompany());
	}

	@Test
	@DisplayName("Record 2553: Address is 555 Kinderkamack Rd")
	void AddressOfRecord2553() {
		assertEquals("555 Kinderkamack Rd", customers.get(2552).getAddress());
	}

	@Test
	@DisplayName("Record 2553: City is Oradell")
	void CityOfRecord2553() {
		assertEquals("Oradell", customers.get(2552).getCity());
	}

	@Test
	@DisplayName("Record 2553: County is Bergen")
	void CountyOfRecord2553() {
		assertEquals("Bergen", customers.get(2552).getCounty());
	}

	@Test
	@DisplayName("Record 2553: State is NJ")
	void StateOfRecord2553() {
		assertEquals("NJ", customers.get(2552).getState());
	}

	@Test
	@DisplayName("Record 2553: ZIP is 7649")
	void ZIPOfRecord2553() {
		assertEquals("7649", customers.get(2552).getZIP());
	}

	@Test
	@DisplayName("Record 2553: Phone is 201-967-7480")
	void PhoneOfRecord2553() {
		assertEquals("201-967-7480", customers.get(2552).getPhone());
	}

	@Test
	@DisplayName("Record 2553: Fax is 201-967-8483")
	void FaxOfRecord2553() {
		assertEquals("201-967-8483", customers.get(2552).getFax());
	}

	@Test
	@DisplayName("Record 2553: Email is marla@makara.com")
	void EmailOfRecord2553() {
		assertEquals("marla@makara.com", customers.get(2552).getEmail());
	}

	@Test
	@DisplayName("Record 2553: Web is http://www.marlamakara.com")
	void WebOfRecord2553() {
		assertEquals("http://www.marlamakara.com", customers.get(2552).getWeb());
	}
}
