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

@Tag("31")
class Record_613 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 613: FirstName is Leola")
	void FirstNameOfRecord613() {
		assertEquals("Leola", customers.get(612).getFirstName());
	}

	@Test
	@DisplayName("Record 613: LastName is Legall")
	void LastNameOfRecord613() {
		assertEquals("Legall", customers.get(612).getLastName());
	}

	@Test
	@DisplayName("Record 613: Company is 98 Star Fm")
	void CompanyOfRecord613() {
		assertEquals("98 Star Fm", customers.get(612).getCompany());
	}

	@Test
	@DisplayName("Record 613: Address is 736 Federal St")
	void AddressOfRecord613() {
		assertEquals("736 Federal St", customers.get(612).getAddress());
	}

	@Test
	@DisplayName("Record 613: City is Davenport")
	void CityOfRecord613() {
		assertEquals("Davenport", customers.get(612).getCity());
	}

	@Test
	@DisplayName("Record 613: County is Scott")
	void CountyOfRecord613() {
		assertEquals("Scott", customers.get(612).getCounty());
	}

	@Test
	@DisplayName("Record 613: State is IA")
	void StateOfRecord613() {
		assertEquals("IA", customers.get(612).getState());
	}

	@Test
	@DisplayName("Record 613: ZIP is 52803")
	void ZIPOfRecord613() {
		assertEquals("52803", customers.get(612).getZIP());
	}

	@Test
	@DisplayName("Record 613: Phone is 563-324-7200")
	void PhoneOfRecord613() {
		assertEquals("563-324-7200", customers.get(612).getPhone());
	}

	@Test
	@DisplayName("Record 613: Fax is 563-324-1514")
	void FaxOfRecord613() {
		assertEquals("563-324-1514", customers.get(612).getFax());
	}

	@Test
	@DisplayName("Record 613: Email is leola@legall.com")
	void EmailOfRecord613() {
		assertEquals("leola@legall.com", customers.get(612).getEmail());
	}

	@Test
	@DisplayName("Record 613: Web is http://www.leolalegall.com")
	void WebOfRecord613() {
		assertEquals("http://www.leolalegall.com", customers.get(612).getWeb());
	}
}
