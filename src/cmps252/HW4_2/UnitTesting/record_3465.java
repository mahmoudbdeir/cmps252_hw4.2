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

@Tag("29")
class Record_3465 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3465: FirstName is Cherie")
	void FirstNameOfRecord3465() {
		assertEquals("Cherie", customers.get(3464).getFirstName());
	}

	@Test
	@DisplayName("Record 3465: LastName is Busi")
	void LastNameOfRecord3465() {
		assertEquals("Busi", customers.get(3464).getLastName());
	}

	@Test
	@DisplayName("Record 3465: Company is Auto Wreckers By Sars Inc")
	void CompanyOfRecord3465() {
		assertEquals("Auto Wreckers By Sars Inc", customers.get(3464).getCompany());
	}

	@Test
	@DisplayName("Record 3465: Address is 10050 N 25th Ave")
	void AddressOfRecord3465() {
		assertEquals("10050 N 25th Ave", customers.get(3464).getAddress());
	}

	@Test
	@DisplayName("Record 3465: City is Phoenix")
	void CityOfRecord3465() {
		assertEquals("Phoenix", customers.get(3464).getCity());
	}

	@Test
	@DisplayName("Record 3465: County is Maricopa")
	void CountyOfRecord3465() {
		assertEquals("Maricopa", customers.get(3464).getCounty());
	}

	@Test
	@DisplayName("Record 3465: State is AZ")
	void StateOfRecord3465() {
		assertEquals("AZ", customers.get(3464).getState());
	}

	@Test
	@DisplayName("Record 3465: ZIP is 85021")
	void ZIPOfRecord3465() {
		assertEquals("85021", customers.get(3464).getZIP());
	}

	@Test
	@DisplayName("Record 3465: Phone is 602-944-8213")
	void PhoneOfRecord3465() {
		assertEquals("602-944-8213", customers.get(3464).getPhone());
	}

	@Test
	@DisplayName("Record 3465: Fax is 602-944-3207")
	void FaxOfRecord3465() {
		assertEquals("602-944-3207", customers.get(3464).getFax());
	}

	@Test
	@DisplayName("Record 3465: Email is cherie@busi.com")
	void EmailOfRecord3465() {
		assertEquals("cherie@busi.com", customers.get(3464).getEmail());
	}

	@Test
	@DisplayName("Record 3465: Web is http://www.cheriebusi.com")
	void WebOfRecord3465() {
		assertEquals("http://www.cheriebusi.com", customers.get(3464).getWeb());
	}
}
