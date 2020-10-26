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

@Tag("43")
class Record_4573 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4573: FirstName is May")
	void FirstNameOfRecord4573() {
		assertEquals("May", customers.get(4572).getFirstName());
	}

	@Test
	@DisplayName("Record 4573: LastName is Bielke")
	void LastNameOfRecord4573() {
		assertEquals("Bielke", customers.get(4572).getLastName());
	}

	@Test
	@DisplayName("Record 4573: Company is Alvin Tourist & Visitor Info")
	void CompanyOfRecord4573() {
		assertEquals("Alvin Tourist & Visitor Info", customers.get(4572).getCompany());
	}

	@Test
	@DisplayName("Record 4573: Address is 1515 Jefferson St")
	void AddressOfRecord4573() {
		assertEquals("1515 Jefferson St", customers.get(4572).getAddress());
	}

	@Test
	@DisplayName("Record 4573: City is Hoboken")
	void CityOfRecord4573() {
		assertEquals("Hoboken", customers.get(4572).getCity());
	}

	@Test
	@DisplayName("Record 4573: County is Hudson")
	void CountyOfRecord4573() {
		assertEquals("Hudson", customers.get(4572).getCounty());
	}

	@Test
	@DisplayName("Record 4573: State is NJ")
	void StateOfRecord4573() {
		assertEquals("NJ", customers.get(4572).getState());
	}

	@Test
	@DisplayName("Record 4573: ZIP is 7030")
	void ZIPOfRecord4573() {
		assertEquals("7030", customers.get(4572).getZIP());
	}

	@Test
	@DisplayName("Record 4573: Phone is 201-420-4732")
	void PhoneOfRecord4573() {
		assertEquals("201-420-4732", customers.get(4572).getPhone());
	}

	@Test
	@DisplayName("Record 4573: Fax is 201-420-6041")
	void FaxOfRecord4573() {
		assertEquals("201-420-6041", customers.get(4572).getFax());
	}

	@Test
	@DisplayName("Record 4573: Email is may@bielke.com")
	void EmailOfRecord4573() {
		assertEquals("may@bielke.com", customers.get(4572).getEmail());
	}

	@Test
	@DisplayName("Record 4573: Web is http://www.maybielke.com")
	void WebOfRecord4573() {
		assertEquals("http://www.maybielke.com", customers.get(4572).getWeb());
	}
}
