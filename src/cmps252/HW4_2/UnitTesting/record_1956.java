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
class Record_1956 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1956: FirstName is Hal")
	void FirstNameOfRecord1956() {
		assertEquals("Hal", customers.get(1955).getFirstName());
	}

	@Test
	@DisplayName("Record 1956: LastName is Yann")
	void LastNameOfRecord1956() {
		assertEquals("Yann", customers.get(1955).getLastName());
	}

	@Test
	@DisplayName("Record 1956: Company is Wooster Area Chamber Commrce")
	void CompanyOfRecord1956() {
		assertEquals("Wooster Area Chamber Commrce", customers.get(1955).getCompany());
	}

	@Test
	@DisplayName("Record 1956: Address is 1641 E Saint Gertrude Pl")
	void AddressOfRecord1956() {
		assertEquals("1641 E Saint Gertrude Pl", customers.get(1955).getAddress());
	}

	@Test
	@DisplayName("Record 1956: City is Santa Ana")
	void CityOfRecord1956() {
		assertEquals("Santa Ana", customers.get(1955).getCity());
	}

	@Test
	@DisplayName("Record 1956: County is Orange")
	void CountyOfRecord1956() {
		assertEquals("Orange", customers.get(1955).getCounty());
	}

	@Test
	@DisplayName("Record 1956: State is CA")
	void StateOfRecord1956() {
		assertEquals("CA", customers.get(1955).getState());
	}

	@Test
	@DisplayName("Record 1956: ZIP is 92705")
	void ZIPOfRecord1956() {
		assertEquals("92705", customers.get(1955).getZIP());
	}

	@Test
	@DisplayName("Record 1956: Phone is 714-850-5855")
	void PhoneOfRecord1956() {
		assertEquals("714-850-5855", customers.get(1955).getPhone());
	}

	@Test
	@DisplayName("Record 1956: Fax is 714-850-0649")
	void FaxOfRecord1956() {
		assertEquals("714-850-0649", customers.get(1955).getFax());
	}

	@Test
	@DisplayName("Record 1956: Email is hal@yann.com")
	void EmailOfRecord1956() {
		assertEquals("hal@yann.com", customers.get(1955).getEmail());
	}

	@Test
	@DisplayName("Record 1956: Web is http://www.halyann.com")
	void WebOfRecord1956() {
		assertEquals("http://www.halyann.com", customers.get(1955).getWeb());
	}
}
