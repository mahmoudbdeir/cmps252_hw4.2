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

@Tag("49")
class Record_2610 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2610: FirstName is Alyce")
	void FirstNameOfRecord2610() {
		assertEquals("Alyce", customers.get(2609).getFirstName());
	}

	@Test
	@DisplayName("Record 2610: LastName is Moffa")
	void LastNameOfRecord2610() {
		assertEquals("Moffa", customers.get(2609).getLastName());
	}

	@Test
	@DisplayName("Record 2610: Company is Meter Man Inc")
	void CompanyOfRecord2610() {
		assertEquals("Meter Man Inc", customers.get(2609).getCompany());
	}

	@Test
	@DisplayName("Record 2610: Address is 10301 Comanche Rd Ne  #-4")
	void AddressOfRecord2610() {
		assertEquals("10301 Comanche Rd Ne  #-4", customers.get(2609).getAddress());
	}

	@Test
	@DisplayName("Record 2610: City is Albuquerque")
	void CityOfRecord2610() {
		assertEquals("Albuquerque", customers.get(2609).getCity());
	}

	@Test
	@DisplayName("Record 2610: County is Bernalillo")
	void CountyOfRecord2610() {
		assertEquals("Bernalillo", customers.get(2609).getCounty());
	}

	@Test
	@DisplayName("Record 2610: State is NM")
	void StateOfRecord2610() {
		assertEquals("NM", customers.get(2609).getState());
	}

	@Test
	@DisplayName("Record 2610: ZIP is 87111")
	void ZIPOfRecord2610() {
		assertEquals("87111", customers.get(2609).getZIP());
	}

	@Test
	@DisplayName("Record 2610: Phone is 505-296-2314")
	void PhoneOfRecord2610() {
		assertEquals("505-296-2314", customers.get(2609).getPhone());
	}

	@Test
	@DisplayName("Record 2610: Fax is 505-296-4595")
	void FaxOfRecord2610() {
		assertEquals("505-296-4595", customers.get(2609).getFax());
	}

	@Test
	@DisplayName("Record 2610: Email is alyce@moffa.com")
	void EmailOfRecord2610() {
		assertEquals("alyce@moffa.com", customers.get(2609).getEmail());
	}

	@Test
	@DisplayName("Record 2610: Web is http://www.alycemoffa.com")
	void WebOfRecord2610() {
		assertEquals("http://www.alycemoffa.com", customers.get(2609).getWeb());
	}
}
