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

@Tag("13")
class Record_1657 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1657: FirstName is Adeline")
	void FirstNameOfRecord1657() {
		assertEquals("Adeline", customers.get(1656).getFirstName());
	}

	@Test
	@DisplayName("Record 1657: LastName is Nix")
	void LastNameOfRecord1657() {
		assertEquals("Nix", customers.get(1656).getLastName());
	}

	@Test
	@DisplayName("Record 1657: Company is Beatty, Bryan M Esq")
	void CompanyOfRecord1657() {
		assertEquals("Beatty, Bryan M Esq", customers.get(1656).getCompany());
	}

	@Test
	@DisplayName("Record 1657: Address is 71 Rowayton Ave")
	void AddressOfRecord1657() {
		assertEquals("71 Rowayton Ave", customers.get(1656).getAddress());
	}

	@Test
	@DisplayName("Record 1657: City is Norwalk")
	void CityOfRecord1657() {
		assertEquals("Norwalk", customers.get(1656).getCity());
	}

	@Test
	@DisplayName("Record 1657: County is Fairfield")
	void CountyOfRecord1657() {
		assertEquals("Fairfield", customers.get(1656).getCounty());
	}

	@Test
	@DisplayName("Record 1657: State is CT")
	void StateOfRecord1657() {
		assertEquals("CT", customers.get(1656).getState());
	}

	@Test
	@DisplayName("Record 1657: ZIP is 6853")
	void ZIPOfRecord1657() {
		assertEquals("6853", customers.get(1656).getZIP());
	}

	@Test
	@DisplayName("Record 1657: Phone is 203-866-5343")
	void PhoneOfRecord1657() {
		assertEquals("203-866-5343", customers.get(1656).getPhone());
	}

	@Test
	@DisplayName("Record 1657: Fax is 203-866-3421")
	void FaxOfRecord1657() {
		assertEquals("203-866-3421", customers.get(1656).getFax());
	}

	@Test
	@DisplayName("Record 1657: Email is adeline@nix.com")
	void EmailOfRecord1657() {
		assertEquals("adeline@nix.com", customers.get(1656).getEmail());
	}

	@Test
	@DisplayName("Record 1657: Web is http://www.adelinenix.com")
	void WebOfRecord1657() {
		assertEquals("http://www.adelinenix.com", customers.get(1656).getWeb());
	}
}
