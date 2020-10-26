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

@Tag("48")
class Record_1512 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1512: FirstName is Santiago")
	void FirstNameOfRecord1512() {
		assertEquals("Santiago", customers.get(1511).getFirstName());
	}

	@Test
	@DisplayName("Record 1512: LastName is Yax")
	void LastNameOfRecord1512() {
		assertEquals("Yax", customers.get(1511).getLastName());
	}

	@Test
	@DisplayName("Record 1512: Company is Slavie Federal Svngs & Ln Assn")
	void CompanyOfRecord1512() {
		assertEquals("Slavie Federal Svngs & Ln Assn", customers.get(1511).getCompany());
	}

	@Test
	@DisplayName("Record 1512: Address is 342 E Gibson St")
	void AddressOfRecord1512() {
		assertEquals("342 E Gibson St", customers.get(1511).getAddress());
	}

	@Test
	@DisplayName("Record 1512: City is Scranton")
	void CityOfRecord1512() {
		assertEquals("Scranton", customers.get(1511).getCity());
	}

	@Test
	@DisplayName("Record 1512: County is Lackawanna")
	void CountyOfRecord1512() {
		assertEquals("Lackawanna", customers.get(1511).getCounty());
	}

	@Test
	@DisplayName("Record 1512: State is PA")
	void StateOfRecord1512() {
		assertEquals("PA", customers.get(1511).getState());
	}

	@Test
	@DisplayName("Record 1512: ZIP is 18509")
	void ZIPOfRecord1512() {
		assertEquals("18509", customers.get(1511).getZIP());
	}

	@Test
	@DisplayName("Record 1512: Phone is 570-346-0834")
	void PhoneOfRecord1512() {
		assertEquals("570-346-0834", customers.get(1511).getPhone());
	}

	@Test
	@DisplayName("Record 1512: Fax is 570-346-9848")
	void FaxOfRecord1512() {
		assertEquals("570-346-9848", customers.get(1511).getFax());
	}

	@Test
	@DisplayName("Record 1512: Email is santiago@yax.com")
	void EmailOfRecord1512() {
		assertEquals("santiago@yax.com", customers.get(1511).getEmail());
	}

	@Test
	@DisplayName("Record 1512: Web is http://www.santiagoyax.com")
	void WebOfRecord1512() {
		assertEquals("http://www.santiagoyax.com", customers.get(1511).getWeb());
	}
}
