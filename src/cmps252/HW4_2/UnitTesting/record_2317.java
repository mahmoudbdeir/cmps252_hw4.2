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

@Tag("8")
class Record_2317 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2317: FirstName is Douglas")
	void FirstNameOfRecord2317() {
		assertEquals("Douglas", customers.get(2316).getFirstName());
	}

	@Test
	@DisplayName("Record 2317: LastName is Pavelko")
	void LastNameOfRecord2317() {
		assertEquals("Pavelko", customers.get(2316).getLastName());
	}

	@Test
	@DisplayName("Record 2317: Company is Betterman Katelman & Hots")
	void CompanyOfRecord2317() {
		assertEquals("Betterman Katelman & Hots", customers.get(2316).getCompany());
	}

	@Test
	@DisplayName("Record 2317: Address is 1701 Lemoyne Ave")
	void AddressOfRecord2317() {
		assertEquals("1701 Lemoyne Ave", customers.get(2316).getAddress());
	}

	@Test
	@DisplayName("Record 2317: City is Syracuse")
	void CityOfRecord2317() {
		assertEquals("Syracuse", customers.get(2316).getCity());
	}

	@Test
	@DisplayName("Record 2317: County is Onondaga")
	void CountyOfRecord2317() {
		assertEquals("Onondaga", customers.get(2316).getCounty());
	}

	@Test
	@DisplayName("Record 2317: State is NY")
	void StateOfRecord2317() {
		assertEquals("NY", customers.get(2316).getState());
	}

	@Test
	@DisplayName("Record 2317: ZIP is 13208")
	void ZIPOfRecord2317() {
		assertEquals("13208", customers.get(2316).getZIP());
	}

	@Test
	@DisplayName("Record 2317: Phone is 315-455-0676")
	void PhoneOfRecord2317() {
		assertEquals("315-455-0676", customers.get(2316).getPhone());
	}

	@Test
	@DisplayName("Record 2317: Fax is 315-455-0258")
	void FaxOfRecord2317() {
		assertEquals("315-455-0258", customers.get(2316).getFax());
	}

	@Test
	@DisplayName("Record 2317: Email is douglas@pavelko.com")
	void EmailOfRecord2317() {
		assertEquals("douglas@pavelko.com", customers.get(2316).getEmail());
	}

	@Test
	@DisplayName("Record 2317: Web is http://www.douglaspavelko.com")
	void WebOfRecord2317() {
		assertEquals("http://www.douglaspavelko.com", customers.get(2316).getWeb());
	}
}
