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

@Tag("42")
class Record_784 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 784: FirstName is Leslie")
	void FirstNameOfRecord784() {
		assertEquals("Leslie", customers.get(783).getFirstName());
	}

	@Test
	@DisplayName("Record 784: LastName is Mazzoni")
	void LastNameOfRecord784() {
		assertEquals("Mazzoni", customers.get(783).getLastName());
	}

	@Test
	@DisplayName("Record 784: Company is C B Sullivan Co Inc")
	void CompanyOfRecord784() {
		assertEquals("C B Sullivan Co Inc", customers.get(783).getCompany());
	}

	@Test
	@DisplayName("Record 784: Address is 2732 S 3rd St")
	void AddressOfRecord784() {
		assertEquals("2732 S 3rd St", customers.get(783).getAddress());
	}

	@Test
	@DisplayName("Record 784: City is Niles")
	void CityOfRecord784() {
		assertEquals("Niles", customers.get(783).getCity());
	}

	@Test
	@DisplayName("Record 784: County is Berrien")
	void CountyOfRecord784() {
		assertEquals("Berrien", customers.get(783).getCounty());
	}

	@Test
	@DisplayName("Record 784: State is MI")
	void StateOfRecord784() {
		assertEquals("MI", customers.get(783).getState());
	}

	@Test
	@DisplayName("Record 784: ZIP is 49120")
	void ZIPOfRecord784() {
		assertEquals("49120", customers.get(783).getZIP());
	}

	@Test
	@DisplayName("Record 784: Phone is 269-684-5875")
	void PhoneOfRecord784() {
		assertEquals("269-684-5875", customers.get(783).getPhone());
	}

	@Test
	@DisplayName("Record 784: Fax is 269-684-5619")
	void FaxOfRecord784() {
		assertEquals("269-684-5619", customers.get(783).getFax());
	}

	@Test
	@DisplayName("Record 784: Email is leslie@mazzoni.com")
	void EmailOfRecord784() {
		assertEquals("leslie@mazzoni.com", customers.get(783).getEmail());
	}

	@Test
	@DisplayName("Record 784: Web is http://www.lesliemazzoni.com")
	void WebOfRecord784() {
		assertEquals("http://www.lesliemazzoni.com", customers.get(783).getWeb());
	}
}
