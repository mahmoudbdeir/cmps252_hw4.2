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

@Tag("7")
class Record_3186 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3186: FirstName is Jon")
	void FirstNameOfRecord3186() {
		assertEquals("Jon", customers.get(3185).getFirstName());
	}

	@Test
	@DisplayName("Record 3186: LastName is Vandall")
	void LastNameOfRecord3186() {
		assertEquals("Vandall", customers.get(3185).getLastName());
	}

	@Test
	@DisplayName("Record 3186: Company is Korris Products Inc")
	void CompanyOfRecord3186() {
		assertEquals("Korris Products Inc", customers.get(3185).getCompany());
	}

	@Test
	@DisplayName("Record 3186: Address is 101 Columbia  #-200")
	void AddressOfRecord3186() {
		assertEquals("101 Columbia  #-200", customers.get(3185).getAddress());
	}

	@Test
	@DisplayName("Record 3186: City is Aliso Viejo")
	void CityOfRecord3186() {
		assertEquals("Aliso Viejo", customers.get(3185).getCity());
	}

	@Test
	@DisplayName("Record 3186: County is Orange")
	void CountyOfRecord3186() {
		assertEquals("Orange", customers.get(3185).getCounty());
	}

	@Test
	@DisplayName("Record 3186: State is CA")
	void StateOfRecord3186() {
		assertEquals("CA", customers.get(3185).getState());
	}

	@Test
	@DisplayName("Record 3186: ZIP is 92656")
	void ZIPOfRecord3186() {
		assertEquals("92656", customers.get(3185).getZIP());
	}

	@Test
	@DisplayName("Record 3186: Phone is 949-362-6587")
	void PhoneOfRecord3186() {
		assertEquals("949-362-6587", customers.get(3185).getPhone());
	}

	@Test
	@DisplayName("Record 3186: Fax is 949-362-3531")
	void FaxOfRecord3186() {
		assertEquals("949-362-3531", customers.get(3185).getFax());
	}

	@Test
	@DisplayName("Record 3186: Email is jon@vandall.com")
	void EmailOfRecord3186() {
		assertEquals("jon@vandall.com", customers.get(3185).getEmail());
	}

	@Test
	@DisplayName("Record 3186: Web is http://www.jonvandall.com")
	void WebOfRecord3186() {
		assertEquals("http://www.jonvandall.com", customers.get(3185).getWeb());
	}
}
