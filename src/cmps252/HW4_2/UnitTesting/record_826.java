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

@Tag("32")
class Record_826 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 826: FirstName is Elsie")
	void FirstNameOfRecord826() {
		assertEquals("Elsie", customers.get(825).getFirstName());
	}

	@Test
	@DisplayName("Record 826: LastName is Cheu")
	void LastNameOfRecord826() {
		assertEquals("Cheu", customers.get(825).getLastName());
	}

	@Test
	@DisplayName("Record 826: Company is Englewood Lock & Safe")
	void CompanyOfRecord826() {
		assertEquals("Englewood Lock & Safe", customers.get(825).getCompany());
	}

	@Test
	@DisplayName("Record 826: Address is 12 Hamilton Ave")
	void AddressOfRecord826() {
		assertEquals("12 Hamilton Ave", customers.get(825).getAddress());
	}

	@Test
	@DisplayName("Record 826: City is Dayton")
	void CityOfRecord826() {
		assertEquals("Dayton", customers.get(825).getCity());
	}

	@Test
	@DisplayName("Record 826: County is Montgomery")
	void CountyOfRecord826() {
		assertEquals("Montgomery", customers.get(825).getCounty());
	}

	@Test
	@DisplayName("Record 826: State is OH")
	void StateOfRecord826() {
		assertEquals("OH", customers.get(825).getState());
	}

	@Test
	@DisplayName("Record 826: ZIP is 45403")
	void ZIPOfRecord826() {
		assertEquals("45403", customers.get(825).getZIP());
	}

	@Test
	@DisplayName("Record 826: Phone is 937-253-9867")
	void PhoneOfRecord826() {
		assertEquals("937-253-9867", customers.get(825).getPhone());
	}

	@Test
	@DisplayName("Record 826: Fax is 937-253-8168")
	void FaxOfRecord826() {
		assertEquals("937-253-8168", customers.get(825).getFax());
	}

	@Test
	@DisplayName("Record 826: Email is elsie@cheu.com")
	void EmailOfRecord826() {
		assertEquals("elsie@cheu.com", customers.get(825).getEmail());
	}

	@Test
	@DisplayName("Record 826: Web is http://www.elsiecheu.com")
	void WebOfRecord826() {
		assertEquals("http://www.elsiecheu.com", customers.get(825).getWeb());
	}
}
