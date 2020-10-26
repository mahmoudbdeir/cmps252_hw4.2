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

@Tag("33")
class Record_1047 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1047: FirstName is Tod")
	void FirstNameOfRecord1047() {
		assertEquals("Tod", customers.get(1046).getFirstName());
	}

	@Test
	@DisplayName("Record 1047: LastName is Priem")
	void LastNameOfRecord1047() {
		assertEquals("Priem", customers.get(1046).getLastName());
	}

	@Test
	@DisplayName("Record 1047: Company is Porter, Dawn M Esq")
	void CompanyOfRecord1047() {
		assertEquals("Porter, Dawn M Esq", customers.get(1046).getCompany());
	}

	@Test
	@DisplayName("Record 1047: Address is 159 Ash St")
	void AddressOfRecord1047() {
		assertEquals("159 Ash St", customers.get(1046).getAddress());
	}

	@Test
	@DisplayName("Record 1047: City is Hopkinton")
	void CityOfRecord1047() {
		assertEquals("Hopkinton", customers.get(1046).getCity());
	}

	@Test
	@DisplayName("Record 1047: County is Middlesex")
	void CountyOfRecord1047() {
		assertEquals("Middlesex", customers.get(1046).getCounty());
	}

	@Test
	@DisplayName("Record 1047: State is MA")
	void StateOfRecord1047() {
		assertEquals("MA", customers.get(1046).getState());
	}

	@Test
	@DisplayName("Record 1047: ZIP is 1748")
	void ZIPOfRecord1047() {
		assertEquals("1748", customers.get(1046).getZIP());
	}

	@Test
	@DisplayName("Record 1047: Phone is 508-435-8185")
	void PhoneOfRecord1047() {
		assertEquals("508-435-8185", customers.get(1046).getPhone());
	}

	@Test
	@DisplayName("Record 1047: Fax is 508-435-8808")
	void FaxOfRecord1047() {
		assertEquals("508-435-8808", customers.get(1046).getFax());
	}

	@Test
	@DisplayName("Record 1047: Email is tod@priem.com")
	void EmailOfRecord1047() {
		assertEquals("tod@priem.com", customers.get(1046).getEmail());
	}

	@Test
	@DisplayName("Record 1047: Web is http://www.todpriem.com")
	void WebOfRecord1047() {
		assertEquals("http://www.todpriem.com", customers.get(1046).getWeb());
	}
}
