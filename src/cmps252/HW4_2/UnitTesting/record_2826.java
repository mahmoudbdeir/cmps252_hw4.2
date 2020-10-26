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
class Record_2826 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2826: FirstName is Becky")
	void FirstNameOfRecord2826() {
		assertEquals("Becky", customers.get(2825).getFirstName());
	}

	@Test
	@DisplayName("Record 2826: LastName is Francesconi")
	void LastNameOfRecord2826() {
		assertEquals("Francesconi", customers.get(2825).getLastName());
	}

	@Test
	@DisplayName("Record 2826: Company is Data Source Media")
	void CompanyOfRecord2826() {
		assertEquals("Data Source Media", customers.get(2825).getCompany());
	}

	@Test
	@DisplayName("Record 2826: Address is 9485 Nw 137th Ave")
	void AddressOfRecord2826() {
		assertEquals("9485 Nw 137th Ave", customers.get(2825).getAddress());
	}

	@Test
	@DisplayName("Record 2826: City is Morriston")
	void CityOfRecord2826() {
		assertEquals("Morriston", customers.get(2825).getCity());
	}

	@Test
	@DisplayName("Record 2826: County is Levy")
	void CountyOfRecord2826() {
		assertEquals("Levy", customers.get(2825).getCounty());
	}

	@Test
	@DisplayName("Record 2826: State is FL")
	void StateOfRecord2826() {
		assertEquals("FL", customers.get(2825).getState());
	}

	@Test
	@DisplayName("Record 2826: ZIP is 32668")
	void ZIPOfRecord2826() {
		assertEquals("32668", customers.get(2825).getZIP());
	}

	@Test
	@DisplayName("Record 2826: Phone is 352-622-9659")
	void PhoneOfRecord2826() {
		assertEquals("352-622-9659", customers.get(2825).getPhone());
	}

	@Test
	@DisplayName("Record 2826: Fax is 352-622-1795")
	void FaxOfRecord2826() {
		assertEquals("352-622-1795", customers.get(2825).getFax());
	}

	@Test
	@DisplayName("Record 2826: Email is becky@francesconi.com")
	void EmailOfRecord2826() {
		assertEquals("becky@francesconi.com", customers.get(2825).getEmail());
	}

	@Test
	@DisplayName("Record 2826: Web is http://www.beckyfrancesconi.com")
	void WebOfRecord2826() {
		assertEquals("http://www.beckyfrancesconi.com", customers.get(2825).getWeb());
	}
}
